<template>
  <!-- category 2 -->
  <mescroll-uni :down="downOption" :up="upOption" @down="downCallback" @init="mescrollInit" @up="upCallback">
    <view class="content">
      <view
          :style='{"minHeight":"100vh","padding":"24rpx 0 0","alignItems":"flex-start","flexWrap":"wrap","background":"#F1F1F1","display":"block","width":"100%","position":"relative","height":"auto"}'>
        <view
            :style='{"border":"0px solid #ff9593","padding":"0","margin":"0 auto","borderRadius":"12rpx","background":"none","display":"flex","width":"calc(100% - 48rpx)","height":"auto"}'
            class="cu-bar bg-white search">
          <picker v-if="queryList.length>1" :range="queryList" :value="queryIndex" mode="selector" range-key="queryName"
                  @change="queryChange">
            <view
                :style='{"padding":"0 0 0 20rpx","borderColor":"#ff9593","borderRadius":"8rpx 0 0 8rpx","background":"#fff","borderWidth":"0","width":"60rpx","lineHeight":"80rpx","borderStyle":"solid","height":"80rpx"}'>
              <text :style='{"width":"32rpx","fontSize":"32rpx","lineHeight":"32rpx","color":"#888"}'
                    class="icon iconfont icon-fangdajing01"></text>
            </view>
          </picker>
          <view
              v-if="queryIndex==0"
              :style='{"margin":"0 0px","borderColor":"#ff9593","borderRadius":"0","flex":"1","background":"#fff","borderWidth":"0","lineHeight":"80rpx","position":"relative","borderStyle":"solid","height":"80rpx"}'
              class="search-form round">
            <text
                :style='{"color":"#999","left":"0px","textAlign":"center","width":"80rpx","fontSize":"40rpx","lineHeight":"80rpx","position":"absolute","right":"0px"}'
                class="icon iconfont "></text>
            <input
                v-model="searchForm.title"
                :style='{"border":"0","padding":"8rpx 20rpx 8rpx 20rpx","color":"#666","borderRadius":"0","background":"none","width":"100%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}'
                placeholder="标题" type="text"></input>
          </view>
          <button
              :style='{"border":"0","padding":"0","margin":"0","color":"#fff","borderRadius":"0 8rpx 8rpx 0","background":"#2B78FF","width":"136rpx","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}'
              class="cu-btn shadow-blur round" @tap="search">搜索
          </button>
        </view>


        <view
            :style='{"border":"2rpx solid #000","padding":"20rpx 0","margin":"40rpx auto 0","borderRadius":"8rpx","alignItems":"flex-end","color":"#fff","flexWrap":"wrap","background":"#0C77D5","display":"flex","width":"calc(100% - 48rpx)","justifyContent":"center"}'>
          <view
              :style='{"border":"0","padding":"0 12rpx","margin":"0 8rpx 0 0","borderRadius":"8rpx","background":"none","display":"flex"}'
              @click="sortClick('clicknum')">
            <text :style='{"color":"inherit","lineHeight":"auto","fontSize":"24rpx"}'>点击量</text>
            <text v-if="listSort!='clicknum'"
                  :style='{"margin":"0 4rpx 0 0","lineHeight":"auto","fontSize":"24rpx","color":"inherit"}'
                  class="icon iconfont icon-jiantou36"></text>
            <text v-else-if="listSort=='clicknum'&&listOrder=='asc'"
                  :style='{"margin":"0 4rpx 0 0","lineHeight":"auto","fontSize":"24rpx","color":"inherit"}'
                  class="icon iconfont icon-jiantou35"></text>
            <text v-else-if="listSort=='clicknum'&&listOrder=='desc'"
                  :style='{"margin":"0 4rpx 0 0","lineHeight":"auto","fontSize":"24rpx","color":"inherit"}'
                  class="icon iconfont icon-jiantou36"></text>
          </view>
          <view
              :style='{"border":"0","padding":"0 12rpx","margin":"0 8rpx 0 0","borderRadius":"8rpx","background":"none","display":"flex"}'
              @click="sortClick('addtime')">
            <text :style='{"color":"inherit","lineHeight":"auto","fontSize":"24rpx"}'>按日期</text>
            <text v-if="listSort!='addtime'"
                  :style='{"margin":"0 4rpx 0 0","lineHeight":"auto","fontSize":"24rpx","color":"inherit"}'
                  class="icon iconfont icon-jiantou36"></text>
            <text v-else-if="listSort=='addtime'&&listOrder=='asc'"
                  :style='{"margin":"0 4rpx 0 0","lineHeight":"auto","fontSize":"24rpx","color":"inherit"}'
                  class="icon iconfont icon-jiantou35"></text>
            <text v-else-if="listSort=='addtime'&&listOrder=='desc'"
                  :style='{"margin":"0 4rpx 0 0","lineHeight":"auto","fontSize":"24rpx","color":"inherit"}'
                  class="icon iconfont icon-jiantou36"></text>
          </view>
        </view>
        <view
            :style='{"padding":"0","alignItems":"flex-start","flexWrap":"wrap","background":"none","display":"flex","width":"100%","height":"auto"}'>
          <scroll-view
              :style='{"minHeight":"100vh","margin":"40rpx 20rpx 0 0","borderRadius":"8rpx 36rpx 32rpx 8rpx","background":"#0C77D5","display":"block","width":"200rpx","height":"100%"}'
              class="category-two"
              scroll-y="true">
            <view v-for="(item,index) in categoryList" :key="index"
                  :class='categoryName === item.typename ? "active" : ""' class="tab"
                  @tap="categoryClick(item.typename)">
              {{ item.typename }}
            </view>
          </scroll-view>

          <!-- 样式2 -->
          <view
              :style='{"padding":"24rpx","margin":"40rpx 0 0","borderRadius":"8rpx","background":"#F6BE1E","flex":"1","width":"calc(100% - 220rpx)","height":"auto"}'
              class="news-box2">
            <block v-for="(product,index) in list" :key="index">
              <view v-if="index==0"
                    :style='{"border":"2rpx solid #000","padding":"20rpx","margin":"0 0 20rpx","borderRadius":"8rpx","background":"#F7F1DF","width":"100%","position":"relative","height":"auto"}'
                    class="list-item"
                    @tap="onDetailTap(product)">
                <image :src="baseUrl+product.picture"
                       :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}'
                       class="listmpic" mode="aspectFill"></image>
                <view
                    :style='{"padding":"20rpx 0","color":"#666","flexWrap":"wrap","background":"none","display":"flex","width":"100%","fontSize":"24rpx"}'>
                  <view
                      :style='{"padding":"0 0px","margin":"0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis"}'
                      class="title ">{{ product.title }}
                  </view>
                  <view :style='{"width":"100%","padding":"0 0px","lineHeight":"48rpx","order":"3"}'>
                    <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'
                          class="icon iconfont icon-shijian21"></text>
                    <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{ product.addtime }}
                    </text>
                  </view>
                  <view :style='{"padding":"0 0px","margin":"0 20rpx 0 0","display":"inline-block"}'>
                    <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'
                          class="icon iconfont icon-geren16"></text>
                    <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{ product.name }}</text>
                  </view>
                  <view :style='{"padding":"0 0px","margin":"0 20rpx 0 0","display":"inline-block"}'>
                    <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'
                          class="icon iconfont icon-zan10"></text>
                    <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>
                      {{ product.thumbsupnum }}
                    </text>
                  </view>
                  <view :style='{"padding":"0 0px","margin":"0 20rpx 0 0","display":"inline-block"}'>
                    <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'
                          class="icon iconfont icon-shoucang10"></text>
                    <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>
                      {{ product.storeupnum }}
                    </text>
                  </view>
                  <view :style='{"padding":"0 0px","margin":"0 20rpx 0 0","display":"inline-block"}'>
                    <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'
                          class="icon iconfont icon-chakan9"></text>
                    <text :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{ product.clicknum }}
                    </text>
                  </view>
                </view>
              </view>
              <view v-if="index>0"
                    :style='{"padding":"20rpx 0","borderColor":"#000","margin":"0 0 20rpx","borderRadius":"8rpx","borderWidth":"2rpx","background":"#F7F1DF","width":"100%","borderStyle":"solid","height":"auto"}'
                    class="list-item"
                    @tap="onDetailTap(product)">
                <view
                    :style='{"padding":"0 20rpx","overflow":"hidden","whiteSpace":"nowrap","color":"#000","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis"}'
                    class="title ">{{ product.title }}
                </view>
                <view :style='{"width":"100%","padding":"0 20rpx"}'>
                  <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'
                        class="icon iconfont icon-shijian21"></text>
                  <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{ product.addtime }}</text>
                </view>
                <view :style='{"padding":"0 20rpx","display":"inline-block"}'>
                  <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'
                        class="icon iconfont icon-geren16"></text>
                  <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{ product.name }}</text>
                </view>
                <view :style='{"padding":"0 20rpx","display":"inline-block"}'>
                  <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'
                        class="icon iconfont icon-zan10"></text>
                  <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{ product.thumbsupnum }}</text>
                </view>
                <view :style='{"padding":"0 20rpx","display":"inline-block"}'>
                  <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'
                        class="icon iconfont icon-shoucang10"></text>
                  <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{ product.storeupnum }}</text>
                </view>
                <view :style='{"padding":"0 20rpx","display":"inline-block"}'>
                  <text :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'
                        class="icon iconfont icon-chakan9"></text>
                  <text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{ product.clicknum }}</text>
                </view>
              </view>
            </block>
          </view>


        </view>


      </view>

      <button
          v-if="userid && isAuth('news','新增')"
          :style='{"border":"0","boxShadow":"none","color":"#fff","bottom":"120rpx","right":"120rpx","borderRadius":"100%","background":"#0C77D5","width":"80rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","height":"80rpx","zIndex":"999"}'
          class="add-btn" @click="onAddTap()">新增
      </button>
      <button
          v-if="!userid && isAuthFront('news','新增')"
          :style='{"border":"0","boxShadow":"none","color":"#fff","bottom":"120rpx","right":"120rpx","borderRadius":"100%","background":"#0C77D5","width":"80rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","height":"80rpx","zIndex":"999"}'
          class="add-btn" @click="onAddTap()">新增
      </button>
    </view>
  </mescroll-uni>
