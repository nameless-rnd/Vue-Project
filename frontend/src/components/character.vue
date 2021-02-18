<template >
  <div v-if="this.character" >
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
          <v-card class="col-md" style="background: #263238;">
            <div class="col-md">
              <v-card class="col-md" outlined justify="center" style="background: #37474F;">
                <v-row style="margin-left: 15px;">
                  <v-list-item class="col-md-12" two-line>
                    <v-list-content>
                      <v-img style="margin-right: 40px;" :src="character.img_small" max-width="50"></v-img>
                    </v-list-content>
                    <v-row>
                      <div v-for="(characters, index) in character.types" :key="index">
                        <v-row style="margin-right: 25px;">
                          <h3
                            justify="center"
                            style="margin-left: 25px;"
                            class="font-weight-black text-uppercase"
                            :class="`red--text`"
                          >{{characters.typeHeroes}}</h3>
                          <span>
                            <v-img :src="characters.img_typeHeroes" max-width="15" right style="margin-left: 5px;"></v-img>
                          </span>
                        </v-row>
                      </div>
                    </v-row>
                  </v-list-item>
                </v-row>
              </v-card>

              <v-list-item three-line v-for="(characters, index) in character.skills" :key="index" dark>
                <v-list-item-avatar size="60">
                  <v-img :src="characters.img_skill"></v-img>
                </v-list-item-avatar>
                <v-list-item-content>
                  <v-list-item-title
                    class="font-weight-black"
                    :class="`red--text`"
                  >{{characters.name_skill}}</v-list-item-title>
                  <p
                    class="text-caption font-weight-bold"
                    :class="`white--text`"
                  >{{characters.detail_skill}}</p>
                  <v-divider dark></v-divider>
                </v-list-item-content>
              </v-list-item>
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