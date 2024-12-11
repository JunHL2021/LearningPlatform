/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50744
 Source Host           : localhost:3306
 Source Schema         : db_learningplatform

 Target Server Type    : MySQL
 Target Server Version : 50744
 File Encoding         : 65001

 Date: 14/05/2024 20:26:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for aboutus
-- ----------------------------
DROP TABLE IF EXISTS `aboutus`;
CREATE TABLE `aboutus`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `subtitle` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '副标题',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容',
  `picture1` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片1',
  `picture2` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片2',
  `picture3` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片3',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '关于我们' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of aboutus
-- ----------------------------
INSERT INTO `aboutus` VALUES (1, '2024-03-27 22:09:15', '关于我们', 'ABOUT US', '当你设想门外是寒冷可怕的世界时，你还应该开门出去看看，是否真的如此。如果你有信心，你对前途就不犹豫了。如果你有勇气，你就不怕前途是否有困难或危险了每个人心中都应有两盏灯，一盏是希望的灯，一盏是勇气的灯。有了这两盏灯，我们就不怕海上的黑暗和风涛的险恶了。人的一生很像是在雾中行走。远远望去，只是迷蒙一片，辨不出方向和吉凶。可是，当你鼓起勇气，放下恐惧和怀疑，一步一步向前走去的时候，你就会发现，每走一步，你都能把下一步路看得清楚一点。“往前走，别站在远远的地方观望！”你就可以找到你的方向。', 'upload/aboutus_picture1.jpg', 'upload/aboutus_picture2.jpg', 'upload/aboutus_picture3.jpg');

-- ----------------------------
-- Table structure for banjixinxi
-- ----------------------------
DROP TABLE IF EXISTS `banjixinxi`;
CREATE TABLE `banjixinxi`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoshigonghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '教师工号',
  `jiaoshixingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '教师姓名',
  `banjihao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '班级号',
  `banjimingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '班级名称',
  `banjirenshu` int(11) DEFAULT NULL COMMENT '班级人数',
  `banjijieshao` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '班级介绍',
  `banjitupian` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '班级图片',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `banjihao`(`banjihao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 117 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '班级信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of banjixinxi
-- ----------------------------
INSERT INTO `banjixinxi` VALUES (111, '2024-03-27 22:09:14', '10001', '赵莉', '001', '班级1', 1, '<p>这是一班</p>', '');
INSERT INTO `banjixinxi` VALUES (112, '2024-03-27 22:09:14', '10002', '李四', '002', '班级2', 2, '<p>这是二班</p>', '');
INSERT INTO `banjixinxi` VALUES (113, '2024-03-27 22:09:14', '10003', '王五', '003', '班级3', 3, '<p>这是三班</p>', '');
INSERT INTO `banjixinxi` VALUES (114, '2024-03-27 22:09:14', '10004', '赵六', '004', '班级4', 4, '<p>这是四班</p>', '');
INSERT INTO `banjixinxi` VALUES (115, '2024-03-27 22:09:14', '10005', '孙七', '005', '班级5', 5, '<p>这是五班</p>', '');
INSERT INTO `banjixinxi` VALUES (116, '2024-03-27 22:09:14', '10006', '周八', '006', '班级6', 6, '<p>这是六班</p>', '');

