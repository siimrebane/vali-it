<template>
  <div class="about">
    <h1>Min</h1>
    <input v-model.number="minA">
    <input v-model.number="minB">
    <button v-on:click="min()">Min</button>
    {{ minAnswer }}
    <h1>List</h1>
    {{ accounts }}
    <table>
      <tr>
        <th>Account Number</th>
        <th>Balance</th>
      </tr>
      <tr v-for="account in accounts">
        <td>{{ account.accountNumber }}</td>
        <td>{{ account.balance }}</td>
        <td>{{ account }}</td>
      </tr>
    </table>
  </div>
</template>

<script>

function min() {
  if (this.minA < this.minB) {
    this.minAnswer = this.minA;
  } else {
    this.minAnswer = this.minB;
  }
}

export default {
  data: function () {
    return {
      'minA': 0,
      'minB': 0,
      'minAnswer': 0,
      accounts: []
    }
  },
  methods: {
    'min': min
  },
  mounted() {
    this.$http.get("http://localhost:8080/sample/bank/account")
        .then(response => this.accounts = response.data);
  }
}
</script>
