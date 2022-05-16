<template>
  <TopBar/>
  <div class="container">
    <Menu/>
    <EditForm/>
  </div>
</template>

<script>
import TopBar from "@/components/TopBar";
import EditForm from "@/components/EditForm";
import Menu from "@/components/Menu";
export default {
  name: "EditAdvert",
  components:{
    Menu,
    TopBar,
    EditForm
  }
}
</script>

<style scoped>

</style>