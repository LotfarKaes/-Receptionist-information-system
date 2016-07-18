CREATE TABLE Staff
(
S_Id UUID PRIMARY KEY,
Name VARCHAR(255) NOT NULL,
IdType VARCHAR(255) DEFAULT 'PERSONNUMMER',
IdNumber VARCHAR(255) DEFAULT '',
);

CREATE TABLE Individuals
(
I_Id UUID PRIMARY KEY,
Name VARCHAR(255) NOT NULL,
IdType VARCHAR(255) DEFAULT 'PERSONNUMMER',
IdNumber VARCHAR(255) DEFAULT '',
Company VARCHAR(255) DEFAULT '',
Country VARCHAR(255) DEFAULT '',
);

CREATE TABLE Visitors
(
I_Id UUID PRIMARY KEY,
Attendant UUID,
DateTime TIMESTAMP,
);