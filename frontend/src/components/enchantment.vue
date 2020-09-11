<template>
  <v-container>
    <v-card-title class="text-center justify-center py-6">
      <h1 class="font-weight-bold display-3 basil--text">พลังแฝงทั้งหมด</h1>
    </v-card-title>
    <v-card class="col-md" style="background: #455A64">
      <v-tabs v-model="tab" background-color="#455A64" color="white" right>
        <v-tab v-for="tabname in tabnames" :key="tabname.text">
          <v-tab-item-avatar style="margin-right: 5px;">
            <v-img :src="tabname.avatar" max-width="20"></v-img>
          </v-tab-item-avatar>
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
          <!---------------------- หน้า AFATA --------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Afata'">
            <v-container style="background: #455A64"></v-container>
            <v-tabs vertical background-color="#455A64" color="white">
              <v-tab>ขั้นที่ 1</v-tab>
              <v-tab>ขั้นที่ 2</v-tab>
              <v-tab>ขั้นที่ 3</v-tab>

              <v-tab-item style="background: #455A64">
                <v-card flat style="background: #455A64">
                  <v-card-text>
                    <div
                      style="col: 30px; background: #455A64"
                      v-for="(enchantment , index) in enchantments"
                      :key="index"
                    >
                      <v-row>
                        <v-col
                          cols="12"
                          v-if="enchantment.levelEn.levelEn === 1 && enchantment.typeEn.typeEn === 'Afata'"
                        >
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
                                    <v-img :src="enchantment.image" max-width="50"></v-img>
                                  </v-row>
                                  <v-row justify="center">
                                    <span
                                      class="font-weight-medium"
                                      :class="`red--text`"
                                    >{{enchantment.name}}</span>
                                  </v-row>
                                </v-list-item-content>
                                <v-list-item-content style="margin-right: 40px;">
                                  <v-list-item-title
                                    class="font-weight-medium"
                                    :class="`red--text`"
                                  >เอฟเฟกต์</v-list-item-title>
                                  <p
                                    class="text-caption"
                                    :class="`white--text`"
                                  >{{enchantment.detail}}</p>
                                </v-list-item-content>
                              </v-list-item>
                            </v-row>
                          </v-card>
                        </v-col>
                      </v-row>
                    </div>
                  </v-card-text>
                </v-card>
              </v-tab-item>

              <v-tab-item style="background: #455A64">
                <v-card flat style="background: #455A64">
                  <v-card-text>
                    <div
                      style="col: 30px; background: #455A64"
                      v-for="(enchantment , index) in enchantments"
                      :key="index"
                    >
                      <v-row>
                        <v-col
                          cols="12"
                          v-if="enchantment.levelEn.levelEn === 2 && enchantment.typeEn.typeEn === 'Afata'"
                        >
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
                                    <v-img :src="enchantment.image" max-width="50"></v-img>
                                  </v-row>
                                  <v-row justify="center">
                                    <span
                                      class="font-weight-medium"
                                      :class="`red--text`"
                                    >{{enchantment.name}}</span>
                                  </v-row>
                                </v-list-item-content>
                                <v-list-item-content style="margin-right: 40px;">
                                  <v-list-item-title
                                    class="font-weight-medium"
                                    :class="`red--text`"
                                  >เอฟเฟกต์</v-list-item-title>
                                  <p
                                    class="text-caption"
                                    :class="`white--text`"
                                  >{{enchantment.detail}}</p>
                                </v-list-item-content>
                              </v-list-item>
                            </v-row>
                          </v-card>
                        </v-col>
                      </v-row>
                    </div>
                  </v-card-text>
                </v-card>
              </v-tab-item>

              <v-tab-item style="background: #455A64">
                <v-card flat style="background: #455A64">
                  <v-card-text>
                    <div
                      style="col: 30px; background: #455A64"
                      v-for="(enchantment , index) in enchantments"
                      :key="index"
                    >
                      <v-row>
                        <v-col
                          cols="12"
                          v-if="enchantment.levelEn.levelEn === 3 && enchantment.typeEn.typeEn === 'Afata'"
                        >
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
                                    <v-img :src="enchantment.image" max-width="50"></v-img>
                                  </v-row>
                                  <v-row justify="center">
                                    <span
                                      class="font-weight-medium"
                                      :class="`red--text`"
                                    >{{enchantment.name}}</span>
                                  </v-row>
                                </v-list-item-content>
                                <v-list-item-content style="margin-right: 40px;">
                                  <v-list-item-title
                                    class="font-weight-medium"
                                    :class="`red--text`"
                                  >เอฟเฟกต์</v-list-item-title>
                                  <p
                                    class="text-caption"
                                    :class="`white--text`"
                                  >{{enchantment.detail}}</p>
                                </v-list-item-content>
                              </v-list-item>
                            </v-row>
                          </v-card>
                        </v-col>
                      </v-row>
                    </div>
                  </v-card-text>
                </v-card>
              </v-tab-item>
            </v-tabs>
          </v-flex>

          <!------------------------------------------------------------------------>
          <!---------------------- หน้า Human --------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Human'">
            <v-container style="background: #455A64"></v-container>
            <v-tabs vertical background-color="#455A64" color="white">
              <v-tab>ขั้นที่ 1</v-tab>
              <v-tab>ขั้นที่ 2</v-tab>
              <v-tab>ขั้นที่ 3</v-tab>

              <v-tab-item style="background: #455A64">
                <v-card flat style="background: #455A64">
                  <v-card-text>
                    <div
                      style="col: 30px; background: #455A64"
                      v-for="(enchantment , index) in enchantments"
                      :key="index"
                    >
                      <v-row>
                        <v-col
                          cols="12"
                          v-if="enchantment.levelEn.levelEn === 1 && enchantment.typeEn.typeEn === 'Human'"
                        >
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
                                    <v-img :src="enchantment.image" max-width="50"></v-img>
                                  </v-row>
                                  <v-row justify="center">
                                    <span
                                      class="font-weight-medium"
                                      :class="`red--text`"
                                    >{{enchantment.name}}</span>
                                  </v-row>
                                </v-list-item-content>
                                <v-list-item-content style="margin-right: 40px;">
                                  <v-list-item-title
                                    class="font-weight-medium"
                                    :class="`red--text`"
                                  >เอฟเฟกต์</v-list-item-title>
                                  <p
                                    class="text-caption"
                                    :class="`white--text`"
                                  >{{enchantment.detail}}</p>
                                </v-list-item-content>
                              </v-list-item>
                            </v-row>
                          </v-card>
                        </v-col>
                      </v-row>
                    </div>
                  </v-card-text>
                </v-card>
              </v-tab-item>

              <v-tab-item style="background: #455A64">
                <v-card flat style="background: #455A64">
                  <v-card-text>
                    <div
                      style="col: 30px; background: #455A64"
                      v-for="(enchantment , index) in enchantments"
                      :key="index"
                    >
                      <v-row>
                        <v-col
                          cols="12"
                          v-if="enchantment.levelEn.levelEn === 2 && enchantment.typeEn.typeEn === 'Human'"
                        >
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
                                    <v-img :src="enchantment.image" max-width="50"></v-img>
                                  </v-row>
                                  <v-row justify="center">
                                    <span
                                      class="font-weight-medium"
                                      :class="`red--text`"
                                    >{{enchantment.name}}</span>
                                  </v-row>
                                </v-list-item-content>
                                <v-list-item-content style="margin-right: 40px;">
                                  <v-list-item-title
                                    class="font-weight-medium"
                                    :class="`red--text`"
                                  >เอฟเฟกต์</v-list-item-title>
                                  <p
                                    class="text-caption"
                                    :class="`white--text`"
                                  >{{enchantment.detail}}</p>
                                </v-list-item-content>
                              </v-list-item>
                            </v-row>
                          </v-card>
                        </v-col>
                      </v-row>
                    </div>
                  </v-card-text>
                </v-card>
              </v-tab-item>

              <v-tab-item style="background: #455A64">
                <v-card flat style="background: #455A64">
                  <v-card-text>
                    <div
                      style="col: 30px; background: #455A64"
                      v-for="(enchantment , index) in enchantments"
                      :key="index"
                    >
                      <v-row>
                        <v-col
                          cols="12"
                          v-if="enchantment.levelEn.levelEn === 3 && enchantment.typeEn.typeEn === 'Human'"
                        >
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
                                    <v-img :src="enchantment.image" max-width="50"></v-img>
                                  </v-row>
                                  <v-row justify="center">
                                    <span
                                      class="font-weight-medium"
                                      :class="`red--text`"
                                    >{{enchantment.name}}</span>
                                  </v-row>
                                </v-list-item-content>
                                <v-list-item-content style="margin-right: 40px;">
                                  <v-list-item-title
                                    class="font-weight-medium"
                                    :class="`red--text`"
                                  >เอฟเฟกต์</v-list-item-title>
                                  <p
                                    class="text-caption"
                                    :class="`white--text`"
                                  >{{enchantment.detail}}</p>
                                </v-list-item-content>
                              </v-list-item>
                            </v-row>
                          </v-card>
                        </v-col>
                      </v-row>
                    </div>
                  </v-card-text>
                </v-card>
              </v-tab-item>
            </v-tabs>
          </v-flex>

          <!------------------------------------------------------------------------>
          <!---------------------- หน้า Lokheim --------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Lokheim'">
            <v-container style="background: #455A64"></v-container>
            <v-tabs vertical background-color="#455A64" color="white">
              <v-tab>ขั้นที่ 1</v-tab>
              <v-tab>ขั้นที่ 2</v-tab>
              <v-tab>ขั้นที่ 3</v-tab>

              <v-tab-item style="background: #455A64">
                <v-card flat style="background: #455A64">
                  <v-card-text>
                    <div
                      style="col: 30px; background: #455A64"
                      v-for="(enchantment , index) in enchantments"
                      :key="index"
                    >
                      <v-row>
                        <v-col
                          cols="12"
                          v-if="enchantment.levelEn.levelEn === 1 && enchantment.typeEn.typeEn === 'Lokheim'"
                        >
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
                                    <v-img :src="enchantment.image" max-width="50"></v-img>
                                  </v-row>
                                  <v-row justify="center">
                                    <span
                                      class="font-weight-medium"
                                      :class="`red--text`"
                                    >{{enchantment.name}}</span>
                                  </v-row>
                                </v-list-item-content>
                                <v-list-item-content style="margin-right: 40px;">
                                  <v-list-item-title
                                    class="font-weight-medium"
                                    :class="`red--text`"
                                  >เอฟเฟกต์</v-list-item-title>
                                  <p
                                    class="text-caption"
                                    :class="`white--text`"
                                  >{{enchantment.detail}}</p>
                                </v-list-item-content>
                              </v-list-item>
                            </v-row>
                          </v-card>
                        </v-col>
                      </v-row>
                    </div>
                  </v-card-text>
                </v-card>
              </v-tab-item>

              <v-tab-item style="background: #455A64">
                <v-card flat style="background: #455A64">
                  <v-card-text>
                    <div
                      style="col: 30px; background: #455A64"
                      v-for="(enchantment , index) in enchantments"
                      :key="index"
                    >
                      <v-row>
                        <v-col
                          cols="12"
                          v-if="enchantment.levelEn.levelEn === 2 && enchantment.typeEn.typeEn === 'Lokheim'"
                        >
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
                                    <v-img :src="enchantment.image" max-width="50"></v-img>
                                  </v-row>
                                  <v-row justify="center">
                                    <span
                                      class="font-weight-medium"
                                      :class="`red--text`"
                                    >{{enchantment.name}}</span>
                                  </v-row>
                                </v-list-item-content>
                                <v-list-item-content style="margin-right: 40px;">
                                  <v-list-item-title
                                    class="font-weight-medium"
                                    :class="`red--text`"
                                  >เอฟเฟกต์</v-list-item-title>
                                  <p
                                    class="text-caption"
                                    :class="`white--text`"
                                  >{{enchantment.detail}}</p>
                                </v-list-item-content>
                              </v-list-item>
                            </v-row>
                          </v-card>
                        </v-col>
                      </v-row>
                    </div>
                  </v-card-text>
                </v-card>
              </v-tab-item>

              <v-tab-item style="background: #455A64">
                <v-card flat style="background: #455A64">
                  <v-card-text>
                    <div
                      style="col: 30px; background: #455A64"
                      v-for="(enchantment , index) in enchantments"
                      :key="index"
                    >
                      <v-row>
                        <v-col
                          cols="12"
                          v-if="enchantment.levelEn.levelEn === 3 && enchantment.typeEn.typeEn === 'Lokheim'"
                        >
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
                                    <v-img :src="enchantment.image" max-width="50"></v-img>
                                  </v-row>
                                  <v-row justify="center">
                                    <span
                                      class="font-weight-medium"
                                      :class="`red--text`"
                                    >{{enchantment.name}}</span>
                                  </v-row>
                                </v-list-item-content>
                                <v-list-item-content style="margin-right: 40px;">
                                  <v-list-item-title
                                    class="font-weight-medium"
                                    :class="`red--text`"
                                  >เอฟเฟกต์</v-list-item-title>
                                  <p
                                    class="text-caption"
                                    :class="`white--text`"
                                  >{{enchantment.detail}}</p>
                                </v-list-item-content>
                              </v-list-item>
                            </v-row>
                          </v-card>
                        </v-col>
                      </v-row>
                    </div>
                  </v-card-text>
                </v-card>
              </v-tab-item>
            </v-tabs>
          </v-flex>

          <!------------------------------------------------------------------------>
          <!---------------------- หน้า Veda --------------------------------------->
          <!------------------------------------------------------------------------>
          <v-flex transparent-body v-if="tabname.text === 'Veda'">
            <v-container style="background: #455A64"></v-container>
            <v-tabs vertical background-color="#455A64" color="white">
              <v-tab>ขั้นที่ 1</v-tab>
              <v-tab>ขั้นที่ 2</v-tab>
              <v-tab>ขั้นที่ 3</v-tab>

              <v-tab-item style="background: #455A64">
                <v-card flat style="background: #455A64">
                  <v-card-text>
                    <div
                      style="col: 30px; background: #455A64"
                      v-for="(enchantment , index) in enchantments"
                      :key="index"
                    >
                      <v-row>
                        <v-col
                          cols="12"
                          v-if="enchantment.levelEn.levelEn === 1 && enchantment.typeEn.typeEn === 'Veda'"
                        >
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
                                    <v-img :src="enchantment.image" max-width="50"></v-img>
                                  </v-row>
                                  <v-row justify="center">
                                    <span
                                      class="font-weight-medium"
                                      :class="`red--text`"
                                    >{{enchantment.name}}</span>
                                  </v-row>
                                </v-list-item-content>
                                <v-list-item-content style="margin-right: 40px;">
                                  <v-list-item-title
                                    class="font-weight-medium"
                                    :class="`red--text`"
                                  >เอฟเฟกต์</v-list-item-title>
                                  <p
                                    class="text-caption"
                                    :class="`white--text`"
                                  >{{enchantment.detail}}</p>
                                </v-list-item-content>
                              </v-list-item>
                            </v-row>
                          </v-card>
                        </v-col>
                      </v-row>
                    </div>
                  </v-card-text>
                </v-card>
              </v-tab-item>

              <v-tab-item style="background: #455A64">
                <v-card flat style="background: #455A64">
                  <v-card-text>
                    <div
                      style="col: 30px; background: #455A64"
                      v-for="(enchantment , index) in enchantments"
                      :key="index"
                    >
                      <v-row>
                        <v-col
                          cols="12"
                          v-if="enchantment.levelEn.levelEn === 2 && enchantment.typeEn.typeEn === 'Veda'"
                        >
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
                                    <v-img :src="enchantment.image" max-width="50"></v-img>
                                  </v-row>
                                  <v-row justify="center">
                                    <span
                                      class="font-weight-medium"
                                      :class="`red--text`"
                                    >{{enchantment.name}}</span>
                                  </v-row>
                                </v-list-item-content>
                                <v-list-item-content style="margin-right: 40px;">
                                  <v-list-item-title
                                    class="font-weight-medium"
                                    :class="`red--text`"
                                  >เอฟเฟกต์</v-list-item-title>
                                  <p
                                    class="text-caption"
                                    :class="`white--text`"
                                  >{{enchantment.detail}}</p>
                                </v-list-item-content>
                              </v-list-item>
                            </v-row>
                          </v-card>
                        </v-col>
                      </v-row>
                    </div>
                  </v-card-text>
                </v-card>
              </v-tab-item>

              <v-tab-item style="background: #455A64">
                <v-card flat style="background: #455A64">
                  <v-card-text>
                    <div
                      style="col: 30px; background: #455A64"
                      v-for="(enchantment , index) in enchantments"
                      :key="index"
                    >
                      <v-row>
                        <v-col
                          cols="12"
                          v-if="enchantment.levelEn.levelEn === 3 && enchantment.typeEn.typeEn === 'Veda'"
                        >
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
                                    <v-img :src="enchantment.image" max-width="50"></v-img>
                                  </v-row>
                                  <v-row justify="center">
                                    <span
                                      class="font-weight-medium"
                                      :class="`red--text`"
                                    >{{enchantment.name}}</span>
                                  </v-row>
                                </v-list-item-content>
                                <v-list-item-content style="margin-right: 40px;">
                                  <v-list-item-title
                                    class="font-weight-medium"
                                    :class="`red--text`"
                                  >เอฟเฟกต์</v-list-item-title>
                                  <p
                                    class="text-caption"
                                    :class="`white--text`"
                                  >{{enchantment.detail}}</p>
                                </v-list-item-content>
                              </v-list-item>
                            </v-row>
                          </v-card>
                        </v-col>
                      </v-row>
                    </div>
                  </v-card-text>
                </v-card>
              </v-tab-item>
            </v-tabs>
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
  name: "enchantment",
  data() {
    return {
      tab: null,
      tabnames: [
        { avatar: "..\\Enchantment\\Afata\\Afata.png", text: "Afata" },
        { avatar: "..\\Enchantment\\Human\\Human.png", text: "Human" },
        { avatar: "..\\Enchantment\\Lokheim\\Lokheim.png", text: "Lokheim" },
        { avatar: "..\\Enchantment\\Veda\\Veda.png", text: "Veda" },
      ],
      enchantments: [],
    };
  },

  methods: {
    /* eslint-disable no-console */
    retrieveEnchantments() {
      http
        .get("/enchantment")
        .then((response) => {
          this.enchantments = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    refreshList() {
      this.retrieveEnchantments();
    },
    /* eslint-enable no-console */
  },
  mounted() {
    this.retrieveEnchantments();
  },
};
</script>
