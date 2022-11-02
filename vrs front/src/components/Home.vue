<template>
  <div class="hello">

    

    
    
  
    <label>Cost Preference:</label>
    <select v-model="trip.cost">
  <option disabled value="">Please select weather preference </option>
  <option v-for = "cost in costs">{{cost}}</option>
  
</select>

<label>Weather Preference:</label>
    <select v-model="trip.weather">
  <option disabled value="">Please select weather preference </option>
  <option v-for = "weather in weathers">{{weather}}</option>

</select>

<label>Vacation Purpose:</label>
    <select v-model="trip.purpose">
  <option disabled value="">Please select weather preference </option>
  <option v-for = "purpose in purposes">{{purpose}}</option>

</select>

<b-button class = "search-container" @click = "search()">
  Search Parameters
</b-button>


    



   
  </div>
</template>

<script>
import axios from 'axios';


export default {

  data(){
    return{
      students: null,
      fields: [
      {key: 'id', label: 'Student ID', sortable: true},
      {key: 'lastName', label: 'Last Name', sortable: true},
      {key: 'firstName', label: 'First Name', sortable: true},
      {key: 'email', label: 'Email', sortable: true, sortable: true},
      {key: 'actions', label: 'Actions'}],
      form: {
          email: '',
          first_name: '',
          last_name: '',
          id: ''
        },
      trip:{
        cost:"",
        weather: "",
        purpose: ""
      },
      costs: ["$1000 - $5000", "$5000 - $10000", "$10000 - $20000"],
      weathers: ["Hot", "Cold", "Mild"],
      purposes: ["Family Get Away", "Sight Seeing", "Historical Monuments"]
    }
  },
  methods: {
    init() {
      axios
        .get('http://localhost:8085/students')
        .then(response => (this.students = response.data))
    },
    search(){
  
      axios
        .get('http://localhost:8085/students')
        .then(response => (this.students = response.data))
        .catch(function(error){
          if (error.response){
            console.log(error.response.data);
          }
        })
      
    }
  }

}


</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #69cb9f;
}
</style>


