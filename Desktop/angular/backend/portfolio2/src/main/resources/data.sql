INSERT INTO usuario (email, nombre, nombre_usuario, password) VALUES ("admin@admin.com", "Admin", "admin", "$2a$12$p7hjFsE12PgRDanR.mNMc.FALN9di89lvVIyCoqJfhZq3gmVxgsYe");
INSERT INTO rol SET rol_nombre="ROLE_ADMIN";
INSERT INTO rol SET rol_nombre="ROLE_USER";
INSERT INTO usuario_rol (usuario_id, rol_id) VALUES (1,1);
INSERT INTO aboutus (backgroundimage, name, title) VALUES ("https://i.ibb.co/WKzysHK/abstract-template-blue-geometric-diagonal-overlap-layer-on-dark-blue-background-free-vector.jpg", "Edita el nombre", "E inserta el título aquí");