-- ----------------------------
-- Table structure for buzhizuoye
-- ----------------------------
DROP TABLE IF EXISTS `buzhizuoye`;
CREATE TABLE `buzhizuoye`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kechengmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '课程名称',
  `kechengfengmian` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '课程封面',
  `banji` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '班级',
  `zuoyemingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '作业名称',
  `buzhishijian` datetime(0) DEFAULT NULL COMMENT '布置时间',
  `zuoyefujian` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '作业附件',
  `jiaoshigonghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '教师工号',
  `jiaoshixingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '教师姓名',
  `xueshengzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学生账号',
  `xueshengxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学生姓名',
  `zuoyeyaoqiu` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '作业要求',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 87 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '布置作业' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of buzhizuoye
-- ----------------------------
INSERT INTO `buzhizuoye` VALUES (81, '2024-03-27 22:09:14', '计算机组成原理', 'upload/jsjzcyl.jpg', '班级1', '课后习题', '2024-03-27 22:09:14', '', '10001', '赵莉', '20201001', '吕俊豪', '无');
INSERT INTO `buzhizuoye` VALUES (82, '2024-03-27 22:09:14', '数据结构', 'upload/sjjg.jpg', '班级2', '课后习题', '2024-03-27 22:09:14', '', '10002', '李四', '20201002', '张金彪', '无');
INSERT INTO `buzhizuoye` VALUES (83, '2024-03-27 22:09:14', '计算机网络', 'upload/jsjwl.jpg', '班级3', '课后习题', '2024-03-27 22:09:14', '', '10003', '王五', '20201003', '张光宇', '无');
INSERT INTO `buzhizuoye` VALUES (84, '2024-03-27 22:09:14', '软件工程', 'upload/rjgc.jpg', '班级4', '课后习题', '2024-03-27 22:09:14', '', '10004', '赵六', '20201004', '夏俊岭', '无');
INSERT INTO `buzhizuoye` VALUES (85, '2024-03-27 22:09:14', '软件测试', 'upload/rjcs.jpg', '班级5', '课后习题', '2024-03-27 22:09:14', '', '10005', '孙七', '20201005', '周浩', '无');
INSERT INTO `buzhizuoye` VALUES (86, '2024-03-27 22:09:14', '网络工程导论', 'upload/wlgcdl.jpg', '班级6', '课后习题', '2024-03-27 22:09:14', '', '10006', '周八', '20201006', '干英豪', '无');

-- ----------------------------
-- Table structure for chatmessage
-- ----------------------------
DROP TABLE IF EXISTS `chatmessage`;
CREATE TABLE `chatmessage`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `uid` bigint(20) NOT NULL COMMENT '用户ID',
  `fid` bigint(20) NOT NULL COMMENT '好友用户ID',
  `content` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '内容',
  `format` int(11) DEFAULT NULL COMMENT '格式(1:文字，2:图片)',
  `isread` int(11) DEFAULT 0 COMMENT '消息已读(0:未读，1:已读)',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '消息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for config
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '配置参数值',
  `url` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'url',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '配置文件' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of config
-- ----------------------------
INSERT INTO `config` VALUES (1, 'picture1', 'upload/picture1.jpg', NULL);
INSERT INTO `config` VALUES (2, 'picture2', 'upload/picture2.jpg', NULL);
INSERT INTO `config` VALUES (3, 'picture3', 'upload/picture3.jpg', NULL);

-- ----------------------------
-- Table structure for friend
-- ----------------------------
DROP TABLE IF EXISTS `friend`;
CREATE TABLE `friend`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `uid` bigint(20) NOT NULL COMMENT '用户ID',
  `fid` bigint(20) NOT NULL COMMENT '好友用户ID',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `picture` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图片',
  `role` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色',
  `tablename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '表名',
  `alias` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '别名',
  `type` int(11) DEFAULT 0 COMMENT '类型(0:好友申请，1:好友，2:消息)',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '好友表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for jiaoshi
-- ----------------------------
DROP TABLE IF EXISTS `jiaoshi`;
CREATE TABLE `jiaoshi`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoshigonghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师工号',
  `jiaoshixingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师姓名',
  `mima` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `shoujihao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机号',
  `xingbie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '性别',
  `nianling` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '年龄',
  `touxiang` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '头像',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `jiaoshigonghao`(`jiaoshigonghao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '教师' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of jiaoshi
-- ----------------------------
INSERT INTO `jiaoshi` VALUES (21, '2024-03-27 22:09:14', '10001', '赵莉', '123456', '15500000001', '女', '35', 'upload/jiaoshi_touxiang1.jpg');
INSERT INTO `jiaoshi` VALUES (22, '2024-03-27 22:09:14', '10002', '李四', '123456', '15500000002', '男', '36', 'upload/jiaoshi_touxiang2.jpg');
INSERT INTO `jiaoshi` VALUES (23, '2024-03-27 22:09:14', '10003', '王五', '123456', '15500000003', '女', '36', 'upload/jiaoshi_touxiang3.jpg');
INSERT INTO `jiaoshi` VALUES (24, '2024-03-27 22:09:14', '10004', '赵六', '123456', '15500000004', '女', '35', 'upload/jiaoshi_touxiang4.jpg');
INSERT INTO `jiaoshi` VALUES (25, '2024-03-27 22:09:14', '10005', '孙七', '123456', '15500000005', '男', '36', 'upload/jiaoshi_touxiang5.jpg');
INSERT INTO `jiaoshi` VALUES (26, '2024-03-27 22:09:14', '10006', '周八', '123456', '15500000006', '女', '36', 'upload/jiaoshi_touxiang6.jpg');

-- ----------------------------
-- Table structure for kechengleixing
-- ----------------------------
DROP TABLE IF EXISTS `kechengleixing`;
CREATE TABLE `kechengleixing`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kechengleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '课程类型',
  `image` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 53 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程类型' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of kechengleixing
-- ----------------------------
INSERT INTO `kechengleixing` VALUES (51, '2024-03-27 22:09:14', '理工类', '');
INSERT INTO `kechengleixing` VALUES (52, '2024-03-27 22:09:14', '文史类', '');

