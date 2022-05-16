<template>
  <aside class="menu">
    <h1 class="menuTitle"> Filter by</h1>

    <Form>
      <div class="formSort">
        <section class="sortOption">
        <Field
            name="brand_name"
            class="formFieldSelect"
            as="select"
            @click="setBrand($event)">
          <option v-for="(BRAND) in brands " :key="BRAND"
                  value='BRAND.brandName'>{{ BRAND.brandName }}</option>
        </Field>
        <label>Car brand</label>
        </section>

        <section class="sortOption">
        <Field
            name="model_name"
            class="formFieldSelect"
            as="select"
            @click="setModel($event)">
          <option v-for="(MODEL) in models " :key="MODEL"
                  value="MODEL.modelName">{{ MODEL.modelName }}</option>
        </Field>
          <label>Car model</label>
        </section>

        <section class="sortOption">
          <Field
              name="car_body"
              class="formField"/>
          <label>Car body</label>
        </section>

        <section class="sortOption">
        <Field
            class="formField"
            type="number"
            name="price_min"/>
        <label>Price min</label>
        </section>

        <section class="sortOption">
          <Field
              class="formField"
              type="number"
              name="price_max"/>
          <label>Price max</label>
        </section>

        <section class="sortOption">
          <Field
              class="formField"
              type="number"
              name="vintage_min"/>
          <label>Vintage min</label>
        </section>

        <section class="sortOption">
          <Field
              class="formField"
              type="number"
              name="vintage_max"/>
          <label>Vintage max</label>
        </section>

        <section class="sortOption">
          <Field
              class="formField"
              type="number"
              name="mileage_min"/>
          <label>Mileage min</label>
        </section>

        <section class="sortOption">
          <Field
              class="formField"
              type="number"
              name="mileage_max"/>
          <label>Mileage max</label>
        </section>

        <section class="sortOption">
          <Field
              class="formField"
              type="number"
              name="power_min"/>
          <label>Power min</label>
        </section>

        <section class="sortOption">
          <Field
              class="formField"
              type="number"
              name="power_max"/>
          <label>Power max</label>
        </section>

        <section class="sortOption">
          <Field
              class="formFieldSelect"
              type="number"
              name="fuel"
          as="select">
          <option value="petrol">petrol</option>
          <option value="diesel">diesel</option>
          </Field>
          <label>Fuel</label>
        </section>
      </div>
      <div class="filterButtonDiv">
        <button>
          Filter
        </button>
      </div>
    </Form>
  </aside>
</template>

<script>
import {Form, Field} from "vee-validate";
import * as yup from "yup";
import axios from "axios";
export default {
  name: "SortForm",
  components: {
    Form,
    Field,
  },
  data: function () {
    const schema = yup.object().shape({
      // .required("Car brand is required!"),
      brand_name: yup
          .string(),
      mode_name: yup
          .string(),
      car_body: yup
          .string(),
      price_min: yup
          .number()
          .lessThan(10000000)
          .required("Price is required!")
          .positive(),
      price_max: yup
          .number()
          .lessThan(10000000)
          .required("Price is required!")
          .positive(),
      vintage_min: yup
          .number()
          .moreThan(1900)
          .lessThan(2022),
      vintage_max: yup
          .number()
          .moreThan(1900)
          .lessThan(2022),
      mileage_min: yup
          .number()
          .positive(),
      mileage_max: yup
          .number()
          .positive(),
      power_min: yup.number()
          .positive(),
      power_max: yup.number()
          .positive(),
      fuel: yup
          .string(),
    });
    return {
      schema,
      selectedBrand: '',
      selectedModel: '',
      brands: [],
      models: [],
    };
  },

  methods: {
    handleForm(advert){
      advert.vintage_min = Number(advert.vintage_min);
      advert.vintage_max = Number(advert.vintage_max);
      advert.mileage_min = Number(advert.mileage_min);
      advert.mileage_max = Number(advert.mileage_max);
      advert.power_min = Number(advert.power_min);
      advert.power_max = Number(advert.power_max);
      advert.price_min = Number(advert.price_min);
      advert.price_max = Number(advert.price_max);

      let URL = `http://localhost:8080/api/adverts?brand_name=
      ${advert.brand_name}$model_name=${advert.mode_name}&car_body=${advert.car_body}&price_min=${advert.price_min}
      &price_max=${advert.price_max}&vintage_min=${advert.vintage_min}&vintage_max=${advert.vintage_max}
      &mileage_min=${advert.mileage_min}&mileage_max=${advert.mileage_max}&power_min=${advert.power_min}
      &power_max=${advert.power_max}&fuel=${advert.fuel}`;
      console.log("dupsko");
      console.log(URL);
    },

    getBrands() {
      axios.get('http://localhost:8080/api/brands').then(function (response) {
        this.brands = response.data
      }.bind(this))
    },
    setBrand(event) {
      this.selectedBrand = event.target.options[event.target.options.selectedIndex].text;

      axios.get('http://localhost:8080/api/models/' + this.selectedBrand).then(function (response) {
        this.models = response.data
      }.bind(this))
    },
    setModel(event) {
      this.selectedModel = event.target.options[event.target.options.selectedIndex].text;
    }
  }
}
</script>

<style scoped>

.menu {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin: 10px 0;
  gap: 15px;
}
.menuTitle{
  font-size: 35px;
  letter-spacing: 1px;
  text-align: center;

}

.formField{
  font-family: "Maiandra GD";
  background: none;
  font-size: 20px;
  width: 100px !important;
  margin:auto;
  border: none;
  border-bottom: black solid 2px;
  padding: 20px;
}
.formFieldSelect{
  font-family: "Maiandra GD";
  background: none;
  font-size: 20px;
  width: 140px !important;
  margin:auto;
  border: none;
  border-bottom: black solid 2px;
  padding: 20px;
}

.formSort{
  display: flex;
  flex-direction: row;
  flex-wrap: wrap;
  justify-content: center;
  gap: 20px
}

@media only screen and (min-width: 1300px) {
  .formSort{
    display: flex;
    flex-direction: column;
    gap: 10px
  }
  .menu{
    padding: 5px;
    border-right: 1px solid black ;
    min-width: 200px;
  }
}

.sortOption{
  display: flex;
  flex-direction: column;
  text-align: center;
}

.filterButtonDiv{
  display: flex;
  flex-direction: column;
  align-items: center
}

.filterButtonDiv button{
  font-size: 20px;
  padding: 5px 15px;
  background: none;
  border: none;
  border-radius: 15px;

  transition: all 0.3s ease-in-out;
  margin: 40px;
}

.filterButtonDiv  button:hover{
  background: black;
  color: yellow;
  cursor: pointer;
}

</style>