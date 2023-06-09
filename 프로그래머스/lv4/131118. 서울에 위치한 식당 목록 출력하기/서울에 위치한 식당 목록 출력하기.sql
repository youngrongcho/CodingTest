-- 코드를 입력하세요
SELECT T1.REST_ID, T1.REST_NAME, T1.FOOD_TYPE, T1.FAVORITES, T1.ADDRESS, 
ROUND(AVG(T2.REVIEW_SCORE),2) AS SCORE
FROM REST_INFO T1, REST_REVIEW T2
WHERE T1.REST_ID = T2.REST_ID
AND T1.ADDRESS LIKE '서울%'
GROUP BY 1
ORDER BY SCORE DESC, T1.FAVORITES DESC;