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
    </h1>
  </div>
</template>

<script>
export default {
  name: "TopBar"
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