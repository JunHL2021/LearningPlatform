<template>
  <view class="content">
    <view
        :style='{"minHeight":"100vh","width":"100%","padding":"0","position":"relative","background":"url(http://codegen.caihongy.cn/20240225/57d43270748a46f0818a72e5d5b4f350.png) no-repeat center top / 100% auto,#F1F1F1","height":"auto"}'>
      <view v-if="user&&user.id"
            :style='{"minHeight":"400rpx","padding":"40rpx 0 0","margin":"0 auto 40rpx","borderRadius":"16rpx","alignItems":"flex-start","background":"url() no-repeat center top / 100% 100%","display":"flex","width":"calc(100% - 48rpx)","position":"relative","height":"auto"}'
            class="header" v-bind:class="{'status':isH5Plus}" @tap="onPageTap('../user-info/user-info')">
        <view
            v-if="tableName=='xuesheng'"
            :style='{"alignContent":"center","padding":"0px 0 0","margin":"0","alignItems":"center","flexWrap":"wrap","textAlign":"center","flex":"1","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}'
            class="userinfo">
          <image
              :src="user.touxiang?baseUrl+user.touxiang:'/static/gen/upload.png'"
              :style='{"width":"100rpx","padding":"0","margin":"0 20rpx 40rpx 0","borderRadius":"100%","height":"100rpx"}'></image>
          <view :style='{"width":"240rpx","margin":"0 0 40rpx","flex":"1","flexDirection":"column","display":"flex"}'
                class="info">
            <view :style='{"width":"100%","lineHeight":"36rpx","fontSize":"28rpx","color":"#333","textAlign":"left"}'>
              {{ user.xueshengzhanghao }}
              <text v-if="user.vip&& user.vip=='是'">(VIP)</text>
            </view>
          </view>

          <view
              :style='{"padding":"0 32rpx 20rpx","margin":"0","borderColor":"#fff","borderRadius":"0 0 16rpx 16rpx","flexWrap":"wrap","flexDirection":"row","background":"rgba(255,255,255,.5)","borderWidth":"0 2rpx 2rpx","display":"flex","width":"100%","borderStyle":"solid","order":"2"}'
              class="info">
          </view>
        </view>
        <view
            v-if="tableName=='jiaoshi'"
            :style='{"alignContent":"center","padding":"0px 0 0","margin":"0","alignItems":"center","flexWrap":"wrap","textAlign":"center","flex":"1","background":"none","display":"flex","width":"100%","position":"relative","height":"auto"}'
            class="userinfo">
          <image
              :src="user.touxiang?baseUrl+user.touxiang:'/static/gen/upload.png'"
              :style='{"width":"100rpx","padding":"0","margin":"0 20rpx 40rpx 0","borderRadius":"100%","height":"100rpx"}'></image>
          <view :style='{"width":"240rpx","margin":"0 0 40rpx","flex":"1","flexDirection":"column","display":"flex"}'
                class="info">
            <view :style='{"width":"100%","lineHeight":"36rpx","fontSize":"28rpx","color":"#333","textAlign":"left"}'>
              {{ user.jiaoshigonghao }}
              <text v-if="user.vip&& user.vip=='是'">(VIP)</text>
            </view>
          </view>

          <view
              :style='{"padding":"0 32rpx 20rpx","margin":"0","borderColor":"#fff","borderRadius":"0 0 16rpx 16rpx","flexWrap":"wrap","flexDirection":"row","background":"rgba(255,255,255,.5)","borderWidth":"0 2rpx 2rpx","display":"flex","width":"100%","borderStyle":"solid","order":"2"}'
              class="info">
          </view>
        </view>
        <view
            :style='{"padding":"8rpx 20rpx","alignItems":"center","borderRadius":"16rpx","background":"none","flexDirection":"column","display":"flex","width":"auto","position":"absolute","right":"0px","justifyContent":"center","height":"auto"}'
            class="setting">
          <text
              :style='{"border":"0","margin":"0 6rpx 0 0","color":"#333","borderRadius":"0","display":"inline-block","width":"48rpx","lineHeight":"48rpx","fontSize":"56rpx"}'
              class="icon iconfont icon-qita6"></text>
          <text :style='{"lineHeight":"2","fontSize":"28rpx","color":"#333","display":"inline-block"}'>设置</text>
        </view>
      </view>

      <view v-else
            :style='{"minHeight":"400rpx","padding":"40rpx 0 0","margin":"0 auto 40rpx","borderRadius":"16rpx","alignItems":"flex-start","background":"url() no-repeat center top / 100% 100%","display":"flex","width":"calc(100% - 48rpx)","position":"relative","height":"auto"}'
            class="header" v-bind:class="{'status':isH5Plus}" @tap="loginClick">
        <view
            :style='{"padding":"60rpx 0 0","alignItems":"center","color":"#333","display":"flex","width":"100%","fontSize":"36rpx","justifyContent":"center","height":"100%"}'>
          登录/注册
        </view>
      </view>

      <view :style='{"width":"calc(100% - 48rpx)","margin":"0 auto","background":"none","height":"auto"}' class="list">

        <view
            :style='{"width":"100%","padding":"20rpx","margin":"0","borderRadius":"16rpx","background":"#fff","height":"auto"}'>
          <view
              :style='{"padding":"0 0px","margin":"0 0 20rpx","background":"none","display":"block","width":"100%","justifyContent":"space-between","height":"auto"}'>
            <view :style='{"fontSize":"32rpx","lineHeight":"72rpx","color":"#222","fontWeight":"600"}'>我的服务</view>
          </view>
          <view
              :style='{"padding":"0","flexWrap":"wrap","flexDirection":"row","display":"flex","width":"100%","justifyContent":"flex-start","height":"auto"}'>

            <block v-for="item in menuList" v-bind:key="item.roleName">
              <block v-for="(menu,index) in item.backMenu" v-if="role==item.roleName" v-bind:key="menu.menu">
                <block v-for=" (child,sort) in menu.child" v-bind:key="child.tableName">
                  <view
                      v-if="child.tableName!='orders/已发货' && child.tableName!='orders/已退款' &&child.tableName!='orders/已取消' && child.tableName!='orders/未支付' && child.tableName!='orders/已支付' && child.tableName!='orders/已完成' && child.tableName!='exampaper' && child.tableName!='examquestion' "
                      :style='{"padding":"10rpx 0 20rpx","borderColor":"#eee","margin":"0 20rpx 20rpx 0","borderRadius":"0","alignItems":"center","flexWrap":"wrap","borderWidth":"0 0 0px","background":"#fff","display":"flex","width":"calc(100% - 0px)","borderStyle":"solid","height":"100%"}'
                      class="li"
                      hover-class="hover"
                      @tap="onPageTap('../'+child.tableName+'/list?userid='+user.id+'&menuJump='+child.menuJump)">
                    <view
                        :class="child.appFrontIcon"
                        :style='{"width":"auto","lineHeight":"1","fontSize":"44rpx","color":"#333","textAlign":"center","display":"inline-block"}'></view>
                    <view
                        :style='{"padding":"0 20rpx","margin":"0px 0 0","color":"#555","textAlign":"left","flex":"1","display":"inline-block","width":"auto","fontSize":"32rpx"}'
                        class="text">{{ child.menu }}
                    </view>
                    <view
                        :style='{"width":"28rpx","lineHeight":"28rpx","fontSize":"32rpx","color":"#bbb","display":"block"}'
                        class="icon iconfont icon-jinru"></view>
                  </view>
                </block>
              </block>
            </block>

            <view v-if="changeHasChat()"
                  :style='{"padding":"10rpx 0 20rpx","borderColor":"#eee","margin":"0 20rpx 20rpx 0","borderRadius":"0","alignItems":"center","flexWrap":"wrap","borderWidth":"0 0 0px","background":"#fff","display":"flex","width":"calc(100% - 0px)","borderStyle":"solid","height":"100%"}'
                  class="li"
                  hover-class="hover" @tap="getRecordList(1)">
              <view
                  :style='{"width":"auto","lineHeight":"1","fontSize":"44rpx","color":"#333","textAlign":"center","display":"inline-block"}'
                  class="cuIcon-news"></view>
              <view
                  :style='{"padding":"0 20rpx","margin":"0px 0 0","color":"#555","textAlign":"left","flex":"1","display":"inline-block","width":"auto","fontSize":"32rpx"}'
                  class="text">
                聊天记录
              </view>
              <view :style='{"width":"28rpx","lineHeight":"28rpx","fontSize":"32rpx","color":"#bbb","display":"block"}'
                    class="icon iconfont icon-jinru"></view>
            </view>
            <view v-if="user&&user.id"
                  :style='{"padding":"10rpx 0 20rpx","borderColor":"#eee","margin":"0 20rpx 20rpx 0","borderRadius":"0","alignItems":"center","flexWrap":"wrap","borderWidth":"0 0 0px","background":"#fff","display":"flex","width":"calc(100% - 0px)","borderStyle":"solid","height":"100%"}'
                  class="li"
                  hover-class="hover" @tap="passwordShow()">
              <view
                  :style='{"width":"auto","lineHeight":"1","fontSize":"44rpx","color":"#333","textAlign":"center","display":"inline-block"}'
                  class="cuIcon-lock"></view>
              <view
                  :style='{"padding":"0 20rpx","margin":"0px 0 0","color":"#555","textAlign":"left","flex":"1","display":"inline-block","width":"auto","fontSize":"32rpx"}'
                  class="text">
                修改密码
              </view>
              <view :style='{"width":"28rpx","lineHeight":"28rpx","fontSize":"32rpx","color":"#bbb","display":"block"}'
                    class="icon iconfont icon-jinru"></view>
            </view>
          </view>
        </view>
      </view>

      <!-- 推荐 -->
      <view v-if="recommendList.length"
            :style='{"width":"100%","padding":"60rpx 0 0","margin":"40rpx 0 0","background":"url(http://codegen.caihongy.cn/20240223/eece8113785146e0a55f0092d5c98ca1.png) no-repeat center top / 100% auto,#FFF7DF","height":"auto"}'
            class="recommend">
        <view
            :style='{"padding":"0 24rpx","color":"#fff","textAlign":"center","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"40rpx","fontWeight":"600","height":"auto"}'>
          推荐活动
        </view>
        <view
            :style='{"padding":"0","margin":"40rpx auto 0","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 48rpx)","justifyContent":"space-between","height":"auto"}'>
          <view v-for="(item,index) in recommendList" :key="index"
                :style='{"border":"2rpx solid #000","padding":"10rpx","margin":"0 0 40rpx","borderRadius":"16rpx","background":"#FCF2B3","width":"48%","height":"auto"}'
                @click="recommendDetail(item.id)">
            <image
                :src="item[recommendPicture]?(baseUrl + item[recommendPicture].split(',')[0]):''"
                :style='{"width":"45%","objectFit":"cover","borderRadius":"8rpx","float":"left","display":"block","height":"160rpx"}'></image>
            <view
                :style='{"padding":"0 10rpx","margin":"0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","width":"55%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","float":"right"}'>
              {{ item[recommendTitle] }}
            </view>
            <view
                :style='{"border":"2rpx solid #000","padding":"0 0px","color":"#fff","borderRadius":"8rpx","textAlign":"center","background":"#0C77D5","width":"calc(55% - 10rpx)","lineHeight":"48rpx","fontSize":"26rpx","float":"right"}'>
              {{ item.addtime }}
            </view>
          </view>
        </view>
      </view>
      <view style="width: 100%;height: 80px"></view>
    </view>
    <uni-popup ref="recordPopup" class="popup-content" type="bottom">
      <view class="z-box">
        <view v-for="item in recordList" :key="item.id" class="section-content" @click="chatClick(item)">
          <view style="display: flex;align-items: center;">
            <img :src="item.picture?baseUrl + item.picture:''"
                 alt=""
                 style="width: 60px;height: 60px;border-radius: 50%;object-fit: cover;">
            <view style="margin: 0 0 0 10px;display: flex;flex-direction: column;align-items: flex-start;">
              <view :style='{"fontSize":"14px","color":"#000","flex":"1","fontWeight":"bold"}'
                    class="item-style">{{ item.name }}
              </view>
              <view :style='{"color":"#666","flex":"1","fontSize":"14px","lineHeight":"1.5"}'
                    class="item-style"
                    style="display: flex;align-items: center;">
                <view v-if="item.notreadnum"
                      style="padding: 0 5px;height: 16px;border-radius: 50%;text-align: center;line-height: 16px;font-size: 12px;background: #f00;color:#fff;width: auto;display: flex; align-items: center">
                  {{ item.notreadnum }}
                </view>
                {{ item.content.split('/').length && item.content.split('/')[0] == 'upload' ? '[图片]' : item.content }}
              </view>
            </view>
          </view>
        </view>
        <view v-if="!recordList.length"
              style="padding: 30px 0;width: 100%;text-align: center;font-size: 14px;color: #666;">
          暂无聊天记录
        </view>
      </view>
    </uni-popup>
    <uni-popup ref="chatPopup" :maskClick="true" class="popup-content" type="bottom" @change="clearChat">
      <view class="popup-chat">
        <view id="chat-content" class="chat-content">
          <view v-for="item in chatList" v-bind:key="item.id">
            <view v-if="item.uid==user.id" class="right-content">
              <view v-if="item.format==1" class="text-content">{{ item.content }}</view>
              <img v-else :src="item.content?baseUrl + item.content:''"
                   style="width: 100px;height: 100px;object-fit: cover;"
                   @click="preViewImg(baseUrl + item.content)"/>
              <img :src="mypic?baseUrl + mypic:''" alt=""
                   style="width: 30px;border-radius: 50%;height: 30px;margin: 0 0 0 10px;object-fit: cover;"/>
            </view>
            <view v-else class="left-content">
              <img :src="nowfpic?baseUrl + nowfpic:''" alt=""
                   style="width: 30px;border-radius: 50%;height: 30px;margin: 0 10px 0 0;object-fit: cover;"/>
              <view v-if="item.format==1" class="text-content">{{ item.content }}</view>
              <img v-else :src="item.content?baseUrl + item.content:''"
                   style="width: 100px;height: 100px;object-fit: cover;"
                   @click="preViewImg(baseUrl + item.content)"/>
            </view>
            <view class="clear-float"></view>
          </view>
        </view>
        <view style="padding: 0 0 20px;">
          <input v-model="chatForm.content" confirm-type="send" placeholder="请输入内容"
                 style="width: calc(100% - 20px);font-size: 14px;background: #eee;margin: 0 10px 10px;padding: 0 10px;"
                 @confirm="addChat">
          </input>
          <view style="display: flex;justify-content: center;">
            <button style="width: auto;padding: 0 10px;background: #29A19C;font-size: 14px;border: none;color: #fff;"
                    @click="addChat">发送
            </button>
            <button style="width: auto;padding: 0 10px;background: #0BB2C7;font-size: 14px;border: none;color: #fff;"
                    @click="uploadSuccess">
              上传图片
            </button>
            <button style="width: auto;padding: 0 10px;background: #c774b1;font-size: 14px;border: none;color: #fff;"
                    @click="closeChat">返回
            </button>
          </view>

        </view>
      </view>
    </uni-popup>
    <uni-popup ref="passwordPopup" class="popup-content" type="bottom">
      <view class="passwordForm">
        <view class="passwordInput">
          <input v-model="passwordForm.mima" placeholder="原密码" type="password"/>
        </view>
        <view class="passwordInput">
          <input v-model="passwordForm.newmima" placeholder="新密码" type="password"/>
        </view>
        <view class="passwordInput">
          <input v-model="passwordForm.newmima1" placeholder="确认密码" type="password"/>
        </view>
        <view class="passwordBtnView">
          <button class="passwordBtn" @click="updatePassword">更新</button>
        </view>
      </view>
    </uni-popup>
  </view>
