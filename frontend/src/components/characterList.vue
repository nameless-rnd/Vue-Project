<template>
  <v-container>
    <v-card-title class="text-center justify-center py-6">
      <h1 class="font-weight-bold display-3 basil--text">ฮีโร่ทั้งหมด</h1>
    </v-card-title>
    <v-container>
      <div class="text-center">
        <h2 class="red--text font-weight-black">เหล่าฮีโร่อีกมากมาย!</h2>
      </div>
    </v-container>

    <v-card class="col-md" style="background: #455A64">
      <v-tabs v-model="tab" background-color="#455A64" color="white" right>
        <v-tab v-for="tabname in tabnames" :key="tabname.text">
          <v-tab-item-avatar style="margin-right: 5px;">
            <v-img :src="tabname.avatar" max-width="15"></v-img>
          </v-tab-item-avatar>
          <v-tab-item-content>
            <v-tab-item-title>{{tabname.text}}</v-tab-item-title>
          </v-tab-item-content>
        </v-tab>
      </v-tabs>

      <v-tabs-items v-model="tab">
        <v-tab-item v-for="tabname in tabnames" :key="tabname">
          <v-flex shrink display-1></v-flex>
          <!------------------------------------------------------------------------>
          <!-------------------- หน้า All Heroes ------------------------------------>
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'All Heroes'">
            <v-container style="background: #455A64"></v-container>
            <v-row style="background: #455A64">
              <div
                style="col: 30px; margin-left: 25px;"
                v-for="(character, index) in characters"
                :key="index"
              >
                <router-link
                  :to="{  name: 'character-details',
                          params: { character: character, id: character.id }
                      }"
                >
                  <v-btn tile class="text-center ma-2" width="150">
                    <v-img :src="character.img_small" max-width="36" style="margin-right: 15px;"></v-img>
                    <v-card-btn>{{character.name}}</v-card-btn>
                  </v-btn>
                </router-link>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!-------------------- หน้า Assasin --------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Assassin'">
            <v-container style="background: #455A64"></v-container>
            <v-row style="background: #455A64">
              <div
                style="col: 30px; margin-left: 25px;"
                v-for="(character, index) in characters"
                :key="index"
              >
                <div v-for="(characters, index) in character.types" :key="index">
                  <router-link
                    :to="{  name: 'character-details',
                          params: { character: character, id: character.id }
                      }"
                  >
                    <v-btn
                      tile
                      class="text-center ma-2"
                      width="150"
                      v-if="characters.typeHeroes === 'Assassin'"
                    >
                      <v-img :src="character.img_small" max-width="36" style="margin-right: 15px;"></v-img>
                      <v-card-btn>{{character.name}}</v-card-btn>
                    </v-btn>
                  </router-link>
                </div>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!-------------------- หน้า Fighter --------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Fighter'">
            <v-container style="background: #455A64"></v-container>
            <v-row style="background: #455A64">
              <div
                style="col: 30px; margin-left: 25px;"
                v-for="(character, index) in characters"
                :key="index"
              >
                <div v-for="(characters, index) in character.types" :key="index">
                  <router-link
                    :to="{  name: 'character-details',
                          params: { character: character, id: character.id }
                      }"
                  >
                    <v-btn
                      tile
                      class="text-center ma-2"
                      width="150"
                      v-if="characters.typeHeroes === 'Fighter'"
                    >
                      <v-img :src="character.img_small" max-width="36" style="margin-right: 15px;"></v-img>
                      <v-card-btn>{{character.name}}</v-card-btn>
                    </v-btn>
                  </router-link>
                </div>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!----------------------- หน้า Mage --------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Mage'">
            <v-container style="background: #455A64"></v-container>
            <v-row style="background: #455A64">
              <div
                style="col: 30px; margin-left: 25px;"
                v-for="(character, index) in characters"
                :key="index"
              >
                <div v-for="(characters, index) in character.types" :key="index">
                  <router-link
                    :to="{  name: 'character-details',
                          params: { character: character, id: character.id }
                      }"
                  >
                    <v-btn
                      tile
                      class="text-center ma-2"
                      width="150"
                      v-if="characters.typeHeroes === 'Mage'"
                    >
                      <v-img :src="character.img_small" max-width="36" style="margin-right: 15px;"></v-img>
                      <v-card-btn>{{character.name}}</v-card-btn>
                    </v-btn>
                  </router-link>
                </div>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!----------------------- หน้า Carry -------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Carry'">
            <v-container style="background: #455A64"></v-container>
            <v-row style="background: #455A64">
              <div
                style="col: 30px; margin-left: 25px;"
                v-for="(character, index) in characters"
                :key="index"
              >
                <div v-for="(characters, index) in character.types" :key="index">
                  <router-link
                    :to="{  name: 'character-details',
                          params: { character: character, id: character.id }
                      }"
                  >
                    <v-btn
                      tile
                      class="text-center ma-2"
                      width="150"
                      v-if="characters.typeHeroes === 'Carry'"
                    >
                      <v-img :src="character.img_small" max-width="36" style="margin-right: 15px;"></v-img>
                      <v-card-btn>{{character.name}}</v-card-btn>
                    </v-btn>
                  </router-link>
                </div>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!----------------------- หน้า Tank --------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Tank'">
            <v-container style="background: #455A64"></v-container>
            <v-row style="background: #455A64">
              <div
                style="col: 30px; margin-left: 25px;"
                v-for="(character, index) in characters"
                :key="index"
              >
                <div v-for="(characters, index) in character.types" :key="index">
                  <router-link
                    :to="{  name: 'character-details',
                          params: { character: character, id: character.id }
                      }"
                  >
                    <v-btn
                      tile
                      class="text-center ma-2"
                      width="150"
                      v-if="characters.typeHeroes === 'Tank'"
                    >
                      <v-img :src="character.img_small" max-width="36" style="margin-right: 15px;"></v-img>
                      <v-card-btn>{{character.name}}</v-card-btn>
                    </v-btn>
                  </router-link>
                </div>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!----------------------- หน้า Support ------------------------------------>
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Support'">
            <v-container style="background: #455A64"></v-container>
            <v-row style="background: #455A64">
              <div
                style="col: 30px; margin-left: 25px;"
                v-for="(character, index) in characters"
                :key="index"
              >
                <div v-for="(characters, index) in character.types" :key="index">
                  <router-link
                    :to="{  name: 'character-details',
                            params: { character: character, id: character.id }
                      }"
                  >
                    <v-btn
                      tile
                      class="text-center ma-2"
                      width="150"
                      v-if="characters.typeHeroes === 'Support'"
                    >
                      <v-img :src="character.img_small" max-width="36" style="margin-right: 15px;"></v-img>
                      <v-card-btn>{{character.name}}</v-card-btn>
                    </v-btn>
                  </router-link>
                </div>
              </div>
            </v-row>
          </v-flex>
        </v-tab-item>
      </v-tabs-items>

      <div class="col-md-6">
        <router-view @refreshData="refreshList"></router-view>
      </div>
    </v-card>
  </v-container>
</template>
<script>
import http from "../http-common";
export default {
  name: "character-list",
  data() {
    return {
      tab: null,
      tabnames: [
        { text: "All Heroes" },
        { avatar: "assasin.png", text: "Assassin" },
        { avatar: "fighter.png", text: "Fighter" },
        { avatar: "mage.png", text: "Mage" },
        { avatar: "carry.png", text: "Carry" },
        { avatar: "tank.png", text: "Tank" },
        { avatar: "support.png", text: "Support" },
      ],
      characters: [],
    };
  },

  methods: {
    /* eslint-disable no-console */
    retrieveCharacters() {
      http
        .get("/character")
        .then((response) => {
          this.characters = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    refreshList() {
      this.retrieveCharacters();
    },
    /* eslint-enable no-console */
  },
  mounted() {
    this.retrieveCharacters();
  },
};
</script>
