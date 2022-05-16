<template>
  <div class="menuBar">
    <h1>
      <span>
        Car
      </span>
      <span>
        Sales
      </span>
      <span>
        Service
      </span>
      <span>
        <font-awesome-icon icon="car"/>
      </span>
    </h1>
  </div>
</template>

<script>
import {library} from "@fortawesome/fontawesome-svg-core";
export default {
  name: "TopBar",

  data() {
    return{
      lib: library,
    }
  }
}
</script>

<style scoped>
.menuBar{
  background: black;
  /*background-image: linear-gradient(to right, black ,gray, yellow);*/
  color: yellow;
  margin: 0;
  padding: 20px;
}

</style>