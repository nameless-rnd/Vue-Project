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

    <v-card class="col-md" style="background: #455a64">
      <v-tabs v-model="tab" background-color="#455A64" color="white" right>
        <v-tab v-for="tabname in tabnames" :key="tabname.text">
          <v-tab-item-avatar style="margin-right: 5px">
            <v-img :src="tabname.avatar" max-width="15"></v-img>
          </v-tab-item-avatar>
          <v-tab-item-content>
            <v-tab-item-title>{{ tabname.text }}</v-tab-item-title>
          </v-tab-item-content>
        </v-tab>
      </v-tabs>
      <v-divider dark></v-divider>

      <v-tabs-items v-model="tab">
        <v-tab-item v-for="tabname in tabnames" :key="tabname">
          <v-flex shrink display-1></v-flex>
          <!------------------------------------------------------------------------>
          <!---------------------- หน้า All Heroes ---------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'All Heroes'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div
                v-for="(character, index) in characters"
                :key="index"
                style="margin-left: 13px"
              >
                <v-hover>
                  <template v-slot:default="{ hover }">
                    <v-container>
                      <v-card class="mx-auto" max-width="180" outline
                        ><v-img
                          max-width="1000"
                          :src="character.img_small"
                        ></v-img>
                        <v-fade-transition>
                          <v-overlay v-if="hover" absolute color="#036358">
                            <v-btn
                              elevation="2"
                              small
                              :to="{
                                name: 'character-details',
                                params: {
                                  character: character,
                                  id: character.id,
                                },
                              }"
                              >see more</v-btn
                            >
                          </v-overlay>
                        </v-fade-transition>
                      </v-card></v-container
                    >
                  </template>
                </v-hover>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!---------------------- หน้า Assasin ------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Assassin'">
            <v-container style="background: #455a64"></v-container>

            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div v-for="(character, index) in characters" :key="index">
                <v-row style="background: #455a64">
                  <div
                    v-for="(characters, index) in character.types"
                    :key="index"
                  >
                    <v-hover v-if="characters.typeHeroes == 'Assassin'">
                      <template v-slot:default="{ hover }">
                        <v-container style="margin-right: 40px">
                          <v-card class="mx-auto" max-width="180" outline
                            ><v-img
                              max-width="300"
                              :src="character.img_small"
                            ></v-img>
                            <v-fade-transition>
                              <v-overlay v-if="hover" absolute color="#036358">
                                <v-btn
                                  :to="{
                                    name: 'character-details',
                                    params: {
                                      character: character,
                                      id: character.id,
                                    },
                                  }"
                                  >See more info</v-btn
                                >
                              </v-overlay>
                            </v-fade-transition>
                          </v-card></v-container
                        >
                      </template>
                    </v-hover>
                  </div>
                </v-row>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!---------------------- หน้า Fighter ------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Fighter'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="margin-left: 0px; background: #455a64">
              <div v-for="(character, index) in characters" :key="index">
                <v-row style="background: #455a64">
                  <div
                    v-for="(characters, index) in character.types"
                    :key="index"
                  >
                    <v-hover v-if="characters.typeHeroes == 'Fighter'">
                      <template v-slot:default="{ hover }">
                        <v-container style="margin-right: 40px">
                          <v-card class="mx-auto" max-width="180" outline
                            ><v-img
                              max-width="300"
                              :src="character.img_small"
                            ></v-img>
                            <v-fade-transition>
                              <v-overlay v-if="hover" absolute color="#036358">
                                <v-btn
                                  :to="{
                                    name: 'character-details',
                                    params: {
                                      character: character,
                                      id: character.id,
                                    },
                                  }"
                                  >See more info</v-btn
                                >
                              </v-overlay>
                            </v-fade-transition>
                          </v-card></v-container
                        >
                      </template>
                    </v-hover>
                  </div>
                </v-row>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!------------------------- หน้า Mage ------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Mage'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div v-for="(character, index) in characters" :key="index">
                <v-row style="background: #455a64">
                  <div
                    v-for="(characters, index) in character.types"
                    :key="index"
                  >
                    <v-hover v-if="characters.typeHeroes == 'Mage'">
                      <template v-slot:default="{ hover }">
                        <v-container style="margin-right: 40px">
                          <v-card class="mx-auto" max-width="180" outline
                            ><v-img
                              max-width="300"
                              :src="character.img_small"
                            ></v-img>
                            <v-fade-transition>
                              <v-overlay v-if="hover" absolute color="#036358">
                                <v-btn
                                  :to="{
                                    name: 'character-details',
                                    params: {
                                      character: character,
                                      id: character.id,
                                    },
                                  }"
                                  >See more info</v-btn
                                >
                              </v-overlay>
                            </v-fade-transition>
                          </v-card></v-container
                        >
                      </template>
                    </v-hover>
                  </div>
                </v-row>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!------------------------- หน้า Carry ------------------------------------>
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Carry'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="margin-left: 0px; background: #455a64">
              <div v-for="(character, index) in characters" :key="index">
                <v-row style="background: #455a64">
                  <div
                    v-for="(characters, index) in character.types"
                    :key="index"
                  >
                    <v-hover v-if="characters.typeHeroes == 'Carry'">
                      <template v-slot:default="{ hover }">
                        <v-container style="margin-right: 40px">
                          <v-card class="mx-auto" max-width="180" outline
                            ><v-img
                              max-width="300"
                              :src="character.img_small"
                            ></v-img>
                            <v-fade-transition>
                              <v-overlay v-if="hover" absolute color="#036358">
                                <v-btn
                                  :to="{
                                    name: 'character-details',
                                    params: {
                                      character: character,
                                      id: character.id,
                                    },
                                  }"
                                  >See more info</v-btn
                                >
                              </v-overlay>
                            </v-fade-transition>
                          </v-card></v-container
                        >
                      </template>
                    </v-hover>
                  </div>
                </v-row>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!------------------------- หน้า Tank ------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Tank'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="margin-left: 0px; background: #455a64">
              <div v-for="(character, index) in characters" :key="index">
                <v-row style="background: #455a64">
                  <div
                    v-for="(characters, index) in character.types"
                    :key="index"
                  >
                    <v-hover v-if="characters.typeHeroes == 'Tank'">
                      <template v-slot:default="{ hover }">
                        <v-container style="margin-right: 40px">
                          <v-card class="mx-auto" max-width="180" outline
                            ><v-img
                              max-width="300"
                              :src="character.img_small"
                            ></v-img>
                            <v-fade-transition>
                              <v-overlay v-if="hover" absolute color="#036358">
                                <v-btn
                                  :to="{
                                    name: 'character-details',
                                    params: {
                                      character: character,
                                      id: character.id,
                                    },
                                  }"
                                  >See more info</v-btn
                                >
                              </v-overlay>
                            </v-fade-transition>
                          </v-card></v-container
                        >
                      </template>
                    </v-hover>
                  </div>
                </v-row>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!------------------------- หน้า Support ---------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Support'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="margin-left: 0px; background: #455a64">
              <div v-for="(character, index) in characters" :key="index">
                <v-row style="background: #455a64">
                  <div
                    v-for="(characters, index) in character.types"
                    :key="index"
                  >
                    <v-hover v-if="characters.typeHeroes == 'Support'">
                      <template v-slot:default="{ hover }">
                        <v-container style="margin-right: 40px">
                          <v-card class="mx-auto" max-width="180" outline
                            ><v-img
                              max-width="300"
                              :src="character.img_small"
                            ></v-img>
                            <v-fade-transition>
                              <v-overlay v-if="hover" absolute color="#036358">
                                <v-btn
                                  :to="{
                                    name: 'character-details',
                                    params: {
                                      character: character,
                                      id: character.id,
                                    },
                                  }"
                                  >See more info</v-btn
                                >
                              </v-overlay>
                            </v-fade-transition>
                          </v-card></v-container
                        >
                      </template>
                    </v-hover>
                  </div>
                </v-row>
              </div>
            </v-row>
          </v-flex>
        </v-tab-item>
      </v-tabs-items>
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
    /* eslint-enable no-console */
  },
  mounted() {
    this.retrieveCharacters();
  },
};
</script>
