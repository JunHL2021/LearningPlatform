<template>
  <view class="content">
    <view :style='{"width":"100%","padding":"24rpx","position":"relative","background":"#F1F1F1","height":"100%"}'
          class="box">
      <view
          :style='{"width":"100%","padding":"24rpx","borderRadius":"16rpx","background":"#fff","display":"block","height":"auto"}'>
        <view
            v-if="tableName=='xuesheng'"
            :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">
            学生账号
          </view>
          <input
              v-model="ruleForm.xueshengzhanghao"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              disabled="true" placeholder="学生账号"></input>
        </view>
        <view
            v-if="tableName=='xuesheng'"
            :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">
            学生姓名
          </view>
          <input
              v-model="ruleForm.xueshengxingming"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="学生姓名"></input>
        </view>
        <view
            v-if="tableName=='xuesheng'"
            :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">
            班级
          </view>
          <input
              v-model="ruleForm.banji"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="班级"></input>
        </view>
        <view
            v-if="tableName=='xuesheng'"
            :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">
            手机号
          </view>
          <input
              v-model="ruleForm.shoujihao"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="手机号"></input>
        </view>
        <view v-if="tableName=='xuesheng'"
              :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
              class=" select">
          <view
              :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">性别
          </view>
          <picker :range="xueshengxingbieOptions" :style='{"width":"100%","flex":"1","height":"auto"}'
                  :value="xueshengxingbieIndex" @change="xueshengxingbieChange">
            <view
                :style='{"border":"2rpx solid #fff","padding":"0 20rpx","color":"#666","borderRadius":"8rpx","background":"rgba(255,255,255,.6)","width":"100%","lineHeight":"80rpx","fontSize":"28rpx"}'
                class="uni-input picker-select-input">{{ ruleForm.xingbie ? ruleForm.xingbie : "请选择性别" }}
            </view>
          </picker>
        </view>
        <view
            v-if="tableName=='xuesheng'"
            :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">
            年龄
          </view>
          <input
              v-model="ruleForm.nianling"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="年龄"></input>
        </view>
        <view
            v-if="tableName=='xuesheng'"
            :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="" @tap="xueshengtouxiangTap">
          <view
              :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">
            头像
          </view>
          <image v-if="ruleForm.touxiang"
                 :src="baseUrl+ruleForm.touxiang"
                 :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}'
                 class="avator" mode=""
                 style="margin: 0;"></image>
          <image v-else
                 :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}'
                 class="avator" mode="" src="../../static/gen/upload.png" style="margin: 0;"></image>
        </view>
        <view
            v-if="tableName=='jiaoshi'"
            :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">
            教师工号
          </view>
          <input
              v-model="ruleForm.jiaoshigonghao"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              disabled="true" placeholder="教师工号"></input>
        </view>
        <view
            v-if="tableName=='jiaoshi'"
            :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">
            教师姓名
          </view>
          <input
              v-model="ruleForm.jiaoshixingming"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="教师姓名"></input>
        </view>
        <view
            v-if="tableName=='jiaoshi'"
            :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">
            手机号
          </view>
          <input
              v-model="ruleForm.shoujihao"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="手机号"></input>
        </view>
        <view v-if="tableName=='jiaoshi'"
              :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
              class=" select">
          <view
              :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">性别
          </view>
          <picker :range="jiaoshixingbieOptions" :style='{"width":"100%","flex":"1","height":"auto"}'
                  :value="jiaoshixingbieIndex" @change="jiaoshixingbieChange">
            <view
                :style='{"border":"2rpx solid #fff","padding":"0 20rpx","color":"#666","borderRadius":"8rpx","background":"rgba(255,255,255,.6)","width":"100%","lineHeight":"80rpx","fontSize":"28rpx"}'
                class="uni-input picker-select-input">{{ ruleForm.xingbie ? ruleForm.xingbie : "请选择性别" }}
            </view>
          </picker>
        </view>
        <view
            v-if="tableName=='jiaoshi'"
            :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">
            年龄
          </view>
          <input
              v-model="ruleForm.nianling"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="年龄"></input>
        </view>
        <view
            v-if="tableName=='jiaoshi'"
            :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="" @tap="jiaoshitouxiangTap">
          <view
              :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">
            头像
          </view>
          <image v-if="ruleForm.touxiang"
                 :src="baseUrl+ruleForm.touxiang"
                 :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}'
                 class="avator" mode=""
                 style="margin: 0;"></image>
          <image v-else
                 :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}'
                 class="avator" mode="" src="../../static/gen/upload.png" style="margin: 0;"></image>
        </view>
        <view :style='{"width":"100%","flexWrap":"wrap","justifyContent":"center","display":"flex","height":"auto"}'
              class="btn">
          <button
              :style='{"border":"0","padding":"0px","margin":"0 20rpx 40rpx","color":"#fff","borderRadius":"60rpx","background":"#F6BE1E","width":"40%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}'
              class="cu-btn lg"
              @tap="update()">
            保存
          </button>
          <button
              :style='{"border":"0px solid rgb(255, 170, 51)","padding":"0px","margin":"0 20rpx","color":"#fff","borderRadius":"60rpx","background":"#bcbcbc","width":"40%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}'
              class="cu-btn lg"
              @tap="logout()">
            退出登录
          </button>
        </view>
      </view>
    </view>
  </view>
</template>

<script>

import xiaEditor from '@/components/xia-editor/xia-editor';
import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";

export default {
  data() {
    return {
      ruleForm: {},
      tableName: "",
      xueshengxingbieOptions: [],
      xueshengxingbieIndex: 0,
      jiaoshixingbieOptions: [],
      jiaoshixingbieIndex: 0,
    }
  },
  components: {
    multipleSelect,
    xiaEditor
  },
  computed: {
    baseUrl() {
      return this.$base.url;
    }
  },
  async onLoad() {
    let table = uni.getStorageSync("nowTable");
    let that = this
    let res = {}
    this.tableName = table;
    this.getSession()
    // 自定义下拉框值
    if (this.tableName == 'xuesheng') {
      this.xueshengxingbieOptions = "男,女".split(',');
      this.xueshengxingbieOptions.forEach((item, index) => {
        if (item == this.ruleForm.xingbie) {
          this.xueshengxingbieIndex = index;
        }
      });
    }
    // 自定义下拉框值
    if (this.tableName == 'jiaoshi') {
      this.jiaoshixingbieOptions = "男,女".split(',');
      this.jiaoshixingbieOptions.forEach((item, index) => {
        if (item == this.ruleForm.xingbie) {
          this.jiaoshixingbieIndex = index;
        }
      });
    }
    this.styleChange()
    this.$forceUpdate()
  },
  methods: {
    async getSession() {
      let res = await this.$api.session(this.tableName)
      this.ruleForm = res.data;
      uni.setStorageSync('userSession', JSON.stringify(res.data))
    },
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
        // document.querySelectorAll('. .uni-input-input').forEach(el=>{
        //   el.style.backgroundColor = this.userInfoForm.list.input.backgroundColor
        // })
      })
    },
    // 获取uuid
    getUUID() {
      return new Date().getTime();
    },
    logout() {
      uni.clearStorageSync()
      this.$utils.jump('../login/login');
    },
    // 注册
    async update() {

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


      let table = uni.getStorageSync("nowTable");
      await this.$api.update(table, this.ruleForm);
      this.$utils.msgBack('修改成功');
      ;
      this.getSession()
    },

  }
}
</script>

<style lang="scss" scoped>
.content {
  min-height: calc(100vh - 44px);
  box-sizing: border-box;
}
</style>
