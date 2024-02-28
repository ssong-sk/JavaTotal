<template>
    <div>
        <h1 class="alert alert-info">SecondApp 입니다</h1>
        <h3>{{ reactiveMessage }}</h3>
        <button v-on:click="btnReactiveMessage">증가</button>

        <h3>{{ mesaage }}</h3>
        <button v-on:click="msgInc">메세지 증가</button>
    </div>
</template>

<script>
import { ref } from 'vue';

export default {
    setup () {
        
        const reactiveMessage=ref(0);
        const btnReactiveMessage=()=>{
            reactiveMessage.value++;
        } 

        const mesaage = ref("안녕 뷰 재밌냐?");
        const msgInc=()=>{
            mesaage.value=mesaage.value+"?";
        }

        return {
            reactiveMessage,
            btnReactiveMessage,
            mesaage,
            msgInc

        }
    }
}
</script>

<style lang="scss" scoped>

</style>