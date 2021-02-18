<template>
  <v-container>
    <v-card-title class="text-center justify-center py-6">
      <h1 class="font-weight-bold display-3 basil--text">ไอเทมทั้งหมด</h1>
    </v-card-title>
    <v-card class="col-md" style="background: #455a64">
      <v-tabs v-model="tab" background-color="#455A64" color="white" right>
        <v-tab v-for="tabname in tabnames" :key="tabname.text">
          <v-tab-item-content class="text-center">
            <v-tab-item-title>{{ tabname.text }}</v-tab-item-title>
          </v-tab-item-content>
        </v-tab>
      </v-tabs>
      <v-divider dark></v-divider>

      <v-tabs-items v-model="tab">
        <v-tab-item v-for="tabname in tabnames" :key="tabname">
          <v-flex shrink display-1></v-flex>
          <!------------------------------------------------------------------------>
          <!------------------------- หน้า โจมตี ------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'โจมตี'">
            <v-container style="background: #455a64"></v-container>
            <div
              style="col: 30px; background: #455a64"
              v-for="(item, index) in items"
              :key="index"
            >
              <v-row>
                <v-col cols="12" v-if="item.typeItem.typeItem === 'โจมตี'">
                  <v-card
                    class="mx-auto"
                    max-width="600"
                    outlined
                    justify="center"
                    style="background: #37474f"
                  >
                    <v-row style="margin-left: 15px">
                      <v-list-item class="col-md-12" three-line>
                        <v-list-item-content style="margin-right: 25px">
                          <v-col>
                            <v-card
                              class="col-md-12"
                              max-width="150"
                              outlined
                              style="background: #37474f"
                            >
                              <v-row justify="center">
                                <v-img
                                  :src="item.img_item"
                                  max-width="60"
                                ></v-img>
                              </v-row>
                              <v-row justify="center">
                                <span
                                  class="font-weight"
                                  :class="`red--text`"
                                  >{{ item.name }}</span
                                >
                              </v-row>
                            </v-card>
                          </v-col>

                          <v-row
                            style="margin-left: 30px"
                            class="col-md-12"
                            justify="center"
                          >
                            <v-row>
                              <v-list-item-title
                                class="font-weight-medium"
                                :class="`red--text`"
                                >ราคา</v-list-item-title
                              >
                              <p class="text-caption" :class="`white--text`">
                                {{ item.priceItem }}
                              </p>
                            </v-row>
                          </v-row>
                        </v-list-item-content>
                        <v-col>
                          <v-list-item-content
                            class="font-weight-medium"
                            :class="`red--text`"
                            >เอฟเฟกต์
                            <v-list-item-title
                              ><v-row
                                style="margin-left: 0px"
                                v-for="(property, index) in item.propertys"
                                :key="index"
                              >
                                <p class="text-caption" :class="`white--text`">
                                  {{ property.effects.effect }} +
                                </p>
                                <p
                                  class="text-caption"
                                  :class="`white--text`"
                                  v-if="
                                    property.effects.effect ==
                                      'อัตราคริติคอล' ||
                                    property.effects.effect ==
                                      'ความเร็วโจมตี' ||
                                    property.effects.effect == 'ดูดเลือด' ||
                                    property.effects.effect == 'เวทแวมไพร์' ||
                                    property.effects.effect ==
                                      'ความเสียหายคริติคอล' ||
                                    property.effects.effect == 'ลดคูลดาวน์'
                                  "
                                >
                                  {{ property.propertyItem }}%
                                </p>
                                <p
                                  class="text-caption"
                                  :class="`white--text`"
                                  v-else
                                >
                                  {{ property.propertyItem }}
                                </p>
                              </v-row></v-list-item-title
                            >
                          </v-list-item-content>
                          <v-list-item-content>
                            <v-list-item-title
                              class="font-weight-medium"
                              :class="`red--text`"
                              >เอฟเฟกต์พิเศษ</v-list-item-title
                            >
                            <p class="text-caption" :class="`white--text`">
                              {{ item.specialEffect }}
                            </p>
                          </v-list-item-content>
                        </v-col>
                      </v-list-item>
                    </v-row>
                  </v-card>
                </v-col>
              </v-row>
            </div>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!------------------------ หน้า เวท --------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'เวท'">
            <v-container style="background: #455a64"></v-container>
            <div
              style="col: 30px; background: #455a64"
              v-for="(item, index) in items"
              :key="index"
            >
              <v-row>
                <v-col cols="12" v-if="item.typeItem.typeItem === 'เวท'">
                  <v-card
                    class="mx-auto"
                    max-width="500"
                    outlined
                    justify="center"
                    style="background: #37474f"
                  >
                    <v-row style="margin-left: 15px">
                      <v-list-item class="col-md-12" three-line>
                        <v-list-item-content style="margin-right: 25px">
                          <v-col>
                            <v-card
                              class="col-md-12"
                              max-width="150"
                              outlined
                              style="background: #37474f"
                            >
                              <v-row justify="center">
                                <v-img
                                  :src="item.img_item"
                                  max-width="60"
                                ></v-img>
                              </v-row>
                              <v-row justify="center">
                                <span
                                  class="font-weight"
                                  :class="`red--text`"
                                  >{{ item.name }}</span
                                >
                              </v-row>
                            </v-card>
                          </v-col>

                          <v-row
                            style="margin-left: 30px"
                            class="col-md-12"
                            justify="center"
                          >
                            <v-row>
                              <v-list-item-title
                                class="font-weight-medium"
                                :class="`red--text`"
                                >ราคา</v-list-item-title
                              >
                              <p class="text-caption" :class="`white--text`">
                                {{ item.priceItem }}
                              </p>
                            </v-row>
                          </v-row>
                        </v-list-item-content>
                        <v-col>
                          <v-list-item-content>
                            <v-list-item-title
                              class="font-weight-medium"
                              :class="`red--text`"
                              >เอฟเฟกต์</v-list-item-title
                            >
                            <v-row
                              style="margin-left: 0px"
                              v-for="(property, index) in item.propertys"
                              :key="index"
                            >
                              <p class="text-caption" :class="`white--text`">
                                {{ property.effects.effect }} +
                              </p>
                              <p
                                class="text-caption"
                                :class="`white--text`"
                                v-if="
                                  property.effects.effect == 'อัตราคริติคอล' ||
                                  property.effects.effect == 'ความเร็วโจมตี' ||
                                  property.effects.effect == 'ดูดเลือด' ||
                                  property.effects.effect == 'เวทแวมไพร์' ||
                                  property.effects.effect ==
                                    'ความเสียหายคริติคอล' ||
                                  property.effects.effect == 'ลดคูลดาวน์'
                                "
                              >
                                {{ property.propertyItem }}%
                              </p>
                              <p
                                class="text-caption"
                                :class="`white--text`"
                                v-else
                              >
                                {{ property.propertyItem }}
                              </p>
                            </v-row>
                          </v-list-item-content>
                          <v-list-item-content>
                            <v-list-item-title
                              class="font-weight-medium"
                              :class="`red--text`"
                              >เอฟเฟกต์พิเศษ</v-list-item-title
                            >
                            <p class="text-caption" :class="`white--text`">
                              {{ item.specialEffect }}
                            </p>
                          </v-list-item-content>
                        </v-col>
                      </v-list-item>
                    </v-row>
                  </v-card>
                </v-col>
              </v-row>
            </div>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!---------------------- หน้า ป้องกัน --------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'ป้องกัน'">
            <v-container style="background: #455a64"></v-container>
            <div
              style="col: 30px; background: #455a64"
              v-for="(item, index) in items"
              :key="index"
            >
              <v-row>
                <v-col cols="12" v-if="item.typeItem.typeItem === 'ป้องกัน'">
                  <v-card
                    class="mx-auto"
                    max-width="500"
                    outlined
                    justify="center"
                    style="background: #37474f"
                  >
                    <v-row style="margin-left: 15px">
                      <v-list-item class="col-md-12" three-line>
                        <v-list-item-content style="margin-right: 25px">
                          <v-col>
                            <v-card
                              class="col-md-12"
                              max-width="150"
                              outlined
                              style="background: #37474f"
                            >
                              <v-row justify="center">
                                <v-img
                                  :src="item.img_item"
                                  max-width="60"
                                ></v-img>
                              </v-row>
                              <v-row justify="center">
                                <span
                                  class="font-weight"
                                  :class="`red--text`"
                                  >{{ item.name }}</span
                                >
                              </v-row>
                            </v-card>
                          </v-col>

                          <v-row
                            style="margin-left: 30px"
                            class="col-md-12"
                            justify="center"
                          >
                            <v-row>
                              <v-list-item-title
                                class="font-weight-medium"
                                :class="`red--text`"
                                >ราคา</v-list-item-title
                              >
                              <p class="text-caption" :class="`white--text`">
                                {{ item.priceItem }}
                              </p>
                            </v-row>
                          </v-row>
                        </v-list-item-content>
                        <v-col>
                          <v-list-item-content>
                            <v-list-item-title
                              class="font-weight-medium"
                              :class="`red--text`"
                              >เอฟเฟกต์</v-list-item-title
                            >
                            <v-row
                              style="margin-left: 0px"
                              v-for="(property, index) in item.propertys"
                              :key="index"
                            >
                              <p class="text-caption" :class="`white--text`">
                                {{ property.effects.effect }} +
                              </p>
                              <p
                                class="text-caption"
                                :class="`white--text`"
                                v-if="
                                  property.effects.effect == 'อัตราคริติคอล' ||
                                  property.effects.effect == 'ความเร็วโจมตี' ||
                                  property.effects.effect == 'ดูดเลือด' ||
                                  property.effects.effect == 'เวทแวมไพร์' ||
                                  property.effects.effect ==
                                    'ความเสียหายคริติคอล' ||
                                  property.effects.effect == 'ลดคูลดาวน์'
                                "
                              >
                                {{ property.propertyItem }}%
                              </p>
                              <p
                                class="text-caption"
                                :class="`white--text`"
                                v-else
                              >
                                {{ property.propertyItem }}
                              </p>
                            </v-row>
                          </v-list-item-content>
                          <v-list-item-content>
                            <v-list-item-title
                              class="font-weight-medium"
                              :class="`red--text`"
                              >เอฟเฟกต์พิเศษ</v-list-item-title
                            >
                            <p class="text-caption" :class="`white--text`">
                              {{ item.specialEffect }}
                            </p>
                          </v-list-item-content>
                        </v-col>
                      </v-list-item>
                    </v-row>
                  </v-card>
                </v-col>
              </v-row>
            </div>
          </v-flex>
          <!------------------------------------------------------------------------>
          <!----------------------- หน้า เคลื่อนที่ ------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'เคลื่อนที่'">
            <v-container style="background: #455a64"></v-container>
            <div
              style="col: 30px; background: #455a64"
              v-for="(item, index) in items"
              :key="index"
            >
              <v-row>
                <v-col cols="12" v-if="item.typeItem.typeItem === 'เคลื่อนที่'">
                  <v-card
                    class="mx-auto"
                    max-width="500"
                    outlined
                    justify="center"
                    style="background: #37474f"
                  >
                    <v-row style="margin-left: 15px">
                      <v-list-item class="col-md-12" three-line>
                        <v-list-item-content style="margin-right: 25px">
                          <v-col>
                            <v-card
                              class="col-md-12"
                              max-width="150"
                              outlined
                              style="background: #37474f"
                            >
                              <v-row justify="center">
                                <v-img
                                  :src="item.img_item"
                                  max-width="60"
                                ></v-img>
                              </v-row>
                              <v-row justify="center">
                                <span
                                  class="font-weight"
                                  :class="`red--text`"
                                  >{{ item.name }}</span
                                >
                              </v-row>
                            </v-card>
                          </v-col>

                          <v-row
                            style="margin-left: 30px"
                            class="col-md-12"
                            justify="center"
                          >
                            <v-row>
                              <v-list-item-title
                                class="font-weight-medium"
                                :class="`red--text`"
                                >ราคา</v-list-item-title
                              >
                              <p class="text-caption" :class="`white--text`">
                                {{ item.priceItem }}
                              </p>
                            </v-row>
                          </v-row>
                        </v-list-item-content>
                        <v-col>
                          <v-list-item-content>
                            <v-list-item-title
                              class="font-weight-medium"
                              :class="`red--text`"
                              >เอฟเฟกต์</v-list-item-title
                            >
                            <v-row
                              style="margin-left: 0px"
                              v-for="(property, index) in item.propertys"
                              :key="index"
                            >
                              <p class="text-caption" :class="`white--text`">
                                {{ property.effects.effect }} +
                              </p>
                              <p
                                class="text-caption"
                                :class="`white--text`"
                                v-if="
                                  property.effects.effect == 'อัตราคริติคอล' ||
                                  property.effects.effect == 'ความเร็วโจมตี' ||
                                  property.effects.effect == 'ดูดเลือด' ||
                                  property.effects.effect == 'เวทแวมไพร์' ||
                                  property.effects.effect ==
                                    'ความเสียหายคริติคอล' ||
                                  property.effects.effect == 'ลดคูลดาวน์'
                                "
                              >
                                {{ property.propertyItem }}%
                              </p>
                              <p
                                class="text-caption"
                                :class="`white--text`"
                                v-else
                              >
                                {{ property.propertyItem }}
                              </p>
                            </v-row>
                          </v-list-item-content>
                          <v-list-item-content>
                            <v-list-item-title
                              class="font-weight-medium"
                              :class="`red--text`"
                              >เอฟเฟกต์พิเศษ</v-list-item-title
                            >
                            <p class="text-caption" :class="`white--text`">
                              {{ item.specialEffect }}
                            </p>
                          </v-list-item-content>
                        </v-col>
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
  name: "item",
  data() {
    return {
      tab: null,
      tabnames: [
        { text: "โจมตี" },
        { text: "เวท" },
        { text: "ป้องกัน" },
        { text: "เคลืื่อนที่" },
        { text: "ป่า" },
        { text: "สนับสนุน" },
      ],
      items: [],
    };
  },

  methods: {
    /* eslint-disable no-console */
    retrieveItems() {
      http
        .get("/item")
        .then((response) => {
          this.items = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    refreshList() {
      this.retrieveItems();
    },
    /* eslint-enable no-console */
  },
  mounted() {
    this.retrieveItems();
  },
};
</script>
