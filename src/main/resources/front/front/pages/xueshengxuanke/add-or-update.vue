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
              class="title">课程名称
          </view>
          <input
              v-model="ruleForm.kechengmingcheng"
              :disabled="ro.kechengmingcheng"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="课程名称"
              type="text"></input>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">课程类型
          </view>
          <input
              v-model="ruleForm.kechengleixing"
              :disabled="ro.kechengleixing"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="课程类型"
              type="text"></input>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="" @tap="kechengfengmianTap">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">课程封面
          </view>
          <image v-if="ruleForm.kechengfengmian"
                 :src="baseUrl+ruleForm.kechengfengmian.split(',')[0]"
                 :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}'
                 class="avator"
                 mode="aspectFill"></image>
          <image v-else
                 :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}'
                 class="avator" mode="aspectFill" src="../../static/gen/upload.png"></image>
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
              class="title">选课时间
          </view>
          <input v-model="ruleForm.xuankeshijian"
                 :disabled="ro.xuankeshijian"
                 :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
                 placeholder="选课时间" @tap="toggleTab('xuankeshijian')"></input>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">教师工号
          </view>
          <input
              v-model="ruleForm.jiaoshigonghao"
              :disabled="ro.jiaoshigonghao"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="教师工号"
              type="text"></input>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">教师姓名
          </view>
          <input
              v-model="ruleForm.jiaoshixingming"
              :disabled="ro.jiaoshixingming"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="教师姓名"
              type="text"></input>
        </view>
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


        <view :style='{"width":"100%","flexWrap":"wrap","justifyContent":"center","display":"flex","height":"auto"}'
              class="btn">
          <button
              :style='{"border":"0","padding":"0px","margin":"0 40rpx 40rpx 0","color":"#fff","borderRadius":"60rpx","background":"#F6BE1E","width":"40%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}'
              class="bg-red" @tap="onSubmitTap">提交
          </button>
        </view>
      </form>

      <w-picker ref="xuankeshijian" :current="false" :hasSecond="false" mode="dateTime" step="1"
                themeColor="#333333" @confirm="xuankeshijianConfirm"></w-picker>
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
        kechengmingcheng: '',
        kechengleixing: '',
        kechengfengmian: '',
        banji: '',
        xuankeshijian: '',
        jiaoshigonghao: '',
        jiaoshixingming: '',
        xueshengzhanghao: '',
        xueshengxingming: '',
      },
      // 登录用户信息
      user: {},
      ro: {
        kechengmingcheng: false,
        kechengleixing: false,
        kechengfengmian: false,
        banji: false,
        xuankeshijian: false,
        jiaoshigonghao: false,
        jiaoshixingming: false,
        xueshengzhanghao: false,
        xueshengxingming: false,
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
    this.ruleForm.xuankeshijian = this.$utils.getCurDateTime();
    let table = uni.getStorageSync("nowTable");
    // 获取用户信息
    let res = await this.$api.session(table);
    this.user = res.data;

    // ss读取
    this.ruleForm.xueshengzhanghao = this.user.xueshengzhanghao
    this.ro.xueshengzhanghao = true;
    this.ruleForm.xueshengxingming = this.user.xueshengxingming
    this.ro.xueshengxingming = true;


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
      res = await this.$api.info(`xueshengxuanke`, this.ruleForm.id);
      this.ruleForm = res.data;
    }
    // 跨表
    this.cross = options.cross;
    if (options.cross) {
      var obj = uni.getStorageSync('crossObj');
      for (var o in obj) {
        if (o == 'kechengmingcheng') {
          this.ruleForm.kechengmingcheng = obj[o];
          this.ro.kechengmingcheng = true;
          continue;
        }
        if (o == 'kechengleixing') {
          this.ruleForm.kechengleixing = obj[o];
          this.ro.kechengleixing = true;
          continue;
        }
        if (o == 'kechengfengmian') {
          this.ruleForm.kechengfengmian = obj[o].split(",")[0];
          this.ro.kechengfengmian = true;
          continue;
        }
        if (o == 'banji') {
          this.ruleForm.banji = obj[o];
          this.ro.banji = true;
          continue;
        }
        if (o == 'xuankeshijian') {
          this.ruleForm.xuankeshijian = obj[o];
          this.ro.xuankeshijian = true;
          continue;
        }
        if (o == 'jiaoshigonghao') {
          this.ruleForm.jiaoshigonghao = obj[o];
          this.ro.jiaoshigonghao = true;
          continue;
        }
        if (o == 'jiaoshixingming') {
          this.ruleForm.jiaoshixingming = obj[o];
          this.ro.jiaoshixingming = true;
          continue;
        }
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


    // 日长控件选择日期时间
    xuankeshijianConfirm(val) {
      console.log(val)
      this.ruleForm.xuankeshijian = val.result;
      this.$forceUpdate();
    },


    kechengfengmianTap() {
      let _this = this;
      this.$api.upload(function (res) {
        _this.ruleForm.kechengfengmian = 'upload/' + res.file;
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
        let res = await this.$api.list(`xueshengxuanke`, params);
        if (res.data.total >= crossoptnum) {
          this.$utils.msg(uni.getStorageSync('tips'));
          uni.removeStorageSync('crossCleanType');
          return false;
        } else {
          //跨表计算
          if (this.ruleForm.id) {
            await this.$api.update(`xueshengxuanke`, this.ruleForm);
          } else {
            await this.$api.add(`xueshengxuanke`, this.ruleForm);
          }
          this.$utils.msgBack('提交成功');
        }
      } else {
        //跨表计算
        if (this.ruleForm.id) {
          await this.$api.update(`xueshengxuanke`, this.ruleForm);
        } else {
          await this.$api.add(`xueshengxuanke`, this.ruleForm);
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
