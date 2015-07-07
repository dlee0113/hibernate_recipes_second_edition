# note that this file is not used by this project.

DROP TABLE book
IF EXISTS;
DROP TABLE publisher
IF EXISTS;

CREATE TABLE publisher (
  code    VARCHAR(6) PRIMARY KEY,
  name    VARCHAR(64)  NOT NULL,
  address VARCHAR(128) NOT NULL,
  UNIQUE (name)
);

CREATE TABLE book (
  isbn        VARCHAR(13) PRIMARY KEY,
  name        VARCHAR(64) NOT NULL,
  publishDate DATE,
  price       DECIMAL(8, 2),
  publisher   VARCHAR(6),
  FOREIGN KEY (publisher) REFERENCES publisher (code),
  UNIQUE (name)
);