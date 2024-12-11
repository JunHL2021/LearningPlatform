import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import news from '@/views/modules/news/list'
import aboutus from '@/views/modules/aboutus/list'
import ziyuanleixing from '@/views/modules/ziyuanleixing/list'
import xueshengxuanke from '@/views/modules/xueshengxuanke/list'
import kechengziyuan from '@/views/modules/kechengziyuan/list'
import xuesheng from '@/views/modules/xuesheng/list'
import zuoyepingfen from '@/views/modules/zuoyepingfen/list'
import jiaoshi from '@/views/modules/jiaoshi/list'
import storeup from '@/views/modules/storeup/list'
import kechengxinxi from '@/views/modules/kechengxinxi/list'
import kechengleixing from '@/views/modules/kechengleixing/list'
import buzhizuoye from '@/views/modules/buzhizuoye/list'
import systemintro from '@/views/modules/systemintro/list'
import tijiaozuoye from '@/views/modules/tijiaozuoye/list'
import banjixinxi from '@/views/modules/banjixinxi/list'
import config from '@/views/modules/config/list'
import newstype from '@/views/modules/newstype/list'

Vue.use(VueRouter);


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
        // 这里不设置值，是把main作为默认页面
        path: '/',
        name: '系统首页',
        component: Home,
        meta: {icon: '', title: 'center', affix: true}
    }, {
        path: '/updatePassword',
        name: '修改密码',
        component: UpdatePassword,
        meta: {icon: '', title: 'updatePassword'}
    }, {
        path: '/pay',
        name: '支付',
        component: pay,
        meta: {icon: '', title: 'pay'}
    }, {
        path: '/center',
        name: '个人信息',
        component: center,
        meta: {icon: '', title: 'center'}
    }
        , {
            path: '/news',
            name: '资讯公告',
            component: news
        }
        , {
            path: '/aboutus',
            name: '关于我们',
            component: aboutus
        }
        , {
            path: '/ziyuanleixing',
            name: '资源类型',
            component: ziyuanleixing
        }
        , {
            path: '/xueshengxuanke',
            name: '学生选课',
            component: xueshengxuanke
        }
        , {
            path: '/kechengziyuan',
            name: '课程资源',
            component: kechengziyuan
        }
        , {
            path: '/xuesheng',
            name: '学生',
            component: xuesheng
        }
        , {
            path: '/zuoyepingfen',
            name: '作业评分',
            component: zuoyepingfen
        }
        , {
            path: '/jiaoshi',
            name: '教师',
            component: jiaoshi
        }
        , {
            path: '/storeup',
            name: '我的收藏',
            component: storeup
        }
        , {
            path: '/kechengxinxi',
            name: '课程信息',
            component: kechengxinxi
        }
        , {
            path: '/kechengleixing',
            name: '课程类型',
            component: kechengleixing
        }
        , {
            path: '/buzhizuoye',
            name: '布置作业',
            component: buzhizuoye
        }
        , {
            path: '/systemintro',
            name: '系统简介',
            component: systemintro
        }
        , {
            path: '/tijiaozuoye',
            name: '提交作业',
            component: tijiaozuoye
        }
        , {
            path: '/banjixinxi',
            name: '班级信息',
            component: banjixinxi
        }
        , {
            path: '/config',
            name: '轮播图管理',
            component: config
        }
        , {
            path: '/newstype',
            name: '资讯公告分类',
            component: newstype
        }
    ]
},
    {
        path: '/login',
        name: 'login',
        component: Login,
        meta: {icon: '', title: 'login'}
    },
    {
        path: '/register',
        name: 'register',
        component: register,
        meta: {icon: '', title: 'register'}
    },
    {
        path: '*',
        component: NotFound
    }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
    mode: 'hash',
    /*hash模式改为history*/
    routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
    return originalPush.call(this, location).catch(err => err)
}
export default router;
