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
              class="title">课程编号
          </view>
          <view
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","flex":"1","background":"rgba(255,255,255,.6)","lineHeight":"80rpx","fontSize":"28rpx"}'
              class="right-input">
            {{ ruleForm.kechengbianhao }}
          </view>
        </view>
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
            class=" select">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">课程类型
          </view>
          <picker :disabled="ro.kechengleixing"
                  :range="kechengleixingOptions"
                  :style='{"border":"2rpx solid #fff","width":"100%","padding":"0 24rpx","flex":"1","background":"rgba(255,255,255,.6)","height":"auto"}'
                  :value="kechengleixingIndex" @change="kechengleixingChange">
            <view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">
              {{ ruleForm.kechengleixing ? ruleForm.kechengleixing : "请选择课程类型" }}
            </view>
          </picker>
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
            class="" @tap="kechengshipinTap">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">课程视频
          </view>
          <input
              v-if="ruleForm.kechengshipin"
              v-model="baseUrl+ruleForm.kechengshipin"
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              placeholder="课程视频"></input>
          <image v-else
                 :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}'
                 class="avator" mode="aspectFill" src="../../static/gen/upload.png"></image>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class=" select">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">发布时间
          </view>
          <picker :disabled="ro.fabushijian"
                  :style='{"border":"2rpx solid #fff","width":"100%","padding":"0 24rpx","flex":"1","background":"rgba(255,255,255,.6)","height":"auto"}'
                  :value="ruleForm.fabushijian" mode="date" @change="fabushijianChange">
            <view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">
              {{ ruleForm.fabushijian ? ruleForm.fabushijian : "请选择发布时间" }}
            </view>
          </picker>
        </view>
        <view
            :style='{"padding":"0px 24rpx","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","alignItems":"center","borderWidth":"0 0 2rpx","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'
            class=" select">
          <view
              :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'
              class="title">教师工号
          </view>
          <picker :disabled="ro.jiaoshigonghao"
                  :range="jiaoshigonghaoOptions"
                  :style='{"border":"2rpx solid #fff","width":"100%","padding":"0 24rpx","flex":"1","background":"rgba(255,255,255,.6)","height":"auto"}'
                  :value="jiaoshigonghaoIndex" @change="jiaoshigonghaoChange">
            <view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">
              {{ jiaoshigonghaoOptions[jiaoshigonghaoIndex] }}
            </view>
          </picker>
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
              :style='{"border":"2rpx solid #fff","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255,255,255,.6)","fontSize":"28rpx","height":"80rpx"}'
              disabled placeholder="教师姓名"></input>
        </view>


        <view
            :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#7D7D7D","borderWidth":"0 0 2rpx 0","width":"100%","borderStyle":"solid","height":"auto"}'
            class="">
          <view
              :style='{"margin":"0 0 0 24rpx","color":"#999","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","minWidth":"160rpx","fontWeight":"500"}'
              class="title">课程详情
          </view>
          <xia-editor ref="editor"
                      v-model="ruleForm.kechengxiangqing"
                      :style='{"border":"2rpx solid #fff","minHeight":"360rpx","padding":"20rpx","color":"#666","borderRadius":"8rpx","background":"rgba(255,255,255,.6)","width":"100%","height":"auto"}'
                      placeholder="课程详情"
                      @editorChange="kechengxiangqingChange"></xia-editor>
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
        kechengbianhao: this.getUUID(),
        kechengmingcheng: '',
        kechengleixing: '',
        kechengfengmian: '',
        banji: '',
        kechengshipin: '',
        kechengxiangqing: '',
        fabushijian: '',
        jiaoshigonghao: '',
        jiaoshixingming: '',
        storeupnum: '',
      },
      kechengleixingOptions: [],
      kechengleixingIndex: 0,
      jiaoshigonghaoOptions: [],
      jiaoshigonghaoIndex: 0,
      // 登录用户信息
      user: {},
      ro: {
        kechengbianhao: false,
        kechengmingcheng: false,
        kechengleixing: false,
        kechengfengmian: false,
        banji: false,
        kechengshipin: false,
        kechengxiangqing: false,
        fabushijian: false,
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
    this.ruleForm.fabushijian = this.$utils.getCurDate();
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
    res = await this.$api.option(`kechengleixing`, `kechengleixing`, {});
    this.kechengleixingOptions = res.data;
    this.kechengleixingOptions.unshift("请选择课程类型");
    // 下2
    res = await this.$api.option(`jiaoshi`, `jiaoshigonghao`, {});
    this.jiaoshigonghaoOptions = res.data;

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
      res = await this.$api.info(`kechengxinxi`, this.ruleForm.id);
      this.ruleForm = res.data;
    }
    // 跨表
    this.cross = options.cross;
    if (options.cross) {
      var obj = uni.getStorageSync('crossObj');
      for (var o in obj) {
        if (o == 'kechengbianhao') {
          this.ruleForm.kechengbianhao = obj[o];
          this.ro.kechengbianhao = true;
          continue;
        }
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
        if (o == 'kechengshipin') {
          this.ruleForm.kechengshipin = obj[o];
          this.ro.kechengshipin = true;
          continue;
        }
        if (o == 'kechengxiangqing') {
          this.ruleForm.kechengxiangqing = obj[o];
          this.ro.kechengxiangqing = true;
          continue;
        }
        if (o == 'fabushijian') {
          this.ruleForm.fabushijian = obj[o];
          this.ro.fabushijian = true;
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
    kechengxiangqingChange(e) {
      this.ruleForm.kechengxiangqing = e
    },
    styleChange() {
      this.$nextTick(() => {
        // document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
        //   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
        // })
      })
    },
    // 下二随
    async jiaoshigonghaoChange(e) {
      this.jiaoshigonghaoIndex = e.target.value
      this.ruleForm.jiaoshigonghao = this.jiaoshigonghaoOptions[this.jiaoshigonghaoIndex]
      let res = await this.$api.follow(`jiaoshi`, `jiaoshigonghao`, {
        columnValue: this.ruleForm.jiaoshigonghao
      });
      if (res.data.jiaoshixingming) {
        this.ruleForm.jiaoshixingming = res.data.jiaoshixingming
      }
    },

    // 多级联动参数

    fabushijianChange(e) {
      this.ruleForm.fabushijian = e.target.value;
      this.$forceUpdate();
    },

    // 日长控件选择日期时间
    clicktimeConfirm(val) {
      console.log(val)
      this.ruleForm.clicktime = val.result;
      this.$forceUpdate();
    },

    // 下拉变化
    kechengleixingChange(e) {
      this.kechengleixingIndex = e.target.value
      this.ruleForm.kechengleixing = this.kechengleixingOptions[this.kechengleixingIndex]
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
    kechengshipinTap() {
      let _this = this;
      this.$api.upload(function (res) {
        _this.ruleForm.kechengshipin = 'upload/' + res.file;
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
      if (this.ruleForm.kechengbianhao) {
        this.ruleForm.kechengbianhao = String(this.ruleForm.kechengbianhao)
      }
//跨表计算判断
      var obj;
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
        let res = await this.$api.list(`kechengxinxi`, params);
        if (res.data.total >= crossoptnum) {
          this.$utils.msg(uni.getStorageSync('tips'));
          uni.removeStorageSync('crossCleanType');
          return false;
        } else {
          //跨表计算
          if (this.ruleForm.id) {
            await this.$api.update(`kechengxinxi`, this.ruleForm);
          } else {
            await this.$api.add(`kechengxinxi`, this.ruleForm);
          }
          this.$utils.msgBack('提交成功');
        }
      } else {
        //跨表计算
        if (this.ruleForm.id) {
          await this.$api.update(`kechengxinxi`, this.ruleForm);
        } else {
          await this.$api.add(`kechengxinxi`, this.ruleForm);
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
