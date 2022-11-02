<template>
  <div id="app">
  <b-container>
    <div>
      <b-navbar toggleable type="dark" variant= "blue" >
      <b-navbar-brand href="#"><b-icon icon="" variant="warning" style="margin-left: 20px;"></b-icon> Vacation Recomendations </b-navbar-brand>

      <b-navbar-toggle target="sidebar-menu">
      </b-navbar-toggle>
      
    </b-navbar>
    </div>
    <br />
    <router-view/>
    </b-container>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 20px;
}
</style>
