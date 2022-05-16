import { createWebHistory, createRouter } from "vue-router";
import MainPage from "@/components/MainPage";
import CarPage from "@/components/CarPage";
import CreateAdvert from "@/components/CreateAdvert";
import AdvertPage from "@/components/AdvertPage";
const routes = [
    {
        path: "/",
        component: MainPage,
    },
    {
        path: "/cars",
        component: CarPage,
    },
    {
        path: "/createAdvert",
        component: CreateAdvert,
    },
    {
        path: "/advert",
        component: AdvertPage,
    },

];
const router = createRouter({
    history: createWebHistory(),
    routes,
});
export default router;