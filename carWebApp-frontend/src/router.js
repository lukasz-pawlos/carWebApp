import { createWebHistory, createRouter } from "vue-router";
import MainPage from "@/components/MainPage";
import CarPage from "@/components/CarPage";
import CreateAdvert from "@/components/CreateAdvert";
import AdvertPage from "@/components/AdvertPage";
import ConfirmationPage from "@/components/ConfirmationPage";
import EditAdvert from "@/components/EditAdvert";
import BuyAdvert from "@/components/BuyAdvert";
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
    {
        path: "/confirmation",
        component: ConfirmationPage,
    },
    {
        path: "/editAdvert",
        component: EditAdvert,
    },
    {
        path: "/buyAdvert",
        component: BuyAdvert,
    },

];
const router = createRouter({
    history: createWebHistory(),
    routes,
});
export default router;