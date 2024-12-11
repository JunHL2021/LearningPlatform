const base = {
    get() {
        return {
            url: "http://localhost:8080/LearningPlatform/",
            name: "LearningPlatform",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/LearningPlatform/front/h5/index.html'
        };
    },
    getProjectName() {
        return {
            projectName: "MR移动学习可视化平台"
        }
    }
}
export default base
