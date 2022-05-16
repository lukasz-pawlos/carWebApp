<template>
  <TopBar/>
  <div class="container">
    <Menu/>

    <div>
    <div class="advert">
      <div>
        <img src="../../public/auto-icon.jpg" alt="auto">
      </div>
      <div class="text">
        <h1>{{ advert.title }}</h1>
        <h2>{{  advert.brandName  }}CAR BRAND</h2>
        <h2>{{  advert.modelName  }}CAR MODEL</h2>

        <span>{{advert.description}}</span>

      </div>
    </div>
      <div class="tableDiv">
        <table>
          <tr>
            <td>COLOR</td>
            <td>{{  advert.color  }}</td>
          </tr>
          <tr>
            <td>VINTAGE</td>
            <td>{{ advert.vintage }}</td>
          </tr>
          <tr>
            <td>MILEAGE</td>
            <td>{{ advert.mileage }}</td>
          </tr>
          <tr>
            <td>POWER</td>
            <td>{{ advert.power }}</td>
          </tr>
          <tr>
            <td>FUEL</td>
            <td>{{ advert.fuel }}</td>
          </tr>
          <tr>
            <td>EMAIL</td>
            <td>{{ advert.email }}</td>
          </tr>
          <tr>
            <td>PHONE</td>
            <td>{{ advert.phone }}</td>
          </tr>
        </table>
      </div>

      <selection class="menuOptions">
        <button>
          Buy this car
        </button>
        <button>
          Edit this advert
        </button>
        <button>
          Delete this advert
        </button>
      </selection>
    </div>
  </div>
</template>

<script>
import TopBar from "@/components/TopBar";
import Menu from "@/components/Menu";
import axios from "axios";
export default {
  name: "AdvertPage",
  components: {
    TopBar,
    Menu,
  },

  data() {
    return {
      secretKey: localStorage.getItem('secretKey'),
      advert: {},
    }
  },

  mounted() {
    this.fetchAdvert();
  },
  methods: {
    fetchAdvert() {
      console.log(this.secretKey);
      axios.get("http://localhost:8080/api/adverts/" + this.secretKey).then(function (response) {
        this.advert = response.data
      }.bind(this))
    },

  },
}
</script>

<style scoped>

.container{
  flex-wrap: nowrap;
}

@media only screen and (min-width: 1300px) {
  .advert{
    display: flex;
    text-align: center;
    flex-wrap: nowrap !important;
  }
}

.advert{
  display: flex;
  text-align: justify;
  flex-wrap: wrap;
  align-items: center;
  justify-content: space-around;
}

.advert h1{
  font-size: 50px;
  font-weight: bold;
  text-align: center;
}

.advert span{
  font-size: 20px;
}

.text{
  padding: 15px;
}
.tableDiv{
  display: flex;
  justify-content: space-around;
  margin-top: 100px;
  font-size: 25px;
}

.advert img{
  width: 300px;
  padding: 40px;
}

.menuOptions {
  display: flex;
  align-items: center;
  justify-content: center;
  margin: 50px 0;
  gap: 15px;
}

.menuOptions button{
  font-size: 20px;
  padding: 5px 15px;
  background: none;
  border: none;
  border-radius: 15px;
  transition: all 0.3s ease-in-out;
}

.menuOptions  button:hover{
  background: black;
  color: yellow;
  cursor: pointer;
}

</style>