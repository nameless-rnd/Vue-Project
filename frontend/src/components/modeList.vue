<template>
  <v-container>
    <v-card-title class="text-center justify-center py-6">
      <h1 class="font-weight-bold display-3 basil--text">โหมดทั้งหมด</h1>
    </v-card-title>
    <v-container>
      <div class="text-center">
        <h2 class="red--text font-weight-black">
          มีโหมดให้เลือกเล่นมากมายหลายแบบ!
        </h2>
      </div>
    </v-container>

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
          <!----------------------- หน้า โหมดทั่วไป ---------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'โหมดทั่วไป'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div
                v-for="(mode, index) in modes"
                :key="index"
                style="margin-left: 13px"
              >
                <v-hover>
                  <template v-slot:default="{ hover }" >
                    <v-container>
                    <v-card
                      class="mx-auto"
                      max-width="344"
                      outline
                      v-if="mode.typeMode.typeMode === 'โหมดทั่วไป'"
                    >
                      <v-img :src="mode.img_mode" height="520px"></v-img>

                      <v-fade-transition>
                        <v-overlay v-if="hover" absolute color="#036358">
                          <v-btn
                            :to="{
                              name: 'mode-details',
                              params: { mode: mode, id: mode.id },
                            }"
                            >See more info</v-btn
                          >
                        </v-overlay>
                      </v-fade-transition>
                    </v-card></v-container>
                  </template>
                </v-hover>
              </div>
            </v-row>
          </v-flex>

          <!------------------------------------------------------------------------>
          <!----------------------- หน้า โหมดบันเทิง ---------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'โหมดบันเทิง'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div
                v-for="(mode, index) in modes"
                :key="index"
                style="margin-left: 13px"
              >
                <v-hover>
                  <template v-slot:default="{ hover }" >
                    <v-container>
                    <v-card
                      class="mx-auto"
                      max-width="344"
                      outline
                      v-if="mode.typeMode.typeMode === 'โหมดบันเทิง'"
                    >
                      <v-img :src="mode.img_mode" height="520px"></v-img>

                      <v-fade-transition>
                        <v-overlay v-if="hover" absolute color="#036358">
                          <v-btn
                            :to="{
                              name: 'mode-details',
                              params: { mode: mode, id: mode.id },
                            }"
                            >See more info</v-btn
                          >
                        </v-overlay>
                      </v-fade-transition>
                    </v-card></v-container>
                  </template>
                </v-hover>
              </div>
            </v-row>
          </v-flex>

          <!------------------------------------------------------------------------>
          <!----------------------- หน้า โหมดพิเศษ ---------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'โหมดพิเศษ'">
            <v-container style="background: #455a64"></v-container>
            <v-row style="col: 30px; margin-left: 0px; background: #455a64">
              <div
                v-for="(mode, index) in modes"
                :key="index"
                style="margin-left: 13px"
              >
                <v-hover>
                  <template v-slot:default="{ hover }" >
                    <v-container>
                    <v-card
                      class="mx-auto"
                      max-width="344"
                      outline
                      v-if="mode.typeMode.typeMode === 'โหมดพิเศษ'"
                    >
                      <v-img :src="mode.img_mode" height="520px"></v-img>

                      <v-fade-transition>
                        <v-overlay v-if="hover" absolute color="#036358">
                          <v-btn
                            :to="{
                              name: 'mode-details',
                              params: { mode: mode, id: mode.id },
                            }"
                            >See more info</v-btn
                          >
                        </v-overlay>
                      </v-fade-transition>
                    </v-card></v-container>
                  </template>
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
  name: "mode-list",
  data() {
    return {
      tab: null,
      tabnames: [
        { text: "โหมดทั่วไป" },
        { text: "โหมดบันเทิง" },
        { text: "โหมดพิเศษ" },
      ],
      modes: [],
    };
  },

  methods: {
    /* eslint-disable no-console */
    retrieveModes() {
      http
        .get("/mode")
        .then((response) => {
          this.modes = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },

    /* eslint-enable no-console */
  },
  mounted() {
    this.retrieveModes();
  },
};
</script>
