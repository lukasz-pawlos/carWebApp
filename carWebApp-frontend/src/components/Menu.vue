<template>
 <aside class="menu">
   <h1 class="menuTitle"> Menu options</h1>
   <section class="menuOptions">
     <button @click="$router.push('./createAdvert')">Sell</button>
     <button @click="$router.push('./cars')">Buy</button>
   </section>
 </aside>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Menu"
}
</script>

<style scoped>
.menu {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin: 20px 0;
  gap: 15px;
}
.menuTitle{
  font-size: 35px;
  letter-spacing: 1px;
  text-align: center;

}
.menuOptions{
  display: flex;
  gap: 20px;
  flex-wrap: wrap;
  padding: 0 10px;
  justify-content: center;
}

@media only screen and (min-width: 1300px) {
  .menuOptions{
    flex-direction: column;
  }
  .menu{
    padding: 5px;
    border-right: 1px solid black ;
    min-width: 200px;
  }
}

.menuOptions button{
  font-size: 20px;
  padding: 5px 15px;
  background: none;
  border: none;
  border-radius: 15px;
  transition: all 0.3s ease-in-out;
}

.menuOptions  button:hover{
  background: black;
  color: yellow;
  cursor: pointer;
}


</style>