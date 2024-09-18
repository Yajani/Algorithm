SELECT COUNT(ID) COUNT
FROM ECOLI_DATA 
WHERE 
    CONV(GENOTYPE, 10, 2) NOT LIKE '%1_' AND
    (CONV(GENOTYPE, 10, 2) LIKE '%1' OR
    CONV(GENOTYPE, 10, 2) LIKE '%1__')

# CONV() 함수는 숫자를 한 숫자 기본 시스템에서 다른 숫자로 변환하고 결과를 문자열 값으로 반환
# _는 글자 하나를 의미 