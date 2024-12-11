const menu = {
    list() {
        return [{
            "backMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-link",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "学生",
                    "menuJump": "列表",
                    "tableName": "xuesheng"
                }], "menu": "学生管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "私聊"],
                    "appFrontIcon": "cuIcon-attentionfavor",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "教师",
                    "menuJump": "列表",
                    "tableName": "jiaoshi"
                }], "menu": "教师管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-brand",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "资源类型",
                    "menuJump": "列表",
                    "tableName": "ziyuanleixing"
                }], "menu": "资源类型管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-list",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "课程资源",
                    "menuJump": "列表",
                    "tableName": "kechengziyuan"
                }], "menu": "课程资源管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-form",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "课程类型",
                    "menuJump": "列表",
                    "tableName": "kechengleixing"
                }], "menu": "课程类型管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "选课"],
                    "appFrontIcon": "cuIcon-pic",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "课程信息",
                    "menuJump": "列表",
                    "tableName": "kechengxinxi"
                }], "menu": "课程信息管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "作业"],
                    "appFrontIcon": "cuIcon-circle",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "学生选课",
                    "menuJump": "列表",
                    "tableName": "xueshengxuanke"
                }], "menu": "学生选课管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "审核", "评分"],
                    "appFrontIcon": "cuIcon-keyboard",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "提交作业",
                    "menuJump": "列表",
                    "tableName": "tijiaozuoye"
                }], "menu": "提交作业管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-explore",
                    "buttons": ["删除", "修改", "查看"],
                    "menu": "作业评分",
                    "menuJump": "列表",
                    "tableName": "zuoyepingfen"
                }], "menu": "作业评分管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-album",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "班级信息",
                    "menuJump": "列表",
                    "tableName": "banjixinxi"
                }], "menu": "班级信息管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-news",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "资讯公告分类",
                    "tableName": "newstype"
                }, {
                    "allButtons": ["查看", "修改"],
                    "appFrontIcon": "cuIcon-present",
                    "buttons": ["查看", "修改"],
                    "menu": "关于我们",
                    "tableName": "aboutus"
                }, {
                    "allButtons": ["查看", "修改"],
                    "appFrontIcon": "cuIcon-vipcard",
                    "buttons": ["查看", "修改"],
                    "menu": "系统简介",
                    "tableName": "systemintro"
                }, {
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-skin",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "轮播图管理",
                    "tableName": "config"
                }, {
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-news",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "资讯公告",
                    "tableName": "news"
                }], "menu": "系统管理"
            }],
            "frontMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "私聊"],
                    "appFrontIcon": "cuIcon-news",
                    "buttons": ["查看", "私聊"],
                    "menu": "教师列表",
                    "menuJump": "列表",
                    "tableName": "jiaoshi"
                }], "menu": "教师模块"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-clothes",
                    "buttons": ["查看"],
                    "menu": "课程资源列表",
                    "menuJump": "列表",
                    "tableName": "kechengziyuan"
                }], "menu": "课程资源模块"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "选课"],
                    "appFrontIcon": "cuIcon-medal",
                    "buttons": ["查看", "选课"],
                    "menu": "课程信息列表",
                    "menuJump": "列表",
                    "tableName": "kechengxinxi"
                }], "menu": "课程信息模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "管理员",
            "tableName": "users"
        }, {
            "backMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "作业"],
                    "appFrontIcon": "cuIcon-circle",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "学生选课",
                    "menuJump": "列表",
                    "tableName": "xueshengxuanke"
                }], "menu": "学生选课管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "审核", "评分"],
                    "appFrontIcon": "cuIcon-keyboard",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "提交作业",
                    "menuJump": "列表",
                    "tableName": "tijiaozuoye"
                }], "menu": "提交作业管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-explore",
                    "buttons": ["查看"],
                    "menu": "作业评分",
                    "menuJump": "列表",
                    "tableName": "zuoyepingfen"
                }], "menu": "作业评分管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-favor",
                    "buttons": ["查看", "删除"],
                    "menu": "我的收藏",
                    "menuJump": "1",
                    "tableName": "storeup"
                }], "menu": "我的收藏管理"
            }],
            "frontMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "私聊"],
                    "appFrontIcon": "cuIcon-news",
                    "buttons": ["查看", "私聊"],
                    "menu": "教师列表",
                    "menuJump": "列表",
                    "tableName": "jiaoshi"
                }], "menu": "教师模块"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-clothes",
                    "buttons": ["查看"],
                    "menu": "课程资源列表",
                    "menuJump": "列表",
                    "tableName": "kechengziyuan"
                }], "menu": "课程资源模块"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "选课"],
                    "appFrontIcon": "cuIcon-medal",
                    "buttons": ["查看", "选课"],
                    "menu": "课程信息列表",
                    "menuJump": "列表",
                    "tableName": "kechengxinxi"
                }], "menu": "课程信息模块"
            }],
            "hasBackLogin": "否",
            "hasBackRegister": "否",
            "hasFrontLogin": "是",
            "hasFrontRegister": "是",
            "roleName": "学生",
            "tableName": "xuesheng"
        }, {
            "backMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-list",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "课程资源",
                    "menuJump": "列表",
                    "tableName": "kechengziyuan"
                }], "menu": "课程资源管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "选课"],
                    "appFrontIcon": "cuIcon-pic",
                    "buttons": ["查看", "新增", "修改", "删除"],
                    "menu": "课程信息",
                    "menuJump": "列表",
                    "tableName": "kechengxinxi"
                }], "menu": "课程信息管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "作业"],
                    "appFrontIcon": "cuIcon-circle",
                    "buttons": ["查看", "作业"],
                    "menu": "学生选课",
                    "menuJump": "列表",
                    "tableName": "xueshengxuanke"
                }], "menu": "学生选课管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "审核", "评分"],
                    "appFrontIcon": "cuIcon-keyboard",
                    "buttons": ["查看", "审核", "评分"],
                    "menu": "提交作业",
                    "menuJump": "列表",
                    "tableName": "tijiaozuoye"
                }], "menu": "提交作业管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-explore",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "作业评分",
                    "menuJump": "列表",
                    "tableName": "zuoyepingfen"
                }], "menu": "作业评分管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-album",
                    "buttons": ["查看"],
                    "menu": "班级信息",
                    "menuJump": "列表",
                    "tableName": "banjixinxi"
                }], "menu": "班级信息管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-favor",
                    "buttons": ["查看", "删除"],
                    "menu": "我的收藏",
                    "menuJump": "1",
                    "tableName": "storeup"
                }], "menu": "我的收藏管理"
            }],
            "frontMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "私聊"],
                    "appFrontIcon": "cuIcon-news",
                    "buttons": ["查看", "私聊"],
                    "menu": "教师列表",
                    "menuJump": "列表",
                    "tableName": "jiaoshi"
                }], "menu": "教师模块"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-clothes",
                    "buttons": ["查看"],
                    "menu": "课程资源列表",
                    "menuJump": "列表",
                    "tableName": "kechengziyuan"
                }], "menu": "课程资源模块"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "选课"],
                    "appFrontIcon": "cuIcon-medal",
                    "buttons": ["查看", "选课"],
                    "menu": "课程信息列表",
                    "menuJump": "列表",
                    "tableName": "kechengxinxi"
                }], "menu": "课程信息模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "是",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "教师",
            "tableName": "jiaoshi"
        }]
    }/*{"child":[{"allButtons":["新增","查看","修改","删除","提交"],"appFrontIcon":"cuIcon-qrcode","buttons":["删除","修改","查看"],"menu":"布置作业","menuJump":"列表","tableName":"buzhizuoye"}],"menu":"布置作业管理"}*/
}/*{"child":[{"allButtons":["新增","查看","修改","删除","提交"],"appFrontIcon":"cuIcon-qrcode","buttons":["查看","提交"],"menu":"布置作业","menuJump":"列表","tableName":"buzhizuoye"}],"menu":"布置作业管理"}*/
export default menu;/*{"child":[{"allButtons":["新增","查看","修改","删除","提交"],"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改","删除","新增"],"menu":"布置作业","menuJump":"列表","tableName":"buzhizuoye"}],"menu":"布置作业管理"}*/