-- ----------------------------
-- Table structure for kechengxinxi
-- ----------------------------
DROP TABLE IF EXISTS `kechengxinxi`;
CREATE TABLE `kechengxinxi`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kechengbianhao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '课程编号',
  `kechengmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '课程名称',
  `kechengleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '课程类型',
  `kechengfengmian` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '课程封面',
  `banji` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '班级',
  `kechengshipin` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '课程视频',
  `kechengxiangqing` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '课程详情',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `jiaoshigonghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '教师工号',
  `jiaoshixingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '教师姓名',
  `clicktime` datetime(0) DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT 0 COMMENT '点击次数',
  `storeupnum` int(11) DEFAULT 0 COMMENT '收藏数',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `kechengbianhao`(`kechengbianhao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 67 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of kechengxinxi
-- ----------------------------
INSERT INTO `kechengxinxi` VALUES (61, '2024-03-27 22:09:14', '1111111111', '计算机组成原理', '理工类', 'upload/jsjzcyl.jpg', '班级1', '', '计算机组成原理', '2024-03-27', '10001', '赵莉', '2024-04-27 22:43:01', 8, 1);
INSERT INTO `kechengxinxi` VALUES (62, '2024-03-27 22:09:14', '2222222222', '数据结构', '理工类', 'upload/sjjg.jpg', '班级2', '', '数据结构', '2024-03-27', '10002', '李四', '2024-05-14 20:07:38', 10, 2);
INSERT INTO `kechengxinxi` VALUES (63, '2024-03-27 22:09:14', '3333333333', '计算机网络', '理工类', 'upload/jsjwl.jpg', '班级3', '', '计算机网络', '2024-03-27', '10003', '王五', '2024-04-26 17:37:49', 6, 3);
INSERT INTO `kechengxinxi` VALUES (64, '2024-03-27 22:09:14', '4444444444', '软件工程', '理工类', 'upload/rjgc.jpg', '班级4', '', '软件工程', '2024-03-27', '10004', '赵六', '2024-04-27 18:49:24', 6, 4);
INSERT INTO `kechengxinxi` VALUES (65, '2024-03-27 22:09:14', '5555555555', '软件测试', '理工类', 'upload/rjcs.jpg', '班级5', '', '软件测试', '2024-03-27', '10005', '孙七', '2024-04-26 17:32:10', 6, 5);
INSERT INTO `kechengxinxi` VALUES (66, '2024-03-27 22:09:14', '6666666666', '网络工程导论', '理工类', 'upload/wlgcdl.jpg', '班级6', '', '网络工程导论', '2024-03-27', '10006', '周八', '2024-04-27 22:41:45', 13, 6);

-- ----------------------------
-- Table structure for kechengziyuan
-- ----------------------------
DROP TABLE IF EXISTS `kechengziyuan`;
CREATE TABLE `kechengziyuan`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `ziyuanmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '资源名称',
  `ziyuanleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '资源类型',
  `ziyuantupian` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '资源图片',
  `ziyuanwenjian` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '资源文件',
  `ziyuanjieshao` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '资源介绍',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  `jiaoshigonghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师工号',
  `jiaoshixingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '教师姓名',
  `clicktime` datetime(0) DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT 0 COMMENT '点击次数',
  `storeupnum` int(11) DEFAULT 0 COMMENT '收藏数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程资源' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of kechengziyuan
-- ----------------------------
INSERT INTO `kechengziyuan` VALUES (41, '2024-03-27 22:09:14', '计算机组成原理', '课程资料', 'upload/jsjzcyl.jpg', 'upload/jsjzcyl.pdf', '<p>计算机组成原理样章</p>', '2024-03-27', '10001', '赵莉', '2024-05-09 16:59:06', 7, 1);
INSERT INTO `kechengziyuan` VALUES (42, '2024-03-27 22:09:14', '数据结构', '课程资料', 'upload/sjjg.jpg', 'upload/sjjg.txt', '<p>数据结构样章</p>', '2024-03-27', '10002', '李四', '2024-04-27 17:10:33', 3, 2);
INSERT INTO `kechengziyuan` VALUES (43, '2024-03-27 22:09:14', '计算机网络', '课程资料', 'upload/jsjwl.jpg', 'upload/jsjwl.pdf', '<p>计算机网络样章</p>', '2024-03-27', '10003', '王五', '2024-04-27 17:15:05', 4, 3);
INSERT INTO `kechengziyuan` VALUES (44, '2024-03-27 22:09:14', '软件工程', '课程资料', 'upload/rjgc.jpg', 'upload/rjgc.pdf', '<p>软件工程样章</p>', '2024-03-27', '10004', '赵六', '2024-04-27 18:16:11', 6, 4);
INSERT INTO `kechengziyuan` VALUES (45, '2024-03-27 22:09:14', '软件测试', '课程资料', 'upload/rjcs.jpg', 'upload/rjcs.txt', '<p>软件测试样章</p>', '2024-03-27', '10005', '孙七', '2024-04-27 17:17:49', 6, 5);
INSERT INTO `kechengziyuan` VALUES (46, '2024-03-27 22:09:14', '网络工程导论', '课程资料', 'upload/wlgcdl.jpg', 'upload/wlgcdl.doc', '<p>网络工程导论样章</p>', '2024-03-27', '10006', '周八', '2024-04-27 20:47:54', 13, 6);

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `introduction` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '简介',
  `typename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '分类名称',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '发布人',
  `headportrait` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '头像',
  `clicknum` int(11) DEFAULT 0 COMMENT '点击次数',
  `clicktime` datetime(0) DEFAULT NULL COMMENT '最近点击时间',
  `thumbsupnum` int(11) DEFAULT 0 COMMENT '赞',
  `crazilynum` int(11) DEFAULT 0 COMMENT '踩',
  `storeupnum` int(11) DEFAULT 0 COMMENT '收藏数',
  `picture` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图片',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 159 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '资讯公告' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (154, '2024-03-27 22:09:15', '在大学给自己定个目标', '最近和几名大一的学生聊天，几名同学认为身边的人普遍都很迷茫，不知道该干什么，业余时间要么是对着电脑、要么是抱着手机刷微博。我问道:“为什么不找点事情做做，制定一个计划，哪怕是锻炼身体也好?4年也可以把身体锻炼得结实些。”当然，我也清楚，我的这些建议对他们来说，未必能有多大用。许多学生因为意志不坚定，没有老师的监督、逼迫，根本就无法做到', '热门资讯', '赵莉', 'upload/news_headportrait4.jpg', 9, '2024-04-27 19:59:43', 4, 4, 4, 'upload/news_picture1.jpg', '<p>最近和几名大一的学生聊天，几名同学认为身边的人普遍都很迷茫，不知道该干什么，业余时间要么是对着电脑、要么是抱着手机刷微博。我问道:“为什么不找点事情做做，制定一个计划，哪怕是锻炼身体也好?4年也可以把身体锻炼得结实些。”当然，我也清楚，我的这些建议对他们来说，未必能有多大用。许多学生因为意志不坚定，没有老师的监督、逼迫，根本就无法做到。</p><p>这让我想到前段时间蹿红网络的“悔过励志帖”——《同学，我大四了》，作者回首自己的大学4年，他感叹投入精力“充其量不过40%”︰每天上网时间少则4个小时，多则10个小时;考试永远是画画重点，在高呼“60分万岁”中与奖学金无缘。作者借自己求职受挫，写帖子以警醒后来人，不要等毕业时再后悔，就业难不仅仅是大学、社会的问题，也是自身的问题。</p><p>也许，这样的大学生不是一个两个，而是一个群体。然而，我总是怀疑这样的励志帖，甚至教师在课堂上苦口婆心地劝说，能对现实中的大学和大学生起到多大的影响和作用，很多时候恐怕只有“三分钟热度”的效应。毕竟，现实的窘境不是一天积累起来的，从小学到高中，学生们的学习都是被动地接受应试，隐藏着功利性的目的，也许从没有为主动学习感到过快乐，而在高中时代，有的教师甚至打出这样的励志宣言:等你考上大学，你就可以想干什么干什么了..…..乎，高中时代的目标是很清晰的，就是为了考上大学，而在一些高中生的眼里，大学甚至就好比是天堂，进了大学的门就可以放轻松了。</p><p>此前，有很多声音都认为大学越来越像培训机构，功利性学习正在整个大学蔓延，考证热、过早地职业化都是大学功利性学习最好的表现形式。在这种批判的声音中，“培训机构”总有被贬低的意味，难与大学之学术思想殿堂的高雅相媲美。但是，在这种批判的背后，还有一个现实问题被遮蔽，那就是很多大学生对自己的学习、对大学生活没有任何目标。</p><p>暨南大学舆情研究中心曾就“当代广州大学生生活与思想现状”作过详细的问卷调查，其中，接受调查的广州高校在读本科生共有191份有效样本，就“读大学的原因”、“大学第一印象”、“专业选择首要因素”等问题制作问卷调查并进行分析。结果显示，在未来规划方面，73.3%的同学表示只有粗略的想法，并无非常明确的目标。</p><p>如果说功利化的学习毕竟还有一个前进的目标，至少能体现出一种为了目标而奋斗的精神和奔头，而没有任何目标，漫无目的地混日子则更可怕，它体现的是一种虚无、意义的缺失。说实话，没有引导学生树立明确的奋斗目标、进而指引学生为之努力的大学，学生很难找到努力的方向，也找不到努力的意义，这还不如“培训机构”来得实在、来得有效用，至少，培训机构的目标很清晰，它能够给学生们一个实实在在看得见的效果，而没有任何目标、浑浑噩噩的大学生活，也许只会给很多学生带来悔过。</p><p>无论如何，混日子的大学生活是不可取的。一方面，高校应该在新生入学的时候，作好目标和方向的引导，甚至贯穿大学4年的学习过程;另一方面，还在迷途的大学生，应尽早为自己找个前进的方向，作好自我规划，对自己的未来和前途负责。</p>');
INSERT INTO `news` VALUES (158, '2024-03-27 22:09:15', '有了梦想就不会感到疲惫', '一段时间以前，一位在港的大陆学生，因为学业的压力、前途的渺茫等诸多原因，选择了自杀。在讨论和反思的潮流中，有一位毕业生在校内网匿名发表了自己的故事。他说，自己当年在学校也曾经面临绝境，一文不名。他选择了做“乞丐学生”，坚持着念完了课程。回忆的一些情节让我印象深刻，比如，平时偷偷住电梯间，蓬头垢面如乞丐;实在很饿，学校举办餐会的时候默默进场埋头大吃', '热门资讯', '李四', 'upload/news_headportrait8.jpg', 17, '2024-04-27 20:00:52', 8, 8, 8, 'upload/news_picture2.jpg', '<p>一段时间以前，一位在港的大陆学生，因为学业的压力、前途的渺茫等诸多原因，选择了自杀。在讨论和反思的潮流中，有一位毕业生在校内网匿名发表了自己的故事。他说，自己当年在学校也曾经面临绝境，一文不名。他选择了做“乞丐学生”，坚持着念完了课程。回忆的一些情节让我印象深刻，比如，平时偷偷住电梯间，蓬头垢面如乞丐;实在很饿，学校举办餐会的时候默默进场埋头大吃。</p><p>“峣峣者易折，皎皎者易污。”能够从内地高校到香港读书的学子，都是一些很优秀的年轻人。不知道曾经高居象牙塔的书生，怎样狠下心，咬牙面对那一个天渊般的落差，以及旁人的目光和议论。</p><p>说到这里，很像一个《读者》式的励志故事。但是这种励志故事从来就不缺乏感动人的力量，因为虽然光明的尾巴不是人人都能够拥有，但是人人都有梦想，面对实现过程中的困难，其奋斗或者说挣扎，却常常和平凡如你我的人们相遇。</p><p>《当幸福来敲门/The Pursuit of Happyness》就是这样偶然被看到，又感动了我的电影。黑人克里斯是一名普普通通的医疗器械推销员，妻子忍受不了经济上的压力离开了他，留下5岁的儿子克里斯托夫和他相依为命。克里斯银行账户里只剩下21块钱，因为没钱付房租，他和儿子被撵出了公寓。费尽周折，克里斯赢得了在一家着名股票投资公司实习的机会，但是实习期间没有薪水，而且最终只有一人可以成功进入公司。</p><p>学妹曾经告诉我一个故事，让我每次想到都觉得莫名恐怖。她说，她硕士毕业去广东求职，一个中学要招几个老师，结果南来北往的硕士博士挤了快有一个礼堂。可想而知，竞争有多么残酷。看来，中外求职者都面临着同样的挑战。但是克里斯和许多“80后”的大学毕业生不同，他更加坚韧:为了节省时间，上班时候不喝水，以避免上厕所。以疯狂的速度给客户打电话，打完一个，直接按挂机键就拨下一个电话。白天，克里斯忍受着一次又一次被拒绝的失望，带着微笑在公司和客户之间穿梭。回家，则要带着儿子穿过污秽的街道，忍受房东的咆哮。</p><p>终于，交不起房租的父子俩流落街头。克里斯和儿子在午夜地铁里相对无言，儿子不能理解为什么不能回家住，爸爸却开始玩游戏:“我们通过时光机，到达古代了!”儿子立刻兴奋地配合起来，环顾左右。父子俩在“恐龙”的追杀下，逃到了一个“山洞”里，“山洞”是什么呢，其实是一间男厕所。克里斯搂着熟睡的儿子，坐靠在厕所的墙面。午夜的灯光很惨白，这个消瘦的、营养不良的父亲，默默地流下了泪水。</p><p>父子俩依旧为了幸福到来而努力。他们开始住收容所，面对有限的床位，这个奔跑起来像猎豹一样的人，有时候得把草原上的爆发力运用到打架上面来。儿子在简陋的收容所床上睡着了，父亲还在埋头修理推销的医疗器械，或者翻那本厚厚的笔试全书。</p><p>钱包磨损得厉害，而且，太瘪了，每张钱都很熟悉。老板要借5块钱，犹豫再三，摩挚着纸币，最终还是把钱送了出去。卖血。鲜血在塑料袋里面渗开，那是一个男人所能奉献的最后。拿着卖血的钱，克里斯仍然去买电子元件。一点点的希望，都要去坚持。</p><p>对于父母，最心酸的事儿是什么呢?就是子女的一点可怜的愿望得不到满足。克里斯托夫的惟一的玩偶“美国英雄”，在一次挤车的过程中掉到了地上。5岁的男孩悲伤欲绝，克里斯坚硬的表情下，读出的是面对困难的凶狠和惨痛。但是，无论多么深切的无望，都没有摧毁父子间的亲情与他们的信念，他们相信幸福总会落到自己的身上。“你是个好爸爸”，克里斯托夫跟着爸爸四处流浪，可是孩子的心灵，衡量的砝码和天使是—样的。</p><p>克里斯最终成为了投资公司的员工，看似冷漠的白人老板们，此时显出他们的些微温情。他忍住了泪水，颤抖着拿起自己的物品，走入了茫茫人海。在熙熙攘攘的人群中间，克里斯举起手，为自己鼓掌，那无声的，一下下重重的掌声，是在为自己喝彩。其实，克里斯托夫的“美国英雄”并没有失落。</p><p>这是一个非常典型的“美国梦”:一个人通过自己的努力，可以实现自己的梦想，幸福，会来敲门。很多人往往会关注对于梦想的树立，而往往忽略过程的艰辛。特别是，当面对一个看似无望的现实的时候，有多少人会坚持，多少人会放弃呢?生活总是在不断地修正，并且提醒我们，顺应大潮的人总是较有可能抵达成功的彼岸。可是，确实是有些人，愿意逆流而上。我相信，这是导演对于逆行者的一点鼓励。</p><p>那个香港的匿名毕业生后来博士毕业，找到了一份不错的工作，有了漂亮的妻子和可爱的孩子。这个强人在帖子里说，有什么坚持不下来的呢?只要有梦想</p>');

-- ----------------------------
-- Table structure for newstype
-- ----------------------------
DROP TABLE IF EXISTS `newstype`;
CREATE TABLE `newstype`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `typename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分类名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 142 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '资讯公告分类' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of newstype
-- ----------------------------
INSERT INTO `newstype` VALUES (141, '2024-03-27 22:09:15', '热门资讯');

-- ----------------------------
-- Table structure for storeup
-- ----------------------------
DROP TABLE IF EXISTS `storeup`;
CREATE TABLE `storeup`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '表名',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `picture` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片',
  `type` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '1' COMMENT '类型',
  `inteltype` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '收藏表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for systemintro
-- ----------------------------
DROP TABLE IF EXISTS `systemintro`;
CREATE TABLE `systemintro`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `subtitle` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '副标题',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容',
  `picture1` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片1',
  `picture2` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片2',
  `picture3` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片3',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统简介' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of systemintro
-- ----------------------------
INSERT INTO `systemintro` VALUES (1, '2024-03-27 22:09:15', '系统简介', 'SYSTEM INTRODUCTION', '在平静的海平面上，每个人都可以成为领航员。但如果只有阳光而没有阴影，只有欢乐而没有痛苦，那就不是完整的人生。就拿最幸福的人来说吧——他的幸福是一团纠结的纱线。痛苦和幸福轮番而至，让我们悲喜交集，甚至死亡都让人生更加可爱。人在生命的严肃时刻，在悲伤与丧亲的阴影下，才最接近真实的自我。在生活和事业的各个方面，才智的功能远不如性格，头脑的功能远不如心性，天分远不如自制力、毅力与教养。我始终认为内心开始过严肃生活的人，他外在的生活会开始变得更为俭朴。在一个奢侈浪费的年代，但愿我能让世人了解：人类真正的需求是多么的稀少。不重蹈覆辙才是真正的醒悟。比别人优秀并无任何高贵之处，真正的高贵在于超越从前的自我。', 'upload/systemintro_picture1.jpg', 'upload/systemintro_picture2.jpg', 'upload/systemintro_picture3.jpg');

-- ----------------------------
-- Table structure for tijiaozuoye
-- ----------------------------
DROP TABLE IF EXISTS `tijiaozuoye`;
CREATE TABLE `tijiaozuoye`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kechengmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '课程名称',
  `kechengfengmian` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '课程封面',
  `tijiaoshijian` datetime(0) DEFAULT NULL COMMENT '提交时间',
  `banji` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '班级',
  `zuoyemingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '作业名称',
  `zuoyeneirong` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '作业内容',
  `jiaoshigonghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '教师工号',
  `jiaoshixingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '教师姓名',
  `xueshengzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学生账号',
  `xueshengxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学生姓名',
  `sfsh` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '审核回复',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 99 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '提交作业' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tijiaozuoye
-- ----------------------------
INSERT INTO `tijiaozuoye` VALUES (92, '2024-03-27 22:09:14', '计算机组成原理', 'upload/jsjzcyl.jpg', '2024-03-27 22:09:14', '班级1', '课后作业', '', '10001', '赵莉', '20201001', '吕俊豪', '是', '');
INSERT INTO `tijiaozuoye` VALUES (93, '2024-03-27 22:09:14', '数据结构', 'upload/sjjg.jpg', '2024-03-27 22:09:14', '班级2', '课后作业', '', '10002', '李四', '20201002', '张金彪', '是', '');
INSERT INTO `tijiaozuoye` VALUES (94, '2024-03-27 22:09:14', '计算机网络', 'upload/jsjwl.jpg', '2024-03-27 22:09:14', '班级3', '课后作业', '', '10003', '王五', '20201003', '张光宇', '是', '');
INSERT INTO `tijiaozuoye` VALUES (95, '2024-03-27 22:09:14', '软件工程', 'upload/rjgc.jpg', '2024-03-27 22:09:14', '班级4', '课后作业', '', '10004', '赵六', '20201004', '夏俊岭', '是', '');
INSERT INTO `tijiaozuoye` VALUES (96, '2024-03-27 22:09:14', '软件测试', 'upload/rjcs.jpg', '2024-03-27 22:09:14', '班级5', '课后作业', '', '10005', '孙七', '20201005', '周浩', '是', '');
INSERT INTO `tijiaozuoye` VALUES (98, '2024-04-27 23:04:08', '网络工程导论', 'upload/wlgcdl.jpg', '2024-04-27 23:04:05', '班级6', '课后作业', '', '10006', '周八', '20201006', '干英豪', '待审核', '');

-- ----------------------------
-- Table structure for token
-- ----------------------------
DROP TABLE IF EXISTS `token`;
CREATE TABLE `token`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `tablename` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '表名',
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色',
  `token` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'token表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of token
-- ----------------------------
INSERT INTO `token` VALUES (1, 1, 'admin', 'users', '管理员', '4wi0hregeuw2tj9mca49wxprfxzri3cx', '2024-04-26 16:49:11', '2024-05-14 15:34:35');
INSERT INTO `token` VALUES (2, 21, '10001', 'jiaoshi', '教师', 'pjldsedeovk5j8j6cl7henn43wgqqg6w', '2024-04-26 17:09:36', '2024-05-14 21:24:45');
INSERT INTO `token` VALUES (3, 11, '20201001', 'xuesheng', '学生', '2ql0xiticgh5v2z5z996j8l5f2m8q612', '2024-04-26 17:35:51', '2024-05-14 21:06:19');
INSERT INTO `token` VALUES (4, 25, '10005', 'jiaoshi', '教师', 'q52tbqq1twsraix4e3nyaglmd3j8sght', '2024-04-27 18:08:43', '2024-04-27 19:08:44');
INSERT INTO `token` VALUES (5, 12, '20201002', 'xuesheng', '学生', 'q1yb2hdh1eq4myrcflw8rv96yggkz2bl', '2024-05-14 20:05:20', '2024-05-14 21:05:21');
INSERT INTO `token` VALUES (6, 13, '20201003', 'xuesheng', '学生', 'zlgiv71mfubbb6pre95ayksos767hwjy', '2024-05-14 20:06:49', '2024-05-14 21:06:50');
INSERT INTO `token` VALUES (7, 16, '20201006', 'xuesheng', '学生', 'nvs4p61ndf2g0hgv8a0aukreo2yjdsrc', '2024-05-14 20:07:26', '2024-05-14 21:07:26');
INSERT INTO `token` VALUES (8, 22, '10002', 'jiaoshi', '教师', 'sa3318f4xjmmwc5l2jz9judvd3dhc5vq', '2024-05-14 20:08:10', '2024-05-14 21:08:11');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `image` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '头像',
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'admin', 'admin', 'upload/image1.jpg', '管理员', '2024-03-27 22:09:15');

