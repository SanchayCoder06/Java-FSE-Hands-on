SET SERVEROUTPUT ON;

-- IF ELSE

DECLARE
    num NUMBER := 10;
BEGIN
    IF num > 0 THEN
        DBMS_OUTPUT.PUT_LINE('Positive Number');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Negative Number');
    END IF;
END;
/

-- ELSIF

DECLARE
    marks NUMBER := 75;
BEGIN
    IF marks >= 90 THEN
        DBMS_OUTPUT.PUT_LINE('Grade A');
    ELSIF marks >= 75 THEN
        DBMS_OUTPUT.PUT_LINE('Grade B');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Grade C');
    END IF;
END;
/

-- FOR LOOP

BEGIN
    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE(i);
    END LOOP;
END;
/