--password 12345

INSERT  INTO user (username,password,name,email,last_name,enabled) VALUES ('ozymern','$2a$10$w3OQyxqtF//Q8Cda6Nk4WOOogYievveOMYGxGsaaKUz4YugUHWFCW','Ozymern','ozymern@gmail.com','Fernandez',1);
INSERT  INTO user (username,password,name,email,last_name,enabled) VALUES ('alejandro','$2a$10$w3OQyxqtF//Q8Cda6Nk4WOOogYievveOMYGxGsaaKUz4YugUHWFCW','Alejandro','ale.fvaras@gmail.com','Fernandez',1);

INSERT  INTO  role(name) VALUES ('ROLE_USER');
INSERT  INTO  role(name) VALUES ('ROLE_ADMIN');

INSERT  INTO user_to_roles (users_id,role_id) VALUES (1,1);
INSERT  INTO user_to_roles (users_id,role_id) VALUES (2,2);
INSERT  INTO user_to_roles (users_id,role_id) VALUES (2,1);
