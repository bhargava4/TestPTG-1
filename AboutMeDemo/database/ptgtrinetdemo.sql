#SIM Tables & test data
CREATE TABLE sim_custom (
  EMP_ID INT NOT NULL ,
  CUSTOM_ID VARCHAR(20) NOT NULL ,
  PRIMARY KEY (EMP_ID),
  UNIQUE KEY  (CUSTOM_ID)
);

CREATE TABLE sim_password (
  EMP_ID int NOT NULL,
  PASSWORD varchar(20) NOT NULL,
  CONSTRAINT FOREIGN KEY (EMP_ID) REFERENCES sim_custom (EMP_ID)
);

CREATE TABLE sim_roles (
  EMP_ID int NOT NULL ,
  EMP_ROLE varchar(100) NOT NULL ,
  PRIMARY KEY (EMP_ID,EMP_ROLE)
);

CREATE TABLE sim_secret (
  EMP_ID int NOT NULL,
  SECRET_QST varchar(100) NOT NULL,
  SECRET_ANS varchar(100) NOT NULL
) ;

INSERT INTO sim_custom VALUES (100, 'custom100'),
				(101, 'custom101');
			

INSERT INTO sim_roles VALUES (100, 'HR Administrator'),
							(101, 'HR Authorization'),
							(102, 'Benefit Decision Make');

INSERT INTO sim_password VALUES (100, 'tmpPwd100'),
				(101, 'tmpPwd101'),
				(102, 'tmpPwd102');
				
INSERT INTO sim_secret VALUES (100, 'Who is your first teacher ?' , 'Vimala'),
							  (101, 'what is your pet name ?' ,'Whity'),
							  (102, 'Who is your first teacher ?' , 'Nirmala');