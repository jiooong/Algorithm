-- 코드를 작성해주세요
WITH FISH AS (
SELECT AVG(LENGTH) AS ALENGTH , FISH_TYPE
FROM FISH_INFO
GROUP BY FISH_TYPE
HAVING ALENGTH >= 33
    )

SELECT COUNT(ID) AS FISH_COUNT, MAX(LENGTH) AS MAX_LENGTH, A.FISH_TYPE
FROM FISH_INFO A
INNER JOIN FISH B ON A.FISH_TYPE = B.FISH_TYPE
GROUP BY A.FISH_TYPE
ORDER BY FISH_TYPE

# (CASE WHEN LENGTH IS NULL
#     THEN 10
#     ELSE LENGTH END)
