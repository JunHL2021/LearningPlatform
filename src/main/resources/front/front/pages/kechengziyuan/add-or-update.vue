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
              class="title">资源名称
          </view>
          <input
              v-model="ruleForm.ziyuanmingcheng"
              :disabled="ro.ziyuanmingcheng"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="资源名称"
              type="text"></input>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class=" select">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">资源类型
          </view>
          <picker :disabled="ro.ziyuanleixing"
                  :range="ziyuanleixingOptions"
                  :style='{"border":"2rpx solid #fff","width":"100%","padding":"0 24rpx","flex":"1","background":"rgba(255,255,255,.6)","height":"auto"}'
                  :value="ziyuanleixingIndex" @change="ziyuanleixingChange">
            <view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">
              {{ruleForm.ziyuanleixing?ruleForm.ziyuanleixing:"请选择资源类型"}}
            </view>
          </picker>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="" @tap="ziyuantupianTap">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">资源图片
          </view>
          <image v-if="ruleForm.ziyuantupian"
                 :src="baseUrl+ruleForm.ziyuantupian.split(',')[0]"
                 :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}'
                 class="avator"
                 mode="aspectFill"></image>
          <image v-else
                 :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}'
                 class="avator" mode="aspectFill" src="../../static/gen/upload.png"></image>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class="" @tap="ziyuanwenjianTap">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">资源文件
          </view>
          <input
              v-if="ruleForm.ziyuanwenjian"
              v-model="baseUrl+ruleForm.ziyuanwenjian"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="资源文件"></input>
          <image v-else
                 :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}'
                 class="avator" mode="aspectFill" src="../../static/gen/upload.png"></image>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class=" select">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">发布日期
          </view>
          <picker :disabled="ro.faburiqi"
                  :style='{"border":"2rpx solid #fff","width":"100%","padding":"0 24rpx","flex":"1","background":"rgba(255,255,255,.6)","height":"auto"}'
                  :value="ruleForm.faburiqi" mode="date" @change="faburiqiChange">
            <view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">
              {{ruleForm.faburiqi?ruleForm.faburiqi:"请选择发布日期"}}
            </view>
          </picker>
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
            :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","borderWidth":"0 0 2rpx 0","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"margin":"0 0 0 24rpx","color":"#999","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="title">资源介绍
          </view>
          <xia-editor ref="editor"
                      v-model="ruleForm.ziyuanjieshao"
                      :style='{"border":"2rpx solid #fff","minHeight":"360rpx","padding":"20rpx","color":"#666","borderRadius":"8rpx","background":"rgba(255,255,255,.6)","width":"100%","height":"auto"}'
                      placeholder="资源介绍"
                      @editorChange="ziyuanjieshaoChange"></xia-editor>
        </view>

        <view :style='{"width":"100%","flexWrap":"wrap","justifyContent":"center","display":"flex","height":"auto"}'
              class="btn">
          <button
              :style='{"border":"0","padding":"0px","margin":"0 40rpx 40rpx 0","color":"#fff","borderRadius":"60rpx","background":"#F6BE1E","width":"40%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}'
              class="bg-red" @tap="onSubmitTap">提交
          </button>
        </view>
      </form>

      <w-picker ref="clicktime" :current="false" :hasSecond="false" mode="dateTime" step="1" themeColor="#333333"
                @confirm="clicktimeConfirm"></w-picker>
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
        ziyuanmingcheng: '',
        ziyuanleixing: '',
        ziyuantupian: '',
        ziyuanwenjian: '',
        ziyuanjieshao: '',
        faburiqi: '',
        jiaoshigonghao: '',
        jiaoshixingming: '',
        storeupnum: '',
      },
      ziyuanleixingOptions: [],
      ziyuanleixingIndex: 0,
      // 登录用户信息
      user: {},
      ro: {
        ziyuanmingcheng: false,
        ziyuanleixing: false,
        ziyuantupian: false,
        ziyuanwenjian: false,
        ziyuanjieshao: false,
        faburiqi: false,
        jiaoshigonghao: false,
        jiaoshixingming: false,
        clicktime: false,
        clicknum: false,
        storeupnum: false,
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
    this.ruleForm.faburiqi = this.$utils.getCurDate();
    let table = uni.getStorageSync("nowTable");
    // 获取用户信息
    let res = await this.$api.session(table);
    this.user = res.data;

    // ss读取
    this.ruleForm.jiaoshigonghao = this.user.jiaoshigonghao
    this.ro.jiaoshigonghao = true;
    this.ruleForm.jiaoshixingming = this.user.jiaoshixingming
    this.ro.jiaoshixingming = true;


    // 下拉框
    res = await this.$api.option(`ziyuanleixing`, `ziyuanleixing`, {});
    this.ziyuanleixingOptions = res.data;
    this.ziyuanleixingOptions.unshift("请选择资源类型");

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
      res = await this.$api.info(`kechengziyuan`, this.ruleForm.id);
      this.ruleForm = res.data;
    }
    // 跨表
    this.cross = options.cross;
    if (options.cross) {
      var obj = uni.getStorageSync('crossObj');
      for (var o in obj) {
        if (o == 'ziyuanmingcheng') {
          this.ruleForm.ziyuanmingcheng = obj[o];
          this.ro.ziyuanmingcheng = true;
          continue;
        }
        if (o == 'ziyuanleixing') {
          this.ruleForm.ziyuanleixing = obj[o];
          this.ro.ziyuanleixing = true;
          continue;
        }
        if (o == 'ziyuantupian') {
          this.ruleForm.ziyuantupian = obj[o].split(",")[0];
          this.ro.ziyuantupian = true;
          continue;
        }
        if (o == 'ziyuanwenjian') {
          this.ruleForm.ziyuanwenjian = obj[o];
          this.ro.ziyuanwenjian = true;
          continue;
        }
        if (o == 'ziyuanjieshao') {
          this.ruleForm.ziyuanjieshao = obj[o];
          this.ro.ziyuanjieshao = true;
          continue;
        }
        if (o == 'faburiqi') {
          this.ruleForm.faburiqi = obj[o];
          this.ro.faburiqi = true;
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
        if (o == 'clicktime') {
          this.ruleForm.clicktime = obj[o];
          this.ro.clicktime = true;
          continue;
        }
        if (o == 'clicknum') {
          this.ruleForm.clicknum = obj[o];
          this.ro.clicknum = true;
          continue;
        }
        if (o == 'storeupnum') {
          this.ruleForm.storeupnum = obj[o];
          this.ro.storeupnum = true;
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
    ziyuanjieshaoChange(e) {
      this.ruleForm.ziyuanjieshao = e
    },
    styleChange() {
      this.$nextTick(() => {
        // document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
        //   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
        // })
      })
    },

    // 多级联动参数

    faburiqiChange(e) {
      this.ruleForm.faburiqi = e.target.value;
      this.$forceUpdate();
    },

    // 日长控件选择日期时间
    clicktimeConfirm(val) {
      console.log(val)
      this.ruleForm.clicktime = val.result;
      this.$forceUpdate();
    },

    // 下拉变化
    ziyuanleixingChange(e) {
      this.ziyuanleixingIndex = e.target.value
      this.ruleForm.ziyuanleixing = this.ziyuanleixingOptions[this.ziyuanleixingIndex]
    },

    ziyuantupianTap() {
      let _this = this;
      this.$api.upload(function (res) {
        _this.ruleForm.ziyuantupian = 'upload/' + res.file;
        _this.$forceUpdate();
        _this.$nextTick(() => {
          _this.styleChange()
        })
      });
    },
    ziyuanwenjianTap() {
      let _this = this;
      this.$api.upload(function (res) {
        _this.ruleForm.ziyuanwenjian = 'upload/' + res.file;
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
      if ((!this.ruleForm.ziyuanmingcheng)) {
        this.$utils.msg(`资源名称不能为空`);
        return
      }
      if ((!this.ruleForm.jiaoshigonghao)) {
        this.$utils.msg(`教师工号不能为空`);
        return
      }
      if (this.ruleForm.clicknum && (!this.$validate.isIntNumer(this.ruleForm.clicknum))) {
        this.$utils.msg(`点击次数应输入整数`);
        return
      }
      if (this.ruleForm.storeupnum && (!this.$validate.isIntNumer(this.ruleForm.storeupnum))) {
        this.$utils.msg(`收藏数应输入整数`);
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
        let res = await this.$api.list(`kechengziyuan`, params);
        if (res.data.total >= crossoptnum) {
          this.$utils.msg(uni.getStorageSync('tips'));
          uni.removeStorageSync('crossCleanType');
          return false;
        } else {
          //跨表计算
          if (this.ruleForm.id) {
            await this.$api.update(`kechengziyuan`, this.ruleForm);
          } else {
            await this.$api.add(`kechengziyuan`, this.ruleForm);
          }
          this.$utils.msgBack('提交成功');
        }
      } else {
        //跨表计算
        if (this.ruleForm.id) {
          await this.$api.update(`kechengziyuan`, this.ruleForm);
        } else {
          await this.$api.add(`kechengziyuan`, this.ruleForm);
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
