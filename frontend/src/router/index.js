import Vue from 'vue'
import VueRouter from 'vue-router'
import login from '../components/login'
import home from '../components/home'
import signup from '../components/signup'

import character from '../components/character'
import characterList from '../components/characterList'
import rune from '../components/rune'
import enchantment from '../components/enchantment'
import item from '../components/item'


Vue.use(VueRouter)

export default new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        {
            path: '/',
            component: login
        },
        {
            path: '/home',
            component: home
        },
        {
            path: '/signup',
            component: signup
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
            props: true
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
        }
    ]
})