</template>

<script>
export default {
  data() {
    return {
      btnColor: ['#409eff', '#67c23a', '#909399', '#e6a23c', '#f56c6c', '#356c6c', '#351c6c', '#f093a9', '#a7c23a', '#104eff', '#10441f', '#a21233', '#503319'],
      clicknumColor: ['#409eff', '#67c23a', '#909399', '#e6a23c', '#f56c6c', '#356c6c', '#351c6c', '#f093a9', '#a7c23a', '#104eff', '#10441f', '#a21233', '#503319'],
      queryList: [
        {
          queryName: "标题",
        },
      ],
      queryIndex: 0,
      list: [],
      lists: [],
      userid: '',
      mescroll: null, //mescroll实例对象
      downOption: {
        auto: false //是否在初始化后,自动执行下拉回调callback; 默认true
      },
      upOption: {
        noMoreSize: 5, //如果列表已无数据,可设置列表的总数量要大于半页才显示无更多数据;避免列表数据过少(比如只有一条数据),显示无更多数据会不好看; 默认5
        textNoMore: '~ 没有更多了 ~',
      },
      hasNext: true,
      searchForm: {},
      categoryList: [],
      categoryName: '全部',
      CustomBar: '0',
      listSort: 'id',
      listOrder: 'desc',
    };
  },
  watch: {},
  mounted() {
  },
  computed: {
    baseUrl() {
      return this.$base.url;
    },
  },
  async onShow() {
    this.btnColor = this.btnColor.sort(() => {
      return (0.5 - Math.random());
    });
    this.clicknumColor = this.clicknumColor.sort(() => {
      return (0.5 - Math.random());
    });
    let res = {};
    if (this.userid) {
      res = await this.$api.page('newstype', {page: 1, limit: 100});
    } else {
      res = await this.$api.list('newstype', {page: 1, limit: 100});
    }
    res.data.list.splice(0, 0, {id: 0, typename: '全部'})
    this.categoryList = res.data.list;
    this.hasNext = true
    // 重新加载数据
    if (this.mescroll) this.mescroll.resetUpScroll()
  },
  onLoad(options) {
    if (options.userid) {
      this.userid = options.userid;
    } else {
      this.userid = "";
    }
    this.hasNext = true
    // 重新加载数据
    if (this.mescroll) this.mescroll.resetUpScroll()
  },
  components: {},
  methods: {
    uGetRect(selector, all) {
      return new Promise(resolve => {
        uni.createSelectorQuery()
            .in(this)
            [all ? 'selectAll' : 'select'](selector)
            .boundingClientRect(rect => {
              if (all && Array.isArray(rect) && rect.length) {
                resolve(rect);
              }
              if (!all && rect) {
                resolve(rect);
              }
            })
            .exec();
      });
    },
    cloneData(data) {
      return JSON.parse(JSON.stringify(data));
    },
    sortClick(type) {
      if (this.listSort == type) {
        if (this.listOrder == 'desc') {
          this.listOrder = 'asc'
        } else {
          this.listOrder = 'desc'
        }
      } else {
        this.listSort = type
        this.listOrder = 'desc'
      }
      this.search()
    },
    priceChange(price) {
      return Number(price).toFixed(2);
    },
    preHttp(str) {
      return str && str.substr(0, 4) == 'http';
    },
    //查询条件切换
    queryChange(e) {
      this.queryIndex = e.detail.value;
      this.searchForm.title = "";
    },
    //类别搜索
    categoryClick(categoryName) {
      this.categoryName = categoryName;
      this.mescroll.resetUpScroll();
    },
    // mescroll组件初始化的回调,可获取到mescroll对象
    mescrollInit(mescroll) {
      this.mescroll = mescroll;
    },
    /*下拉刷新的回调 */
    downCallback(mescroll) {
      this.hasNext = true
      // 重置分页参数页数为1
      mescroll.resetUpScroll()
    },
    /*上拉加载的回调: mescroll携带page的参数, 其中num:当前页 从1开始, size:每页数据条数,默认10 */
    async upCallback(mescroll) {
      let params = {
        page: mescroll.num,
        limit: mescroll.size
      }
      params['sort'] = this.listSort;
      params['order'] = this.listOrder;

      if (this.categoryName != '全部') {
        params.typename = this.categoryName
      }
      if (this.searchForm.title) {
        params['title'] = '%' + this.searchForm.title + '%'
      }
      let user = uni.getStorageSync("appUserid") ? JSON.parse(uni.getStorageSync('userSession')) : {}
      let res = {}
      if (this.userid) {
        res = await this.$api.page(`news`, params);
      } else {
        res = await this.$api.list(`news`, params);
      }

      // 如果是第一页数据置空
      if (mescroll.num == 1) this.list = [];
      this.list = this.list.concat(res.data.list);
      this.$forceUpdate()

      let length = Math.ceil(this.list.length / 6)
      let arr = [];
      for (let i = 0; i < length; i++) {
        arr[i] = this.list.slice(i * 6, (i + 1) * 6)
      }
      this.lists = arr
      if (res.data.list.length == 0) this.hasNext = false;
      mescroll.endSuccess(mescroll.size, this.hasNext);
    },
    // 详情
    onDetailTap(item) {
      uni.setStorageSync("useridTag", this.userid);
      this.$utils.jump(`../news-detail/news-detail?id=${item.id}`)
    },
    onUpdate(e) {
      this.onUpdateTap(e.currentTarget.dataset.row)
    },
    // 修改
    onUpdateTap(row) {
      uni.setStorageSync("useridTag", this.userid);
      this.$utils.jump(`./add-or-update?id=${row.id}`)
    },
    // 添加
    onAddTap() {
      uni.setStorageSync("useridTag", this.userid);
      this.$utils.jump(`./add-or-update`)
    },
    onDelete(e) {
      this.onDeleteTap(e.currentTarget.dataset.row.id)
    },
    onDeleteTap(id) {
      var _this = this;
      uni.showModal({
        title: '提示',
        content: '是否确认删除',
        success: async function (res) {
          if (res.confirm) {
            await _this.$api.del('news', JSON.stringify([id]));
            let obj = await _this.$api.list('storeup', {
              page: 1,
              limit: 100,
              tablename: 'news',
              refid: id,
            })
            if (obj.data.list.length) {
              let arr = []
              for (let x in obj.data.list) {
                arr.push(obj.data.list[x].id)
              }
              await _this.$api.del('storeup', JSON.stringify(arr))
            }
            _this.$utils.msg('删除成功');
            _this.hasNext = true
            // 重置分页参数页数为1
            _this.search()
          }
        }
      });
    },
    // 搜索
    async search() {
      this.mescroll.num = 1
      let searchForm = {
        page: this.mescroll.num,
        limit: this.mescroll.size
      }
      searchForm['sort'] = this.listSort;
      searchForm['order'] = this.listOrder;

      if (this.categoryName != '全部') {
        searchForm.typename = this.categoryName
      }
      if (this.searchForm.title) {
        searchForm['title'] = '%' + this.searchForm.title + '%'
      }
      let res = {};
      if (this.userid) {
        res = await this.$api.page(`news`, searchForm);
      } else {
        res = await this.$api.list(`news`, searchForm);
      }
      // 如果是第一页数据置空
      if (this.mescroll.num == 1) this.list = [];
      this.list = this.list.concat(res.data.list);
      let length = Math.ceil(this.list.length / 6)
      let arr = [];
      for (let i = 0; i < length; i++) {
        arr[i] = this.list.slice(i * 6, (i + 1) * 6)
      }
      this.lists = arr
      if (res.data.list.length == 0) this.hasNext = false;
      this.mescroll.endSuccess(this.mescroll.size, this.hasNext);
    }
  }
};
</script>

