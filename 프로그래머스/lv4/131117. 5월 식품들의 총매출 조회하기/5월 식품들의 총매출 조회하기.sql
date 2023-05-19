-- 코드를 입력하세요
SELECT T1.PRODUCT_ID, T1.PRODUCT_NAME, T1.PRICE * SUM(T2.AMOUNT) AS TOTAL_SALES
FROM FOOD_PRODUCT T1, FOOD_ORDER T2
WHERE T1.PRODUCT_ID = T2.PRODUCT_ID
AND T2.PRODUCE_DATE LIKE '2022-05%'
GROUP BY 1
ORDER BY 3 DESC, 1;