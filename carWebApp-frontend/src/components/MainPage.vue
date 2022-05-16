<template>
  <TopBar/>
  <div class="container">
    <Menu/>
  </div>


</template>

<script>
import TopBar from "@/components/TopBar";
import Menu from "@/components/Menu";
export default {
  name: "MainPage",
  components: {
    Menu,
    TopBar
  }
}
</script>

<style>

@media only screen and (min-width: 1300px) {
  .container {
    display: flex;
  }
}

</style>