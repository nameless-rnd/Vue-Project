import Vue from "vue";
import VueRouter from "vue-router";
import login from "../components/login";
import home from "../components/home";
import signup from "../components/signup";
import character from "../components/character";
import characterList from "../components/characterList";
import rune from "../components/rune";
import enchantment from "../components/enchantment";
import item from "../components/item";
import modeList from "../components/modeList";
import mode from "../components/mode";
import skinList from "../components/skinList";
import skin from "../components/skin";
import post from "../components/post";
import comment from "../components/comment";

Vue.use(VueRouter);

export default new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes: [
    {
      path: "/",
      component: login,
    },
    {
      path: "/home",
      name: "home",
      component: home,
    },
    {
      path: "/signup",
      component: signup,
    },
    {
      path: "/characterList",
      name: "characterList",
      component: characterList,
    },
    {
      path: "/character/:id?",
      name: "character-details",
      component: character,
      props: true,
    },
    {
      path: "/rune",
      name: "rune",
      component: rune,
    },
    {
      path: "/enchantment",
      name: "enchatment",
      component: enchantment,
    },
    {
      path: "/item",
      name: "item",
      component: item,
    },
    {
      path: "/modeList",
      name: "modeList",
      component: modeList,
    },
    {
      path: "/mode/:id?",
      name: "mode-details",
      component: mode,
      props: true,
    },
    {
      path: "/skinList",
      name: "skinList",
      component: skinList,
    },
    {
      path: "/skin/:id?",
      name: "skin-details",
      component: skin,
      props: true,
    },
    {
      path: "/post",
      name: "post",
      alias: "/post",
      component: post,
      children: [
        {
          path: "/post/:id",
          name: "comment",
          component: comment,
          props: true,
        },
      ],
    },
  ],
});