<style lang="scss" scoped>
.content {
  min-height: calc(100vh - 44px);
  box-sizing: border-box;
}

.category-one .tab {
  cursor: pointer;
  border-radius: 12rpx;
  padding: 0 0px;
  margin: 0 20rpx 0 0;
  color: #333;
  background: none;
  display: inline-block;
  width: auto;
  font-size: 28rpx;
  line-height: 64rpx;
}

.category-one .tab.active {
  cursor: pointer;
  padding: 0 0px;
  margin: 0 20rpx 0 0;
  color: #38bf3e;
  display: inline-block;
  font-size: 28rpx;
  border-color: #38bf3e;
  line-height: 64rpx;
  border-radius: 0;
  background: none;
  width: auto;
  border-width: 0 0 4rpx;
  border-style: solid;
}

.category-two .tab {
  cursor: pointer;
  border: 0;
  border-radius: 0px 0 0 0;
  padding: 0;
  color: #fff;
  background: none;
  display: inline-block;
  width: 100%;
  font-size: 28rpx;
  line-height: 80rpx;
  text-align: center;
}

.category-two .tab.active {
  cursor: pointer;
  border: 0;
  border-radius: 4rpx 32rpx 0 0;
  padding: 0;
  color: #000;
  background: #F6BE1E;
  display: inline-block;
  width: 100%;
  font-size: 28rpx;
  line-height: 80rpx;
  text-align: center;
}

.category-three .tab {
  cursor: pointer;
  padding: 0;
  color: #fff;
  background: burlywood;
  display: inline-block;
  width: 100%;
  font-size: 28rpx;
  line-height: 80rpx;
  text-align: center;
}

.category-three .tab.active {
  cursor: pointer;
  padding: 0;
  color: #fff;
  background: #000;
  display: inline-block;
  width: 100%;
  font-size: 28rpx;
  line-height: 80rpx;
  text-align: center;
}
</style>
