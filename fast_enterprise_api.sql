/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : fast_enterprise_api

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2019-03-15 16:59:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for fea_enterprise
-- ----------------------------
DROP TABLE IF EXISTS `fea_enterprise`;
CREATE TABLE `fea_enterprise` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fea_enterprise
-- ----------------------------
INSERT INTO `fea_enterprise` VALUES ('1', '阿里巴巴集团', '2019-03-15 15:51:03', '2019-03-15 15:51:06');
INSERT INTO `fea_enterprise` VALUES ('2', '腾讯', '2019-03-15 16:53:32', '2019-03-15 16:53:34');
SET FOREIGN_KEY_CHECKS=1;
