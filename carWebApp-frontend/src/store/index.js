import { createStore } from "vuex";
import { advert } from "./advert.module";

const store = createStore({
    modules: {
        advert,
    },
});
export default store;