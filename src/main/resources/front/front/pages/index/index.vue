<template>
  <view class="content">
    <view
        :style='{"minHeight":"100vh","padding":"40rpx 0px 0","overflow":"hidden","alignItems":"flex-start","flexWrap":"wrap","background":"#f1f1f1","flexDirection":"row","display":"flex","width":"100%","height":"auto"}'>
      <swiper
          :autoplay='true'
          :circular='true' :duration='500' :indicator-dots='true' :interval='5000'
          :style='{"border":"2rpx solid #000","margin":"0 auto","borderRadius":"8rpx","background":"url(http://codegen.caihongy.cn/20240222/772e7c2b8323449c81ceb2c4faf0e109.png) no-repeat center top / 100% 100%,#fff","width":"calc(100% - 48rpx)","height":"360rpx","order":"1"}'
          :vertical='false' class="swiper" indicator-active-color='#000000' indicator-color='rgba(0, 0, 0, .3)'>
        <swiper-item v-for="(swiper,index) in swiperList" :key="index"
                     :style='{"width":"100%","background":"#fff","height":"100%"}' @tap="onSwiperTap(swiper)">
          <image
              :src="baseUrl+swiper.img"
              :style='{"width":"100%","padding":"24rpx","objectFit":"cover","background":"url(http://codegen.caihongy.cn/20240222/772e7c2b8323449c81ceb2c4faf0e109.png) no-repeat center top / 100% 100%,#fff","display":"block","height":"100%"}'
              mode="aspectFill"></image>
          <view v-if="false"
                :style='{"width":"100%","padding":"0 8rpx","lineHeight":"60rpx","fontSize":"28rpx","color":"#333","background":"#fff"}'>
            {{ swiper.title }}
          </view>
        </swiper-item>
      </swiper>
      <!-- menu -->
      <view v-if="true"
            :style='{"border":"2rpx solid #000","padding":"20rpx","margin":"40rpx auto","borderRadius":"8rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20240222/772e7c2b8323449c81ceb2c4faf0e109.png) no-repeat center top / 100% 100%,#fff","display":"flex","width":"calc(100% - 48rpx)","justifyContent":"space-between","order":"0"}'
            class="menu">
        <block v-for="(item,index1) in menuList" v-bind:key="item.roleName">
          <block v-for=" (menu,index) in item.frontMenu" v-if="index1==0" v-bind:key="index">
            <block v-for=" (child,sort) in menu.child" v-bind:key="sort">
              <block v-for=" (button,sort2) in child.buttons" v-bind:key="sort2">
                <view
                    v-if="button=='查看' && child.tableName!='yifahuodingdan' && child.tableName!='yituikuandingdan' &&child.tableName!='yiquxiaodingdan' && child.tableName!='weizhifudingdan' && child.tableName!='yizhifudingdan' && child.tableName!='yiwanchengdingdan' "
                    :style='{"width":"25%","padding":"12rpx 0","margin":"10rpx 0","height":"auto"}'
                    class="menu-list"
                    @tap="onPageTap2('../'+child.tableName+'/list')">
                  <view :class="child.appFrontIcon"
                        :style='{"padding":"0px","margin":"0px auto","color":"#0d75d6","borderRadius":"100%","textAlign":"center","background":"none","display":"block","width":"88rpx","lineHeight":"88rpx","fontSize":"64rpx","height":"88rpx"}'
                        class="iconarr"></view>
                  <view
                      :style='{"padding":"0","margin":"12rpx auto 0","color":"#0d75d6","textAlign":"center","width":"100%","lineHeight":"28rpx","fontSize":"28rpx"}'>
                    {{ child.menu.split("列表")[0] }}
                  </view>
                </view>
              </block>
            </block>
          </block>
        </block>
      </view>
      <!-- menu -->
      <!-- 关于我们 -->
      <view
          :style='{"padding":"80rpx 24rpx","margin":"40rpx auto 0","borderRadius":"0px","alignItems":"flex-start","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20240223/4eb834b8c753407b8611b447ef50e882.png) no-repeat center top / 100% auto,#FFF7DF","flexDirection":"column","display":"flex","width":"calc(100% - 0px)","position":"relative","height":"auto","order":"1"}'>
        <view
            :style='{"padding":"0 12rpx","margin":"0","borderColor":"#38bf3e","color":"#fff","textAlign":"center","background":"none","borderWidth":"0 0 0 0px","width":"100%","fontSize":"40rpx","lineHeight":"36rpx","borderStyle":"solid","text-stroke":"2rpx #000000","fontWeight":"600","height":"36rpx"}'>
          {{ aboutUsDetail.title }}
        </view>
        <view
            :style='{"margin":"40rpx 0 0","color":"#333","textAlign":"center","display":"block","width":"100%","lineHeight":"1","fontSize":"32rpx"}'>
          {{ aboutUsDetail.subtitle }}
        </view>
        <view
            :style='{"padding":"0 0px","margin":"40rpx 0 0","borderRadius":"0","background":"none","display":"flex","width":"100%","justifyContent":"space-between","height":"auto","order":"2"}'>
          <img
              v-if="aboutUsDetail.picture1"
              :src="baseUrl+aboutUsDetail.picture1"
              :style='{"width":"100%","margin":"0 0px","objectFit":"cover","borderRadius":"16rpx","display":"block","height":"300rpx"}'>
          <img
              v-if="aboutUsDetail.picture2"
              :src="baseUrl+aboutUsDetail.picture2"
              :style='{"width":"31%","margin":"0 0px","objectFit":"cover","borderRadius":"16rpx","display":"none","height":"160rpx"}'>
          <img
              v-if="aboutUsDetail.picture3"
              :src="baseUrl+aboutUsDetail.picture3"
              :style='{"width":"31%","margin":"0 0px","objectFit":"cover","borderRadius":"16rpx","display":"none","height":"160rpx"}'>
        </view>
        <view
            :style='{"padding":"0px","margin":"24rpx 0 0px 0","color":"#333","borderRadius":"0","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","order":"2"}'
            v-html="aboutUsDetail.content"></view>
        <view
            :style='{"border":"0","padding":"0 30rpx","margin":"40rpx auto 20rpx","borderRadius":"8rpx","textAlign":"center","background":"#a5ccc4","display":"none","width":"auto","lineHeight":"56rpx","order":"3"}'>
          <text :style='{"color":"#f5f5f5","fontSize":"24rpx"}'>更多</text>
          <text :style='{"color":"#f5f5f5","fontSize":"24rpx"}' class="icon iconfont icon-gengduo1"></text>
        </view>
        <view
            :style='{"width":"100%","position":"absolute","top":"-200rpx","background":"url(http://codegen.caihongy.cn/20231220/f7e2906a88da4261917ac452b2a8858c.png) no-repeat center top /100% 100%","display":"none","height":"160rpx"}'/>
        <view
            :style='{"width":"50%","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"160rpx"}'/>
      </view>
      <!-- 系统简介 -->
      <view
          :style='{"padding":"64rpx 24rpx","margin":"0px auto","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20240223/eece8113785146e0a55f0092d5c98ca1.png) no-repeat center top / 100% auto,#FFF7DF","display":"flex","width":"calc(100% - 0px)","height":"auto","order":"6"}'>
        <view
            :style='{"padding":"0 0 0 12rpx","margin":"0 auto","borderColor":"#38bf3e","color":"#fff","textAlign":"center","background":"none","borderWidth":"0px","width":"100%","lineHeight":"36rpx","fontSize":"40rpx","borderStyle":"solid","text-stroke":"2rpx #000000","fontWeight":"600"}'>
          {{ systemIntroductionDetail.title }}
        </view>
        <view
            :style='{"padding":"0 0 24rpx","margin":"32rpx auto 0px","color":"#333","borderRadius":"0 0 40rpx 40rpx","textAlign":"center","background":"none","display":"block","width":"calc(100% - 48rpx)","lineHeight":"1","fontSize":"32rpx"}'>
          {{ systemIntroductionDetail.subtitle }}
        </view>
        <view
            :style='{"padding":"20rpx","margin":"20rpx 0 0","borderColor":"#333","borderRadius":"16rpx 16rpx 0 0","flexWrap":"wrap","background":"none","borderWidth":"2rpx 2rpx 0 2rpx","display":"block","width":"100%","borderStyle":"solid","justifyContent":"space-between","height":"auto"}'>
          <img
              v-if="systemIntroductionDetail.picture1"
              :src="baseUrl+systemIntroductionDetail.picture1"
              :style='{"margin":"0 0px","objectFit":"cover","borderRadius":"8rpx","display":"block","width":"48%","float":"left","height":"400rpx"}'>
          <img
              v-if="systemIntroductionDetail.picture2"
              :src="baseUrl+systemIntroductionDetail.picture2"
              :style='{"margin":"0 0px","objectFit":"cover","borderRadius":"8rpx","display":"block","width":"48%","float":"right","height":"190rpx"}'>
          <img
              v-if="systemIntroductionDetail.picture3"
              :src="baseUrl+systemIntroductionDetail.picture3"
              :style='{"margin":"20rpx 0 0","objectFit":"cover","borderRadius":"8rpx","display":"block","width":"48%","float":"right","height":"190rpx"}'>
        </view>
        <view
            :style='{"padding":"20rpx 20rpx 40rpx","margin":"0","borderColor":"#000","color":"#333","borderRadius":"0 0 16rpx 16rpx","background":"none","borderWidth":"0 2rpx 2rpx","width":"100%","clear":"both","lineHeight":"48rpx","fontSize":"28rpx","borderStyle":"solid"}'
            v-html="systemIntroductionDetail.content"></view>
        <view
            :style='{"border":"0","padding":"0 30rpx","margin":"0 auto","textAlign":"center","background":"#409EFF","display":"none","width":"auto","lineHeight":"56rpx","order":"3"}'>
          <text :style='{"color":"#f5f5f5","fontSize":"24rpx"}'>更多</text>
          <text :style='{"color":"#f5f5f5","fontSize":"24rpx"}' class="icon iconfont icon-gengduo1"></text>
        </view>
        <view
            :style='{"width":"50%","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"160rpx"}'/>
        <view
            :style='{"width":"50%","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"160rpx"}'/>
      </view>
      <!-- 商品推荐 -->
      <view
          :style='{"width":"calc(100% - 0px)","padding":"60rpx 24rpx","margin":"0 auto","borderRadius":"0","background":"url(http://codegen.caihongy.cn/20240223/73a4808da5734644ad6d17fe0195e700.png) no-repeat center top / 100% auto,#F6BE1E","order":"1"}'
          class="listBox recommend">
        <view
            :style='{"padding":"0 24rpx","margin":"0","textAlign":"center","background":"none","width":"100%","lineHeight":"80rpx","height":"auto"}'
            class="title">
          <view :style='{"fontSize":"40rpx","color":"#fff","text-stroke":"2rpx #000000","fontWeight":"600"}'>
            课程资源推荐
          </view>
        </view>
        <!-- 样式3 -->
        <view :style='{"width":"100%","padding":"0 0 24rpx","margin":"40rpx 0 0","height":"auto"}'
              class="list-box style3">
          <view v-for="(product,index) in kechengziyuanlist" :key="index"
                :style='{"border":"2rpx solid #000","padding":"20rpx","margin":"0 0 40rpx","borderRadius":"8rpx","alignItems":"center","flexWrap":"wrap","background":"#F7F1DF","display":"flex","width":"100%","height":"auto"}'
                class="list-item"
                @tap="onDetailTap('kechengziyuan',product.id)">
            <image
                v-if="product.ziyuantupian.substring(0,4)=='http'"
                :src="product.ziyuantupian"
                :style='{"width":"260rpx","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"260rpx"}'
                class="list-item-image"
                mode="aspectFill"></image>
            <image
                v-else
                :src="product.ziyuantupian?baseUrl+product.ziyuantupian.split(',')[0]:''"
                :style='{"width":"260rpx","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"260rpx"}'
                class="list-item-image"
                mode="aspectFill"></image>
            <view
                :style='{"minHeight":"200rpx","padding":"0 0 0 20rpx","margin":"0","flexWrap":"wrap","display":"flex","width":"calc(100% - 260rpx)","position":"relative","height":"auto"}'
                class="list-item-body">
              <view
                  :style='{"padding":"0 0px","margin":"0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis"}'
                  class="list-item-title">{{ product.ziyuanmingcheng }}
              </view>
              <view
                  :style='{"padding":"0 0px","margin":"0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis"}'
                  class="list-item-title">{{ product.ziyuanleixing }}
              </view>
              <view :style='{"width":"100%","padding":"0 0px","order":"6"}'>
                <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'
                      class="icon iconfont icon-shijian21"></text>
                <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{ product.addtime }}</text>
              </view>
              <view :style='{"padding":"0 0px","margin":"0 10rpx 0 0"}'>
                <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'
                      class="icon iconfont icon-geren16"></text>
                <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{ product.jiaoshigonghao }}
                </text>
              </view>
              <view :style='{"padding":"0 0px","margin":"0 10rpx 0 0","display":"inline-block"}'>
                <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'
                      class="icon iconfont icon-shoucang10"></text>
                <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{ product.storeupnum }}</text>
              </view>
              <view :style='{"padding":"0 0px","margin":"0 10rpx 0 0","display":"inline-block"}'>
                <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'
                      class="icon iconfont icon-chakan2"></text>
                <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{ product.clicknum }}</text>
              </view>
            </view>
          </view>
        </view>
      </view>
      <view
          :style='{"width":"calc(100% - 0px)","padding":"60rpx 24rpx","margin":"0 auto","borderRadius":"0","background":"url(http://codegen.caihongy.cn/20240223/73a4808da5734644ad6d17fe0195e700.png) no-repeat center top / 100% auto,#F6BE1E","order":"1"}'
          class="listBox recommend">
        <view
            :style='{"padding":"0 24rpx","margin":"0","textAlign":"center","background":"none","width":"100%","lineHeight":"80rpx","height":"auto"}'
            class="title">
          <view :style='{"fontSize":"40rpx","color":"#fff","text-stroke":"2rpx #000000","fontWeight":"600"}'>
            课程信息推荐
          </view>
        </view>
        <!-- 样式3 -->
        <view :style='{"width":"100%","padding":"0 0 24rpx","margin":"40rpx 0 0","height":"auto"}'
              class="list-box style3">
          <view v-for="(product,index) in kechengxinxilist" :key="index"
                :style='{"border":"2rpx solid #000","padding":"20rpx","margin":"0 0 40rpx","borderRadius":"8rpx","alignItems":"center","flexWrap":"wrap","background":"#F7F1DF","display":"flex","width":"100%","height":"auto"}'
                class="list-item"
                @tap="onDetailTap('kechengxinxi',product.id)">
            <image
                v-if="product.kechengfengmian.substring(0,4)=='http'"
                :src="product.kechengfengmian"
                :style='{"width":"260rpx","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"260rpx"}'
                class="list-item-image"
                mode="aspectFill"></image>
            <image
                v-else
                :src="product.kechengfengmian?baseUrl+product.kechengfengmian.split(',')[0]:''"
                :style='{"width":"260rpx","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"260rpx"}'
                class="list-item-image"
                mode="aspectFill"></image>
            <view
                :style='{"minHeight":"200rpx","padding":"0 0 0 20rpx","margin":"0","flexWrap":"wrap","display":"flex","width":"calc(100% - 260rpx)","position":"relative","height":"auto"}'
                class="list-item-body">
              <view
                  :style='{"padding":"0 0px","margin":"0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis"}'
                  class="list-item-title">课程名称:{{ product.kechengmingcheng }}
              </view>
              <view
                  :style='{"padding":"0 0px","margin":"0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis"}'
                  class="list-item-title">{{ product.kechengleixing }}
              </view>
              <view :style='{"width":"100%","padding":"0 0px","order":"6"}'>
                <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'
                      class="icon iconfont icon-shijian21"></text>
                <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{ product.addtime }}</text>
              </view>
              <view :style='{"padding":"0 0px","margin":"0 10rpx 0 0"}'>
                <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'
                      class="icon iconfont icon-geren16"></text>
                <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{ product.jiaoshigonghao }}
                </text>
              </view>
              <view :style='{"padding":"0 0px","margin":"0 10rpx 0 0","display":"inline-block"}'>
                <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'
                      class="icon iconfont icon-shoucang10"></text>
                <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{ product.storeupnum }}</text>
              </view>
              <view :style='{"padding":"0 0px","margin":"0 10rpx 0 0","display":"inline-block"}'>
                <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'
                      class="icon iconfont icon-chakan2"></text>
                <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{ product.clicknum }}</text>
              </view>
            </view>
          </view>
        </view>
      </view>
      <!-- 商品推荐 -->

      <!-- 商品列表 -->
      <!-- 商品列表 -->
      <!-- 新闻资讯 -->
      <view
          :style='{"width":"calc(100% - 0px)","padding":"60rpx 24rpx","margin":"0 auto","background":"url(http://codegen.caihongy.cn/20240223/73a4808da5734644ad6d17fe0195e700.png) no-repeat center top / 100% auto,#F6BE1E","order":"5"}'
          class="listBox news">
        <view
            :style='{"padding":"0 0 0 12rpx","margin":"0 auto","borderColor":"#38bf3e","textAlign":"center","display":"block","justifyContent":"space-between","background":"none","borderWidth":"0 0 0 0px","width":"calc(100% - 48rpx)","lineHeight":"60rpx","position":"relative","borderStyle":"solid","height":"60rpx"}'
            class="title">
          <view :style='{"fontSize":"40rpx","color":"#fff","text-stroke":"2rpx #000000","fontWeight":"600"}'>资讯公告
          </view>
          <view
              :style='{"position":"absolute","right":"60rpx","alignItems":"center","top":"0px","justifyContent":"center","display":"flex"}'
              @tap="onPageTap('news')">
            <text :style='{"color":"#eee","fontSize":"24rpx"}'>查看更多</text>
            <text :style='{"color":"#eee","fontSize":"24rpx"}' class="icon iconfont icon-jiantou25"></text>
          </view>
        </view>
        <!-- 样式5 -->
        <view :style='{"width":"100%","padding":"0","margin":"60rpx 0 0","height":"auto"}' class="news-box2">
          <block v-for="(item,index) in news" :key="index">
            <view v-if="index==0"
                  :style='{"border":"2rpx solid #000000","padding":"20rpx","margin":"0 0 20rpx","borderRadius":"8rpx","background":"#F7F1DF","width":"100%","position":"relative","height":"auto"}'
                  class="list-item"
                  @tap="onNewsDetailTap(item.id)">
              <image
                  :src="baseUrl+item.picture"
                  :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}'
                  class="listmpic" mode="aspectFill"></image>
              <view :style='{"width":"100%","background":"rgba(0,0,0,0)"}'>
                <view
                    :style='{"padding":"0 0px","overflow":"hidden","whiteSpace":"nowrap","color":"#333","width":"100%","lineHeight":"48rpx","fontSize":"inherit","textOverflow":"ellipsis"}'
                    class="title">{{ item.title }}
                </view>
                <view
                    :style='{"padding":"0 0px","margin":"0","overflow":"hidden","whiteSpace":"nowrap","color":"inherit","width":"100%","lineHeight":"48rpx","fontSize":"inherit","textOverflow":"ellipsis"}'
                    class="text">{{ item.introduction }}
                </view>
                <view :style='{"width":"100%","padding":"0 0px"}'>
                  <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'
                        class="icon iconfont icon-shijian21"></text>
                  <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{ item.addtime }}</text>
                </view>
                <view :style='{"padding":"0 0px","margin":"0 20rpx 0 0","display":"inline-block"}'>
                  <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'
                        class="icon iconfont icon-geren16"></text>
                  <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{ item.name }}</text>
                </view>
                <view :style='{"padding":"0 0px","margin":"0 20rpx 0 0","display":"inline-block"}'>
                  <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'
                        class="icon iconfont icon-zan10"></text>
                  <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{ item.thumbsupnum }}
                  </text>
                </view>
                <view :style='{"padding":"0 0px","margin":"0 20rpx 0 0","display":"inline-block"}'>
                  <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'
                        class="icon iconfont icon-shoucang10"></text>
                  <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{ item.storeupnum }}
                  </text>
                </view>
                <view :style='{"padding":"0 0px","margin":"0 20rpx 0 0","display":"inline-block"}'>
                  <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'
                        class="icon iconfont icon-chakan2"></text>
                  <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{ item.clicknum }}</text>
                </view>
              </view>
            </view>
            <view v-if="index>0"
                  :style='{"padding":"20rpx","borderColor":"#000","margin":"0 0 20rpx 0","borderRadius":"8rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#F7F1DF","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
                  class="list-item"
                  @tap="onNewsDetailTap(item.id)">
              <view
                  :style='{"padding":"0 0px","overflow":"hidden","whiteSpace":"nowrap","color":"#333","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis"}'
                  class="title">{{ item.title }}
              </view>
              <view
                  :style='{"padding":"0 0px","margin":"0","overflow":"hidden","whiteSpace":"nowrap","color":"#666","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis"}'
                  class="text">{{ item.introduction }}
              </view>
              <view :style='{"width":"100%","padding":"0 0px","order":"3"}'>
                <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'
                      class="icon iconfont icon-shijian21"></text>
                <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{ item.addtime }}</text>
              </view>
              <view :style='{"padding":"0 0px","margin":"0 20rpx 0 0","display":"inline-block"}'>
                <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'
                      class="icon iconfont icon-geren16"></text>
                <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{ item.name }}</text>
              </view>
              <view :style='{"padding":"0 0px","margin":"0 20rpx 0 0","display":"inline-block"}'>
                <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'
                      class="icon iconfont icon-zan10"></text>
                <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{ item.thumbsupnum }}</text>
              </view>
              <view :style='{"padding":"0 0px","margin":"0 20rpx 0 0","display":"inline-block"}'>
                <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'
                      class="icon iconfont icon-shoucang10"></text>
                <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{ item.storeupnum }}</text>
              </view>
              <view :style='{"padding":"0 0px","margin":"0 20rpx 0 0","display":"inline-block"}'>
                <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'
                      class="icon iconfont icon-chakan9"></text>
                <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{ item.clicknum }}</text>
              </view>
            </view>
          </block>
        </view>
      </view>
      <!-- 新闻资讯 -->
    </view>
  </view>
