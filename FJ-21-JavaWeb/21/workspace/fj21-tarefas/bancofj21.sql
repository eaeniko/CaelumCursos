-- MySQL dump 10.13  Distrib 5.7.20, for Linux (x86_64)
--
-- Host: localhost    Database: fj21
-- ------------------------------------------------------
-- Server version	5.7.20-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Tarefa`
--

DROP TABLE IF EXISTS `Tarefa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Tarefa` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dataFinalizacao` date DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `finalizado` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Tarefa`
--

LOCK TABLES `Tarefa` WRITE;
/*!40000 ALTER TABLE `Tarefa` DISABLE KEYS */;
INSERT INTO `Tarefa` VALUES (1,'2017-07-14','Estudar JPA e Hibernate',''),(2,'2017-07-14','Estudar JPA e Hibernate','');
/*!40000 ALTER TABLE `Tarefa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contatos`
--

DROP TABLE IF EXISTS `contatos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contatos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `dataNascimento` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contatos`
--

LOCK TABLES `contatos` WRITE;
/*!40000 ALTER TABLE `contatos` DISABLE KEYS */;
INSERT INTO `contatos` VALUES (11,'Inez','inez@cc.com','rua das ruas, 88','2000-02-09'),(13,'Carlos','c@cc.com','rua c, 44','2003-09-27'),(15,'Luciana Bezerra','lab@lab.com','rua da Lu, 33','2017-07-12'),(16,'Sandra Mari','sm@or.com.br','Rua Dunnant, 67','1981-07-02'),(17,'Pedro','p@cc.com.br','Rua Pedro Moreira, 44','2016-06-01'),(24,'Ana','ana@gmail.com','Rua da Ana, 21','1992-07-21'),(25,'Jennifer','jen@gmail.com','Rua Cruzeiro, 100','1990-12-07'),(26,'Ana Vitoria','anav@gmail','Rua Autor, 230','2017-08-16'),(28,'Carolina Santos','carols@gmail.com','Av. Sto Amaro, 2225','2010-01-05'),(30,'Caelum','contato@caelum.com.br','R. Vergueiro 3185 cj 57','2017-11-06'),(31,'Caelum','contato@caelum.com.br','R. Vergueiro 3185 cj 57','2017-11-06'),(32,'Caelum','contato@caelum.com.br','R. Vergueiro 3185 cj 57','2017-11-06'),(33,'Caelum','contato@caelum.com.br','R. Vergueiro 3185 cj 57','2017-11-06'),(34,'Niko','agencianiko@gmail.com','Rua alguma coisa 394','2017-12-05'),(38,'Teste','agencianiko@hotmail.com','Sei la 111','1996-10-21'),(41,'Nikolai','','Rua pepepe 394','1996-10-21');
/*!40000 ALTER TABLE `contatos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tarefas`
--

DROP TABLE IF EXISTS `tarefas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tarefas` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `finalizado` tinyint(1) DEFAULT NULL,
  `dataFinalizacao` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarefas`
--

LOCK TABLES `tarefas` WRITE;
/*!40000 ALTER TABLE `tarefas` DISABLE KEYS */;
INSERT INTO `tarefas` VALUES (3,'Ligar para Ana',1,'2001-01-01'),(7,'Comprar a parada',1,'2016-09-09'),(18,'ligar gerente',1,'2017-07-14'),(20,'montar agenda professores',1,'2017-07-14'),(27,'5a. Aula fj21',1,'2017-12-13'),(28,'Sabado na Caelum',1,'2017-12-13'),(29,'Testando tarefas',1,'2017-12-13'),(30,'Testando tarefas',1,'2017-12-13'),(31,'teste',0,NULL),(32,'teste tarefa',1,'2017-12-13'),(35,'teste tarefa',1,'2017-12-13'),(37,'teste',1,'2017-12-13'),(38,'teste',1,'2017-12-13'),(88,'testeeee 2222',1,'2017-12-13'),(89,'ssss44',1,'2017-12-13'),(90,'oi testa',1,'2017-12-13'),(92,'testeeeeeee',1,'2017-12-13'),(93,'eeeeeeeeeeee',1,'2017-12-13'),(94,'ssssssssssssss',1,'2017-12-13'),(95,'asdaafds',1,'2017-12-13'),(96,'teste login\r\n',1,'2017-12-15');
/*!40000 ALTER TABLE `tarefas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `login` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES ('seu_usuario','sua_senha'),('user','password'),('admin','admin');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-15 19:22:40
