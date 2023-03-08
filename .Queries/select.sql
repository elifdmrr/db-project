select * from EMPLOYEES;
-- reads all column from employees table

select * from DEPARTMENTS;
-- reads all column from departments table

select first_name from EMPLOYEES;
-- get only firstname from employees table

select city from LOCATIONS;
--display city names

--get first_name, last_name, and salary
select FIRST_NAME, LAST_NAME, SALARY from EMPLOYEES;

--get me street address and postal code
select STREET_ADDRESS, POSTAL_CODE from LOCATIONS;

select distinct FIRST_NAME from EMPLOYEES;
--remove dublicates