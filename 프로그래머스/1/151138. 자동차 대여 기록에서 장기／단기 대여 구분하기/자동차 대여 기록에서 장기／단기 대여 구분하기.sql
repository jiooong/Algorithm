# -- 코드를 입력하세요
SELECT HISTORY_ID,	CAR_ID,	DATE_FORMAT(START_DATE,"%Y-%m-%d") AS START_DATE,DATE_FORMAT(END_DATE,"%Y-%m-%d") AS END_DATE, IF(DATEDIFF(END_DATE,START_DATE)+1>=30, '장기 대여', '단기 대여') AS RENT_TYPE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE YEAR(START_DATE) = 2022 AND MONTH(START_DATE) = 09
ORDER BY HISTORY_ID DESC

