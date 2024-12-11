<template>
  <div
      :style='{"minHeight":"calc(100vh - 200px)","padding":"20px 0 30px","margin":"0 auto","color":"#666","background":"none","width":"calc(100% - 60px)","fontSize":"16px","height":"100%"}'
      class="addEdit-block">
    <el-form
        ref="ruleForm"
        :model="ruleForm"
        :rules="rules"
        :style='{"border":"1px solid #ceddee","padding":"30px 0","boxShadow":"inset 0px 0px 0px 0px #E8EFF7,0 0px 0px 0px rgba(100,100,100,.1)","borderColor":"#eee","alignItems":"flex-start","borderRadius":"8px","flexWrap":"wrap","background":"rgba(255,255,255,.6)","borderWidth":"1px","display":"flex","fontSize":"inherit","borderStyle":"double"}'
        class="add-update-preview"
        label-width="200px"
    >
      <template>
        <el-form-item
            v-if="type!='info'"
            :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
            class="input" label="资源名称" prop="ziyuanmingcheng">
          <el-input v-model="ruleForm.ziyuanmingcheng" :readonly="ro.ziyuanmingcheng" clearable
                    placeholder="资源名称"></el-input>
        </el-form-item>
        <el-form-item
            v-else
            :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
            class="input" label="资源名称" prop="ziyuanmingcheng">
          <el-input v-model="ruleForm.ziyuanmingcheng" placeholder="资源名称" readonly></el-input>
        </el-form-item>
        <el-form-item
            v-if="type!='info'"
            :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
            class="select" label="资源类型" prop="ziyuanleixing">
          <el-select v-model="ruleForm.ziyuanleixing" :disabled="ro.ziyuanleixing" placeholder="请选择资源类型">
            <el-option
                v-for="(item,index) in ziyuanleixingOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item
            v-else
            :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
            class="input" label="资源类型" prop="ziyuanleixing">
          <el-input v-model="ruleForm.ziyuanleixing"
                    placeholder="资源类型" readonly></el-input>
        </el-form-item>
        <el-form-item
            v-if="type!='info' && !ro.ziyuantupian"
            :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
            class="upload" label="资源图片" prop="ziyuantupian">
          <file-upload
              :fileUrls="ruleForm.ziyuantupian?ruleForm.ziyuantupian:''"
              :limit="3"
              :multiple="true"
              action="file/upload"
              tip="点击上传资源图片"
              @change="ziyuantupianUploadChange"
          ></file-upload>
        </el-form-item>
        <el-form-item
            v-else-if="ruleForm.ziyuantupian"
            :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
            class="upload" label="资源图片" prop="ziyuantupian">
          <img v-if="ruleForm.ziyuantupian.substring(0,4)=='http'" v-bind:key="index"
               :src="ruleForm.ziyuantupian.split(',')[0]"
               class="upload-img" height="100" style="margin-right:20px;" width="100">
          <img v-for="(item,index) in ruleForm.ziyuantupian.split(',')" v-else v-bind:key="index" :src="$base.url+item"
               class="upload-img" height="100" style="margin-right:20px;" width="100">
        </el-form-item>
        <el-form-item
            v-if="type!='info'&& !ro.ziyuanwenjian"
            :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
            class="upload" label="资源文件" prop="ziyuanwenjian">
          <file-upload
              :fileUrls="ruleForm.ziyuanwenjian?ruleForm.ziyuanwenjian:''"
              :limit="1"
              :multiple="true"
              :type="3"
              action="file/upload"
              tip="点击上传资源文件"
              @change="ziyuanwenjianUploadChange"
          ></file-upload>
        </el-form-item>
        <el-form-item
            v-else-if="ruleForm.ziyuanwenjian"
            :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
            label="资源文件" prop="ziyuanwenjian">
          <el-button
              :style='{"border":"0px solid #C7D5E0","cursor":"pointer","padding":"0 30px","margin":"0 20px 0 0","color":"#333","clipPath":"polygon(95% 0, 100% 51%, 95% 100%, 5% 100%, 0% 50%, 5% 0)","outline":"none","borderRadius":"4px","background":"#eee","width":"auto","lineHeight":"36px","fontSize":"16px","height":"40px"}'
              size="small" type="text" @click="download($base.url+ruleForm.ziyuanwenjian)">下载
          </el-button>
        </el-form-item>
        <el-form-item
            v-else-if="!ruleForm.ziyuanwenjian"
            :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
            label="资源文件" prop="ziyuanwenjian">
          <el-button
              :style='{"border":"0px solid #C7D5E0","cursor":"pointer","padding":"0 30px","margin":"0 20px 0 0","color":"#333","clipPath":"polygon(95% 0, 100% 51%, 95% 100%, 5% 100%, 0% 50%, 5% 0)","outline":"none","borderRadius":"4px","background":"#eee","width":"auto","lineHeight":"36px","fontSize":"16px","height":"40px"}'
              size="small" type="text">无
          </el-button>
        </el-form-item>
        <el-form-item
            v-if="type!='info'"
            :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
            class="date" label="发布日期" prop="faburiqi">
          <el-date-picker
              v-model="ruleForm.faburiqi"
              :readonly="ro.faburiqi"
              format="yyyy 年 MM 月 dd 日"
              placeholder="发布日期"
              type="date"
              value-format="yyyy-MM-dd"
          ></el-date-picker>
        </el-form-item>
        <el-form-item
            v-else-if="ruleForm.faburiqi"
            :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
            class="input" label="发布日期" prop="faburiqi">
          <el-input v-model="ruleForm.faburiqi" placeholder="发布日期" readonly></el-input>
        </el-form-item>
        <el-form-item
            v-if="type!='info'"
            :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
            class="input" label="教师工号" prop="jiaoshigonghao">
          <el-input v-model="ruleForm.jiaoshigonghao" :readonly="ro.jiaoshigonghao" clearable
                    placeholder="教师工号"></el-input>
        </el-form-item>
        <el-form-item
            v-else
            :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
            class="input" label="教师工号" prop="jiaoshigonghao">
          <el-input v-model="ruleForm.jiaoshigonghao" placeholder="教师工号" readonly></el-input>
        </el-form-item>
        <el-form-item
            v-if="type!='info'"
            :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
            class="input" label="教师姓名" prop="jiaoshixingming">
          <el-input v-model="ruleForm.jiaoshixingming" :readonly="ro.jiaoshixingming" clearable
                    placeholder="教师姓名"></el-input>
        </el-form-item>
        <el-form-item
            v-else
            :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
            class="input" label="教师姓名" prop="jiaoshixingming">
          <el-input v-model="ruleForm.jiaoshixingming" placeholder="教师姓名" readonly></el-input>
        </el-form-item>
      </template>
      <el-form-item
          v-if="type!='info'"
          :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
          label="资源介绍" prop="ziyuanjieshao">
        <editor
            v-model="ruleForm.ziyuanjieshao"
            action="file/upload"
            class="editor"
            style="min-width: 200px; max-width: 600px;">
        </editor>
      </el-form-item>
      <el-form-item
          v-else-if="ruleForm.ziyuanjieshao"
          :style='{"padding":"2px 0","margin":"0 auto 24px","color":"inherit","borderRadius":"4px","background":"none","width":"100%","fontSize":"inherit"}'
          label="资源介绍" prop="ziyuanjieshao">
        <span
            :style='{"fontSize":"16px","lineHeight":"40px","color":"inherit","fontWeight":"500","display":"inline-block"}'
            v-html="ruleForm.ziyuanjieshao"></span>
      </el-form-item>
      <el-form-item
          :style='{"padding":"0","margin":"30px auto","alignItems":"center","textAlign":"center","background":"none","display":"flex","width":"60%","fontSize":"18px"}'
          class="btn">
        <el-button v-if="type!='info'" class="btn3" type="success" @click="onSubmit">
          <span :style='{"color":"inherit","margin":"0 2px","fontSize":"inherit"}'
                class="icon iconfont icon-tijiao16"></span>
          确定
        </el-button>
        <el-button v-if="type!='info'" class="btn4" type="success" @click="back()">
          <span :style='{"color":"inherit","margin":"0 2px","fontSize":"inherit"}'
                class="icon iconfont icon-quxiao09"></span>
          撤消
        </el-button>
        <el-button v-if="type=='info'" class="btn5" type="success" @click="back()">
          <span :style='{"color":"inherit","margin":"0 2px","fontSize":"inherit"}'
                class="icon iconfont icon-fanhui01"></span>
          返回
        </el-button>
      </el-form-item>
    </el-form>


  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import {checkIdCard, isEmail, isIntNumer, isMobile, isNumber, isPhone, isURL} from "@/utils/validate";

