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
-- Table structure for table `aservice`
--

DROP TABLE IF EXISTS `aservice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aservice` (
  `available_places` varchar(40) NOT NULL,
  `No_beds` int DEFAULT NULL,
  `the_vies` varchar(40) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `hotel_id` int DEFAULT NULL,
  PRIMARY KEY (`available_places`),
  KEY `hotel_id` (`hotel_id`),
  CONSTRAINT `aservice_ibfk_1` FOREIGN KEY (`hotel_id`) REFERENCES `hotel` (`hotel_id`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aservice`
--

LOCK TABLES `aservice` WRITE;
/*!40000 ALTER TABLE `aservice` DISABLE KEYS */;
INSERT INTO `aservice` VALUES (' room',1,'Garden',100,3),('5 rooms',5,'Sea',650,2),('asdsa',2,'asda',45,NULL),('Double room',2,'Garden',180,3),('dsfds',2,'fdsf',3553,17),('dxgfchvb',5,'cfghvjb',123,13),('fcbgnvh',2,'dfjk',1245,NULL),('gcxggcx',2,'fdfsd',2431,22),('sad',2,'asd',54665,NULL),('sadsa',2,'sad',12,14),('Suite',6,'Sea',1100,1),('Triple Room',3,'Garden',300,3);
/*!40000 ALTER TABLE `aservice` ENABLE KEYS */;
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
