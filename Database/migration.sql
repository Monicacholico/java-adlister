USE adlister_db;
DROP TABLE IF EXISTS users;
CREATE TABLE users(
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  username VARCHAR(100),
  email VARCHAR(50),
  password VARCHAR(30),
  PRIMARY KEY (id),
  UNIQUE (email)
);

USE adlister_db;
DROP TABLE IF EXISTS ads;
CREATE TABLE ads(
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  title VARCHAR(50),
  description VARCHAR(200),
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users (id)
);