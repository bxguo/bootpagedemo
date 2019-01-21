/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50527
Source Host           : 127.0.0.1:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2019-01-21 09:39:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `province_id` bigint(20) DEFAULT NULL,
  `city_name` varchar(20) DEFAULT NULL,
  `description` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES ('1', '111', '深圳', '鹏城');
INSERT INTO `city` VALUES ('2', '222', '珠江', '巴拉巴拉');
INSERT INTO `city` VALUES ('3', '3', '广州', '羊城');
