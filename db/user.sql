/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : 127.0.0.1:3306
 Source Schema         : test2

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 18/02/2019 17:44:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;



-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `nickname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户昵称',
  `avatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `status` int(11) NOT NULL DEFAULT 0 COMMENT '账号状态状态，status, condition, mode, position, state of affairs, fettle',
  `create_date` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '1', 1, '2018-03-01 16:00:04', '2018-03-01 16:00:11');
INSERT INTO `user` VALUES (2, 'test', '2', 1, '2018-03-01 16:01:00', '2018-03-07 16:01:05');
INSERT INTO `user` VALUES (5, '毛熊', '3', 1, '2018-03-20 09:38:48', '2019-02-20 11:18:52');
INSERT INTO `user` VALUES (7, '高丽', '4', 1, '2018-03-20 09:43:53', '2019-02-18 11:19:00');
INSERT INTO `user` VALUES (13, '二毛', '5', 1, '2018-03-22 10:14:13', '2019-02-18 11:19:00');
INSERT INTO `user` VALUES (14, '长颈鹿', '6', 1, '2018-03-22 21:13:04', '2019-02-18 11:18:57');
INSERT INTO `user` VALUES (15, '狮子', '7', 1, '2018-03-22 21:19:47', '2019-02-18 11:19:00');
INSERT INTO `user` VALUES (16, '老鼠', '7', 1, '2018-03-22 21:24:48', '2019-02-18 11:19:00');
INSERT INTO `user` VALUES (17, '山鸡', '8', 1, '2018-03-22 21:25:55', NULL);

SET FOREIGN_KEY_CHECKS = 1;
