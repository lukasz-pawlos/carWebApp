<template>
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

  <selection class="carItem" @click="$router.push('./advert')">
    <img src="../../public/auto-icon.jpg" alt="auto" class="carPhoto">
    <p class="carTitle"> Title</p>
    <p class="carBrand">Audi</p>
    <p class="carName">RS6</p>
    <p class="carKM"> 150 000km</p>
    <div class="carPrice">
      <span class="price"> 100 000 zl</span>
    </div>
  </selection>

  <selection class="carItem" @click="$router.push('./advert')">
    <img src="../../public/auto-icon.jpg" alt="auto" class="carPhoto">
    <p class="carTitle"> Title</p>
    <p class="carBrand">Audi</p>
    <p class="carName">RS6</p>
    <p class="carKM"> 150 000km</p>
    <div class="carPrice">
      <span class="price"> 100 000 zl</span>
    </div>
  </selection>

  <selection class="carItem" @click="$router.push('./advert')">
    <img src="../../public/auto-icon.jpg" alt="auto" class="carPhoto">
    <p class="carTitle"> Title</p>
    <p class="carBrand">Audi</p>
    <p class="carName">RS6</p>
    <p class="carKM"> 150 000km</p>
    <div class="carPrice">
      <span class="price"> 100 000 zl</span>
    </div>
  </selection>

</div>
</template>

<script>
import axios from "axios";
import router from "@/router";

export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Cars",

  data() {
    return{
      cars: [],
    }
  },

  mounted() {
    this.fetchAdverts();
  },

  methods: {
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
  }
}
</script>

<style scoped>
.cars{
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  margin-top: 50px;
  gap: 30px;
}
.carItem{
  max-width: 450px;
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  gap: 10px;
  padding: 10px 15px;
  cursor: pointer;
  border-radius: 20px;
  transition: all 0.3s ease-in-out;
}


.carItem:hover{
  box-shadow: rgba(50, 50, 93, 0.25) 0 13px 27px -5px,
  rgba(0, 0, 0, 0.3) 0 8px 16px -8px;
}

.carPhoto{
  width: 20%;
}
.carTitle{
  font-size: 25px;
  font-weight: bold;
}

.carBrand{
  font-size: 20px;
  font-weight: bold;
}

.carName{
  font-size: 20px;
  font-weight: bold;
}

.carKM{
  color: grey;
}

.carPrice{
  font-weight: bold;
  font-size: 30px;
}
</style>