-- ----------------------------
-- Table structure for xuesheng
-- ----------------------------
DROP TABLE IF EXISTS `xuesheng`;
CREATE TABLE `xuesheng`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueshengzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生账号',
  `xueshengxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生姓名',
  `mima` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `banji` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '班级',
  `shoujihao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机号',
  `xingbie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '性别',
  `nianling` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '年龄',
  `touxiang` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '头像',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `xueshengzhanghao`(`xueshengzhanghao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xuesheng
-- ----------------------------
INSERT INTO `xuesheng` VALUES (11, '2024-03-27 22:09:14', '20201001', '吕俊豪', '123456', '班级1', '15600000001', '男', '22', 'upload/xuesheng_touxiang1.jpg');
INSERT INTO `xuesheng` VALUES (12, '2024-03-27 22:09:14', '20201002', '张金彪', '123456', '班级2', '15600000002', '男', '22', 'upload/xuesheng_touxiang2.jpg');
INSERT INTO `xuesheng` VALUES (13, '2024-03-27 22:09:14', '20201003', '张光宇', '123456', '班级3', '15600000003', '男', '19', 'upload/xuesheng_touxiang3.jpg');
INSERT INTO `xuesheng` VALUES (14, '2024-03-27 22:09:14', '20201004', '夏俊岭', '123456', '班级4', '15600000004', '男', '22', 'upload/xuesheng_touxiang4.jpg');
INSERT INTO `xuesheng` VALUES (15, '2024-03-27 22:09:14', '20201005', '周浩', '123456', '班级5', '15600000005', '男', '21', 'upload/xuesheng_touxiang5.jpg');
INSERT INTO `xuesheng` VALUES (16, '2024-03-27 22:09:14', '20201006', '干英豪', '123456', '班级6', '15600000006', '男', '22', 'upload/xuesheng_touxiang6.jpg');

