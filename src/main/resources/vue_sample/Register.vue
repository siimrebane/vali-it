<template>
  <div>
    <input v-model="email" placeholder="enter your email"/>
    <button v-on:click="register()">Register</button>
  </div>
</template>
<script>

export default {
  data: function (){
    return {
      'email': ''
    }
  },
  methods: {
    'register': function (){
      alert(this.email);
    }
  }
}
</script>
