<template>
  <TopBar/>
  <div class="container">
    <Menu/>
    <salesForm/>
  </div>
</template>

<script>
import TopBar from "@/components/TopBar";
import Menu from "@/components/Menu";
import SalesForm from "@/components/SalesForm";
export default {
  name: "CreateAdvert",
  components:{
    TopBar,
    Menu,
    SalesForm
  }
}
</script>

<style scoped>

</style>