-- ----------------------------
-- Table structure for xueshengxuanke
-- ----------------------------
DROP TABLE IF EXISTS `xueshengxuanke`;
CREATE TABLE `xueshengxuanke`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kechengmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '课程名称',
  `kechengleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '课程类型',
  `kechengfengmian` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '课程封面',
  `banji` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '班级',
  `xuankeshijian` datetime(0) DEFAULT NULL COMMENT '选课时间',
  `jiaoshigonghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '教师工号',
  `jiaoshixingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '教师姓名',
  `xueshengzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学生账号',
  `xueshengxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学生姓名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 85 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生选课' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xueshengxuanke
-- ----------------------------
INSERT INTO `xueshengxuanke` VALUES (73, '2024-03-27 22:09:14', '计算机组成原理', '理工类', 'upload/jsjzcyl.jpg', '班级1', '2024-03-27 22:09:14', '10001', '赵莉', '20201001', '吕俊豪');
INSERT INTO `xueshengxuanke` VALUES (74, '2024-03-27 22:09:14', '数据结构', '理工类', 'upload/sjjg.jpg', '班级2', '2024-03-27 22:09:14', '10002', '李四', '20201002', '张金彪');
INSERT INTO `xueshengxuanke` VALUES (75, '2024-03-27 22:09:14', '计算机网络', '理工类', 'upload/jsjwl.jpg', '班级3', '2024-03-27 22:09:14', '10003', '王五', '20201003', '张光宇');
INSERT INTO `xueshengxuanke` VALUES (76, '2024-03-27 22:09:14', '软件工程', '理工类', 'upload/rjgc.jpg', '班级4', '2024-03-27 22:09:14', '10004', '赵六', '20201004', '夏俊岭');
INSERT INTO `xueshengxuanke` VALUES (79, '2024-04-26 17:37:47', '软件测试', '理工类', 'upload/rjcs.jpg', '班级5', '2024-04-26 17:37:45', '10005', '孙七', '20201005', '周浩');
INSERT INTO `xueshengxuanke` VALUES (81, '2024-04-27 22:42:59', '网络工程导论', '理工类', 'upload/wlgcdl.jpg', '班级6', '2024-04-27 22:42:56', '10006', '周八', '20201006', '干英豪');
INSERT INTO `xueshengxuanke` VALUES (82, '2024-05-14 20:06:32', '计算机组成原理', '理工类', 'upload/jsjzcyl.jpg', '班级1', '2024-05-14 20:06:25', '10001', '赵莉', '20201002', '张金彪');
INSERT INTO `xueshengxuanke` VALUES (83, '2024-05-14 20:06:58', '计算机组成原理', '理工类', 'upload/jsjzcyl.jpg', '班级1', '2024-05-14 20:06:56', '10001', '赵莉', '20201003', '张光宇');
INSERT INTO `xueshengxuanke` VALUES (84, '2024-05-14 20:07:36', '计算机组成原理', '理工类', 'upload/jsjzcyl.jpg', '班级1', '2024-05-14 20:07:34', '10001', '赵莉', '20201006', '干英豪');

-- ----------------------------
-- Table structure for ziyuanleixing
-- ----------------------------
DROP TABLE IF EXISTS `ziyuanleixing`;
CREATE TABLE `ziyuanleixing`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `ziyuanleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '资源类型',
  `image` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '资源类型' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ziyuanleixing
