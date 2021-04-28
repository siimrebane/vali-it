<template>
  <div>
    <input v-model="email" placeholder="enter your email"/>
    <button v-on:click="register()">Register</button>
    {{ balance }}
    <table border="1">
      <tr v-for="email in emails">
        <td>{{ email }}</td>
      </tr>
    </table>
  </div>
</template>
<script>

export default {
  data: function () {
    return {
      'email': '',
      'emails': ["a@a.ee", "b@b.com"],
      'balance': ''
    }
  },
  methods: {
    'register': function () {
      this.$http.get('http://localhost:8080/sample/bank/account/' + this.email)
          .then(response => {
            console.log(response);
            this.balance = response.data
          })
          .catch(response => {
            alert("juhtus viga")
          })
      this.emails.push(this.email);
    }
  }
}
</script>
