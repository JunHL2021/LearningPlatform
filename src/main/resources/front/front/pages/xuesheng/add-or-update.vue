<template>
  <view class="content">
    <view
        :style='{"minHeight":"100vh","width":"100%","padding":"24rpx","position":"relative","background":"#F1F1F1","height":"auto"}'>
      <form
          :style='{"width":"100%","padding":"24rpx","borderRadius":"16rpx","background":"#fff","display":"block","height":"auto"}'
          class="app-update-pv">
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">学生账号
          </view>
          <input
              v-model="ruleForm.xueshengzhanghao"
              :disabled="ro.xueshengzhanghao"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="学生账号"
              type="text"></input>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">学生姓名
          </view>
          <input
              v-model="ruleForm.xueshengxingming"
              :disabled="ro.xueshengxingming"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="学生姓名"
              type="text"></input>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">密码
          </view>
          <input
              v-model="ruleForm.mima"
              :disabled="ro.mima"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="密码" type="text"></input>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">班级
          </view>
          <input
              v-model="ruleForm.banji"
              :disabled="ro.banji"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="班级" type="text"></input>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">手机号
          </view>
          <input
              v-model="ruleForm.shoujihao"
              :disabled="ro.shoujihao"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="手机号" type="text"></input>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class=" select">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">性别
          </view>
          <picker :disabled="ro.xingbie"
                  :range="xingbieOptions"
                  :style='{"border":"2rpx solid #fff","width":"100%","padding":"0 24rpx","flex":"1","background":"rgba(255,255,255,.6)","height":"auto"}'
                  :value="xingbieIndex" @change="xingbieChange">
            <view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">
              {{ ruleForm.xingbie ? ruleForm.xingbie : "请选择性别" }}
            </view>
          </picker>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">年龄
          </view>
          <input
              v-model="ruleForm.nianling"
              :disabled="ro.nianling"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="年龄" type="text"></input>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="" @tap="touxiangTap">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">头像
          </view>
          <image v-if="ruleForm.touxiang"
                 :src="baseUrl+ruleForm.touxiang.split(',')[0]"
                 :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}'
                 class="avator"
                 mode="aspectFill"></image>
          <image v-else
                 :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}'
                 class="avator" mode="aspectFill" src="../../static/gen/upload.png"></image>
        </view>


        <view :style='{"width":"100%","flexWrap":"wrap","justifyContent":"center","display":"flex","height":"auto"}'
              class="btn">
          <button
              :style='{"border":"0","padding":"0px","margin":"0 40rpx 40rpx 0","color":"#fff","borderRadius":"60rpx","background":"#F6BE1E","width":"40%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}'
              class="bg-red" @tap="onSubmitTap">提交
          </button>
        </view>
      </form>

    </view>
  </view>
</template>

<script>
import wPicker from "@/components/w-picker/w-picker.vue";
import xiaEditor from '@/components/xia-editor/xia-editor';
import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";

