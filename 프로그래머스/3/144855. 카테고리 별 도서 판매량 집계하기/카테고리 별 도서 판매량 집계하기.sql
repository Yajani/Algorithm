SELECT CATEGORY, sum(SALES) AS TOTAL_SALES
FROM BOOK_SALES bs, BOOK b 

WHERE bs.BOOK_ID = b.BOOK_ID AND
SALES_DATE LIKE "2022-01%"

GROUP BY CATEGORY
ORDER BY CATEGORY