</template>
<script>
import menu from '@/utils/menu'

export default {
  data() {
    return {
      isH5Plus: true,
      user: {},
      tableName: '',
      role: '',
      menuList: [],
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
      recommendList: [],
      recommendTable: '',
      recommendTitle: '',
      recommendPicture: '',
      // 聊天
      recordList: [],
      nowfid: 0,
      nowfpic: '',
      nowname: '',
      nowtablename: '',
      chatList: [],
      chatForm: {
        content: ''
      },
      chatTimer: null,
      hasChatList: [
        'jiaoshi',
      ],
      friendList: [],
      passwordForm: {
        mima: '',
        newmima: '',
        newmima1: '',
      },
    };
  },
  computed: {
    baseUrl() {
      return this.$base.url;
    },
    mypic() {
      this.$forceUpdate()
      return uni.getStorageSync('headportrait')
    },
  },
  async onLoad() {
    let menus = menu.list();
    this.menuList = menus;
  },
  async onShow() {
    uni.removeStorageSync("useridTag");
    this.role = uni.getStorageSync("appRole");
    await this.getSession()
    this.getThumbsup()
    this.getStoreup()
    this.tableName = uni.getStorageSync("nowTable");
    let menus = menu.list();
    this.menuList = menus;
    this.getRecommendList()
  },
  methods: {
    async getSession() {
      let table = uni.getStorageSync("nowTable");
      let res = await this.$api.session(table);
      this.user = res.data;
      this.$forceUpdate()
    },
    async getThumbsup() {
      if (!this.user || !this.user.id) {
        return false
      }
      let res = await this.$api.page('storeup', {userid: this.user.id, type: 21})
      this.user.thumbsnum = Number(res.data.total)
      this.$forceUpdate()
    },
    async getStoreup() {
      if (!this.user || !this.user.id) {
        return false
      }
      let res = await this.$api.page('storeup', {userid: this.user.id, type: 1})
      this.user.storenum = Number(res.data.total)
      this.$forceUpdate()
    },
    loginClick() {
      uni.navigateTo({
        url: '../login/login'
      });
    },
    onPageTap(url) {
      uni.setStorageSync("useridTag", 1);
      uni.navigateTo({
        url: url,
        fail: function () {
          uni.switchTab({
            url: url
          });
        }
      });
    },
    async getRecommendList() {
      let params = {
        page: 1,
        limit: 4
      }
      let res;
      res = await this.$api.recommend('kechengziyuan', params);
      this.recommendList = res.data.list
      this.recommendTable = 'kechengziyuan'
      this.recommendTitle = 'ziyuanmingcheng'
      this.recommendPicture = 'ziyuantupian'
      this.$forceUpdate()
    },
    recommendDetail(id) {
      uni.navigateTo({
        url: `../${this.recommendTable}/detail?id=${id}`,
        fail: function () {
          uni.switchTab({
            url: `../${this.recommendTable}/detail?id=${id}`
          });
        }
      });
    },
    changeHasChat() {
      let table = uni.getStorageSync("nowTable")
      for (let x in this.hasChatList) {
        if (this.hasChatList[x] == table) {
          return true
        }
      }
      return false
    },
    async getRecordList(type = 1) {
      let res = await this.$api.page2('friend', {
        uid: this.user.id,
        type: 2
      })
      this.recordList = res.data.list
      if (type == 1) {
        this.$refs.recordPopup.open()
      }

    },
    async chatClick(row) {
      if (row.type == 0) {
        return false
      }
      this.nowfid = row.fid
      this.nowfpic = row.picture
      this.nowname = row.name
      this.nowtablename = row.tablename
      await this.getChatList()
      this.$refs.chatPopup.open()
      this.$forceUpdate()
    },
    async getChatList() {
      let res = await this.$api.mlist('chatmessage', {
        page: 1,
        limit: 1000,
        uid: this.user.id,
        fid: this.nowfid
      })
      this.chatList = res.data.list
      // #ifndef MP-WEIXIN
      let div = document.getElementsByClassName('chat-content')[0]
      setTimeout(() => {
        if (div)
          div.scrollTop = div.scrollHeight
      }, 0)
      // #endif
      this.chatTimer = setTimeout(() => {
        this.getChatList()
      }, 5000)
    },
    preViewImg(img) {
      uni.previewImage({
        urls: [img],
        current: img
      })
    },
    clearChat(e) {
      if (!e.show) {
        this.getRecordList(0)
        clearTimeout(this.chatTimer)
      }

    },
    closeChat() {
      this.$refs.chatPopup.close()
    },
    async uploadSuccess() {
      clearTimeout(this.chatTimer)
      let _this = this;
      await this.$api.upload(async function (obj) {
        let res = await _this.$api.page('friend', {
          uid: _this.user.id,
          fid: _this.nowfid,
          type: 2
        })
        if (!res.data.list.length) {
          await _this.$api.add('friend', {
            uid: _this.user.id,
            fid: _this.nowfid,
            name: _this.nowname,
            picture: _this.nowfpic,
            type: 2,
            tablename: 'yonghu'
          })
          await _this.$api.add('friend', {
            fid: _this.user.id,
            uid: _this.nowfid,
            name: uni.getStorageSync("nickname"),
            picture: _this.mypic,
            type: 2,
            tablename: uni.getStorageSync("nowTable")
          })
        }
        await _this.$api.add('chatmessage', {
          uid: _this.user.id,
          fid: _this.nowfid,
          content: 'upload/' + obj.file,
          format: 2
        })
        _this.chatForm = {
          content: ''
        }
        _this.getChatList()
      })
    },
    async addChat() {
      clearTimeout(this.chatTimer)
      let res = await this.$api.page('friend', {
        uid: this.user.id,
        fid: this.nowfid,
        type: 2
      })
      if (!res.data.list.length) {
        await this.$api.add('friend', {
          uid: this.user.id,
          fid: this.nowfid,
          name: this.nowname,
          picture: this.nowfpic,
          type: 2,
          tablename: 'yonghu'
        })
        await this.$api.add('friend', {
          fid: this.user.id,
          uid: this.nowfid,
          name: uni.getStorageSync("nickname"),
          picture: this.mypic,
          type: 2,
          tablename: uni.getStorageSync("nowTable")
        })
      }
      await this.$api.add('chatmessage', {
        uid: this.user.id,
        fid: this.nowfid,
        content: this.chatForm.content,
        format: 1
      })
      this.chatForm = {
        content: ''
      }
      this.getChatList()
    },
    passwordShow() {
      this.passwordForm = {
        mima: '',
        newmima: '',
        newmima1: '',
      }
      this.$forceUpdate()
      this.$refs.passwordPopup.open()
    },
    async updatePassword() {
      if (this.passwordForm.mima == '') {
        this.$utils.msg('原密码不能为空')
        return false
      }
      if (this.passwordForm.newmima == '') {
        this.$utils.msg('新密码不能为空')
        return false
      }
      if (this.passwordForm.newmima1 == '') {
        this.$utils.msg('确认密码不能为空')
        return false
      }
      let password = ''
      if (this.user.mima) {
        password = this.user.mima;
      } else if (this.user.password) {
        password = this.user.password;
      }
      let newpassword = this.passwordForm.mima
      if (password != newpassword) {
        this.$utils.msg('原密码不正确')
        return false
      }
      if (this.passwordForm.newmima != this.passwordForm.newmima1) {
        this.$utils.msg('两次密码不一致')
        return false
      }
      if (this.passwordForm.mima == this.passwordForm.newmima) {
        this.$utils.msg('新密码与原密码相同！')
        return false
      }
      if (this.tableName == 'xuesheng') {
      }
      this.user.password = this.passwordForm.newmima
      this.user.mima = this.passwordForm.newmima
      await this.$api.update(this.tableName, this.user)
      this.$utils.msg('修改密码成功,下次登录系统生效')
      this.$refs.passwordPopup.close()
      this.getSession()
    },
  }
}
</script>

