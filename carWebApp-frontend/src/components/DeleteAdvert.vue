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
  name: "DeleteAdvert",
  components:{
    Menu,
    TopBar
  }
}
</script>

<style scoped>

</style>