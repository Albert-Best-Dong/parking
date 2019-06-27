/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : car_park

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 26/06/2019 10:23:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bill
-- ----------------------------
DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill`  (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `pay_type` int(3) NULL DEFAULT NULL COMMENT '付款方式',
  `operator` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作者',
  `park_info_id` int(32) NULL DEFAULT NULL COMMENT '停车信息',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL,
  `UPDATE_TIME` datetime(0) NULL DEFAULT NULL,
  `CREATE_BY` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `UPDATE_BY` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `park_info_id`(`park_info_id`) USING BTREE,
  CONSTRAINT `bill_ibfk_1` FOREIGN KEY (`park_info_id`) REFERENCES `park_info` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bill
-- ----------------------------
INSERT INTO `bill` VALUES (19, 2, 'admin', 42, NULL, NULL, NULL, NULL);
INSERT INTO `bill` VALUES (20, 2, 'admin', 43, NULL, NULL, NULL, NULL);
INSERT INTO `bill` VALUES (21, 2, 'admin', 44, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for park_info
-- ----------------------------
DROP TABLE IF EXISTS `park_info`;
CREATE TABLE `park_info`  (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '停车信息id',
  `card_id` int(20) NULL DEFAULT NULL COMMENT '卡号',
  `park_in` datetime(0) NULL DEFAULT NULL COMMENT '停车时间',
  `park_out` datetime(0) NULL DEFAULT NULL COMMENT '取车时间',
  `car_id` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车牌号',
  `fee` double(255, 0) NULL DEFAULT NULL COMMENT '停车费',
  `status` int(1) NULL DEFAULT NULL COMMENT '停车状态 0正在停 1离开',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL,
  `UPDATE_TIME` datetime(0) NULL DEFAULT NULL,
  `CREATE_BY` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `UPDATE_BY` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `park_space_id` int(32) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `park_space_id`(`park_space_id`) USING BTREE,
  CONSTRAINT `park_info_ibfk_1` FOREIGN KEY (`park_space_id`) REFERENCES `park_space` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 45 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of park_info
-- ----------------------------
INSERT INTO `park_info` VALUES (7, 0, '2019-06-05 21:14:49', '2019-06-05 21:44:05', '陕A88888', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (8, 0, '2019-06-05 21:45:50', '2019-06-05 21:46:15', '陕A99999', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (9, 0, '2019-06-05 21:50:10', '2019-06-05 23:07:11', '苏J12345', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (10, 0, '2019-06-05 23:10:54', '2019-06-05 23:56:14', '陕A88888', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (12, 0, '2019-06-05 23:58:24', '2019-06-05 23:59:20', '川A1K181', 5, 1, NULL, NULL, NULL, NULL, 13);
INSERT INTO `park_info` VALUES (13, 6, '2019-06-06 10:46:44', '2019-06-06 11:38:13', '陕A88888', 5, 1, NULL, NULL, NULL, NULL, 14);
INSERT INTO `park_info` VALUES (14, 11, '2019-06-06 14:39:18', '2019-06-06 14:58:10', 'test', 5, 1, NULL, NULL, NULL, NULL, 15);
INSERT INTO `park_info` VALUES (15, 1, '2019-06-19 20:20:24', '2019-06-19 20:20:52', '陕A88888', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (16, 12, '2019-06-19 20:22:12', '2019-06-19 20:22:21', '苏J12345', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (20, 5, '2019-06-19 20:40:14', '2019-06-19 20:40:21', 'sss', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (21, 5, '2019-06-19 20:51:33', '2019-06-19 20:51:43', '陕A88888', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (22, 2, '2019-06-19 20:55:10', '2019-06-19 20:55:37', '陕A88888', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (23, 12, '2019-06-19 21:05:30', '2019-06-19 21:05:36', 'sss', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (24, 1, '2019-06-19 21:10:50', '2019-06-19 21:10:59', '陕A88888', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (25, 2, '2019-06-19 21:14:24', '2019-06-19 21:14:31', '苏J12345', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (26, 7, '2019-06-19 21:17:40', '2019-06-19 21:17:52', '陕A88888', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (27, 2, '2019-06-19 21:24:44', '2019-06-19 21:24:52', '陕A88888', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (28, 3, '2019-06-19 21:29:52', '2019-06-19 21:29:59', 'fff', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (29, 5, '2019-06-19 21:45:40', '2019-06-19 21:45:48', 'ggg', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (30, 2, '2019-06-19 21:47:58', '2019-06-19 21:48:06', 'ggg', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (31, 12, '2019-06-19 21:51:05', '2019-06-19 21:51:13', '陕A99999', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (32, 5, '2019-06-19 21:56:07', '2019-06-19 21:56:13', 'fff', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (33, 1, '2019-06-19 21:59:34', '2019-06-19 21:59:41', '苏J12345', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (34, 99, '2019-06-19 22:00:56', '2019-06-19 22:01:15', '陕B88888', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (35, 80, '2019-06-19 22:04:31', '2019-06-19 22:04:46', '陕B88888', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (36, 3, '2019-06-19 22:06:48', '2019-06-19 22:07:07', '陕C66666', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (37, 12, '2019-06-19 23:11:13', '2019-06-19 23:12:46', '苏J12345', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (38, 5, '2019-06-19 23:15:13', '2019-06-19 23:15:19', '陕A88888', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (39, 12, '2019-06-19 23:18:16', '2019-06-19 23:18:22', 'fff', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (40, 2, '2019-06-19 23:20:54', '2019-06-19 23:21:02', 'fff', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (41, 2, '2019-06-19 23:24:44', '2019-06-19 23:24:55', '陕A88888', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (42, 1, '2019-06-19 23:33:34', '2019-06-19 23:39:06', '陕A88888', 5, 1, NULL, NULL, NULL, NULL, 13);
INSERT INTO `park_info` VALUES (43, 2, '2019-06-19 23:33:49', '2019-06-20 00:08:49', '苏J12345', 5, 1, NULL, NULL, NULL, NULL, 12);
INSERT INTO `park_info` VALUES (44, 45, '2019-06-20 00:07:17', '2019-06-22 14:01:31', '川AVR980', 123, 1, NULL, NULL, NULL, NULL, 16);

-- ----------------------------
-- Table structure for park_space
-- ----------------------------
DROP TABLE IF EXISTS `park_space`;
CREATE TABLE `park_space`  (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `floor` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车位所属楼层',
  `area` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属区域',
  `space_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车位号',
  `status` int(3) NULL DEFAULT NULL COMMENT '车位状态：0可使用 1占用 2被预定',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL,
  `UPDATE_TIME` datetime(0) NULL DEFAULT NULL,
  `CREATE_BY` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `UPDATE_BY` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of park_space
-- ----------------------------
INSERT INTO `park_space` VALUES (12, '-1F ', 'A', '1', 0, NULL, NULL, NULL, NULL);
INSERT INTO `park_space` VALUES (13, '-1F ', 'A', '2', 0, NULL, NULL, NULL, NULL);
INSERT INTO `park_space` VALUES (14, '-1F ', 'B', '1', 0, NULL, NULL, NULL, NULL);
INSERT INTO `park_space` VALUES (15, '-1F ', 'B', '2', 0, NULL, NULL, NULL, NULL);
INSERT INTO `park_space` VALUES (16, '-1F ', 'C', '1', 0, NULL, NULL, NULL, NULL);
INSERT INTO `park_space` VALUES (17, '-1F ', 'C', '2', 0, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `sn` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键id',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `gender` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `age` int(3) NULL DEFAULT NULL COMMENT '年龄',
  `birthday` datetime(0) NULL DEFAULT NULL COMMENT '出生年月',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  PRIMARY KEY (`sn`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('admin', '董', 'admin', NULL, 0, NULL, NULL, NULL);
INSERT INTO `user` VALUES ('lisi', '李四', '000000', '男', 18, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
