
SELECT SUM(SCORE) AS SCORE, A.EMP_NO, A.EMP_NAME, A.POSITION, A.EMAIL
FROM HR_EMPLOYEES A
INNER JOIN HR_GRADE B ON A.EMP_NO = B.EMP_NO
GROUP BY EMP_NO, EMP_NAME,POSITION,EMAIL
ORDER BY SCORE DESC
LIMIT 1