export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
      id: '',
      type: '',


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


      ruleForm: {
        ziyuanmingcheng: '',
        ziyuanleixing: '',
        ziyuantupian: '',
        ziyuanwenjian: '',
        ziyuanjieshao: '',
        faburiqi: '',
        jiaoshigonghao: '',
        jiaoshixingming: '',
        clicktime: '',
      },

      ziyuanleixingOptions: [],


      rules: {
        ziyuanmingcheng: [
          {required: true, message: '资源名称不能为空', trigger: 'blur'},
        ],
        ziyuanleixing: [],
        ziyuantupian: [],
        ziyuanwenjian: [],
        ziyuanjieshao: [],
        faburiqi: [],
        jiaoshigonghao: [
          {required: true, message: '教师工号不能为空', trigger: 'blur'},
        ],
        jiaoshixingming: [],
        clicktime: [],
        clicknum: [
          {validator: validateIntNumber, trigger: 'blur'},
        ],
        storeupnum: [
          {validator: validateIntNumber, trigger: 'blur'},
        ],
      }
    };
  },
  props: ["parent"],
  computed: {},
  components: {},
  created() {
    this.ruleForm.faburiqi = this.getCurDate()
  },
  methods: {

    // 下载
    download(file) {
      window.open(`${file}`)
    },
    // 初始化
    init(id, type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if (this.type == 'info' || this.type == 'else') {
        this.info(id);
      } else if (this.type == 'logistics') {
        this.logistics = false;
        this.info(id);
      } else if (this.type == 'cross') {
        var obj = this.$storage.getObj('crossObj');
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
            this.ruleForm.ziyuantupian = obj[o];
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

      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({data}) => {
        if (data && data.code === 0) {

          var json = data.data;
          if (((json.jiaoshigonghao != '' && json.jiaoshigonghao) || json.jiaoshigonghao == 0) && this.$storage.get("role") != "管理员") {
            this.ruleForm.jiaoshigonghao = json.jiaoshigonghao
            this.ro.jiaoshigonghao = true;
          }
          if (((json.jiaoshixingming != '' && json.jiaoshixingming) || json.jiaoshixingming == 0) && this.$storage.get("role") != "管理员") {
            this.ruleForm.jiaoshixingming = json.jiaoshixingming
            this.ro.jiaoshixingming = true;
          }
        } else {
          this.$message.error(data.msg);
        }
      });

      this.$http({
        url: `option/ziyuanleixing/ziyuanleixing`,
        method: "get"
      }).then(({data}) => {
        if (data && data.code === 0) {
          this.ziyuanleixingOptions = data.data;
        } else {
          this.$message.error(data.msg);
        }
      });

    },
    // 多级联动参数

    info(id) {
      this.$http({
        url: `kechengziyuan/info/${id}`,
        method: "get"
      }).then(({data}) => {
        if (data && data.code === 0) {
          this.ruleForm = data.data;
          //解决前台上传图片后台不显示的问题
          let reg = new RegExp('../../../upload', 'g')//g代表全部
          this.ruleForm.ziyuanjieshao = this.ruleForm.ziyuanjieshao.replace(reg, '../../../LearningPlatform/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {
      if (this.ruleForm.ziyuantupian != null) {
        this.ruleForm.ziyuantupian = this.ruleForm.ziyuantupian.replace(new RegExp(this.$base.url, "g"), "");
      }
      if (this.ruleForm.ziyuanwenjian != null) {
        this.ruleForm.ziyuanwenjian = this.ruleForm.ziyuanwenjian.replace(new RegExp(this.$base.url, "g"), "");
      }
      var objcross = this.$storage.getObj('crossObj');
      //更新跨表属性
      var crossuserid;
      var crossrefid;
      var crossoptnum;
      if (this.type == 'cross') {
        var statusColumnName = this.$storage.get('statusColumnName');
        var statusColumnValue = this.$storage.get('statusColumnValue');
        if (statusColumnName != '') {
          var obj = this.$storage.getObj('crossObj');
          if (statusColumnName && !statusColumnName.startsWith("[")) {
            for (var o in obj) {
              if (o == statusColumnName) {
                obj[o] = statusColumnValue;
              }
            }
            var table = this.$storage.get('crossTable');
            this.$http({
              url: `${table}/update`,
              method: "post",
              data: obj
            }).then(({data}) => {
            });
          } else {
            crossuserid = this.$storage.get('userid');
            crossrefid = obj['id'];
            crossoptnum = this.$storage.get('statusColumnName');
            crossoptnum = crossoptnum.replace(/\[/, "").replace(/\]/, "");
          }
        }
      }
      this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          if (crossrefid && crossuserid) {
            this.ruleForm.crossuserid = crossuserid;
            this.ruleForm.crossrefid = crossrefid;
            let params = {
              page: 1,
              limit: 10,
              crossuserid: this.ruleForm.crossuserid,
              crossrefid: this.ruleForm.crossrefid,
            }
            this.$http({
              url: "kechengziyuan/page",
              method: "get",
              params: params
            }).then(({
                       data
                     }) => {
              if (data && data.code === 0) {
                if (data.data.total >= crossoptnum) {
                  this.$message.error(this.$storage.get('tips'));
                  return false;
                } else {
                  this.$http({
                    url: `kechengziyuan/${!this.ruleForm.id ? "save" : "update"}`,
                    method: "post",
                    data: this.ruleForm
                  }).then(({data}) => {
                    if (data && data.code === 0) {
                      this.$message({
                        message: "操作成功",
                        type: "success",
                        duration: 1500,
                        onClose: () => {
                          this.parent.showFlag = true;
                          this.parent.addOrUpdateFlag = false;
                          this.parent.kechengziyuanCrossAddOrUpdateFlag = false;
                          this.parent.search();
                          this.parent.contentStyleChange();
                        }
                      });
                    } else {
                      this.$message.error(data.msg);
                    }
                  });

                }
              } else {
              }
            });
          } else {
            this.$http({
              url: `kechengziyuan/${!this.ruleForm.id ? "save" : "update"}`,
              method: "post",
              data: this.ruleForm
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.$message({
                  message: "操作成功",
                  type: "success",
                  duration: 1500,
                  onClose: () => {
                    this.parent.showFlag = true;
                    this.parent.addOrUpdateFlag = false;
                    this.parent.kechengziyuanCrossAddOrUpdateFlag = false;
                    this.parent.search();
                    this.parent.contentStyleChange();
                  }
                });
              } else {
                this.$message.error(data.msg);
              }
            });
          }
        }
      });
    },
    // 获取uuid
    getUUID() {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.kechengziyuanCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    ziyuantupianUploadChange(fileUrls) {
      this.ruleForm.ziyuantupian = fileUrls;
    },
    ziyuanwenjianUploadChange(fileUrls) {
      this.ruleForm.ziyuanwenjian = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
.amap-wrapper {
  width: 100%;
  height: 500px;
}

.search-box {
  position: absolute;
}

.el-date-editor.el-input {
  width: auto;
}

.add-update-preview .el-form-item /deep/ .el-form-item__label {
  padding: 0 10px 0 0;
  color: inherit;
  background: none;
  font-weight: 600;
  display: inline-block;
  width: 200px;
  font-size: inherit;
  line-height: 40px;
  text-align: right;
}

.add-update-preview .el-form-item /deep/ .el-form-item__content {
  margin-left: 200px;
}

.add-update-preview .el-input /deep/ .el-input__inner {
  padding: 0 30px;
  color: inherit;
  font-size: 16px;
  border-color: #b4b4b4;
  border-radius: 4px;
  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
  outline: none;
  clip-path: polygon(98% 0, 100% 51%, 98% 100%, 2% 100%, 0% 50%, 2% 0);
  background: #eee;
  width: 400px;
  border-width: 0px;
  border-style: solid;
  height: 36px;
}

.add-update-preview .el-input-number /deep/ .el-input__inner {
  text-align: left;
  padding: 0 30px;
  color: inherit;
  font-size: 16px;
  border-color: #b4b4b4;
  border-radius: 4px;
  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
  outline: none;
  clip-path: polygon(98% 0, 100% 51%, 98% 100%, 2% 100%, 0% 50%, 2% 0);
  background: #eee;
  width: 400px;
  border-width: 0px;
  border-style: solid;
  height: 36px;
}

.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
  display: none;
}

.add-update-preview .el-input-number /deep/ .el-input-number__increase {
  display: none;
}

.add-update-preview .el-select /deep/ .el-input__inner {
  padding: 0 30px;
  color: inherit;
  font-size: 16px;
  border-color: #C7D5E0;
  border-radius: 4px;
  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
  outline: none;
  clip-path: polygon(98% 0, 100% 51%, 98% 100%, 2% 100%, 0% 50%, 2% 0);
  background: #eee;
  width: auto;
  border-width: 0px;
  border-style: solid;
  min-width: 350px;
  height: 36px;
}

.add-update-preview .el-date-editor /deep/ .el-input__inner {
  padding: 0 30px;
  color: inherit;
  font-size: 16px;
  border-color: #C7D5E0;
  border-radius: 4px;
  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
  outline: none;
  clip-path: polygon(98% 0, 100% 51%, 98% 100%, 2% 100%, 0% 50%, 2% 0);
  background: #eee;
  width: auto;
  border-width: 0 0 0px;
  border-style: solid;
  min-width: 250px;
  height: 36px;
}

.add-update-preview /deep/ .el-upload--picture-card {
  background: transparent;
  border: 0;
  border-radius: 0;
  width: auto;
  height: auto;
  line-height: initial;
  vertical-align: middle;
}

.add-update-preview /deep/ .upload .upload-img {
  border: 0px solid #C7D5E0;
  cursor: pointer;
  border-radius: 4px;
  clip-path: polygon(90% 0, 100% 51%, 90% 100%, 10% 100%, 0% 50%, 10% 0);
  color: #aaa;
  background: #eee;
  object-fit: cover;
  width: 180px;
  font-size: 32px;
  line-height: 100px;
  text-align: center;
  height: 100px;
}

.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
  border: 0px solid #C7D5E0;
  cursor: pointer;
  border-radius: 4px;
  clip-path: polygon(90% 0, 100% 51%, 90% 100%, 10% 100%, 0% 50%, 10% 0);
  color: #aaa;
  background: #eee;
  object-fit: cover;
  width: 180px;
  font-size: 32px;
  line-height: 100px;
  text-align: center;
  height: 100px;
}

.add-update-preview /deep/ .el-upload .el-icon-plus {
  border: 0px solid #C7D5E0;
  cursor: pointer;
  border-radius: 4px;
  clip-path: polygon(90% 0, 100% 51%, 90% 100%, 10% 100%, 0% 50%, 10% 0);
  color: #aaa;
  background: #eee;
  object-fit: cover;
  width: 180px;
  font-size: 32px;
  line-height: 100px;
  text-align: center;
  height: 100px;
}

.add-update-preview .el-textarea /deep/ .el-textarea__inner {
  border: 0px solid #C7D5E0;
  border-radius: 4px;
  padding: 10px 36px;
  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
  outline: none;
  clip-path: polygon(95% 0, 100% 51%, 95% 100%, 5% 100%, 0% 50%, 5% 0);
  color: inherit;
  background: #eee;
  width: 500px;
  font-size: 16px;
  height: 140px;
}

.add-update-preview .btn .btn1 {
  border: 0px solid #3fcbca;
  cursor: pointer;
  padding: 0 10px;
  margin: 0px 4px;
  color: #fff;
  display: inline-block;
  font-size: 18px;
  line-height: 24px;
  border-radius: 10px;
  outline: none;
  clip-path: polygon(5% 0, 100% 0%, 95% 100%, 0% 100%);
  background: #5680ac;
  width: auto;
  height: 40px;
}

.add-update-preview .btn .btn1:hover {
  opacity: 0.8;
}

.add-update-preview .btn .btn2 {
  border: 0px solid #23b7e5;
  cursor: pointer;
  padding: 0 10px;
  margin: 0px 4px;
  color: #fff;
  font-size: 18px;
  line-height: 24px;
  border-radius: 10px;
  outline: none;
  clip-path: polygon(5% 0, 100% 0%, 95% 100%, 0% 100%);
  background: #56ac92;
  width: auto;
  height: 40px;
}

.add-update-preview .btn .btn2:hover {
  opacity: 0.8;
}

.add-update-preview .btn .btn3 {
  border: 0px solid #3fcbca;
  cursor: pointer;
  padding: 0 20px;
  margin: 0px 4px;
  color: #fff;
  font-size: 18px;
  line-height: 24px;
  border-radius: 10px;
  outline: none;
  clip-path: polygon(5% 0, 100% 0%, 95% 100%, 0% 100%);
  background: #64ac56;
  width: auto;
  height: 40px;
}

.add-update-preview .btn .btn3:hover {
  opacity: 0.8;
}

.add-update-preview .btn .btn4 {
  border: 0px solid #FF6B6B;
  cursor: pointer;
  padding: 0 20px;
  margin: 0px 4px;
  color: #fff;
  font-size: 18px;
  line-height: 24px;
  border-radius: 10px;
  outline: none;
  clip-path: polygon(5% 0, 100% 0%, 95% 100%, 0% 100%);
  background: #be696d;
  width: auto;
  height: 40px;
}

.add-update-preview .btn .btn4:hover {
  opacity: 0.8;
}

.add-update-preview .btn .btn5 {
  border: 0px solid #65C3DF;
  cursor: pointer;
  padding: 0 20px;
  margin: 4px;
  color: #fff;
  font-size: 18px;
  line-height: 24px;
  border-radius: 10px;
  outline: none;
  clip-path: polygon(5% 0, 100% 0%, 95% 100%, 0% 100%);
  background: #aaa;
  width: auto;
  height: 40px;
}

.add-update-preview .btn .btn5:hover {
  opacity: 0.8;
}
</style>
