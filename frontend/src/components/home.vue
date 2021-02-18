<template>
  <v-container class="application">
    <!---------------------------------------------------------------------------------->
    <!---------------------------------- Post ------------------------------------------>
    <!---------------------------------------------------------------------------------->
    <div class="col-md-12">
      <v-row >
        <v-card
          class="mx-auto col-md"
          max-width="500"
          tile
          style="background: #455a64"
        ><v-row align="end" class="fill-height"> 
            <v-dialog
              v-model="dialog"
              outline
              persistent
              max-width="600px"
              v-if="login()"
            ><template v-slot:activator="{ on, attrs }" justify="center">
                <v-btn
                  width="350"
                  rounded
                  outline
                  target="_self"
                  v-bind="attrs"
                  v-on="on"
                  style="margin-left: 75px"
                > เขียนโพส ... </v-btn>
              </template>
              <!----------------------------- Add Post ---------------------------------------->
              <v-card class="mx-auto col-md" style="background: #455a64">
                <v-row justify="center">
                  <h1 class="font-weight-bold">สร้างโพส</h1>
                </v-row>
                <v-divider dark></v-divider>
                <div class="col-md">
                  <v-row>      
                    <v-col class="py-0">
                      <v-list-item>
                        <v-list-item-content v-if="login()">
                          <v-list-item-title class="title">
                            {{ name }}
                          </v-list-item-title>
                        </v-list-item-content>
                      </v-list-item>
                    </v-col>
                  </v-row>
                  <v-form v-model="valid" ref="form">
                    <v-container>
                      <v-row>
                        <v-col cols="12">
                          <v-textarea
                            outlined
                            auto-grow
                            v-model="informationPost"
                            label="เขียนโพส..."
                          >
                          </v-textarea>
                        </v-col>
                      </v-row>
                    </v-container>
                    <v-card-actions>
                      <v-btn text @click="dialog = false"> Cancel </v-btn>
                      <v-spacer></v-spacer>
                      <v-btn
                        text
                        color="primary"
                        @click="savePost"
                        :disabled="!formIsValid"
                      > Post </v-btn>
                    </v-card-actions>
                  </v-form>
                </div>
              </v-card>
            </v-dialog>
          </v-row>
        </v-card>
      </v-row>
    </div>
    <!---------------------------------- View Post ------------------------------------------>
    <div class="col-md-12" v-for="(post, index) in posts" :key="index">
      <v-row>
        <v-card
          class="mx-auto col-md"
          max-width="500"
          tile
          style="background: #455a64"
        ><v-row>
            <v-list-item>        
              <v-list-item-content>
                <v-list-item-title class="title"
                  >{{ post.createdBy.name }}
                </v-list-item-title>
                <v-list-item-subtitle> {{ post.date }} </v-list-item-subtitle>
              </v-list-item-content>
            </v-list-item>
          </v-row>
          <v-divider dark></v-divider>
          <div class="col-md-12">
            <p class="font-weight-bold" :class="`white--text`">
              {{ post.informationPost }}
            </p>
          </div>
          <!---------------------------------------------------------------------------------->
          <!--------------------------------- Comment ---------------------------------------->
          <!---------------------------------------------------------------------------------->
          <div class="col-md-12">
            <!---------------------------- Add Comment --------------------------------------->
            <v-form v-model="valid" ref="form">
              <v-row align="end" class="fill-height">
                <v-list-item three-line>
                  <v-textarea
                    auto-grow
                    label="Comment"
                    rows="1"
                    class="col-md-12"
                    v-model="informationComment"
                  ></v-textarea>
                  <v-btn text icon @click="saveComment(post)">
                    <v-icon>mdi-send</v-icon>
                  </v-btn>
                </v-list-item>
              </v-row>
            </v-form>
            <!-------------------------- View Comment -------------------------------------->
            <div v-for="(comment, index) in comments" :key="index">
              <v-row v-if="comment.post.id === post.id">
                <v-list-item three-line>   
                  <v-list-item-content>
                    <v-list-item-title class="title"
                      >{{ comment.createdBy.name }}
                    </v-list-item-title>
                    <p class="font-weight-bold" :class="`white--text`">
                      {{ comment.informationComment }}
                    </p>
                  </v-list-item-content>
                </v-list-item>
              </v-row>
            </div>
          </div>
        </v-card>
      </v-row>
    </div>
  </v-container>
</template>
<script>
import http from "../http-common";
export default {
  name: "home",
  data() {
    return {
      dialog: false,
      posts: [],
      comments: [],
      users: [],
      informationPost: "",
      valid: false,

      slides: [
        { image: "..\\Rov.jpg", route: null },
        { image: "..\\rov-main.jpg", route: "/characterList" },
        { image: "..\\rov-rune.png", route: "/rune" },
        { image: "..\\rov-enchantment.jpg", route: "/enchantment" },
        { image: "..\\RoV-map.jpg", route: "/modeList" },
      ],
    };
  },
  computed: {
    formIsValid() {
      return this.informationPost;
    },
    formIsValidComment() {
      return this.informationComment;
    },
  },
  methods: {
    login() {
      this.name = localStorage.getItem("Name");
      return this.$router.history.current["path"];
    },
    /* eslint-disable no-console */
    getUsers() {
      http
        .get("/user")
        .then((response) => {
          this.users = response.data;
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    savePost() {
      http
        .post(
          "/post/" + this.informationPost + "/" + localStorage.getItem("Id"),
          this.post
        )
        .then((response) => {
          console.log(response);
          this.posts.push(response.data);
          this.$alert("", "Post Success", "success");
          this.clear();
          this.dialog = false;
        })
        .catch((e) => {
          console.log(e);
          this.clear();
        });
    },
    saveComment(post) {
      http
        .post(
          "/comment/" +
            this.informationComment + "/" +
            post.id + "/" +
            localStorage.getItem("Id"),
          this.comment
        )
        .then((response) => {
          console.log(response);
          this.comments.push(response.data);
          this.informationComment = "";
          this.clear();
        })
        .catch((e) => {
          console.log(e);
          this.clear();
        });
    },

    clear() {
      this.$refs.form.reset();
    },
    retrievePosts() {
      http
        .get("/post")
        .then((response) => {
          this.posts = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    retrieveComments() {
      http
        .get("/comment")
        .then((response) => {
          this.comments = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
  mounted() {
    this.getUsers();
    this.retrievePosts();
    this.retrieveComments();
  },
};
</script>
