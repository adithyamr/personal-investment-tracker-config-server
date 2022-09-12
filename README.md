# personal-investment-tracker-config-server
personal-investment-tracker-config-server

mvn spring-boot:build-image
docker network create personal-investment-tracker                                                                                                 
docker run --network personal-investment-tracker --name config_server -d -p 9000:9000 -it personal-investment-tracker-config-server:0.0.1-SNAPSHOT 


ssh-keyscan -t ecdsa github.com  ==> hostkey
ssh-keygen -m PEM -t ecdsa -b 256 ==> generate private and public key


docker run -p 5432:5432 -d --network personal-investment-tracker --name postgres -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=Admin@123 
CREATE DATABASE pit OWNER admin;

create table PROPERTIES (
  id serial primary key, 
  CREATED_ON timestamp ,
  APPLICATION text, 
  PROFILE text, 
  LABEL text, 
  KEY text, 
  VALUE text
 );
 
INSERT INTO properties (CREATED_ON, APPLICATION, PROFILE, LABEL, KEY, VALUE) VALUES (current_timestamp,'discovery-server','dev','latest','server.port','8761');
INSERT INTO properties (CREATED_ON, APPLICATION, PROFILE, LABEL, KEY, VALUE) VALUES (current_timestamp,'discovery-server','dev','latest','spring.application.name','discovery-server');
INSERT INTO properties (CREATED_ON, APPLICATION, PROFILE, LABEL, KEY, VALUE) VALUES (current_timestamp,'stock-api','dev','latest','server.port','9006');
INSERT INTO properties (CREATED_ON, APPLICATION, PROFILE, LABEL, KEY, VALUE) VALUES (current_timestamp,'stock-api','dev','latest','spring.application.name','stock-api');
