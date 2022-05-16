<template>
  <div class="formDiv">
    <h1> Sell your car </h1>

    <Form @submit="handleForm" :validation-schema="schema">
      <Field name="brandName" class="formField"  as="select" @click="setBrand($event)">
        <option v-for="(BRAND) in brands " :key="BRAND"
                value='BRAND.brandName'>{{ BRAND.brandName }}</option>
      </Field>
      <label>Car brand</label>
      <ErrorMessage name="carBrand" class="errorMessage"/>

      <Field name="modelName" class="formField" as="select" @click="setModel($event)">
        <option v-for="(MODEL) in models " :key="MODEL"
                value="MODEL.modelName">{{ MODEL.modelName }}</option>
      </Field>
      <label>Car model</label>
      <ErrorMessage name="carModel" class="errorMessage"/>


      <Field
          class="formField"
          type="text"
          name="color"/>
      <label>Car color</label>
      <ErrorMessage name="color" class="errorMessage"/>


      <Field
          class="formField"
          type="number"
          name="vintage"/>
      <label>Vintage</label>
      <ErrorMessage name="vintage" class="errorMessage"/>


      <Field
          class="formField"
          type="number"
          name="mileage"/>
      <label>Mileage</label>
      <ErrorMessage name="mileage" class="errorMessage"/>

      <Field
          class="formField"
          type="number"
          name="power"/>
      <label>Power</label>
      <ErrorMessage name="power" class="errorMessage"/>

      <Field name="fuel" class="formField" as="select">
        <option value="petrol">petrol</option>
        <option value="diesel">diesel</option>
      </Field>
      <label>Fuel</label>
      <ErrorMessage name="fuel" class="errorMessage"/>


      <Field
          class="formField"
          type="text"
          name="title">
        </Field>
      <label>Title</label>
      <ErrorMessage name="title" class="errorMessage"/>

      <Field
          class="formFieldText"
          type="text"
          name="description"
          as="textarea"/>
      <label>Description</label>
      <ErrorMessage name="description" class="errorMessage"/>


      <Field
          class="formField"
          type="number"
          name="price"/>
      <label>Price</label>
      <ErrorMessage name="price" class="errorMessage"/>




      <Field
          class="formField"
          type="email"
          name="email"/>
      <label>Email</label>
      <ErrorMessage name="email" class="errorMessage"/>


      <Field
          class="formField"
          type="text"
          name="phone"/>
      <label>Phone number</label>
      <ErrorMessage name="phone" class="errorMessage"/>

      <div>
        <button>
          Send advert
        </button>
      </div>
    </Form>
  </div>
</template>

<script>

import {Form, Field, ErrorMessage} from "vee-validate";
import * as yup from "yup";
import router from "@/router";
import axios from "axios";
export default {
  name: "SalesForm",
  components: {
    Form,
    Field,
    ErrorMessage,
  },
  data: function () {
    const schema = yup.object().shape({
      // .required("Car brand is required!"),
      modelName: yup
          .string(),
      // .required("Car model is required!"),
      vintage: yup
          .number()
          .required("Vintage is required!")
          .moreThan(1900)
          .lessThan(2022),
      mileage: yup
          .number()
          .required("Mileage is required!")
          .positive(),
      power: yup.number()
          .required("Power is required!")
          .positive(),
      fuel: yup
          .string(),
      // .required("Type of fuel is required!"),
      color: yup
          .string()
          .required("Color  is required!"),
      description: yup
          .string()
          .max(200)
          .required("Description is required!"),
      title: yup
          .string()
          .max(30)
          .required("Title is required!"),
      price: yup
          .number()
          .lessThan(10000000)
          .required("Price is required!")
          .positive(),
      email: yup
          .string()
          .email("Email is invalid!")
          .required("Email is required!"),
      phone: yup
          .string()
          .matches(/^[0-9]{9}$/, "Good form is: XXXXXXXXX")
          .required("Phone is required!"),
    });

    return {
      successful: false,
      loading: false,
      message: "",
      schema,
      selectedBrand: '',
      selectedModel: '',
      brands: [],
      models: [],
    };
  },
  mounted() {
    this.getBrands();
  },
  methods: {
    handleForm(advert){
      advert.vintage = Number(advert.vintage);
      advert.mileage = Number(advert.mileage);
      advert.power = Number(advert.power);
      advert.price = Number(advert.price);


      axios.post('http://localhost:8080/api/adverts',{
        color: advert.color,
        vintage: advert.vintage,
        mileage: advert.mileage,
        power: advert.power,
        fuel: advert.fuel,
        modelName: this.selectedModel,
        description: advert.description,
        title: advert.title,
        price: advert.price,
        email: advert.email,
        phone: advert.phone,
      });

      router.push('./');
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
  },

}
</script>

<style scoped>

.formDiv{
  display: flex;
  text-align: center;
  justify-content: center;
  flex-direction: column;
  align-content: space-around;
  margin: auto;
}

form{
  display: flex;
  flex-direction: column;
}
select{
  width: 100px;
  margin:auto;
}

label{
  text-align: center;
  font-weight: bold;
  font-size: 20px;
}
.formField{
  font-family: "Maiandra GD";
  background: none;
  font-size: 20px;
  width: 580px !important;
  margin:auto;
  border: none;
  border-bottom: black solid 2px;
  padding: 20px;
}
Field :hover{

}
.formField :hover{

  border-bottom: black solid 2px;
}

.formFieldText{
  width: 600px;
  font-size: 20px;
  margin:auto;
  background: none;
  border: none;
  resize: none;
  height: 100px;
  border-bottom: black solid 2px;
}


.errorMessage{
  color: red;
  font-size: 17px;
  font-weight: bold;
}

.formDiv button{
  font-size: 40px;
  margin: 50px;
  padding: 5px 15px;
  background: none;
  border: none;
  border-radius: 15px;
  transition: all 0.3s ease-in-out;
}

.formDiv  button:hover{
  background: black;
  color: yellow;
  cursor: pointer;
}

</style>