<template>
  <view>
    <mescroll-uni :down="downOption" :up="upOption" @down="downCallback" @init="mescrollInit" @up="upCallback">
      <view class="content">
        <view
            :style='{"minHeight":"100vh","width":"100%","padding":"0","position":"relative","background":"#F1F1F1","height":"auto"}'
            class="container">
          <swiper :autoplay='true' :circular='true' :duration='500'
                  :indicator-dots='true' :interval='5000'
                  :style='{"width":"100%","background":"none","height":"480rpx"}' :vertical='false'
                  class="swiper" indicator-active-color='#339933' indicator-color='rgba(0, 0, 0, .3)'>
            <swiper-item v-for="(swiper,index) in swiperList"
                         :key="index" :style='{"width":"100%","background":"none","height":"100%"}'>
              <image
                  v-if="swiper.substring(0,4)=='http'"
                  :src="swiper"
                  :style='{"width":"100%","objectFit":"contain","background":"none","display":"block","height":"100%"}'
                  mode="aspectFill"></image>
              <image
                  v-else
                  :src="baseUrl+swiper"
                  :style='{"width":"100%","objectFit":"contain","background":"none","display":"block","height":"100%"}'
                  mode="aspectFill"></image>
            </swiper-item>
          </swiper>
          <view
              :style='{"padding":"0px","flexWrap":"wrap","background":"none","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'
              class="detail-content">

            <view
                :style='{"padding":"4rpx 24rpx 8rpx","margin":"0 auto","borderColor":"#000","borderWidth":"0 2rpx","background":"#FFF7DF","display":"flex","width":"calc(100% - 48rpx)","borderStyle":"solid","height":"auto"}'
                class="detail-list-item title">
              <view
                  :style='{"width":"auto","padding":"0 10rpx 0 0","lineHeight":"48rpx","fontSize":"28rpx","color":"#333","textAlign":"left"}'
                  class="lable">教师姓名：
              </view>
              <view
                  :style='{"padding":"0px","margin":"0px","color":"#666","textAlign":"left","flex":"1","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'
                  class="text">{{ detail.jiaoshixingming }}
              </view>
            </view>

            <view
                :style='{"padding":"4rpx 24rpx 8rpx","margin":"0 auto","borderColor":"#000","borderWidth":"0 2rpx","background":"#FFF7DF","display":"flex","width":"calc(100% - 48rpx)","borderStyle":"solid","height":"auto"}'
                class="detail-list-item">
              <view
                  :style='{"width":"auto","padding":"0 10rpx 0 0","lineHeight":"48rpx","fontSize":"28rpx","color":"#333","textAlign":"left"}'
                  class="lable">
                教师工号：
              </view>
              <view
                  :style='{"padding":"0px","margin":"0px","color":"#666","textAlign":"left","flex":"1","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'
                  class="text">
                {{ detail.jiaoshigonghao }}
              </view>
            </view>
            <view
                :style='{"padding":"4rpx 24rpx 8rpx","margin":"0 auto","borderColor":"#000","borderWidth":"0 2rpx","background":"#FFF7DF","display":"flex","width":"calc(100% - 48rpx)","borderStyle":"solid","height":"auto"}'
                class="detail-list-item">
              <view
                  :style='{"width":"auto","padding":"0 10rpx 0 0","lineHeight":"48rpx","fontSize":"28rpx","color":"#333","textAlign":"left"}'
                  class="lable">
                手机号：
              </view>
              <view
                  :style='{"padding":"0px","margin":"0px","color":"#666","textAlign":"left","flex":"1","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'
                  class="text">
                {{ detail.shoujihao }}
              </view>
            </view>
            <view
                :style='{"padding":"4rpx 24rpx 8rpx","margin":"0 auto","borderColor":"#000","borderWidth":"0 2rpx","background":"#FFF7DF","display":"flex","width":"calc(100% - 48rpx)","borderStyle":"solid","height":"auto"}'
                class="detail-list-item">
              <view
                  :style='{"width":"auto","padding":"0 10rpx 0 0","lineHeight":"48rpx","fontSize":"28rpx","color":"#333","textAlign":"left"}'
                  class="lable">
                性别：
              </view>
              <view
                  :style='{"padding":"0px","margin":"0px","color":"#666","textAlign":"left","flex":"1","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'
                  class="text">
                {{ detail.xingbie }}
              </view>
            </view>
            <view
                :style='{"padding":"4rpx 24rpx 8rpx","margin":"0 auto","borderColor":"#000","borderWidth":"0 2rpx","background":"#FFF7DF","display":"flex","width":"calc(100% - 48rpx)","borderStyle":"solid","height":"auto"}'
                class="detail-list-item">
              <view
                  :style='{"width":"auto","padding":"0 10rpx 0 0","lineHeight":"48rpx","fontSize":"28rpx","color":"#333","textAlign":"left"}'
                  class="lable">
                年龄：
              </view>
              <view
                  :style='{"padding":"0px","margin":"0px","color":"#666","textAlign":"left","flex":"1","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'
                  class="text">
                {{ detail.nianling }}
              </view>
            </view>


            <view
                :style='{"padding":"0px 24rpx","margin":"32rpx 0 24rpx 0","borderRadius":"16rpx","flexWrap":"wrap","background":"none","display":"flex","width":"100%","height":"auto","order":"8"}'
                class="bottom-content bg-white tabbar border shop">

              <button
                  v-if="userid&&isAuth('jiaoshi','私聊')"
                  :style='{"border":"0","padding":"0 20rpx","margin":"0 3% 20rpx 0","color":"#fff","borderRadius":"8rpx","background":"#0C77D5","width":"auto","fontSize":"28rpx","minWidth":"20%","lineHeight":"80rpx","height":"80rpx"}'
                  @tap="chatClick">私聊
              </button>
              <button
                  v-if="!userid&&isAuthFront('jiaoshi','私聊')"
                  :style='{"border":"0","padding":"0 20rpx","margin":"0 3% 20rpx 0","color":"#fff","borderRadius":"8rpx","background":"#0C77D5","width":"auto","fontSize":"28rpx","minWidth":"20%","lineHeight":"80rpx","height":"80rpx"}'
                  @tap="chatClick">私聊
              </button>

            </view>
          </view>
        </view>
      </view>
    </mescroll-uni>
    <uni-popup ref="chatPopup" :maskClick="true" class="popup-content" type="bottom" @change="clearChat">
      <view class="popup-chat">
        <view id="chat-content" class="chat-content">
          <view v-for="item in chatList" v-bind:key="item.id">
            <view v-if="item.uid==user.id" class="right-content">
              <view v-if="item.format==1" class="text-content">{{ item.content }}</view>
              <img v-else :src="item.content?baseUrl + item.content:''"
                   style="width: 100px;height: 100px;object-fit: cover;"
                   @click="preViewImg(baseUrl + item.content)"/>
              <img :src="mpic?baseUrl + mpic:''" alt=""
                   style="width: 40px;border-radius: 50%;height: 40px;margin: 0 0 0 10px;object-fit: cover;"/>
            </view>
            <view v-else class="left-content">
              <img :src="fpic?baseUrl + fpic:''" alt=""
                   style="width: 40px;border-radius: 50%;height: 40px;margin: 0 10px 0 0;object-fit: cover;"/>
              <view v-if="item.format==1" class="text-content">{{ item.content }}</view>
              <img v-else :src="item.content?baseUrl + item.content:''"
                   style="width: 100px;height: 100px;object-fit: cover;"
                   @click="preViewImg(baseUrl + item.content)"/>
            </view>
            <view class="clear-float"></view>
          </view>
        </view>
        <view style="">
          <input v-model="chatForm.content" confirm-type="send" placeholder="请输入内容"
                 style="width: calc(100% - 20px);font-size: 14px;background: #eee;margin: 0 10px 10px;padding: 0 10px;"
                 @confirm="addChat">
          </input>
          <view style="display: flex;justify-content: space-around;">
            <button style="width: auto;padding: 0 10px;background: #29A19C;font-size: 14px;border: none;color: #fff;"
                    @click="addChat">发送
            </button>
            <button style="width: auto;padding: 0 10px;background: #0BB2C7;font-size: 14px;border: none;color: #fff;"
                    @click="uploadSuccess">
              上传图片
            </button>
          </view>

        </view>
      </view>
    </uni-popup>
  </view>