<style lang="scss" scoped>
.content {
  height: calc(100vh - 94px);
  box-sizing: border-box;
}

.z-box {
  background: #fff;
  width: 100%;
  padding: 10px 0 60px;
  max-height: 60vh;
  overflow-y: scroll;

  .section-content {
    cursor: pointer;
    padding: 10px;
    box-shadow: 0px 4px 10px 0px rgba(0, 0, 0, 0.3);
    margin: 0 auto 20px;
    color: #333;
    background: #fff;
    display: flex;
    width: calc(100% - 20px);
    border-color: #efefef;
    border-width: 0;
    align-items: center;
    border-style: solid;
    position: relative;
    justify-content: space-between;
  }
}

.popup-chat {
  background: #fff;
  padding-bottom: 40px;

  .chat-content {
    padding-bottom: 20px;
    width: 100%;
    margin-bottom: 10px;
    max-height: 400px;
    height: 400px;
    overflow-y: scroll;
    border: 1px solid #eeeeee;
    background: #eee;
    display: flex;
    flex-direction: column;


    .left-content {
      float: left;
      margin-bottom: 10px;
      padding: 10px;
      max-width: 80%;
      display: flex;
      align-items: center;

      .text-content {
        background: #e5ffff;
        padding: 8px 12px;
        border-radius: 5px;
      }
    }

    .right-content {
      float: right;
      margin-bottom: 10px;
      padding: 10px;
      max-width: 80%;
      display: flex;
      align-items: center;

      .text-content {
        background: #fff;
        padding: 8px 12px;
        border-radius: 5px;
      }
    }
  }

}

.passwordForm {
  width: 100%;
  padding: 10px 20px 60px;
  background: #fff;

  .passwordInput {
    background: #eee;
    margin: 0 0 10px;
    padding: 0 10px;

    input {
      height: 36px;
      line-height: 36px;
      font-size: 14px;
    }
  }

  .passwordBtnView {
    width: 100%;
    display: flex;
    align-items: center;
    justify-content: center;
    padding: 10px 0;

    .passwordBtn {
      padding: 0 20px;
      width: auto;
      height: 20px;
      line-height: 20px;
      font-size: 14px;
      color: #fff;
      background: #007aff;
      border: none;
      border-radius: 5px;

    }
  }
}
</style>
