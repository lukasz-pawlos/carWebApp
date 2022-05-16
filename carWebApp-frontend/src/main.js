import { createApp } from 'vue'
import App from './App.vue'
import router from "./router";
import { plugin, defaultConfig } from '@formkit/vue'
import store from "./store";

createApp(App)
    .use(plugin, defaultConfig)
    .use(router)
    .use(store)
    .mount("#app");