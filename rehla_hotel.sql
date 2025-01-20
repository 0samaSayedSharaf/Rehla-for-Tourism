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
-- Table structure for table `hotel`
--

DROP TABLE IF EXISTS `hotel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hotel` (
  `hotel_id` int NOT NULL AUTO_INCREMENT,
  `hotel_name` varchar(60) DEFAULT NULL,
  `hotels_rate` varchar(15) DEFAULT NULL,
  `hotels_location` varchar(60) DEFAULT NULL,
  `city` varchar(40) NOT NULL,
  PRIMARY KEY (`hotel_id`,`city`),
  KEY `city` (`city`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hotel`
--

LOCK TABLES `hotel` WRITE;
/*!40000 ALTER TABLE `hotel` DISABLE KEYS */;
INSERT INTO `hotel` VALUES (1,'Seti Abu Simbel Lake','3 Stars','Abu Simbel','Aswan'),(2,'Citymax','4 Stars','Assuan/Aswan','Aswan'),(3,'Sofitel Legend Old Cataract Aswan','6 Stars','Assuan/Aswan','Aswan'),(5,'San giovanni','3 Stars','5.1 Km to City Center','Alex'),(7,'San giovannifdsf','3 Stars','5.1 Km to City Center','Alex'),(8,'Steigenberger Cecil','4 Stars','5.4 Km To City Center','Alex'),(10,'Guardian','3 Stars','1.0 km to Giza Pyramids‬‬','Giza'),(12,'Grand Pyramids Hotel','4 stars','2.3 Km to Giza Pyramids','Giza'),(13,'sadsa','sda','asdsa','Luxor'),(14,'asdsa','adsdaasdas','asdsa','marsa'),(17,'s','dfsf','dsfds','dsa'),(18,'fdg','dfg','gdfg','marsa mat'),(19,'zxcx','zxcxz','xzczx','zdzfdfdx'),(21,'dsf','vcxv','vxcvx',' matf'),(22,'asDz','dsdvcbcvb','saddas','marsa matro7');
/*!40000 ALTER TABLE `hotel` ENABLE KEYS */;
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
