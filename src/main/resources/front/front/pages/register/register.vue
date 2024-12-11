<template>
  <view class="content">
    <view
        :style='{"minHeight":"100vh","padding":"80rpx 24rpx 24rpx","alignItems":"flex-start","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20240221/0e49410173244550af4a20b298dd0979.png) no-repeat center top / 100% 100%,#4ab030","display":"flex","width":"100%","height":"auto"}'
        class="box">
      <view
          :style='{"padding":"96rpx 60rpx 96rpx 20rpx","margin":"40rpx 0 80rpx","borderRadius":"16rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20240221/d6a8211fdbd94e28bc42b938de7b9b84.png) no-repeat center top / 100% 100%","display":"flex","width":"100%","position":"relative","height":"auto"}'>
        <image
            :style='{"width":"160rpx","margin":"0 auto 60rpx","borderRadius":"8rpx","display":"none","height":"160rpx"}'
            mode="aspectFill" src="http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg"></image>
        <view
            v-if="tableName=='xuesheng'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="uni-form-item uni-column">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">学生账号：
          </view>
          <input
              v-model="ruleForm.xueshengzhanghao"
              :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'
              class="uni-input" name="" placeholder="学生账号" type="text"/>
        </view>
        <view
            v-if="tableName=='xuesheng'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="uni-form-item uni-column">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">学生姓名：
          </view>
          <input
              v-model="ruleForm.xueshengxingming"
              :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'
              class="uni-input" name="" placeholder="学生姓名" type="text"/>
        </view>
        <view
            v-if="tableName=='xuesheng'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="uni-form-item uni-column">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">密码：
          </view>
          <input
              v-model="ruleForm.mima"
              :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'
              class="uni-input" name="" placeholder="密码" type="password"/>
        </view>
        <view
            v-if="tableName=='xuesheng'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="uni-form-item uni-column">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">确认密码：
          </view>
          <input
              v-model="ruleForm.mima2"
              :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'
              class="uni-input" name="" placeholder="确认密码" type="password"/>
        </view>
        <view
            v-if="tableName=='xuesheng'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="uni-form-item uni-column">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">班级：
          </view>
          <input
              v-model="ruleForm.banji"
              :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'
              class="uni-input" name="" placeholder="班级" type="text"/>
        </view>
        <view
            v-if="tableName=='xuesheng'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="uni-form-item uni-column">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">手机号：
          </view>
          <input
              v-model="ruleForm.shoujihao"
              :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'
              class="uni-input" name="" placeholder="手机号" type="text"/>
        </view>
        <view
            v-if="tableName=='xuesheng'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">性别：
          </view>
          <picker
              v-if="tableName=='xuesheng'"
              :range="xueshengxingbieOptions"
              :style='{"width":"100%","margin":"0 0 24rpx 0","alignItems":"center","display":"flex","height":"76rpx"}'
              :value="xueshengxingbieIndex"
              @change="xueshengxingbieChange">
            <view>
              <view
                  :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0 20rpx","color":"#666","borderRadius":"40rpx","background":"#DDD5D5","width":"100%","lineHeight":"76rpx","fontSize":"28rpx"}'
                  class="uni-input">{{ ruleForm.xingbie ? ruleForm.xingbie : "请选择性别" }}
              </view>
            </view>
          </picker>
        </view>
        <view
            v-if="tableName=='xuesheng'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="uni-form-item uni-column">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">年龄：
          </view>
          <input
              v-model="ruleForm.nianling"
              :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'
              class="uni-input" name="" placeholder="年龄" type="text"/>
        </view>
        <view
            v-if="tableName=='xuesheng'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="" @tap="xueshengtouxiangTap">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">头像：
          </view>
          <image
              v-if="ruleForm.touxiang"
              :src="baseUrl+ruleForm.touxiang"
              :style='{"width":"160rpx","margin":"0 0 20rpx","borderRadius":"40rpx","objectFit":"cover","display":"block","height":"100rpx"}'
              class="avator" mode=""></image>
          <image
              v-else
              :style='{"width":"160rpx","margin":"0 0 20rpx","borderRadius":"40rpx","objectFit":"cover","display":"block","height":"100rpx"}'
              class="avator" mode="" src="../../static/gen/upload.png"></image>
        </view>
        <view
            v-if="tableName=='jiaoshi'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="uni-form-item uni-column">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">教师工号：
          </view>
          <input
              v-model="ruleForm.jiaoshigonghao"
              :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'
              class="uni-input" name="" placeholder="教师工号" type="text"/>
        </view>
        <view
            v-if="tableName=='jiaoshi'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="uni-form-item uni-column">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">教师姓名：
          </view>
          <input
              v-model="ruleForm.jiaoshixingming"
              :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'
              class="uni-input" name="" placeholder="教师姓名" type="text"/>
        </view>
        <view
            v-if="tableName=='jiaoshi'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="uni-form-item uni-column">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">密码：
          </view>
          <input
              v-model="ruleForm.mima"
              :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'
              class="uni-input" name="" placeholder="密码" type="password"/>
        </view>
        <view
            v-if="tableName=='jiaoshi'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="uni-form-item uni-column">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">确认密码：
          </view>
          <input
              v-model="ruleForm.mima2"
              :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'
              class="uni-input" name="" placeholder="确认密码" type="password"/>
        </view>
        <view
            v-if="tableName=='jiaoshi'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="uni-form-item uni-column">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">手机号：
          </view>
          <input
              v-model="ruleForm.shoujihao"
              :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'
              class="uni-input" name="" placeholder="手机号" type="text"/>
        </view>
        <view
            v-if="tableName=='jiaoshi'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">性别：
          </view>
          <picker
              v-if="tableName=='jiaoshi'"
              :range="jiaoshixingbieOptions"
              :style='{"width":"100%","margin":"0 0 24rpx 0","alignItems":"center","display":"flex","height":"76rpx"}'
              :value="jiaoshixingbieIndex"
              @change="jiaoshixingbieChange">
            <view>
              <view
                  :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0 20rpx","color":"#666","borderRadius":"40rpx","background":"#DDD5D5","width":"100%","lineHeight":"76rpx","fontSize":"28rpx"}'
                  class="uni-input">{{ ruleForm.xingbie ? ruleForm.xingbie : "请选择性别" }}
              </view>
            </view>
          </picker>
        </view>
        <view
            v-if="tableName=='jiaoshi'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="uni-form-item uni-column">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">年龄：
          </view>
          <input
              v-model="ruleForm.nianling"
              :style='{"border":"2rpx solid rgba(255,255,255,.8)","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"60rpx","flex":"1","background":"#DDD5D5","fontSize":"28rpx","height":"76rpx"}'
              class="uni-input" name="" placeholder="年龄" type="text"/>
        </view>
        <view
            v-if="tableName=='jiaoshi'"
            :style='{"margin":"0 0 60rpx 0","borderColor":"#eee","alignItems":"center","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="" @tap="jiaoshitouxiangTap">
          <view
              :style='{"color":"rgb(0, 0, 0)","textAlign":"right","display":"block","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="label">头像：
          </view>
          <image
              v-if="ruleForm.touxiang"
              :src="baseUrl+ruleForm.touxiang"
              :style='{"width":"160rpx","margin":"0 0 20rpx","borderRadius":"40rpx","objectFit":"cover","display":"block","height":"100rpx"}'
              class="avator" mode=""></image>
          <image
              v-else
              :style='{"width":"160rpx","margin":"0 0 20rpx","borderRadius":"40rpx","objectFit":"cover","display":"block","height":"100rpx"}'
              class="avator" mode="" src="../../static/gen/upload.png"></image>
        </view>
        <button
            :style='{"border":"0","padding":"0px","boxShadow":"0px 8rpx 20rpx 0px rgba(0,0,0,0.3)","margin":"48rpx auto 24rpx","color":"#fff","bottom":"-48rpx","borderRadius":"16rpx","left":"25%","background":"#F6BE1E","width":"50%","lineHeight":"88rpx","fontSize":"32rpx","position":"absolute","height":"88rpx"}'
            class="btn-submit" type="primary" @tap="register">注册
        </button>

        <view :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}' class="idea1">idea1</view>
        <view :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}' class="idea2">idea2</view>
        <view :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}' class="idea3">idea3</view>
      </view>
    </view>
  </view>
