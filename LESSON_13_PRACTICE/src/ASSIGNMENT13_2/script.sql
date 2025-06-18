create DATABASE fpp_address;

CREATE TABLE PERSON (
                        ID VARCHAR(50) PRIMARY KEY,
                        first_name VARCHAR(50) NOT NULL,
                        last_name VARCHAR(50) NOT NULL,
                        ssn VARCHAR(20) NOT NULL
);

CREATE TABLE ADDRESS (
                         PERSON_ID VARCHAR(50),
                         street VARCHAR(100) NOT NULL,
                         city VARCHAR(50) NOT NULL,
                         state VARCHAR(50) NOT NULL,
                         zip VARCHAR(10) NOT NULL,
                         PRIMARY KEY (PERSON_ID),
                         FOREIGN KEY (PERSON_ID) REFERENCES PERSON(ID)
                             ON DELETE CASCADE
);
