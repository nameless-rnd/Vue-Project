<template>
  <div >
    <!---------------------------- Add Comment --------------------------------------->
    <v-row align="end" class="fill-height">
      <v-list-item three-line>
        <v-list-item-avatar color="grey" size="35" style="margin-right: 30px">
          <v-img src=""></v-img>
        </v-list-item-avatar>
        <v-textarea
          auto-grow
          label="Comment"
          rows="1"
          :id="post.id"
          v-model="informationComment"
        ></v-textarea>
        <v-btn
          class="ma-2"
          text
          icon
          @click="saveComment"
          :disabled="!formIsValidComment"
        >
          <v-icon>mdi-send</v-icon>
        </v-btn>
        <p>{{ post.id }}</p>
      </v-list-item>
    </v-row>
  </div>
</template>
<script>
export default {
  name: "comment",
  props: ["post"],
};
</script>