USE syscursos;
CREATE TABLE `usuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `nombres` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `contraseña` varchar(20)  NOT NULL,
  `tipo_usuario` varchar(50)  NOT NULL,
  PRIMARY KEY (`id_usuario`)
);

CREATE TABLE `curso` (
    `id_usuario` int,
    `id_curso` int NOT NULL AUTO_INCREMENT,
    `nombre_curso` varchar(200) NOT NULL,
    `estado` varchar(100) NOT NULL,
    PRIMARY KEY (`id_curso`),
    FOREIGN KEY (`id_usuario`) REFERENCES usuario(`id_usuario`)
);
CREATE TABLE `subscripcion` (
    `id_usuario` int,
    `id_curso` int,
    `id_subscripcion` int NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (`id_subscripcion`),
    FOREIGN KEY (`id_usuario`) REFERENCES usuario(`id_usuario`),
    FOREIGN KEY (`id_curso`) REFERENCES curso(`id_curso`)
);

