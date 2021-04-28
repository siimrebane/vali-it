<template>
  <div class="home">
    <input v-model.number="x"/>
    <input v-model.number="y"/>
    <button v-on:click="show()">kuva</button>
    <table border="1">
      <!-- table = [[1, 2],[2,4]]-->
      <tr v-for="row in table"> <!-- 1row = [1,2]; 2row =[2,4] -->
        <td v-for="column in row">{{column}}</td>
      </tr>
    </table>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  data: function(){
    return {
      "x": 0,
      "y": 0,
      "table": [[]]
    }
  },
  methods: {
    "show": function(){
      for(let i = 1; i <= this.x; i++){
        this.table[i-1] = []
        for(let j = 1; j <= this.y; j++){
          this.table[i-1][j-1] = i*j;
        }
      }
      this.table.splice()
    }
  }
}
</script>
