<template>
  <TopBar/>
  <div class="container">
    <Menu/>

    <div class="formDiv">
      <Form @submit="handlePurchase" :validation-schema="schema">
        <section class="sortOption">
          <Field
              name="email"
              class="formField"/>
          <label>Email</label>
          <ErrorMessage name="email" class="errorMessage" />
        </section>

        <section class="sortOption">
          <Field
              name="phone"
              class="formField"/>
          <label>Phone</label>
          <ErrorMessage name="phone" class="errorMessage" />
        </section>

        <div class="filterButtonDiv">
          <button>
            Buy car
          </button>
        </div>

      </Form>
    </div>

  </div>
</template>

<script>
import {Form, Field, ErrorMessage} from "vee-validate";
import TopBar from "@/components/TopBar";
import Menu from "@/components/Menu";
import * as yup from "yup";
import axios from "axios";
import router from "@/router";
export default {
  name: "BuyAdvert",
  components: {
    TopBar,
    Menu,
    ErrorMessage,
    Form,
    Field
  },
  data() {
    const schema = yup.object().shape({
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
      schema,
    };
  },
  methods: {
    handlePurchase(advert) {

      console.log(localStorage.getItem('secretKey'))

      router.push('./');
      return axios.post('http://localhost:8080/api/adverts/' + localStorage.getItem('secretKey'), {
        secretKey: localStorage.getItem('secretKey'),
        buyerEmail: advert.email,
        buyerPhone: advert.phone,
      })
    }
  },
}
</script>

<style scoped>

.formDiv{
  display: flex;
  flex-direction: column;
  text-align: center;
  min-width: 100%;
  margin: auto;
}

.sortOption{
  display: flex;
  flex-direction: column;
  text-align: center;
}

.formField{
  font-family: "Maiandra GD";
  background: none;
  font-size: 20px;
  width: 500px !important;
  margin:auto;
  border: none;
  border-bottom: black solid 2px;
  padding: 20px;
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

.errorMessage{
  color: red;
  font-size: 17px;
  font-weight: bold;
}

</style>