</template>

<script>
export default {
  data() {
    return {
      btnColor: ['#409eff', '#67c23a', '#909399', '#e6a23c', '#f56c6c', '#356c6c', '#351c6c', '#f093a9', '#a7c23a', '#104eff', '#10441f', '#a21233', '#503319'],
      id: '',
      userid: '',
      detail: {},
      swiperList: [],
      commentList: [],
      mescroll: null, //mescroll实例对象
      downOption: {
        auto: false //是否在初始化后,自动执行下拉回调callback; 默认true
      },
      upOption: {
        noMoreSize: 3, //如果列表已无数据,可设置列表的总数量要大于半页才显示无更多数据;避免列表数据过少(比如只有一条数据),显示无更多数据会不好看; 默认5
        textNoMore: '~ 没有更多了 ~',
      },
      hasNext: true,
      user: {},
      count: 0,
      timer: null,
      title: '',
      chatList: [],
      chatForm: {
        content: ''
      },
      chatTimer: null,
      fpic: '',
      fname: '',
      mpic: uni.getStorageSync('headportrait'),
    }
  },
  components: {},
  computed: {
    baseUrl() {
      return this.$base.url;
    },
  },
  async onLoad(options) {
    // #ifdef APP-PLUS
    let page = getCurrentPages()
    this.href = this.baseUrl + 'front/h5/#/' + page[page.length - 1].route
    // #endif
    let table = uni.getStorageSync("nowTable");
    // 获取用户信息
    let res = await this.$api.session(table);
    this.user = res.data;
    this.id = options.id;
    if (options.userid) {
      this.userid = options.userid;
    }
    // 渲染数据
    this.init();
  },
  // #ifdef MP-WEIXIN
  onShareAppMessage() {
    var obj = {
      title: this.title,
      imageUrl: this.swiperList[0] ? this.baseUrl + this.swiperList[0] : ''
    }
    return obj
  },
  // #endif
  onUnload() {
    if (this.timer) {
      clearInterval(this.timer);
    }
  },
  async onShow(options) {
    let table = uni.getStorageSync("nowTable");
    // 获取用户信息
    let res = await this.$api.session(table);
    this.user = res.data;
    this.btnColor = this.btnColor.sort(() => {
      return (0.5 - Math.random());
    });
    let crossCleanType = uni.getStorageSync('crossCleanType')
    if (crossCleanType) {
      uni.removeStorageSync('crossCleanType')
      res = await this.$api.info('jiaoshi', this.id);
      this.detail = res.data;
      this.title = this.detail.jiaoshixingming
    }
  },
  destroyed: function () {
    //window.clearInterval(this.inter);
  },
  methods: {
    // 拨打电话
    callClick(row) {
      uni.makePhoneCall({
        phoneNumber: row
      })
    },
    // 支付
    onPayTap() {
      let that = this
      if (!this.user) {
        this.$utils.msg("请先登录")
        setTimeout(() => {
          that.$utils.jump('../login/login')
        }, 1500)
        return false
      }
      uni.setStorageSync('paytable', 'jiaoshi');
      uni.setStorageSync('payObject', this.detail);
      this.$utils.jump('../pay-confirm/pay-confirm?type=1')
    },
    onDetailTap(item) {
      uni.setStorageSync("useridTag", this.userid);
      this.$utils.jump(`./detail?id=${item.id}&userid=` + this.userid)
    },
    // 跨表
    async onAcrossTap(tableName, crossOptAudit, crossOptPay, statusColumnName, tips, statusColumnValue, type = 1) {
      let that = this
      if (!this.user) {
        this.$utils.msg("请先登录")
        setTimeout(() => {
          that.$utils.jump('../login/login')
        }, 1500)
        return false
      }
      uni.setStorageSync('crossTable', 'jiaoshi');
      uni.setStorageSync(`crossObj`, this.detail);
      uni.setStorageSync(`statusColumnName`, statusColumnName);
      uni.setStorageSync(`statusColumnValue`, statusColumnValue);
      uni.setStorageSync(`tips`, tips);
      if (statusColumnName != '' && !statusColumnName.startsWith("[")) {
        var obj = uni.getStorageSync('crossObj');
        for (var o in obj) {
          if (o == statusColumnName && obj[o] == statusColumnValue) {
            this.$utils.msg(tips);
            return
          }
        }
      }
      this.$utils.jump(`../${tableName}/add-or-update?cross=true`);
    },
    // 获取详情
    async init(type = 1) {
      if (this.timer) {
        clearInterval(this.timer);
      }
      let res = await this.$api.info('jiaoshi', this.id);
      if (res.data.touxiang) {
        this.fpic = res.data.touxiang.split(',')[0]
      } else if (res.data.headportrait) {
        this.fpic = res.data.headportrait.split(',')[0]
      }
      if (res.data.jiaoshigonghao) {
        this.fname = res.data.jiaoshigonghao
      }
      this.detail = res.data;

      this.title = this.detail.jiaoshixingming
      // 轮播图片
      this.swiperList = this.detail.touxiang ? this.detail.touxiang.split(",") : [];


      if (type == 2) {
        this.detail.discussnum++
        await this.$api.update('jiaoshi', this.detail)
      }
    },
    // mescroll组件初始化的回调,可获取到mescroll对象
    mescrollInit(mescroll) {
      this.mescroll = mescroll;
    },

    /*下拉刷新的回调 */
    downCallback(mescroll) {
      this.hasNext = true
      mescroll.resetUpScroll()
    },

    /*上拉加载的回调: mescroll携带page的参数, 其中num:当前页 从1开始, size:每页数据条数,默认10 */
    async upCallback(mescroll) {
      mescroll.endSuccess(mescroll.size, this.hasNext);

    },


    onChatTap() {
      this.$utils.jump('../chat/chat')
    },
    // 下载
    download(url) {
      let _this = this;
      url = _this.$base.url + url;
      uni.downloadFile({
        url: url,
        success: (res) => {
          if (res.statusCode === 200) {
            _this.$utils.msg('下载成功');
            window.open(url);
          }
        }
      });
    },
    //
    onCartTabTap() {
      this.$utils.tab('../shop-cart/shop-cart')
    },
    chatClick() {
      let that = this
      if (!this.user) {
        this.$utils.msg("请先登录")
        setTimeout(() => {
          that.$utils.jump('../login/login')
        }, 1500)
        return false
      }
      if (this.detail.id == this.user.id) {
        this.$utils.msg('不能给自己发信息！');
        return false
      }
      this.getChatList()
      this.$refs.chatPopup.open()
    },
    async getChatList() {
      let res = await this.$api.mlist('chatmessage', {
        page: 1,
        limit: 1000,
        uid: this.user.id,
        fid: this.detail.id
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
    clearChat(e) {
      if (!e.show) {
        clearTimeout(this.chatTimer)
      }
    },
    preViewImg(img) {
      uni.previewImage({
        urls: [img],
        current: img
      })
    },
    async uploadSuccess() {
      clearTimeout(this.chatTimer)
      let _this = this;
      await this.$api.upload(async function (obj) {
        let res = await _this.$api.page('friend', {
          uid: _this.user.id,
          fid: _this.detail.id,
        })
        if (!res.data.list.length) {
          await _this.$api.add('friend', {
            uid: _this.user.id,
            fid: _this.detail.id,
            name: _this.fname,
            picture: _this.fpic,
            type: 2,
            tablename: 'yonghu'
          })
          await _this.$api.add('friend', {
            fid: _this.user.id,
            uid: _this.detail.id,
            name: uni.getStorageSync("nickname"),
            picture: _this.mpic,
            type: 2,
            tablename: uni.getStorageSync("nowTable")
          })
        }
        await _this.$api.add('chatmessage', {
          uid: _this.user.id,
          fid: _this.detail.id,
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
        fid: this.detail.id,
      })
      if (!res.data.list.length) {
        await this.$api.add('friend', {
          uid: this.user.id,
          fid: this.detail.id,
          name: this.fname,
          picture: this.fpic,
          type: 2,
          tablename: 'yonghu'
        })
        await this.$api.add('friend', {
          fid: this.user.id,
          uid: this.detail.id,
          name: uni.getStorageSync("nickname"),
          picture: this.mpic,
          type: 2,
          tablename: uni.getStorageSync("nowTable")
        })
      }
      await this.$api.add('chatmessage', {
        uid: this.user.id,
        fid: this.detail.id,
        content: this.chatForm.content,
        format: 1
      })
      this.chatForm = {
        content: ''
      }
      this.getChatList()
    },
  }
}
</script>

<style lang="scss">
page {
  --animate-duration: 1s;
  --animate-delay: 1s;
  --animate-repeat: 1;
}

.content {
  min-height: calc(100vh - 44px);
  box-sizing: border-box;
}

.seat-list {
  display: flex;
  align-items: center;
  flex-wrap: wrap;
  background: #FFFFFF;
  margin: 20upx;
  border-radius: 20upx;
  padding: 20upx;
  font-size: 30upx;

  .seat-item {
    width: 33.33%;
    display: flex;
    align-items: center;
    flex-direction: column;
    margin-bottom: 20upx;

    .seat-icon {
      width: 50upx;
      height: 50upx;
      margin-bottom: 10upx;
    }
  }
}

audio {
  display: flex;
  flex-direction: column;
}

.audio /deep/ .uni-audio-default {
  width: inherit;
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
</style>
