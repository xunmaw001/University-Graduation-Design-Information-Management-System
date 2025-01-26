const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm22t68/",
            name: "ssm22t68",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm22t68/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校毕业设计信息管理系统设计与实现"
        } 
    }
}
export default base
