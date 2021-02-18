<template>
  <v-container>
    <v-card-title class="text-center justify-center py-6">
      <h1 class="font-weight-bold display-3 basil--text">สกิลทั้งหมด</h1>
    </v-card-title>
    <v-card class="col-md" style="background: #455a64">
      <v-tabs v-model="tab" background-color="#455A64" color="white" right>
        <v-tab v-for="tabname in tabnames" :key="tabname.text">
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
          <!-------------------------- หน้า Heroic ---------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Heroic'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div v-for="(skin, index) in skins" :key="index">
                <v-hover v-if="skin.typeSkin.typeSkin === 'Heroic'">
                  <template v-slot:default="{ hover }">
                    <v-container style="margin-right: 40px">
                      <v-card class="mx-auto" max-width="180" outline
                        ><v-img max-width="300" :src="skin.img_small"></v-img>
                        <v-fade-transition>
                          <v-overlay v-if="hover" absolute color="#036358">
                            <v-btn
                              :to="{
                                name: 'skin-details',
                                params: { skin: skin, id: skin.id },
                              }"
                              >See more info</v-btn
                            >
                          </v-overlay>
                        </v-fade-transition>
                      </v-card></v-container
                    ></template
                  ></v-hover
                >
              </div></v-row
            >
          </v-flex>

          <!------------------------------------------------------------------------>
          <!---------------------------- หน้า Epic ---------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Epic'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div v-for="(skin, index) in skins" :key="index">
                <v-hover v-if="skin.typeSkin.typeSkin === 'Epic'">
                  <template v-slot:default="{ hover }">
                    <v-container style="margin-right: 40px">
                      <v-card class="mx-auto" max-width="180" outline
                        ><v-img max-width="300" :src="skin.img_small"></v-img>
                        <v-fade-transition>
                          <v-overlay v-if="hover" absolute color="#036358">
                            <v-btn
                              :to="{
                                name: 'skin-details',
                                params: { skin: skin, id: skin.id },
                              }"
                              >See more info</v-btn
                            >
                          </v-overlay>
                        </v-fade-transition>
                      </v-card></v-container
                    ></template
                  >
                </v-hover>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!------------------------ หน้า Ultimate ---------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Ultimate'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div v-for="(skin, index) in skins" :key="index">
                <v-hover v-if="skin.typeSkin.typeSkin === 'Ultimate'">
                  <template v-slot:default="{ hover }">
                    <v-container style="margin-right: 40px">
                      <v-card class="mx-auto" max-width="180" outline
                        ><v-img max-width="300" :src="skin.img_small"></v-img>
                        <v-fade-transition>
                          <v-overlay v-if="hover" absolute color="#036358">
                            <v-btn
                              :to="{
                                name: 'skin-details',
                                params: { skin: skin, id: skin.id },
                              }"
                              >See more info</v-btn
                            >
                          </v-overlay>
                        </v-fade-transition>
                      </v-card></v-container
                    ></template
                  >
                </v-hover>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!-------------------------- หน้า Legend ---------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Legend'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div v-for="(skin, index) in skins" :key="index">
                <v-hover v-if="skin.typeSkin.typeSkin === 'Legend'">
                  <template v-slot:default="{ hover }">
                    <v-container style="margin-right: 40px">
                      <v-card class="mx-auto" max-width="180" outline
                        ><v-img max-width="300" :src="skin.img_small"></v-img>
                        <v-fade-transition>
                          <v-overlay v-if="hover" absolute color="#036358">
                            <v-btn
                              :to="{
                                name: 'skin-details',
                                params: { skin: skin, id: skin.id },
                              }"
                              >See more info</v-btn
                            >
                          </v-overlay>
                        </v-fade-transition>
                      </v-card></v-container
                    ></template
                  >
                </v-hover>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!------------------------- หน้า SUPREME ---------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'SUPREME'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div v-for="(skin, index) in skins" :key="index">
                <v-hover v-if="skin.typeSkin.typeSkin === 'SUPREME'">
                  <template v-slot:default="{ hover }">
                    <v-container style="margin-right: 40px">
                      <v-card class="mx-auto" max-width="180" outline
                        ><v-img max-width="300" :src="skin.img_small"></v-img>
                        <v-fade-transition>
                          <v-overlay v-if="hover" absolute color="#036358">
                            <v-btn
                              :to="{
                                name: 'skin-details',
                                params: { skin: skin, id: skin.id },
                              }"
                              >See more info</v-btn
                            >
                          </v-overlay>
                        </v-fade-transition>
                      </v-card></v-container
                    ></template
                  >
                </v-hover>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!--------------------------- หน้า VALOR ---------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'VALOR'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div v-for="(skin, index) in skins" :key="index">
                <v-hover v-if="skin.typeSkin.typeSkin === 'VALOR'">
                  <template v-slot:default="{ hover }">
                    <v-container style="margin-right: 40px">
                      <v-card class="mx-auto" max-width="180" outline
                        ><v-img max-width="300" :src="skin.img_small"></v-img>
                        <v-fade-transition>
                          <v-overlay v-if="hover" absolute color="#036358">
                            <v-btn
                              :to="{
                                name: 'skin-details',
                                params: { skin: skin, id: skin.id },
                              }"
                              >See more info</v-btn
                            >
                          </v-overlay>
                        </v-fade-transition>
                      </v-card></v-container
                    ></template
                  >
                </v-hover>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!----------------------------- หน้า EVO ---------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'EVO'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div v-for="(skin, index) in skins" :key="index">
                <v-hover v-if="skin.typeSkin.typeSkin === 'EVO'">
                  <template v-slot:default="{ hover }">
                    <v-container style="margin-right: 40px">
                      <v-card class="mx-auto" max-width="180" outline
                        ><v-img max-width="300" :src="skin.img_small"></v-img>
                        <v-fade-transition>
                          <v-overlay v-if="hover" absolute color="#036358">
                            <v-btn
                              :to="{
                                name: 'skin-details',
                                params: { skin: skin, id: skin.id },
                              }"
                              >See more info</v-btn
                            >
                          </v-overlay>
                        </v-fade-transition>
                      </v-card></v-container
                    ></template
                  >
                </v-hover>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!------------------------- หน้า Limited ---------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Limited'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div v-for="(skin, index) in skins" :key="index">
                <v-hover v-if="skin.typeSkin.typeSkin === 'Limited'">
                  <template v-slot:default="{ hover }">
                    <v-container style="margin-right: 40px">
                      <v-card class="mx-auto" max-width="180" outline
                        ><v-img max-width="300" :src="skin.img_small"></v-img>
                        <v-fade-transition>
                          <v-overlay v-if="hover" absolute color="#036358">
                            <v-btn
                              :to="{
                                name: 'skin-details',
                                params: { skin: skin, id: skin.id },
                              }"
                              >See more info</v-btn
                            >
                          </v-overlay>
                        </v-fade-transition>
                      </v-card></v-container
                    ></template
                  >
                </v-hover>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!----------------------- หน้า Miracle ---------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Miracle'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div v-for="(skin, index) in skins" :key="index">
                <v-hover v-if="skin.typeSkin.typeSkin === 'Miracle'">
                  <template v-slot:default="{ hover }">
                    <v-container style="margin-right: 40px">
                      <v-card class="mx-auto" max-width="180" outline
                        ><v-img max-width="300" :src="skin.img_small"></v-img>
                        <v-fade-transition>
                          <v-overlay v-if="hover" absolute color="#036358">
                            <v-btn
                              :to="{
                                name: 'skin-details',
                                params: { skin: skin, id: skin.id },
                              }"
                              >See more info</v-btn
                            >
                          </v-overlay>
                        </v-fade-transition>
                      </v-card></v-container
                    ></template
                  >
                </v-hover>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!----------------------- หน้า ESTEEM ---------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'ESTEEM'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div v-for="(skin, index) in skins" :key="index">
                <v-hover v-if="skin.typeSkin.typeSkin === 'ESTEEM'">
                  <template v-slot:default="{ hover }">
                    <v-container style="margin-right: 40px">
                      <v-card class="mx-auto" max-width="180" outline
                        ><v-img max-width="300" :src="skin.img_small"></v-img>
                        <v-fade-transition>
                          <v-overlay v-if="hover" absolute color="#036358">
                            <v-btn
                              :to="{
                                name: 'skin-details',
                                params: { skin: skin, id: skin.id },
                              }"
                              >see more</v-btn
                            >
                          </v-overlay>
                        </v-fade-transition>
                      </v-card></v-container
                    ></template
                  >
                </v-hover>
              </div>
            </v-row>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!----------------------- หน้า Mythical ---------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Mythical'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div v-for="(skin, index) in skins" :key="index">
                <v-hover v-if="skin.typeSkin.typeSkin === 'Mythical'">
                  <template v-slot:default="{ hover }">
                    <v-container style="margin-right: 40px">
                      <v-card class="mx-auto" max-width="180" outline
                        ><v-img max-width="300" :src="skin.img_small"></v-img>
                        <v-fade-transition>
                          <v-overlay v-if="hover" absolute color="#036358">
                            <v-btn
                              :to="{
                                name: 'skin-details',
                                params: { skin: skin, id: skin.id },
                              }"
                              >See more info</v-btn
                            >
                          </v-overlay>
                        </v-fade-transition>
                      </v-card></v-container
                    ></template
                  >
                </v-hover>
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
  name: "skin-list",
  data() {
    return {
      tab: null,
      tabnames: [
        { text: "Heroic" },
        { text: "Epic" },
        { text: "Ultimate" },
        { text: "Legend" },
        { text: "SUPREME" },
        { text: "VALOR" },
        { text: "EVO" },
        { text: "Limited" },
        { text: "Miracle" },
        { text: "ESTEEM" },
        { text: "Mythical" },
      ],
      skins: [],
    };
  },
  methods: {
    /* eslint-disable no-console */
    retrieveSkins() {
      http
        .get("/skin")
        .then((response) => {
          this.skins = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    /* eslint-enable no-console */
  },
  mounted() {
    this.retrieveSkins();
  },
};
</script>
