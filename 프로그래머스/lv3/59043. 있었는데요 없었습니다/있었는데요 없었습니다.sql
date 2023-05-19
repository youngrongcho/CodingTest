-- 코드를 입력하세요
SELECT T1.ANIMAL_ID, T1.NAME
FROM ANIMAL_INS T1, ANIMAL_OUTS T2
WHERE T1.ANIMAL_ID = T2.ANIMAL_ID 
AND T2.DATETIME < T1.DATETIME
ORDER BY T1.DATETIME;