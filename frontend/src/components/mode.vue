<template >
  <div v-if="this.mode">
    <v-container class="application">
      <v-container>
        <v-card-title class="text-center justify-center py-6">
          <h1 class="font-weight-bold display-3 basil--text">
            {{ mode.name }}
          </h1>
        </v-card-title>
        <h4
          justify="center"
          style="margin-left: 25px"
          class="font-weight-black"
          :class="`white--text`"
        >
          {{ mode.information }}
        </h4>
      </v-container>
      <div class="col-md-12">
        <v-row justify="center">
          <v-card style="background: #222222">
            <v-img :src="mode.map.map" max-width="900" max-height="500"></v-img>
          </v-card>
        </v-row>
      </div>
      <div>
        <v-row
          justify="center"
          v-for="(modes, index) in mode.monsters"
          :key="index"
        >
          <v-card class="col-md" style="background: #263238" max-width="600">
            <v-list-item three-line dark>
              <v-list-item-avatar size="60" style="margin-left: 50px">
                <v-img :src="modes.img_monster"></v-img>
              </v-list-item-avatar>
              <v-list-item-content style="margin-left: 50px">
                <v-list-item-title
                  class="font-weight-black"
                  :class="`red--text`"
                  >{{ modes.name }}</v-list-item-title
                >
                <p class="text-caption font-weight-bold" :class="`white--text`">
                  : เกิดหลังจากเกมเริ่ม {{ modes.time_start }} วินาที และ
                </p>
              </v-list-item-content>
            </v-list-item>
          </v-card>
        </v-row>
      </div>
    </v-container>
  </div>

</template>
<script>
export default {
  name: "mode",
  props: ["mode"],
};
</script>