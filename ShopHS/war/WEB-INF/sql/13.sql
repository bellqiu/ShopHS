CREATE TABLE `setting` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `k` varchar(200) NOT NULL,
  `v` varchar(2000) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `k_UNIQUE` (`k`)
)
