<template>
  <div>
    <div class="menu">
      <!-- <a v-for="header in 3" :key="header">Home</a> -->
      <a v-for="menu in menus" :key="menu">{{ menu }}</a>
    </div>

    <div class="celeb" v-for="(agency,key) in agencys" :key="key">
      <img :src="agency.imgSrc">
      <h3>{{ agency.name}}</h3>
      <p>{{agency.company}}</p>
      <button @click="onClickLikes(key)">좋아요</button>
      <span>좋아요:{{ agency.likes }}</span>
    </div>

  </div>
</template>

<script>
export default {
  data () {
    
    return {

      menus:['Home', 'Celeb', 'About'],
      agencys:[{name:'한예슬',company:"하이브",likes:0,imgSrc:require('./assets/image/6.jpg')},
      {name:'전지현',company:"YG",likes:0,imgSrc:require('./assets/image/8.jpg')},
      {name:'강동원',company:"SM",likes:0,imgSrc:require('./assets/image/9.jpg')},
      {name:'김태희',company:"JYP",likes:0,imgSrc:require('./assets/image/10.jpg')},
      {name:'신민아',company:"안테나",likes:0,imgSrc:require('./assets/image/17.jpg')}]
     
    }
  },
  methods:{
    onClickLikes(key){
      this.agencys[key].likes++;
    }
  }
}
</script>

<style lang="css" scoped>
   .menu{
     background-color: blueviolet;
     padding: 10px;
     border-radius: 5px;
    }

    .menu a{
      color: wheat;
      padding: 10px;

    }

    .celeb img {
      width: 200px;
      border-radius: 20px;

    }

</style>