<template>
  <div class = "container">
      <h1 class = "text-center"> Users List </h1>

    <table class = "table table-striped">
        <thead>
          <tr>
              <th> User Id </th>
              <th> User Name </th>
              <th> User Email </th>
          </tr>
        </thead>

        <tbody>
          <tr v-for="user in users" v-bind:key="user.id">
              <td> {{user.id}}</td>
              <td> {{user.name}}</td>
              <td> {{user.email}}</td>
          </tr>
        </tbody>
    </table>
  </div>
</template>

<script>

import UserService from '../services/UserService'

export default {
    name: 'Users-Users',
    data(){
        return {
            users: []
        }
    },
    methods: {
        getUsers(){
            UserService.getUsers().then((response) => {
                this.users = response.data;
            })
        }
    },
    created() {
        this.getUsers();
    }
}

</script>