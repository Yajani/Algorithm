SELECT YEAR(O.SALES_DATE) AS YEAR, MONTH(O.SALES_DATE) AS MONTH, U.GENDER AS GENDER ,COUNT(DISTINCT O.USER_ID) USERS
FROM USER_INFO U JOIN ONLINE_SALE O ON U.USER_ID = O.USER_ID
GROUP BY YEAR(O.SALES_DATE),MONTH(O.SALES_DATE),U.GENDER
HAVING GENDER IS NOT NULL
ORDER BY YEAR,MONTH,GENDER
