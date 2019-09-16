INSERT INTO CATEGORIES VALUES (1,'LAPTOP');
INSERT INTO CATEGORIES VALUES (2,'SMARTPHONE');
INSERT INTO CATEGORIES VALUES (3,'TABLET');

INSERT INTO LAPTOP VALUES (1,'MACKBOOK PRO',89000,'8GB + 128GB',1);
INSERT INTO LAPTOP VALUES (2,'SURFACE PRO',99000,'8GB + 256GB',1);
INSERT INTO LAPTOP VALUES (3,'MACKBOOK AIR',67000,'4GB + 128GB',1);
INSERT INTO LAPTOP VALUES (4,'MACKBOOK PRO',134000,'16GB + 500GB',1);

INSERT INTO SMART_PHONE VALUES(1,'SAMSUNG S9',51000,'6GB + 128GB',2);
INSERT INTO SMART_PHONE VALUES(2,'IPHONE 11',81000,'4GB + 64GB',2);
INSERT INTO SMART_PHONE VALUES(3,'ONEPLUS 7 PRO',49000,'8GB + 128GB',2);
INSERT INTO SMART_PHONE VALUES(4,'MI NOTE 7 PRO',18000,'6GB + 128GB',2);

INSERT INTO TABLET VALUES(1,'SAMSUNG S6',34000,'6GB + 64GB',3);
INSERT INTO TABLET VALUES(2,'APPLE IPAD',34000,'6GB + 64GB',3);

INSERT INTO STUDENT VALUES(1,'IMRAN SHAIKH');
INSERT INTO STUDENT VALUES(2,'SURAJ CHAURASIYA');
INSERT INTO STUDENT VALUES(3,'ROHIT');

INSERT INTO STUDENT_LAPTOP VALUES(1,1);
INSERT INTO STUDENT_LAPTOP VALUES(1,3);
INSERT INTO STUDENT_LAPTOP VALUES(2,1);
INSERT INTO STUDENT_LAPTOP VALUES(4,2);
INSERT INTO STUDENT_LAPTOP VALUES(3,2);
INSERT INTO STUDENT_LAPTOP VALUES(2,4);

SELECT STUDENT_NAME,NAME , LAPTOP.ID ,MODEL,PRICE FROM STUDENT  INNER JOIN LAPTOP ON STUDENT.ID = LAPTOP.ID INNER JOIN CATEGORIES ON CATEGORIES.ID = LAPTOP.CATEGORIES_ID;
SELECT STUDENT_LAPTOP.STUDENT_ID, LAPTOP_ID, STUDENT_NAME, CATEGORIES.NAME , MODEL, PRICE FROM  STUDENT_LAPTOP  INNER JOIN  STUDENT  ON STUDENT_LAPTOP .STUDENT_ID =  STUDENT.ID INNER JOIN  LAPTOP ON STUDENT_LAPTOP.LAPTOP_ID = LAPTOP.ID INNER JOIN CATEGORIES ON CATEGORIES.ID = LAPTOP.ID;
SELECT Student.name, model, price, Categories.name from Student INNER JOIN laptop on Student.id = Laptop.id INNER JOIN Categories on Categories.id = Laptop.id;
