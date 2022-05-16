<template>
  <TopBar/>
  <div class="container">
    <Menu/>
    <Cars/>
  </div>
</template>



<script>
import TopBar from "@/components/TopBar";
import Menu from "@/components/Menu";
import Cars from "@/components/Cars";
export default {
  name: "CarPage",
  components: {
    Cars,
    Menu,
    TopBar
  }
}
</script>

<style scoped>

</style>