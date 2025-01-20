-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: rehla
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person` (
  `name_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `country` varchar(40) DEFAULT NULL,
  `city` varchar(40) DEFAULT NULL,
  `nat_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`name_id`),
  KEY `city_idx` (`city`),
  CONSTRAINT `city` FOREIGN KEY (`city`) REFERENCES `tourist_cities` (`city`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (56,'Osama Sayed','653232','Eygpt','Aswan','4651313'),(57,'Osama sayed','623623','sddf','Aswan','623263'),(58,'osama sayed','6523','sfdsfd','Aswan','56623'),(59,'Osam sdas','35233','gdfsxfczx','Aswan','123232'),(60,'Osam sdas','35233','gdfsxfczx','Aswan','123232'),(61,'Osam sdas','35233','gdfsxfczx','Aswan','123232'),(62,'Osam sdas','35233','gdfsxfczx','Aswan','123232'),(63,'Ad dsa','3232','asdsfsd','Aswan','32'),(64,'osama sayed','15311322','dsfdsf','Aswan','1512331'),(65,'osama sayed','15311322','dsfdsf','Aswan','1512331'),(66,'osama sayed','15311322','dsfdsf','Aswan','1512331'),(67,'Osama sayed','5623','dsfsdfsd','Aswan','652353'),(68,'Osama Sayed','53113535','Eygpt','Aswan','5132135'),(69,'Osama Sayed','45456546','Eygpt','Aswan','535153'),(70,'Osama Sayed','45456546','Eygpt','Aswan','535153'),(71,'Osama Sayed','5456566','Eygpt','Aswan','525566'),(72,'Osama Sayed','2326265','eygpt','Aswan','65233225'),(73,'Osama Sayed','5132','eygpt','Aswan','465132'),(74,'Osama Sayed','3525335','Eygpt','Aswan','651353');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-04 18:22:44
