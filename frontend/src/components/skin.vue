<template >
  <div v-if="this.skin">
    <v-container class="application" justify="center">
      <v-container>
        <v-card-title class="text-center justify-center py-6">
          <h1 class="font-weight-bold display-3 basil--text">
            {{ skin.name }}
          </h1>
        </v-card-title>
      </v-container>

      <div class="col-md-12 show-desktop">
        <v-row justify="center">
          <v-img :src="skin.img_big" max-width="900" max-height="500"></v-img>
        </v-row>
      </div>

      <div class="col-md-12">
        <v-row justify="center" >
            <v-card class="col-md" style="background: #263238;" max-width="600">
            <v-list-item three-line dark>
                <v-list-item-content style="margin-left: 50px;">
                  <v-list-item-title
                    class="font-weight-black"
                    :class="`red--text`"
                  >ระดับ</v-list-item-title>
                  <p
                    class=" font-weight-bold"
                    :class="`white--text`"
                  >{{skin.typeSkin.typeSkin}}</p>     
                </v-list-item-content>
                <v-list-item-content style="margin-left: 50px;">
                  <v-list-item-title
                    class="font-weight-black"
                    :class="`red--text`"
                  >วิธีได้รับ</v-list-item-title>
                  <p
                    class="font-weight-bold"
                    :class="`white--text`"
                  >{{skin.howto.receive}}</p>     
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
  name: "skin",
  props: ["skin"],

};
</script>