</template>

<script>
import menu from '@/utils/menu'
import '@/assets/css/global-restaurant.css'
import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"

export default {
  components: {
    uniIcons
  },
  data() {
    return {
      options2: {
        effect: 'flip',
        loop: true
      },
      options3: {
        effect: 'cube',
        loop: true,
        cubeEffect: {
          shadow: true,
          slideShadows: true,
          shadowOffset: 20,
          shadowScale: 0.94,
        }
      },
      rows: 2,
      column: 4,
      iconArr: [
        'cuIcon-same',
        'cuIcon-deliver',
        'cuIcon-evaluate',
        'cuIcon-shop',
        'cuIcon-ticket',
        'cuIcon-cascades',
        'cuIcon-discover',
        'cuIcon-question',
        'cuIcon-pic',
        'cuIcon-filter',
        'cuIcon-footprint',
        'cuIcon-pulldown',
        'cuIcon-pullup',
        'cuIcon-moreandroid',
        'cuIcon-refund',
        'cuIcon-qrcode',
        'cuIcon-remind',
        'cuIcon-profile',
        'cuIcon-home',
        'cuIcon-message',
        'cuIcon-link',
        'cuIcon-lock',
        'cuIcon-unlock',
        'cuIcon-vip',
        'cuIcon-weibo',
        'cuIcon-activity',
        'cuIcon-friendadd',
        'cuIcon-friendfamous',
        'cuIcon-friend',
        'cuIcon-goods',
        'cuIcon-selection'
      ],
      role: '',
      aboutUsDetail: {},
      systemIntroductionDetail: {},
      menuList: [],
      swiperMenuList: [],
      user: {},
      tableName: '',

      //轮播
      swiperList: [],
      kechengziyuanlist: [],
      kechengxinxilist: [],
      news: [],
    }
  },
  watch: {},
  mounted() {
  },
  computed: {
    baseUrl() {
      return this.$base.url;
    },
  },
  async onLoad() {

  },
  async onShow() {
    this.swiperMenuList = []
    this.role = uni.getStorageSync("appRole");
    let table = uni.getStorageSync("nowTable");
    let res = await this.$api.session(table);
    this.user = res.data;
    this.tableName = table;
    let menus = menu.list();
    this.menuList = menus;
    this.menuList.forEach((item, key) => {
      if (key == 0) {
        item.frontMenu.forEach((item2, key2) => {
          if (item2.child[0].buttons.indexOf("查看") > -1) {
            this.swiperMenuList.push(item2);
          }
        })
      }
    })
    // let res;
    // 轮播图
    let swiperList = []
    res = await this.$api.list('config', {
      page: 1,
      limit: 5
    });
    for (let item of res.data.list) {
      if (item.name.indexOf('picture') >= 0 && item.value && item.value != "" && item.value != null) {
        swiperList.push({
          img: item.value,
          title: item.name,
          url: item.url
        });
      }
    }
    if (swiperList) {
      this.swiperList = swiperList;
    }


    this.getAboutUs();
    this.getSystemIntroduction();
    // 推荐信息
    // 推荐信息
    this.getRecommendList()
    this.getHomeList()
    this.getNewsList()
  },
  methods: {
    uGetRect(selector, all) {
      return new Promise(resolve => {
        uni.createSelectorQuery()
            .in(this)
            [all ? 'selectAll' : 'select'](selector)
            .boundingClientRect(rect => {
              if (all && Array.isArray(rect) && rect.length) {
                resolve(rect);
              }
              if (!all && rect) {
                resolve(rect);
              }
            })
            .exec();
      });
    },
    cloneData(data) {
      return JSON.parse(JSON.stringify(data));
    },
    newsTabClick2(index) {
      this.newsIndex2 = index
      this.getNewsList()
    },
    async getNewsList() {
      let res;
      let params = {
        page: 1,
        limit: 4,
        sort: 'id',
        order: 'desc',
      }
      // 资讯公告
      res = await this.$api.list('news', params)
      this.news = res.data.list
    },
    homeTabClick2(index, name) {
      this['home' + name + 'Index2'] = index
      this.getHomeList()
    },
    async getHomeList() {
      let res;
      let params;
    },
    recommendTabClick2(index, name) {
      this[name + 'Index2'] = index
      this.getRecommendList()
    },
    async getRecommendList() {
      let res;
      let params;
      // 推荐信息
      params = {
        page: 1,
        limit: 4,
      }
      res = await this.$api.recommend('kechengziyuan', params);
      this.kechengziyuanlist = res.data.list


      // 推荐信息
      params = {
        page: 1,
        limit: 4,
      }
      if (uni.getStorageSync("appUserid")) {
        res = await this.$api.recommend2('kechengxinxi', params);
      } else {
        res = await this.$api.recommend('kechengxinxi', params);
      }
      this.kechengxinxilist = res.data.list


    },
    //轮播图跳转
    onSwiperTap(e) {
      if (e.url) {
        if (e.url.indexOf('https') != -1) {
          window.open(e.url)
        } else {
          this.$utils.jump(e.url)
        }
      }
    },
    async getAboutUs() {
      let res = await this.$api.info('aboutus', 1)
      this.aboutUsDetail = res.data;
    },
    async getSystemIntroduction() {
      let res = await this.$api.info('systemintro', 1)
      this.systemIntroductionDetail = res.data;
    },
    // 新闻详情
    onNewsDetailTap(id) {
      this.$utils.jump(`../news-detail/news-detail?id=${id}`)
    },
    // 推荐列表点击详情
    onDetailTap(tableName, id) {
      this.$utils.jump(`../${tableName}/detail?id=${id}`)
    },
    onPageTap(tableName) {

      uni.navigateTo({
        url: `../${tableName}/list`,
        fail: function () {
          uni.switchTab({
            url: `../${tableName}/list`
          });
        }
      });
      // this.$utils.jump(`../${tableName}/list`)
    },
    onPageTap2(url) {
      uni.setStorageSync("useridTag", 0);
      uni.navigateTo({
        url: url,
        fail: function () {
          uni.switchTab({
            url: url
          });
        }
      });
    }
  }
}
</script>

<style lang="scss" scoped>
.content {
  min-height: calc(100vh - 44px);
  box-sizing: border-box;
}

</style>
