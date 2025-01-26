import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
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
    import discussketixinxi from '@/views/modules/discussketixinxi/list'
    import lunwenzhidao from '@/views/modules/lunwenzhidao/list'
    import ketixinxi from '@/views/modules/ketixinxi/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import xueshengxuanti from '@/views/modules/xueshengxuanti/list'
    import lunwentijiao from '@/views/modules/lunwentijiao/list'
    import dabianchengji from '@/views/modules/dabianchengji/list'
    import daoshi from '@/views/modules/daoshi/list'
    import config from '@/views/modules/config/list'
    import lunwendabian from '@/views/modules/lunwendabian/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/discussketixinxi',
        name: '课题信息评论',
        component: discussketixinxi
      }
      ,{
	path: '/lunwenzhidao',
        name: '论文指导',
        component: lunwenzhidao
      }
      ,{
	path: '/ketixinxi',
        name: '课题信息',
        component: ketixinxi
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/xueshengxuanti',
        name: '学生选题',
        component: xueshengxuanti
      }
      ,{
	path: '/lunwentijiao',
        name: '论文提交',
        component: lunwentijiao
      }
      ,{
	path: '/dabianchengji',
        name: '答辩成绩',
        component: dabianchengji
      }
      ,{
	path: '/daoshi',
        name: '导师',
        component: daoshi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/lunwendabian',
        name: '论文答辩',
        component: lunwendabian
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
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
