<template>
    <div>
        <h1 class="alert alert-info">FourthApp 입니다</h1>
      
            <li v-for="fruit in fruitArray" :key="fruit">{{ fruit}}</li>
            <li v-for="info in infoArray" :key="info">{{ info }}</li>
            <li v-for="info in infoArray" :key="info">{{ info.id }}/{{ info.user }}</li>
     
    </div>
</template>

<script>
export default {
    setup () {
        
        const fruitArray=['apple','banana','orange'];
        const infoArray=[{id:0,user:'영수'},
                         {id:1,user:'정수'},
                         {id:2,user:'일수'},
                         {id:3,user:'이수'}]

        return {

            fruitArray,
            infoArray
        }
        
    }
}
</script>

<style lang="scss" scoped>

</style>