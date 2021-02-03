<template>
    <div class="home">
        <img alt="Vue logo" src="../assets/logo.png">
        Name: <input v-model="employee.name" placeholder="first name">
        Address: <input v-model="employee.address" placeholder="last name">
        <button v-on:click="saveInHtml()">Salvesta</button>
        <table border="1">
            <tr>
                <th>id</th>
                <th>name</th>
                <th>address</th>
                <th>phone</th>
            </tr>
            <tr v-for="row in employees">
                <td>{{row.id}}</td>
                <td>{{row.name}}</td>
                <td>{{row.address}}</td>
                <td>{{row.phone}}</td>
            </tr>
        </table>
    </div>
</template>

<script>
    let getData = function () {
        this.$http.get('http://localhost:8080/solution/employee')
            .then(response => this.employees = response.data)
            .catch(response => console.log(response))
    }

    // @ is an alias to /src
    let saveInJs = function () {
        this.$http.post('http://localhost:8080/solution/employee/test', this.employee)
        .then(() => this.getData());
    }

    export default {
        name: 'Register',
        components: {},
        data: function () {
            return {
                employee: {},
                employees: []
            }
        },
        methods: {
            saveInHtml: saveInJs,
            getData: getData
        },
        mounted() {
            this.getData();
        }
    }
</script>
