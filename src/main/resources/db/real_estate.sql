/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.18-log : Database - real_estate
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`real_estate` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `real_estate`;

/*Table structure for table `blog_comment` */

DROP TABLE IF EXISTS `blog_comment`;

CREATE TABLE `blog_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  `email` varchar(255) COLLATE utf8_bin NOT NULL,
  `comment` text COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `blog_comment` */

insert  into `blog_comment`(`id`,`name`,`email`,`comment`) values (1,'dgf','dfdfgd@fdgdfg','dfgdf');

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `category` */

insert  into `category`(`id`,`name`) values (1,'fgd'),(2,'sdfsdfs'),(3,'dsfsdf'),(4,'dfgdfgdfgdgdgdgdfdgdfgdfgdfgdfgdfgdfgdfgdfgdfgddg'),(5,'rttrfyrtyrty');

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `city` */

insert  into `city`(`id`,`name`) values (1,'gfdgdfgdfg'),(2,'zzz');

/*Table structure for table `contact` */

DROP TABLE IF EXISTS `contact`;

CREATE TABLE `contact` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  `email` varchar(255) COLLATE utf8_bin NOT NULL,
  `subject` varchar(255) COLLATE utf8_bin NOT NULL,
  `message` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `contact` */

insert  into `contact`(`id`,`name`,`email`,`subject`,`message`) values (1,'dfgd','dfgdf@fdgd','dfgdfg','dgdfgdfgdf'),(2,'dfgddfgdfgdf','dfgdf@fdgdgdfg','dfgdfgdfgdf','dgdfgdfgdffdgdfgdfgdf'),(3,'fgdfssssssssss','gdfg@fdgdf','dfgdf','dfgdgdfgdfgdfgdfgdf'),(4,'hfgh','gfhfg@fdgd','gdfdf','dfgdfgdfgdfggdfg');

/*Table structure for table `listing` */

DROP TABLE IF EXISTS `listing`;

CREATE TABLE `listing` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `company` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `country` varchar(255) COLLATE utf8_bin NOT NULL,
  `description` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_bin NOT NULL,
  `facebook_link` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `google_plus` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `keyword` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `linked_in` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `location_address` varchar(255) COLLATE utf8_bin NOT NULL,
  `owner_designation` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `owner_name` varchar(255) COLLATE utf8_bin NOT NULL,
  `phone` bigint(20) NOT NULL,
  `pic_url` varchar(255) COLLATE utf8_bin NOT NULL,
  `temporary_address` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `title` varchar(255) COLLATE utf8_bin NOT NULL,
  `twitter_user` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `website` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `zip_code` int(11) NOT NULL,
  `category_id` int(11) NOT NULL,
  `listing_city_id` int(11) NOT NULL,
  `listing_state_id` int(11) NOT NULL,
  `website2` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKihh4sybr84ylwhn05uol8o8dh` (`category_id`),
  KEY `FK2e55xya31422d9u9guhjr1he6` (`listing_city_id`),
  KEY `FKlpokgn75l7tug393jyvogm0ls` (`listing_state_id`),
  CONSTRAINT `FK2e55xya31422d9u9guhjr1he6` FOREIGN KEY (`listing_city_id`) REFERENCES `city` (`id`),
  CONSTRAINT `FKihh4sybr84ylwhn05uol8o8dh` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`),
  CONSTRAINT `FKlpokgn75l7tug393jyvogm0ls` FOREIGN KEY (`listing_state_id`) REFERENCES `state` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `listing` */

insert  into `listing`(`id`,`company`,`country`,`description`,`email`,`facebook_link`,`google_plus`,`keyword`,`linked_in`,`location_address`,`owner_designation`,`owner_name`,`phone`,`pic_url`,`temporary_address`,`title`,`twitter_user`,`website`,`zip_code`,`category_id`,`listing_city_id`,`listing_state_id`,`website2`) values (10,'dfgdf','fghfg','dfgdfgdgdghjgsdfuystgytdfyusduyfsdkufysdftgsduifhysfgusdgfyusdtfsdgfyugsdyufgsdyufsduyfsdfuysdfusdgfuysdyfusdtfuysduyftsduifhguysdfyuisdfuysdyfuysdtfuysduyftsdufgyusdfyuisydtf','gfhfgh@fdgdf','fgdfg','gdfg','fghfg','','hfg','dgdfg','gfhfgh',45454544444,'1535795130467_listing-thumb-3.jpg','fghfg','fghfgh','dfgdfg','fhfg',4454,3,1,3,'tytdfgdf'),(12,'fghfghf','fdgdf','fghfghfhsdsfgdfsdgagyuGgtFGugdfg855ghfghfgdgdf dsddf   dfgdfgdf df     dfgd 8558 f sdfgdfg','hfg@fdgdfg','gfhfghfg','fghfgh','dfgdf','fghfg','fgdfg','ghfghfg','gfhfg',454545454,'1535795550562_listing-thumb-1.jpg','dfgdf','dfgdfg','hfg','dfgdf',4544,2,1,1,'fghfgh'),(13,'yrt','gfhfg','tryrtyrtyrtyryrtyrtyrtrtrtryrtyrtyrtyryrtyrtyrtrtrtryrtyrtyrtyryrtyrtyrtrtrtryrtyrtyrtyryrtyrtyrtrtrtryrtyrtyrtyryrtyrtyrtrtr','dfgdfg@dgdfg','rtyrt','rtyrt','fghfg','rtyrt','gfhfgh','tryrt','dfgdf',4545454,'1535796951060_listing-thumb-6.jpg','fghfgh','title','tryrt','gfhfg',44547,1,1,1,'tryrty'),(14,'fghfghf','fghfg','fghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfghfgh','dsfsdf@gdfgdf','gfhfg','gfhfgh','fghfg','fghfgh','fhfgh','fghfg','sdfsd',454545,'1535798308810_listing-thumb-5.jpg','fghfgh','ghfgh','fghfg','fghfg',454545,1,2,3,'fghfgh');

/*Table structure for table `state` */

DROP TABLE IF EXISTS `state`;

CREATE TABLE `state` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `state` */

insert  into `state`(`id`,`name`) values (1,'my state '),(3,'my state 2');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  `surname` varchar(255) COLLATE utf8_bin NOT NULL,
  `email` varchar(255) COLLATE utf8_bin NOT NULL,
  `password` varchar(255) COLLATE utf8_bin NOT NULL,
  `user_type` enum('ADMIN','USER') COLLATE utf8_bin NOT NULL DEFAULT 'USER',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`surname`,`email`,`password`,`user_type`) values (15,'dfgdf','dfgdf','admin@mail.com','$2a$10$oPmECuS3ZoMGFuQKNmHPAuT5TVN0tDYS5WQU2tIAIc2VqoERN9xmy','ADMIN'),(16,'DFG','DFGDF','user@mail.com','$2a$10$TFOwCOE9ZEqW02gdTEl56umrc06HhqtzXM8htGKtN38oknJPS329a','USER');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
