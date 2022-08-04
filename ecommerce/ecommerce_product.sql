-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: ecommerce
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `productid` bigint NOT NULL AUTO_INCREMENT,
  `sku` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `unitprice` decimal(13,2) DEFAULT NULL,
  `imageurl` varchar(255) DEFAULT NULL,
  `unitsinstock` int DEFAULT NULL,
  `datecreated` date DEFAULT NULL,
  `lastupdated` date DEFAULT NULL,
  `categoryid` bigint DEFAULT NULL,
  PRIMARY KEY (`productid`),
  KEY `categoryid` (`categoryid`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`categoryid`) REFERENCES `productcategory` (`categoryid`)
) ENGINE=InnoDB AUTO_INCREMENT=100052 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (100021,'adfaf','Earphones','Boat ultrasound',1234.00,'https://cdn.shopify.com/s/files/1/0057/8938/4802/products/1neon_3105765c-e660-47c7-9deb-3482720df176_800x.png?v=1592544752',34,'2021-07-26','2022-07-27',1234),(100022,'adfaf','Smartwatch','Boat waveT',456.54,'https://m.media-amazon.com/images/I/41jPj8Yn5wS._AC_SX425_.jpg',34,'2021-07-26','2022-07-27',1233),(100023,'adfaf','WashingMachine','IFBRGS 456',22800.54,'https://images-eu.ssl-images-amazon.com/images/I/41V1Loe5saL._SX342_SY445_QL70_FMwebp_.jpg',34,'2021-07-26','2022-07-27',1235),(100026,'phone','SmartPhone','Realme Narzo 50A',115000.00,'https://image01.realme.net/general/20220418/1650302784612.png.webp',3,'2022-06-22','2022-07-29',1233),(100028,'dadsad','Smart Watch','Noise Wavet',3453.00,'https://images-eu.ssl-images-amazon.com/images/I/61KPI-ZFbvL._AC_UL116_SR116,116_.jpg',3,'2022-07-15','2022-07-30',1233),(100029,'dadsad','Television','LG LCD TV',45493.00,'https://image.shutterstock.com/image-vector/realistic-tv-screen-modern-stylish-260nw-605545907.jpg',3,'2022-07-21','2022-07-29',1234),(100038,'askdfads','Refridgerator','Samsung ',16890.00,'https://images.samsung.com/is/image/samsung/in-feature-works-longer-for-less-257500664?$FB_TYPE_C_JPG$',4,'2022-07-15','2022-08-02',1235);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-04 10:23:41
