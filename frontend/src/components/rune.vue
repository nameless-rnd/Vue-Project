<template>
  <v-container>
    <v-card-title class="text-center justify-center py-6">
      <h1 class="font-weight-bold display-3 basil--text">รูนทั้งหมด</h1>
    </v-card-title>
    <v-card class="col-md" style="background: #455A64">
      <v-tabs v-model="tab" background-color="#455A64" color="white" right>
        <v-tab v-for="tabname in tabnames" :key="tabname.text">
          <v-tab-item-content>
            <v-tab-item-title>{{tabname.text}}</v-tab-item-title>
          </v-tab-item-content>
        </v-tab>
      </v-tabs>
      <v-divider></v-divider>

      <v-tabs-items v-model="tab">
        <v-tab-item v-for="tabname in tabnames" :key="tabname">
          <v-flex shrink display-1></v-flex>
          <!------------------------------------------------------------------------>
          <!-------------------- หน้า All Runes ------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'All Runes'">
            <v-container style="background: #455A64"></v-container>
            <div style="col: 30px; background: #455A64" v-for="(rune, index) in runes" :key="index">
              <v-row>
                <v-col cols="12">
                  <v-card
                    class="mx-auto"
                    max-width="500"
                    outlined
                    justify="center"
                    style="background: #37474F;"
                  >
                    <v-row>
                      <v-list-item class="col-md-12">
                        <v-list-item-content>
                          <v-row justify="center">
                            <v-img :src="rune.img_rune" max-width="45"></v-img>
                          </v-row>
                          <v-row justify="center">
                            <span class="font-weight-medium" :class="`red--text`">{{rune.name}}</span>
                          </v-row>
                        </v-list-item-content>
                        <v-list-item-content>
                          <v-row style="col: 30px; margin-left: 5px;">
                            <v-list-item-title
                              class="font-weight-medium"
                              :class="`red--text`"
                            >ประเภทรูน</v-list-item-title>
                          </v-row>
                          <v-row style="col: 30px; margin-left: 5px;">
                            <p
                              class="text-caption"
                              :class="`white--text`"
                              v-for="(types, index) in rune.types"
                              :key="index"
                              style="margin-right: 15px;"
                            >{{types.typeRune}}</p>
                          </v-row>
                        </v-list-item-content>
                        <v-list-item-content>
                          <v-list-item-title
                            class="font-weight-medium"
                            :class="`red--text`"
                          >เอฟเฟกต์</v-list-item-title>
                          <p class="text-caption" :class="`white--text`">{{rune.effect}}</p>
                        </v-list-item-content>
                      </v-list-item>
                    </v-row>
                  </v-card>
                </v-col>
              </v-row>
            </div>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!-------------------- หน้า Level 1 --------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Level 1'">
            <v-container style="background: #455A64"></v-container>
            <div style="col: 30px; background: #455A64" v-for="(rune, index) in runes" :key="index">
              <v-row>
                <v-col cols="12" v-if="rune.level.level === 1">
                  <v-card
                    class="mx-auto"
                    max-width="500"
                    outlined
                    justify="center"
                    style="background: #37474F;"
                  >
                    <v-row>
                      <v-list-item class="col-md-12">
                        <v-list-item-content>
                          <v-row justify="center">
                            <v-img :src="rune.img_rune" max-width="45"></v-img>
                          </v-row>
                          <v-row justify="center">
                            <span class="font-weight-medium" :class="`red--text`">{{rune.name}}</span>
                          </v-row>
                        </v-list-item-content>
                        <v-list-item-content>
                          <v-row style="col: 30px; margin-left: 5px;">
                            <v-list-item-title
                              class="font-weight-medium"
                              :class="`red--text`"
                            >ประเภทรูน</v-list-item-title>
                          </v-row>
                          <v-row style="col: 30px; margin-left: 5px;">
                            <p
                              class="text-caption"
                              :class="`white--text`"
                              v-for="(types, index) in rune.types"
                              :key="index"
                              style="margin-right: 15px;"
                            >{{types.typeRune}}</p>
                          </v-row>
                        </v-list-item-content>
                        <v-list-item-content>
                          <v-list-item-title
                            class="font-weight-medium"
                            :class="`red--text`"
                          >เอฟเฟกต์</v-list-item-title>
                          <p class="text-caption" :class="`white--text`">{{rune.effect}}</p>
                        </v-list-item-content>
                      </v-list-item>
                    </v-row>
                  </v-card>
                </v-col>
              </v-row>
            </div>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!-------------------- หน้า Level 2 --------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Level 2'">
            <v-container style="background: #455A64"></v-container>
            <div style="col: 30px; background: #455A64" v-for="(rune, index) in runes" :key="index">
              <v-row>
                <v-col cols="12" v-if="rune.level.level === 2">
                  <v-card
                    class="mx-auto"
                    max-width="500"
                    outlined
                    justify="center"
                    style="background: #37474F;"
                  >
                    <v-row>
                      <v-list-item class="col-md-12">
                        <v-list-item-content>
                          <v-row justify="center">
                            <v-img :src="rune.img_rune" max-width="45"></v-img>
                          </v-row>
                          <v-row justify="center">
                            <span class="font-weight-medium" :class="`red--text`">{{rune.name}}</span>
                          </v-row>
                        </v-list-item-content>
                        <v-list-item-content>
                          <v-row style="col: 30px; margin-left: 5px;">
                            <v-list-item-title
                              class="font-weight-medium"
                              :class="`red--text`"
                            >ประเภทรูน</v-list-item-title>
                          </v-row>
                          <v-row style="col: 30px; margin-left: 5px;">
                            <p
                              class="text-caption"
                              :class="`white--text`"
                              v-for="(types, index) in rune.types"
                              :key="index"
                              style="margin-right: 15px;"
                            >{{types.typeRune}}</p>
                          </v-row>
                        </v-list-item-content>
                        <v-list-item-content>
                          <v-list-item-title
                            class="font-weight-medium"
                            :class="`red--text`"
                          >เอฟเฟกต์</v-list-item-title>
                          <p class="text-caption" :class="`white--text`">{{rune.effect}}</p>
                        </v-list-item-content>
                      </v-list-item>
                    </v-row>
                  </v-card>
                </v-col>
              </v-row>
            </div>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!----------------------- หน้า Level 3 --------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Level 3'">
            <v-container style="background: #455A64"></v-container>
            <div style="col: 30px; background: #455A64" v-for="(rune, index) in runes" :key="index">
              <v-row>
                <v-col cols="12" v-if="rune.level.level === 3">
                  <v-card
                    class="mx-auto"
                    max-width="500"
                    outlined
                    justify="center"
                    style="background: #37474F;"
                  >
                    <v-row>
                      <v-list-item class="col-md-12">
                        <v-list-item-content>
                          <v-row justify="center">
                            <v-img :src="rune.img_rune" max-width="45"></v-img>
                          </v-row>
                          <v-row justify="center">
                            <span class="font-weight-medium" :class="`red--text`">{{rune.name}}</span>
                          </v-row>
                        </v-list-item-content>
                        <v-list-item-content>
                          <v-row style="col: 30px; margin-left: 5px;">
                            <v-list-item-title
                              class="font-weight-medium"
                              :class="`red--text`"
                            >ประเภทรูน</v-list-item-title>
                          </v-row>
                          <v-row style="col: 30px; margin-left: 5px;">
                            <p
                              class="text-caption"
                              :class="`white--text`"
                              v-for="(types, index) in rune.types"
                              :key="index"
                              style="margin-right: 15px;"
                            >{{types.typeRune}}</p>
                          </v-row>
                        </v-list-item-content>
                        <v-list-item-content>
                          <v-list-item-title
                            class="font-weight-medium"
                            :class="`red--text`"
                          >เอฟเฟกต์</v-list-item-title>
                          <p class="text-caption" :class="`white--text`">{{rune.effect}}</p>
                        </v-list-item-content>
                      </v-list-item>
                    </v-row>
                  </v-card>
                </v-col>
              </v-row>
            </div>
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
  name: "rune",
  data() {
    return {
      tab: null,
      tabnames: [
        { text: "All Runes" },
        { text: "Level 1" },
        { text: "Level 2" },
        { text: "Level 3" },
      ],
      runes: [],
    };
  },

  methods: {
    /* eslint-disable no-console */
    retrieveRunes() {
      http
        .get("/rune")
        .then((response) => {
          this.runes = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    refreshList() {
      this.retrieveRunes();
    },
    /* eslint-enable no-console */
  },
  mounted() {
    this.retrieveRunes();
  },
};
</script>
