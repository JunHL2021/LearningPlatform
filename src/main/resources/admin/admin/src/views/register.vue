<template>
  <div>
    <div
        :style='{"minHeight":"100vh","alignItems":"flex-start","background":"url(http://codegen.caihongy.cn/20230811/7f629293ab5f4bd4aff0bf329cdf87a8.jpg)","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'
        class="container">
      <el-form v-if="pageFlag=='register'"
               ref="rgsForm"
               :model="rgsForm" :rules="rules"
               :style='{"border":"0px solid #f6f6f6","minHeight":"1000px","padding":"8px 20px 90px","boxShadow":"0 0px 0px rgba(0, 0, 0, .2)","margin":"0 auto","borderRadius":"0px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230811/c518cf0ec8c5434facdea340da558cd1.png) no-repeat 64% 250px,url(http://codegen.caihongy.cn/20230811/35998be3b95844a68cab0b7410497ea1.png) no-repeat center top / 100% 100%","width":"40%","fontSize":"16px","position":"relative","height":"auto"}'
               class="rgs-form">
        <div v-if="true"
             :style='{"padding":"0px","margin":"200px auto 230px","borderColor":"#eee","color":"#333","background":"none","borderWidth":"0px","display":"inline-block","width":"100%","lineHeight":"40px","fontSize":"26px","borderStyle":"solid","fontWeight":"600"}'
             class="title">MR移动学习可视化平台注册
        </div>
        <el-form-item
            v-if="tableName=='xuesheng'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('xueshengzhanghao')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">学生账号：
          </div>
          <el-input v-model="ruleForm.xueshengzhanghao" autocomplete="off" placeholder="学生账号" type="text"/>
        </el-form-item>
        <el-form-item
            v-if="tableName=='xuesheng'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('xueshengxingming')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">学生姓名：
          </div>
          <el-input v-model="ruleForm.xueshengxingming" autocomplete="off" placeholder="学生姓名" type="text"/>
        </el-form-item>
        <el-form-item
            v-if="tableName=='xuesheng'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('mima')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">密码：
          </div>
          <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="password"/>
        </el-form-item>
        <el-form-item
            v-if="tableName=='xuesheng'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('mima')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">确认密码：
          </div>
          <el-input v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password"/>
        </el-form-item>
        <el-form-item
            v-if="tableName=='xuesheng'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('banji')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">班级：
          </div>
          <el-input v-model="ruleForm.banji" autocomplete="off" placeholder="班级" type="text"/>
        </el-form-item>
        <el-form-item
            v-if="tableName=='xuesheng'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('shoujihao')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">手机号：
          </div>
          <el-input v-model="ruleForm.shoujihao" autocomplete="off" placeholder="手机号" type="text"/>
        </el-form-item>
        <el-form-item
            v-if="tableName=='xuesheng'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('xingbie')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">性别：
          </div>
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in xueshengxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item
            v-if="tableName=='xuesheng'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('nianling')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">年龄：
          </div>
          <el-input v-model="ruleForm.nianling" autocomplete="off" placeholder="年龄" type="text"/>
        </el-form-item>
        <el-form-item
            v-if="tableName=='xuesheng'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('touxiang')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">头像：
          </div>
          <file-upload
              :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
              :limit="3"
              :multiple="true"
              action="file/upload"
              tip="点击上传头像"
              @change="xueshengtouxiangUploadChange"
          ></file-upload>
        </el-form-item>
        <el-form-item
            v-if="tableName=='jiaoshi'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('jiaoshigonghao')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">教师工号：
          </div>
          <el-input v-model="ruleForm.jiaoshigonghao" autocomplete="off" placeholder="教师工号" type="text"/>
        </el-form-item>
        <el-form-item
            v-if="tableName=='jiaoshi'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('jiaoshixingming')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">教师姓名：
          </div>
          <el-input v-model="ruleForm.jiaoshixingming" autocomplete="off" placeholder="教师姓名" type="text"/>
        </el-form-item>
        <el-form-item
            v-if="tableName=='jiaoshi'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('mima')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">密码：
          </div>
          <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="password"/>
        </el-form-item>
        <el-form-item
            v-if="tableName=='jiaoshi'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('mima')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">确认密码：
          </div>
          <el-input v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password"/>
        </el-form-item>
        <el-form-item
            v-if="tableName=='jiaoshi'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('shoujihao')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">手机号：
          </div>
          <el-input v-model="ruleForm.shoujihao" autocomplete="off" placeholder="手机号" type="text"/>
        </el-form-item>
        <el-form-item
            v-if="tableName=='jiaoshi'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('xingbie')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">性别：
          </div>
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in jiaoshixingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item
            v-if="tableName=='jiaoshi'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('nianling')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">年龄：
          </div>
          <el-input v-model="ruleForm.nianling" autocomplete="off" placeholder="年龄" type="text"/>
        </el-form-item>
        <el-form-item
            v-if="tableName=='jiaoshi'"
            :style='{"padding":"0 0px","margin":"0 auto 10px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}'
            class="list-item">
          <div v-if="true"
               :class="changeRules('touxiang')?'required':''"
               :style='{"padding":"0 8px 0 0","color":"#666","textAlign":"right","left":"-180px","width":"180px","lineHeight":"40px","fontSize":"16px","position":"absolute"}'
               class="lable">头像：
          </div>
          <file-upload
              :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
              :limit="3"
              :multiple="true"
              action="file/upload"
              tip="点击上传头像"
              @change="jiaoshitouxiangUploadChange"
          ></file-upload>
        </el-form-item>
        <button
            :style='{"border":"1px solid #fff","cursor":"pointer","padding":"0 0 0 30px","boxShadow":"0 0 0px rgba(64, 158, 255, .5)","margin":"30px auto 5px","color":"#fff","display":"block","letterSpacing":"10px","outline":"none","borderRadius":"10px","background":"linear-gradient(180deg, rgba(163,207,63,1) 0%, rgba(99,126,36,1) 100%)","width":"50%","fontSize":"20px","height":"44px"}'
            class="r-btn" type="button" @click="login()">注册
        </button>
        <div
            :style='{"cursor":"pointer","padding":"0","margin":"20px 0","color":"rgba(159, 159, 159, 1)","textAlign":"right","display":"inline-block","width":"50%","lineHeight":"1","fontSize":"14px"}'
            class="r-login" @click="close()">已有账号，直接登录
        </div>
      </el-form>

    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      ruleForm: {},
      forgetForm: {},
      pageFlag: '',
      tableName: "",
      rules: {},
      xueshengxingbieOptions: [],
      jiaoshixingbieOptions: [],
    };
  },
  mounted() {
    this.pageFlag = this.$route.query.pageFlag
    if (this.$route.query.pageFlag == 'register') {

      let table = this.$storage.get("loginTable");
      this.tableName = table;
      if (this.tableName == 'xuesheng') {
        this.ruleForm = {
          xueshengzhanghao: '',
          xueshengxingming: '',
          mima: '',
          banji: '',
          shoujihao: '',
          xingbie: '',
          nianling: '',
          touxiang: '',
        }
      }
      if (this.tableName == 'jiaoshi') {
        this.ruleForm = {
          jiaoshigonghao: '',
          jiaoshixingming: '',
          mima: '',
          shoujihao: '',
          xingbie: '',
          nianling: '',
          touxiang: '',
        }
      }
      if ('xuesheng' == this.tableName) {
        this.rules.xueshengzhanghao = [{required: true, message: '请输入学生账号', trigger: 'blur'}]
      }
      if ('xuesheng' == this.tableName) {
        this.rules.xueshengxingming = [{required: true, message: '请输入学生姓名', trigger: 'blur'}]
      }
      if ('xuesheng' == this.tableName) {
        this.rules.mima = [{required: true, message: '请输入密码', trigger: 'blur'}]
      }
      if ('jiaoshi' == this.tableName) {
        this.rules.jiaoshigonghao = [{required: true, message: '请输入教师工号', trigger: 'blur'}]
      }
      if ('jiaoshi' == this.tableName) {
        this.rules.jiaoshixingming = [{required: true, message: '请输入教师姓名', trigger: 'blur'}]
      }
      if ('jiaoshi' == this.tableName) {
        this.rules.mima = [{required: true, message: '请输入密码', trigger: 'blur'}]
      }
      this.xueshengxingbieOptions = "男,女".split(',')
      this.jiaoshixingbieOptions = "男,女".split(',')
    }
  },
  created() {
  },
  destroyed() {
  },
  methods: {
    changeRules(name) {
      if (this.rules[name]) {
        return true
      }
      return false
    },
    // 获取uuid
    getUUID() {
      return new Date().getTime();
    },
    close() {
      this.$router.push({path: "/login"});
    },
    xueshengtouxiangUploadChange(fileUrls) {
      this.ruleForm.touxiang = fileUrls;
    },
    jiaoshitouxiangUploadChange(fileUrls) {
      this.ruleForm.touxiang = fileUrls;
    },

    // 多级联动参数


    // 注册
    login() {
      var url = this.tableName + "/register";
      if ((!this.ruleForm.xueshengzhanghao) && `xuesheng` == this.tableName) {
        this.$message.error(`学生账号不能为空`);
        return
      }
      if ((!this.ruleForm.xueshengxingming) && `xuesheng` == this.tableName) {
        this.$message.error(`学生姓名不能为空`);
        return
      }
      if ((!this.ruleForm.mima) && `xuesheng` == this.tableName) {
        this.$message.error(`密码不能为空`);
        return
      }
      if ((this.ruleForm.mima != this.ruleForm.mima2) && `xuesheng` == this.tableName) {
        this.$message.error(`两次密码输入不一致`);
        return
      }
      if (this.ruleForm.touxiang != null) {
        this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url, "g"), "");
      }
      if ((!this.ruleForm.jiaoshigonghao) && `jiaoshi` == this.tableName) {
        this.$message.error(`教师工号不能为空`);
        return
      }
      if ((!this.ruleForm.jiaoshixingming) && `jiaoshi` == this.tableName) {
        this.$message.error(`教师姓名不能为空`);
        return
      }
      if ((!this.ruleForm.mima) && `jiaoshi` == this.tableName) {
        this.$message.error(`密码不能为空`);
        return
      }
      if ((this.ruleForm.mima != this.ruleForm.mima2) && `jiaoshi` == this.tableName) {
        this.$message.error(`两次密码输入不一致`);
        return
      }
      if (this.ruleForm.touxiang != null) {
        this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url, "g"), "");
      }
      this.$http({
        url: url,
        method: "post",
        data: this.ruleForm
      }).then(({data}) => {
        if (data && data.code === 0) {
          this.$message({
            message: "注册成功",
            type: "success",
            duration: 1500,
            onClose: () => {
              this.$router.replace({path: "/login"});
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>

<style lang="scss" scoped>
.container {
  position: relative;
  background: url(http://codegen.caihongy.cn/20230811/7f629293ab5f4bd4aff0bf329cdf87a8.jpg);

  .el-date-editor.el-input {
    width: 100%;
  }

  .rgs-form .el-input /deep/ .el-input__inner {
    border-radius: 0px;
    padding: 0 10px;
    box-shadow: 0 0px 0px rgba(60, 60, 60, .1);
    outline: none;
    color: #666;
    background: none;
    width: calc(100% - 0px);
    font-size: 16px;
    border-color: #ddd;
    border-width: 1px;
    border-style: solid;
    height: 44px;
  }

  .rgs-form .el-select /deep/ .el-input__inner {
    border-radius: 0px;
    padding: 0 10px;
    box-shadow: 0 0px 0px rgba(60, 60, 60, .1);
    outline: none;
    color: #666;
    background: none;
    width: 100%;
    font-size: 16px;
    border-color: #ddd;
    border-width: 1px;
    border-style: solid;
    height: 44px;
  }

  .rgs-form .el-date-editor /deep/ .el-input__inner {
    border-radius: 0px;
    padding: 0 10px 0 30px;
    box-shadow: 0 0px 0px rgba(60, 60, 60, .1);
    outline: none;
    color: #666;
    background: none;
    width: 288px;
    font-size: 16px;
    border-color: #ddd;
    border-width: 1px;
    border-style: solid;
    height: 44px;
  }

  .rgs-form .el-date-editor /deep/ .el-input__inner {
    border-radius: 0px;
    padding: 0 10px 0 30px;
    box-shadow: 0 0px 0px rgba(60, 60, 60, .1);
    outline: none;
    color: #666;
    background: none;
    width: 288px;
    font-size: 16px;
    border-color: #ddd;
    border-width: 1px;
    border-style: solid;
    height: 44px;
  }

  .rgs-form /deep/ .el-upload--picture-card {
    background: transparent;
    border: 0;
    border-radius: 0;
    width: auto;
    height: auto;
    line-height: initial;
    vertical-align: middle;
  }

  .rgs-form /deep/ .upload .upload-img {
    cursor: pointer;
    margin: 0 0 5px;
    color: #bbb;
    font-size: 32px;
    border-color: #ddd;
    line-height: 80px;
    border-radius: 0px;
    background: none;
    width: 120px;
    border-width: 1px;
    border-style: solid;
    text-align: center;
    height: 80px;
  }

  .rgs-form /deep/ .el-upload-list .el-upload-list__item {
    cursor: pointer;
    margin: 0 0 5px;
    color: #bbb;
    font-size: 32px;
    border-color: #ddd;
    line-height: 80px;
    border-radius: 0px;
    background: none;
    width: 120px;
    border-width: 1px;
    border-style: solid;
    text-align: center;
    height: 80px;
  }

  .rgs-form /deep/ .el-upload .el-icon-plus {
    cursor: pointer;
    margin: 0 0 5px;
    color: #bbb;
    font-size: 32px;
    border-color: #ddd;
    line-height: 80px;
    border-radius: 0px;
    background: none;
    width: 120px;
    border-width: 1px;
    border-style: solid;
    text-align: center;
    height: 80px;
  }
}

.required {
  position: relative;
}

.required::after {
  color: red;
  position: absolute;
  right: 5px;
  content: "*";
}

.editor > .avatar-uploader {
  line-height: 0;
  height: 0;
}
</style>
