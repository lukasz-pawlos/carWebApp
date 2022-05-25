<template>
  <TopBar/>
  <div class="container">
    <Menu/>
    <SortForm @carURL="getCars"/>

    <div class="cars">
      <selection
          class="carItem"
          v-for="(CAR) in cars " :key="CAR"
          @click="getIDandPush(CAR.secretKey)">
        <img src="../../public/auto-icon.jpg" alt="auto" class="carPhoto">
        <p class="carTitle"> {{ CAR.title }}</p>
        <p class="carBrand">{{ CAR.brandName }}</p>
        <p class="carName">{{ CAR.modelName }}</p>
        <p class="carKM"> {{ CAR.mileage }} km</p>
        <div class="carPrice">
          <span class="price"> {{ CAR.price }} zł</span>
        </div>
      </selection>

    </div>
  </div>
</template>



<script>
import TopBar from "@/components/TopBar";
import Menu from "@/components/Menu";
import SortForm from "@/components/SortForm";
import axios from "axios";
import router from "@/router";
export default {
  name: "CarPage",
  components: {
    Menu,
    TopBar,
    SortForm
  },

  data() {
    return{
      cars: [],
      link: '',
    }
  },

  mounted() {
    this.fetchAdverts();
  },

  watch: {
    link: function (){
      console.log(this.link);
      axios.get(this.link).then(function (response) {
        this.cars = response.data
      }.bind(this))
    }
  },

  methods: {
    getCars(value){
      this.$emit('carURL', value)
      this.link = value;
    },

    fetchAdverts(){
      axios.get("http://localhost:8080/api/adverts").then(function (response){
        this.cars = response.data
      }.bind(this))
    },
    getIDandPush(key) {
      localStorage.setItem('secretKey', key);
      console.log(localStorage.getItem('secretKey'));
      router.push("./advert")
    },
  },


}
</script>

<style scoped>

</style>