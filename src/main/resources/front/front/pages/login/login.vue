<template>
  <view class="content">
    <view
        :style='{"minHeight":"100vh","padding":"80rpx 24rpx 24rpx","alignItems":"flex-start","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20240221/0e49410173244550af4a20b298dd0979.png) no-repeat center top / 100% 100%,#4ab030","display":"flex","width":"100%","height":"auto"}'
        class="box">
      <view
          :style='{"padding":"96rpx 60rpx 40rpx 20rpx","margin":"40rpx 0 0px","borderRadius":"16rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20240221/d6a8211fdbd94e28bc42b938de7b9b84.png) no-repeat center top / 100% 100%","flexDirection":"column","display":"flex","width":"100%","position":"relative","justifyContent":"space-between","height":"auto"}'>
        <image
            :style='{"width":"160rpx","margin":"0 auto 60rpx","borderRadius":"100%","display":"none","height":"160rpx","order":"-1"}'
            mode="aspectFill" src="http://codegen.caihongy.cn/20231220/41304a2a7b194c148f209f014055dbdf.jpg"></image>
        <view v-if="loginType==1"
              :style='{"margin":"0 0 80rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
              class="uni-form-item uni-column">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">账号：
          </view>
          <input v-model="username"
                 :style='{"border":"0px solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","width":"auto","fontSize":"28rpx","height":"76rpx"}'
                 class="uni-input" name="" placeholder="请输入账号" type="text"/>
        </view>
        <view v-if="loginType==1"
              :style='{"margin":"0 0 80rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
              class="uni-form-item uni-column">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">密码：
          </view>
          <input v-model="password"
                 :style='{"border":"0px solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","width":"auto","fontSize":"28rpx","height":"76rpx"}'
                 class="uni-input" name="" placeholder="请输入密码" type="password"/>
        </view>
        <view v-if="roleNum>1"
              :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"76rpx"}'>
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">用户类型：
          </view>
          <picker :range="options"
                  :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0 20rpx","color":"#666","borderRadius":"60rpx","background":"#DDD5D5","flex":"1","display":"inline-block","width":"auto","lineHeight":"76rpx","fontSize":"28rpx"}'
                  :value="index"
                  @change="optionsChange">
            <view class="uni-picker-type">{{ options[index] }}</view>
          </picker>
        </view>


        <button v-if="loginType==1"
                :style='{"border":"0","padding":"0px","boxShadow":"0px 8rpx 20rpx 0px rgba(0,0,0,0.3)","margin":"0","color":"#fff","bottom":"-48rpx","borderRadius":"16rpx","left":"25%","background":"#F6BE1E","width":"50%","lineHeight":"96rpx","fontSize":"30rpx","position":"absolute","fontWeight":"600","height":"96rpx","order":"2"}'
                class="btn-submit" type="primary"
                @tap="onLoginTap">
          登录
        </button>
        <button v-if="loginType==2"
                :style='{"border":"0","padding":"0px","boxShadow":"0px 8rpx 20rpx 0px rgba(0,0,0,0.3)","margin":"0","color":"#fff","bottom":"-48rpx","borderRadius":"16rpx","left":"25%","background":"#F6BE1E","width":"50%","lineHeight":"96rpx","fontSize":"30rpx","position":"absolute","fontWeight":"600","height":"96rpx","order":"2"}'
                class="btn-submit" type="primary"
                @tap="onFaceLoginTap">
          人脸识别登录
        </button>
        <view
            :style='{"padding":"0","margin":"0 0 40rpx","flexWrap":"wrap","display":"flex","width":"calc(100% - 0px)","justifyContent":"center","height":"auto","order":"4"}'
            class="links">
          <view
              :style='{"padding":"0px 20rpx","margin":"0 20rpx 20rpx 0","color":"#fff","borderRadius":"12rpx","background":"#0D75D6","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'
              class="link-highlight"
              @tap="onRegisterTap('xuesheng')">
            注册学生
          </view>
        </view>

        <view :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}' class="idea1">idea1</view>
        <view :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}' class="idea2">idea2</view>
        <view :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}' class="idea3">idea3</view>
      </view>
    </view>
  </view>
</template>

<script>
import menu from '@/utils/menu'

export default {
  data() {
    return {
      username: '',
      password: '',
      loginType: 1,
      codes: [{
        num: 1,
        color: '#000',
        rotate: '10deg',
        size: '16px'
      }, {
        num: 2,
        color: '#000',
        rotate: '10deg',
        size: '16px'
      }, {
        num: 3,
        color: '#000',
        rotate: '10deg',
        size: '16px'
      }, {
        num: 4,
        color: '#000',
        rotate: '10deg',
        size: '16px'
      }],
      options: [
        '请选择登录用户类型',
      ],
      optionsValues: [
        '',
        'xuesheng',
      ],
      index: 0,
      roleNum: 0,

    }
  },
  onLoad() {
    let options = ['请选择登录用户类型'];
    let menus = menu.list();
    this.menuList = menus;
    for (let i = 0; i < this.menuList.length; i++) {
      if (this.menuList[i].hasFrontLogin == '是') {
        options.push(this.menuList[i].roleName);
        this.roleNum++;
      }
    }
    if (this.roleNum == 1) {
      this.index = 1;
    }
    this.options = options;
    this.styleChange()
  },
  onShow() {
  },
  mounted() {
  },
  methods: {
    styleChange() {
      this.$nextTick(() => {
        // document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
        //   el.style.backgroundColor = this.loginFrom.content.input.backgroundColor
        // })
      })
    },
    onRegisterTap(tableName) {
      uni.setStorageSync("loginTable", tableName);
      this.$utils.jump('../register/register')
    },
    async onLoginTap() {
      if (!this.username) {
        this.$utils.msg('请输入用户名')
        return
      }
      if (!this.password) {
        this.$utils.msg('请输入用户密码')
        return
      }
      if (!this.optionsValues[this.index]) {
        this.$utils.msg('请选择登录用户类型')
        return
      }

      this.loginPost()

    },
    async loginPost() {

      let res = await this.$api.login(`${this.optionsValues[this.index]}`, {
        username: this.username,
        password: this.password
      });
      uni.removeStorageSync("useridTag");
      uni.setStorageSync("appToken", res.token);
      uni.setStorageSync("nickname", this.username);
      uni.setStorageSync("nowTable", `${this.optionsValues[this.index]}`);
      res = await this.$api.session(`${this.optionsValues[this.index]}`);
      if (res.data.touxiang) {
        uni.setStorageSync('headportrait', res.data.touxiang);
      } else if (res.data.headportrait) {
        uni.setStorageSync('headportrait', res.data.headportrait);
      }
      uni.setStorageSync('userSession', JSON.stringify(res.data))
      // 保存用户id
      uni.setStorageSync("appUserid", res.data.id);
      if (res.data.vip) {
        uni.setStorageSync("vip", res.data.vip);
      }
      uni.setStorageSync("appRole", `${this.options[this.index]}`);
      this.$utils.tab('../index/index');
    },
    optionsChange(e) {
      this.index = e.target.value
    }
  }
}
</script>

<style lang="scss" scoped>
page {
  height: 100%;
}

.content {
  height: 100%;
  box-sizing: border-box;
}

</style>