-- ----------------------------
INSERT INTO `ziyuanleixing` VALUES (31, '2024-03-27 22:09:14', '视频课程', 'upload/shipinkecheng.jpg');
INSERT INTO `ziyuanleixing` VALUES (32, '2024-03-27 22:09:14', '课程资料', 'upload/kechengziliao.jpg');

-- ----------------------------
-- Table structure for zuoyepingfen
-- ----------------------------
DROP TABLE IF EXISTS `zuoyepingfen`;
CREATE TABLE `zuoyepingfen`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kechengmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '课程名称',
  `kechengfengmian` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '课程封面',
  `pingfenshijian` datetime(0) DEFAULT NULL COMMENT '评分时间',
  `banji` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '班级',
  `zuoyemingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '作业名称',
  `chengji` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '成绩',
  `pingfenjieguo` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '评分结果',
  `jiaoshigonghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '教师工号',
  `jiaoshixingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '教师姓名',
  `xueshengzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学生账号',
  `xueshengxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学生姓名',
  `pingfenneirong` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '评分内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 107 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '作业评分' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of zuoyepingfen
-- ----------------------------
INSERT INTO `zuoyepingfen` VALUES (101, '2024-03-27 22:09:14', '计算机组成原理', 'upload/jsjzcyl.jpg', '2024-03-27 22:09:14', '班级1', '课后作业', '成绩1', 'A', '10001', '赵莉', '20201001', '吕俊豪', '优');
INSERT INTO `zuoyepingfen` VALUES (102, '2024-03-27 22:09:14', '数据结构', 'upload/sjjg.jpg', '2024-03-27 22:09:14', '班级2', '课后作业', '成绩2', 'A', '10002', '李四', '20201002', '张金彪', '优');
INSERT INTO `zuoyepingfen` VALUES (103, '2024-03-27 22:09:14', '计算机网络', 'upload/jsjwl.jpg', '2024-03-27 22:09:14', '班级3', '课后作业', '成绩3', 'A', '10003', '王五', '20201003', '张光宇', '优');
INSERT INTO `zuoyepingfen` VALUES (104, '2024-03-27 22:09:14', '软件工程', 'upload/rjgc.jpg', '2024-03-27 22:09:14', '班级4', '课后作业', '成绩4', 'A', '10004', '赵六', '20201004', '夏俊岭', '优');
INSERT INTO `zuoyepingfen` VALUES (105, '2024-03-27 22:09:14', '软件测试', 'upload/rjcs.jpg', '2024-03-27 22:09:14', '班级5', '课后作业', '成绩5', 'A', '10005', '孙七', '20201005', '周浩', '优');
INSERT INTO `zuoyepingfen` VALUES (106, '2024-03-27 22:09:14', '网络工程导论', 'upload/wlgcdl.jpg', '2024-03-27 22:09:14', '班级6', '课后作业', '成绩6', 'A', '10006', '周八', '20201006', '干英豪', '优');

SET FOREIGN_KEY_CHECKS = 1;
