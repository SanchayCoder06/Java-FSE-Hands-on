SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE display_message
IS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Hello, Welcome to PL/SQL Stored Procedures');
END;
/

CREATE OR REPLACE PROCEDURE calculate_annual_salary(
    monthly_salary IN NUMBER
)
IS
    annual_salary NUMBER;
BEGIN
    annual_salary := monthly_salary * 12;
    DBMS_OUTPUT.PUT_LINE('Annual Salary = ' || annual_salary);
END;
/

CREATE OR REPLACE PROCEDURE check_even_odd(
    num IN NUMBER
)
IS
BEGIN
    IF MOD(num,2) = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Even Number');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Odd Number');
    END IF;
END;
/

BEGIN
    display_message;
    calculate_annual_salary(50000);
    check_even_odd(25);
END;
/