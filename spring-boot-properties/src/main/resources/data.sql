insert into propriedade
    (nome,valor,descricao,categoria,subcategoria) values
    ('server.port', '8080', 'Server HTTP port',
     'WEB PROPERTIES', 'EMBEDDED SERVER CONFIGURATION');

-- SPRING WEB SERVICES (WebServicesProperties)
insert into propriedade(categoria,subcategoria,nome,valor,descricao) values ('WEB PROPERTIES','EMBEDDED SERVER CONFIGURATION','spring.webservices.path','/services','Path that serves as the base URI for the services');
insert into propriedade(categoria,subcategoria,nome,valor,descricao) values ('WEB PROPERTIES','EMBEDDED SERVER CONFIGURATION','spring.webservices.servlet.init','','Servlet init parameters to pass to Spring Web Services');
insert into propriedade(categoria,subcategoria,nome,valor,descricao) values ('WEB PROPERTIES','EMBEDDED SERVER CONFIGURATION','spring.webservices.servlet.load-on-startup','-1','Load on startup priority of the Spring Web Services servlet');
