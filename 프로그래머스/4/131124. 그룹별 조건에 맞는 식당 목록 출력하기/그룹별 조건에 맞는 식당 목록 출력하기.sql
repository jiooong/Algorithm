-- 코드를 입력하세요

WITH COUNTING AS(
SELECT COUNT(REVIEW_ID) AS COUNTING, A.MEMBER_ID
FROM REST_REVIEW A
INNER JOIN MEMBER_PROFILE B ON A.MEMBER_ID = B.MEMBER_ID
GROUP BY A.MEMBER_ID
ORDER BY COUNTING DESC
LIMIT 1)

SELECT A.MEMBER_NAME,	B.REVIEW_TEXT,	DATE_FORMAT(B.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM MEMBER_PROFILE A
INNER JOIN REST_REVIEW B ON A.MEMBER_ID=B.MEMBER_ID
INNER JOIN COUNTING C ON A.MEMBER_ID = C.MEMBER_ID
ORDER BY REVIEW_DATE, REVIEW_TEXT 

                  
