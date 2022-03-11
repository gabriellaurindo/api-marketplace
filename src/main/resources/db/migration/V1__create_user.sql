CREATE TABLE marketplace_owner.user (
	id BIGINT NOT NULL CONSTRAINT pk_user PRIMARY KEY,
	username VARCHAR ( 30 ) UNIQUE NOT NULL,
	password VARCHAR ( 20 ) NOT NULL,
	email VARCHAR ( 80 ) UNIQUE NOT NULL
);

CREATE VIEW marketplace_owner.vw_user AS SELECT * FROM marketplace_owner.user;
