<template>
  <div class="hello">
  
  <h2> Trip Parameters </h2>

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

    <b-button @click="search()">
          Search Parameters
  </b-button>

    
    <b-table striped hover responsive :items="students" :fields="fields">
      <template #cell(actions)="row">
        
      </template>
    </b-table>
    
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'HelloWorld',
  data () {
    return {
      students: null,
      //field key must match attribute of object
      fields: [
      {key: 'id', label: 'Trip ID', sortable: true},
      {key: 'name', label: 'Destination Name', sortable: true},
      {key: 'weather', label: 'Weather', sortable: true},
      {key: 'priceIndex', label: 'Price', sortable: true},
      {key: 'purpose', label: 'Purpose', sortable: true, sortable: true}],
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
      costs: ["Low", "Medium", "High"],
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

    },
    edit(item, index, button) {
      this.form.id = item.id
      this.form.email = item.email
      this.form.first_name = item.firstName
      this.form.last_name = item.lastName
    },
    resetEditModal() {
      this.form.id=''
      this.form.email=''
      this.form.first_name=''
      this.form.last_name=''
    },
    onSave(event) {
      var numId;
      numId = parseInt(this.form.id);
      axios
        .put('http://localhost:8085/students/' + numId, {
          "id": numId,
          "firstName": this.form.first_name,
          "lastName": this.form.last_name,
          "email": this.form.email,
        })
        .then(() => this.init())
        .catch(function (error) {
          console.log(error);
        });
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
  color: #42b983;
}
</style>
