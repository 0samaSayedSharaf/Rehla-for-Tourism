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
-- Table structure for table `rest_date`
--

DROP TABLE IF EXISTS `rest_date`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rest_date` (
  `rest_name` varchar(120) DEFAULT NULL,
  `reserv_date` timestamp NULL DEFAULT NULL,
  `id` int DEFAULT NULL,
  KEY `rest_name_idx` (`id`),
  CONSTRAINT `rest_date` FOREIGN KEY (`id`) REFERENCES `resturant` (`rest_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rest_date`
--

LOCK TABLES `rest_date` WRITE;
/*!40000 ALTER TABLE `rest_date` DISABLE KEYS */;
INSERT INTO `rest_date` VALUES (NULL,NULL,NULL),('ELmontazah',NULL,NULL),('ELmontazah',NULL,NULL),('ELmontazah','2020-01-01 21:59:00',NULL),('ELmontazah',NULL,NULL),('ELmontazah','2000-01-03 21:59:00',NULL),('ELmontazah','2000-01-03 21:59:00',NULL),('ELmontazah','2000-01-03 21:59:00',NULL),('ELmontazah',NULL,NULL),('ELmontazah','2001-12-30 21:59:00',NULL),(NULL,NULL,NULL),('ELmontazah',NULL,NULL),(NULL,NULL,NULL),('ELmontazah',NULL,NULL),('ELmontazah','2021-01-01 06:15:00',NULL),('ELmontazah',NULL,NULL),('ELmontazah','2021-01-01 06:15:00',NULL),('ELmontazah',NULL,NULL),('ELmontazah','2021-01-01 07:15:00',NULL),('fdfds',NULL,NULL),(NULL,NULL,NULL),(NULL,NULL,NULL),(NULL,NULL,NULL),(NULL,NULL,NULL),(NULL,NULL,NULL),(NULL,NULL,NULL),('ELmontazah',NULL,NULL),('ELmontazah',NULL,NULL),('ELmontazah',NULL,NULL),('ELmontazah',NULL,NULL),('ELmontazah',NULL,NULL),('ELmontazah',NULL,NULL),('ELmontazah',NULL,NULL),('ELmontazah',NULL,NULL);
/*!40000 ALTER TABLE `rest_date` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-04 18:22:45