</template>

<script>
import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";

export default {
  data() {
    return {
      xueshengxingbieOptions: [],
      xueshengxingbieIndex: 0,
      jiaoshixingbieOptions: [],
      jiaoshixingbieIndex: 0,
      ruleForm: {
        xueshengzhanghao: '',
        xueshengxingming: '',
        mima: '',
        banji: '',
        shoujihao: '',
        xingbie: '',
        nianling: '',
        touxiang: '',
        jiaoshigonghao: '',
        jiaoshixingming: '',
        mima: '',
        shoujihao: '',
        xingbie: '',
        nianling: '',
        touxiang: '',
      },
      tableName: ""
    }
  },
  components: {
    multipleSelect
  },
  computed: {
    baseUrl() {
      return this.$base.url;
    },
  },
  async onLoad() {
    let res = [];
    let table = uni.getStorageSync("loginTable");
    this.tableName = table;

    // 自定义下拉框值
    if (this.tableName == 'xuesheng') {
      this.xueshengxingbieOptions = "男,女".split(',');
      this.ruleForm.xingbie = this.xueshengxingbieOptions[0]
    }
    // 自定义下拉框值
    if (this.tableName == 'jiaoshi') {
      this.jiaoshixingbieOptions = "男,女".split(',');
      this.ruleForm.xingbie = this.jiaoshixingbieOptions[0]
    }

    this.styleChange()
  },
  methods: {

    // 下拉变化
    xueshengxingbieChange(e) {
      this.xueshengxingbieIndex = e.target.value
      this.ruleForm.xingbie = this.xueshengxingbieOptions[this.xueshengxingbieIndex]
    },
    xueshengtouxiangTap() {
      let _this = this;
      this.$api.upload(function (res) {
        _this.ruleForm.touxiang = 'upload/' + res.file;
        _this.$forceUpdate();
      });
    },
    // 下拉变化
    jiaoshixingbieChange(e) {
      this.jiaoshixingbieIndex = e.target.value
      this.ruleForm.xingbie = this.jiaoshixingbieOptions[this.jiaoshixingbieIndex]
    },
    jiaoshitouxiangTap() {
      let _this = this;
      this.$api.upload(function (res) {
        _this.ruleForm.touxiang = 'upload/' + res.file;
        _this.$forceUpdate();
      });
    },

    toggleTab(str) {
      this.$refs[str].show();
    },

    styleChange() {
      this.$nextTick(() => {
        // document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
        //   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
        // })
      })
    },
    // 获取uuid
    getUUID() {
      return new Date().getTime();
    },
    // 注册
    async register() {

      if ((!this.ruleForm.xueshengzhanghao) && `xuesheng` == this.tableName) {
        this.$utils.msg(`学生账号不能为空`);
        return
      }
      if ((!this.ruleForm.xueshengxingming) && `xuesheng` == this.tableName) {
        this.$utils.msg(`学生姓名不能为空`);
        return
      }
      if ((!this.ruleForm.mima) && `xuesheng` == this.tableName) {
        this.$utils.msg(`密码不能为空`);
        return
      }
      if (`xuesheng` == this.tableName && (this.ruleForm.mima != this.ruleForm.mima2)) {
        this.$utils.msg(`两次密码输入不一致`);
        return
      }
      if ((!this.ruleForm.jiaoshigonghao) && `jiaoshi` == this.tableName) {
        this.$utils.msg(`教师工号不能为空`);
        return
      }
      if ((!this.ruleForm.jiaoshixingming) && `jiaoshi` == this.tableName) {
        this.$utils.msg(`教师姓名不能为空`);
        return
      }
      if ((!this.ruleForm.mima) && `jiaoshi` == this.tableName) {
        this.$utils.msg(`密码不能为空`);
        return
      }
      if (`jiaoshi` == this.tableName && (this.ruleForm.mima != this.ruleForm.mima2)) {
        this.$utils.msg(`两次密码输入不一致`);
        return
      }
      await this.$api.register(`${this.tableName}`, this.ruleForm);
      this.$utils.msgBack('注册成功');
      ;
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
