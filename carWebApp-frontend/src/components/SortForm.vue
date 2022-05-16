<template>
  <aside class="menu">
    <h1 class="menuTitle"> Filter by</h1>

    <Form>
      <div class="formSort">
        <section class="sortOption">
        <Field
            name="brandName"
            class="formField"/>
        <label>Car brand</label>
        </section>

        <section class="sortOption">
        <Field
            name="modelName"
               class="formField"/>
          <label>Car model</label>
        </section>

        <section class="sortOption">
          <Field
              name="carBody"
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
export default {
  name: "SortForm",
  components:{
    Form,
    Field,
  },
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