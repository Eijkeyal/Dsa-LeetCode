CREATE FUNCTION getNthHighestSalary(N IN NUMBER) RETURN NUMBER IS
result NUMBER;
BEGIN
    /* Write your PL/SQL query statement below */
    SELECT DISTINCT salary INTO result
    FROM (
        SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
        FROM Employee
    )
    WHERE rnk = N;

    RETURN result;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN NULL;
END;