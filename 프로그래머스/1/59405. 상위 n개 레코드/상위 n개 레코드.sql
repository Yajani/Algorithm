-- 코드를 입력하세요
SELECT NAME
FROM (select * from ANIMAL_INS order by DATETIME)
where rownum = 1; 
