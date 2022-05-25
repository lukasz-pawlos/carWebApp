<template>
  <TopBar/>
  <div class="container">
    <Menu/>

    <div class="formDiv">
      <Form @submit="handleConfirmation" :validation-schema="schema">
        <section class="sortOption">
        <Field
            name="secretKey"
            class="formField"/>
        <label>Secret key</label>
          <ErrorMessage name="secretKey" class="errorMessage" />
        </section>

        <div class="filterButtonDiv">
          <button>
            Delete advert
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
  name: "ConfirmationPage",
  components: {
    TopBar,
    Menu,
    Form,
    Field,
    ErrorMessage
  },
  data() {
    const schema = yup.object().shape({
      secretKey: yup
          .string()
          .required("Secret key is required!"),
    });
    return {
      schema,
    };
  },
  methods: {
    handleConfirmation(advert) {
      console.log(advert.secretKey)
      axios.delete('http://localhost:8080/api/adverts/' + advert.secretKey, {});
      router.push('./');
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