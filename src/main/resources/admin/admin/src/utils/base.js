const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot65sq2/",
            name: "springboot65sq2",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot65sq2/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "课堂管理系统"
        } 
    }
}
export default base
