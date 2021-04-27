<template>
  <div class="about">
    <h1>Min</h1>
    <input v-model.number="minA">
    <input v-model.number="minB">
    <button v-on:click="min()">Min</button>
    {{minAnswer}}
  </div>
</template>

<script>

function min(){
  if(this.minA < this.minB){
    this.minAnswer = this.minA;
  } else {
    this.minAnswer = this.minB;
  }
}

export default {
  data: function (){
    return {
      'minA': 0,
      'minB': 0,
      'minAnswer': 0
    }
  },
  methods: {
    'min': min
  }
}
</script>
