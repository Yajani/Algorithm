# PARENT_ID가 자신의 ID와 일치하는 행의 개수를 세 CHILD_COUNT 컬럼과 함께 출력해야 한다.

# 자식이 없어서 Null로 나타난 경우, IFNULL 구문 등을 사용하여 0으로 대체하여 출력해야 한다.
 
SELECT
    ID,
    IFNULL(
        (
            SELECT
                COUNT(*)
            FROM
                ECOLI_DATA
            GROUP BY
                PARENT_ID
            HAVING
                PARENT_ID = ID
        ), 0
    ) AS CHILD_COUNT
FROM
    ECOLI_DATA
ORDER BY
    ID