export default {
  data() {
    return {
      cross: '',
      ruleForm: {
        xueshengzhanghao: '',
        xueshengxingming: '',
        mima: '',
        banji: '',
        shoujihao: '',
        xingbie: '',
        nianling: '',
        touxiang: '',
      },
      xingbieOptions: [],
      xingbieIndex: 0,
      // 登录用户信息
      user: {},
      ro: {
        xueshengzhanghao: false,
        xueshengxingming: false,
        mima: false,
        banji: false,
        shoujihao: false,
        xingbie: false,
        nianling: false,
        touxiang: false,
      },
    }
  },
  components: {
    wPicker,
    xiaEditor,
    multipleSelect,
  },
  computed: {
    baseUrl() {
      return this.$base.url;
    },


  },
  async onLoad(options) {
    let table = uni.getStorageSync("nowTable");
    // 获取用户信息
    let res = await this.$api.session(table);
    this.user = res.data;

    // ss读取


    // 自定义下拉框值
    this.xingbieOptions = "男,女".split(',')

    // 如果有登录，获取登录后保存的userid
    this.ruleForm.userid = uni.getStorageSync("appUserid")
    if (options.refid) {
      // 如果上一级页面传递了refid，获取改refid数据信息
      this.ruleForm.refid = Number(options.refid);
      this.ruleForm.nickname = uni.getStorageSync("nickname");
    }
    // 如果是更新操作
    if (options.id) {
      this.ruleForm.id = options.id;
      // 获取信息
      res = await this.$api.info(`xuesheng`, this.ruleForm.id);
      this.ruleForm = res.data;
    }
    // 跨表
    this.cross = options.cross;
    if (options.cross) {
      var obj = uni.getStorageSync('crossObj');
      for (var o in obj) {
        if (o == 'xueshengzhanghao') {
          this.ruleForm.xueshengzhanghao = obj[o];
          this.ro.xueshengzhanghao = true;
          continue;
        }
        if (o == 'xueshengxingming') {
          this.ruleForm.xueshengxingming = obj[o];
          this.ro.xueshengxingming = true;
          continue;
        }
        if (o == 'mima') {
          this.ruleForm.mima = obj[o];
          this.ro.mima = true;
          continue;
        }
        if (o == 'banji') {
          this.ruleForm.banji = obj[o];
          this.ro.banji = true;
          continue;
        }
        if (o == 'shoujihao') {
          this.ruleForm.shoujihao = obj[o];
          this.ro.shoujihao = true;
          continue;
        }
        if (o == 'xingbie') {
          this.ruleForm.xingbie = obj[o];
          this.ro.xingbie = true;
          continue;
        }
        if (o == 'nianling') {
          this.ruleForm.nianling = obj[o];
          this.ro.nianling = true;
          continue;
        }
        if (o == 'touxiang') {
          this.ruleForm.touxiang = obj[o].split(",")[0];
          this.ro.touxiang = true;
          continue;
        }
      }
    }
    this.styleChange()
    this.$forceUpdate()

    if (uni.getStorageSync('raffleType') && uni.getStorageSync('raffleType') != null) {
      uni.removeStorageSync('raffleType')
      setTimeout(() => {
        this.onSubmitTap()
      }, 300)
    }
  },
  methods: {
    styleChange() {
      this.$nextTick(() => {
        // document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
        //   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
        // })
      })
    },

    // 多级联动参数


    // 下拉变化
    xingbieChange(e) {
      this.xingbieIndex = e.target.value
      this.ruleForm.xingbie = this.xingbieOptions[this.xingbieIndex]
    },

    touxiangTap() {
      let _this = this;
      this.$api.upload(function (res) {
        _this.ruleForm.touxiang = 'upload/' + res.file;
        _this.$forceUpdate();
        _this.$nextTick(() => {
          _this.styleChange()
        })
      });
    },

    getUUID() {
      return new Date().getTime();
    },
    async onSubmitTap() {
//跨表计算判断
      var obj;
      if ((!this.ruleForm.xueshengzhanghao)) {
        this.$utils.msg(`学生账号不能为空`);
        return
      }
      if ((!this.ruleForm.xueshengxingming)) {
        this.$utils.msg(`学生姓名不能为空`);
        return
      }
      if ((!this.ruleForm.mima)) {
        this.$utils.msg(`密码不能为空`);
        return
      }
      //更新跨表属性
      var crossuserid;
      var crossrefid;
      var crossoptnum;
      if (this.cross) {
        uni.setStorageSync('crossCleanType', true);
        var statusColumnName = uni.getStorageSync('statusColumnName');
        var statusColumnValue = uni.getStorageSync('statusColumnValue');
        if (statusColumnName != '') {
          if (!obj) {
            obj = uni.getStorageSync('crossObj');
          }
          if (!statusColumnName.startsWith("[")) {
            for (var o in obj) {
              if (o == statusColumnName) {
                obj[o] = statusColumnValue;
              }

            }
            var table = uni.getStorageSync('crossTable');
            await this.$api.update(`${table}`, obj);
          } else {
            crossuserid = Number(uni.getStorageSync('appUserid'));
            crossrefid = obj['id'];
            crossoptnum = uni.getStorageSync('statusColumnName');
            crossoptnum = crossoptnum.replace(/\[/, "").replace(/\]/, "");
          }
        }
      }
      if (crossrefid && crossuserid) {
        this.ruleForm.crossuserid = crossuserid;
        this.ruleForm.crossrefid = crossrefid;
        let params = {
          page: 1,
          limit: 10,
          crossuserid: crossuserid,
          crossrefid: crossrefid,
        }
        let res = await this.$api.list(`xuesheng`, params);
        if (res.data.total >= crossoptnum) {
          this.$utils.msg(uni.getStorageSync('tips'));
          uni.removeStorageSync('crossCleanType');
          return false;
        } else {
          //跨表计算
          if (this.ruleForm.id) {
            await this.$api.update(`xuesheng`, this.ruleForm);
          } else {
            await this.$api.add(`xuesheng`, this.ruleForm);
          }
          this.$utils.msgBack('提交成功');
        }
      } else {
        //跨表计算
        if (this.ruleForm.id) {
          await this.$api.update(`xuesheng`, this.ruleForm);
        } else {
          await this.$api.add(`xuesheng`, this.ruleForm);
        }
        this.$utils.msgBack('提交成功');
      }
    },
    optionsChange(e) {
      this.index = e.target.value
    },
    bindDateChange(e) {
      this.date = e.target.value
    },
    getDate(type) {
      const date = new Date();
      let year = date.getFullYear();
      let month = date.getMonth() + 1;
      let day = date.getDate();
      if (type === 'start') {
        year = year - 60;
      } else if (type === 'end') {
        year = year + 2;
      }
      month = month > 9 ? month : '0' + month;
      ;
      day = day > 9 ? day : '0' + day;
      return `${year}-${month}-${day}`;
    },
    toggleTab(str) {
      if (this.ro[str]) {
        return false
      }
      this.$refs[str].show();
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
