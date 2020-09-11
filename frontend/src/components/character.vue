<template >
  <div v-if="this.character">
    <v-container class="application">
      <v-container>
        <v-card-title class="text-center justify-center py-6">
          <h1 class="font-weight-bold display-3 basil--text">{{character.name}}</h1>
        </v-card-title>
      </v-container>

      <v-row justify="space-around">
        <v-col cols="5" justify="center">
          <div class="show-desktop"></div>
          <v-img :src="character.img_big" aspect-ratio="1"></v-img>
        </v-col>
        <v-col cols="5" justify="center">
          <v-card height="500" class="col-md" style="background: #263238;">
            <div class="col-md">
              <v-card class="col-md" outlined justify="center" style="background: #37474F;">
                <v-row style="margin-left: 25px;">
                  <v-list-item class="col-md-12" two-line>
                    <v-img style="margin-right: 35px;" :src="character.img_small" max-width="50"></v-img>
                    <v-row v-for="(characters, index) in character.types" :key="index">
                      <span
                        justify="center"
                        style="margin-left: 25px;"
                        class="font-weight-black"
                        :class="`red--text`"
                      >{{characters.typeHeroes}}</span>
                      <span>
                        <v-img
                          :src="character.img_type1_heroes"
                          max-width="15"
                          right
                          style="margin-left: 5px;"
                        ></v-img>
                      </span>
                    </v-row>
                  </v-list-item>
                </v-row>
              </v-card>
              <!--สกิลตัวตัว-->
              <v-list-item three-line>
                <v-list-item-avatar size="60">
                  <v-img :src="character.img_skill"></v-img>
                </v-list-item-avatar>
                <v-list-item-content>
                  <v-list-item-title
                    class="font-weight-black"
                    :class="`red--text`"
                  >{{character.name_skill}}</v-list-item-title>
                  <p class="text-caption" :class="`white--text`">{{character.detail_skill}}</p>
                </v-list-item-content>
              </v-list-item>
              <v-divider></v-divider>

              <!--สกิล 1-->
              <v-list-item three-line>
                <v-list-item-avatar size="60">
                  <v-img :src="character.img_skill_1_1"></v-img>
                </v-list-item-avatar>
                <v-list-item-content>
                  <v-list-item-title
                    class="font-weight-black"
                    :class="`red--text`"
                  >{{character.name_skill_1_1}}</v-list-item-title>
                  <p class="text-caption" :class="`white--text`">{{character.detail_skill_1_1}}</p>
                </v-list-item-content>
              </v-list-item>
              <v-divider></v-divider>

              <v-list-item three-line v-if="character.name_skill_1_2 != null">
                <v-list-item-avatar size="60">
                  <v-img :src="character.img_skill_1_2"></v-img>
                </v-list-item-avatar>
                <v-list-item-content>
                  <v-list-item-title
                    class="font-weight-black"
                    :class="`red--text`"
                  >{{character.name_skill_1_2}}</v-list-item-title>
                  <p class="text-caption" :class="`white--text`">{{character.detail_skill_1_2}}</p>
                </v-list-item-content>
              </v-list-item>
              <v-divider></v-divider>

              <!--สกิล 2-->
              <v-list-item three-line>
                <v-list-item-avatar size="60">
                  <v-img :src="character.img_skill_2_1"></v-img>
                </v-list-item-avatar>
                <v-list-item-content>
                  <v-list-item-title
                    class="font-weight-black"
                    :class="`red--text`"
                  >{{character.name_skill_2_1}}</v-list-item-title>
                  <p class="text-caption" :class="`white--text`">{{character.detail_skill_2_1}}</p>
                </v-list-item-content>
              </v-list-item>
              <v-divider></v-divider>

              <v-list-item three-line v-if="character.name_skill_2_2 != null">
                <v-list-item-avatar size="60">
                  <v-img :src="character.img_skill_2_2"></v-img>
                </v-list-item-avatar>
                <v-list-item-content>
                  <v-list-item-title
                    class="font-weight-black"
                    :class="`red--text`"
                  >{{character.name_skill_2_2}}</v-list-item-title>
                  <p class="text-caption" :class="`white--text`">{{character.detail_skill_2_2}}</p>
                </v-list-item-content>
              </v-list-item>
              <v-divider></v-divider>

              <!--สกิล อัลติ-->
              <v-list-item three-line>
                <v-list-item-avatar size="60">
                  <v-img :src="character.img_skill_3_1"></v-img>
                </v-list-item-avatar>
                <v-list-item-content>
                  <v-list-item-title
                    class="font-weight-black"
                    :class="`red--text`"
                  >{{character.name_skill_3_1}}</v-list-item-title>
                  <p class="text-caption" :class="`white--text`">{{character.detail_skill_3_1}}</p>
                </v-list-item-content>
              </v-list-item>

              <v-list-item three-line v-if="character.name_skill_3_2 != null">
                <v-list-item-avatar size="60">
                  <v-img :src="character.img_skill_3_2"></v-img>
                </v-list-item-avatar>
                <v-list-item-content>
                  <v-list-item-title
                    class="font-weight-black"
                    :class="`red--text`"
                  >{{character.name_skill_3_2}}</v-list-item-title>
                  <p class="text-caption" :class="`white--text`">{{character.detail_skill_3_2}}</p>
                </v-list-item-content>
              </v-list-item>
              <v-divider></v-divider>
            </div>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>
<script>
export default {
  name: "character",
  props: ["character"],
};
</script>