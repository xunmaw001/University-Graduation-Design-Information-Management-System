import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import xueshengList from '../pages/xuesheng/list'
import xueshengDetail from '../pages/xuesheng/detail'
import xueshengAdd from '../pages/xuesheng/add'
import daoshiList from '../pages/daoshi/list'
import daoshiDetail from '../pages/daoshi/detail'
import daoshiAdd from '../pages/daoshi/add'
import ketixinxiList from '../pages/ketixinxi/list'
import ketixinxiDetail from '../pages/ketixinxi/detail'
import ketixinxiAdd from '../pages/ketixinxi/add'
import xueshengxuantiList from '../pages/xueshengxuanti/list'
import xueshengxuantiDetail from '../pages/xueshengxuanti/detail'
import xueshengxuantiAdd from '../pages/xueshengxuanti/add'
import lunwentijiaoList from '../pages/lunwentijiao/list'
import lunwentijiaoDetail from '../pages/lunwentijiao/detail'
import lunwentijiaoAdd from '../pages/lunwentijiao/add'
import lunwenzhidaoList from '../pages/lunwenzhidao/list'
import lunwenzhidaoDetail from '../pages/lunwenzhidao/detail'
import lunwenzhidaoAdd from '../pages/lunwenzhidao/add'
import lunwendabianList from '../pages/lunwendabian/list'
import lunwendabianDetail from '../pages/lunwendabian/detail'
import lunwendabianAdd from '../pages/lunwendabian/add'
import dabianchengjiList from '../pages/dabianchengji/list'
import dabianchengjiDetail from '../pages/dabianchengji/detail'
import dabianchengjiAdd from '../pages/dabianchengji/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'xuesheng',
					component: xueshengList
				},
				{
					path: 'xueshengDetail',
					component: xueshengDetail
				},
				{
					path: 'xueshengAdd',
					component: xueshengAdd
				},
				{
					path: 'daoshi',
					component: daoshiList
				},
				{
					path: 'daoshiDetail',
					component: daoshiDetail
				},
				{
					path: 'daoshiAdd',
					component: daoshiAdd
				},
				{
					path: 'ketixinxi',
					component: ketixinxiList
				},
				{
					path: 'ketixinxiDetail',
					component: ketixinxiDetail
				},
				{
					path: 'ketixinxiAdd',
					component: ketixinxiAdd
				},
				{
					path: 'xueshengxuanti',
					component: xueshengxuantiList
				},
				{
					path: 'xueshengxuantiDetail',
					component: xueshengxuantiDetail
				},
				{
					path: 'xueshengxuantiAdd',
					component: xueshengxuantiAdd
				},
				{
					path: 'lunwentijiao',
					component: lunwentijiaoList
				},
				{
					path: 'lunwentijiaoDetail',
					component: lunwentijiaoDetail
				},
				{
					path: 'lunwentijiaoAdd',
					component: lunwentijiaoAdd
				},
				{
					path: 'lunwenzhidao',
					component: lunwenzhidaoList
				},
				{
					path: 'lunwenzhidaoDetail',
					component: lunwenzhidaoDetail
				},
				{
					path: 'lunwenzhidaoAdd',
					component: lunwenzhidaoAdd
				},
				{
					path: 'lunwendabian',
					component: lunwendabianList
				},
				{
					path: 'lunwendabianDetail',
					component: lunwendabianDetail
				},
				{
					path: 'lunwendabianAdd',
					component: lunwendabianAdd
				},
				{
					path: 'dabianchengji',
					component: dabianchengjiList
				},
				{
					path: 'dabianchengjiDetail',
					component: dabianchengjiDetail
				},
				{
					path: 'dabianchengjiAdd',
					component: dabianchengjiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
