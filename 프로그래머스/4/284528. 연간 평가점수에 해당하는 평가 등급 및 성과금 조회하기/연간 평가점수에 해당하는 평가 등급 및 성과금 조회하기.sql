-- 코드를 작성해주세요
WITH SC AS(
SELECT (CASE WHEN AVG(B.SCORE) >= 96
       THEN 'S'
       WHEN AVG(B.SCORE) >= 90
        THEN 'A'
       WHEN AVG(B.SCORE) >= 80
        THEN 'B'
       ELSE 'C' END) AS GRADE , A.EMP_NO , AVG(A.SAL) AS AVE
FROM HR_EMPLOYEES A
INNER JOIN HR_GRADE B ON A.EMP_NO = B.EMP_NO
INNER JOIN HR_DEPARTMENT C ON A.DEPT_ID = C.DEPT_ID
GROUP BY A.EMP_NO )

SELECT A.EMP_NO,A.EMP_NAME,B.GRADE, (CASE WHEN B.GRADE = 'S'
                                            THEN AVE * 0.2
                                           WHEN B.GRADE = 'A'
                                           THEN AVE * 0.15
                                           WHEN B.GRADE = 'B'
                                           THEN AVE * 0.1
                                           WHEN B.GRADE = 'C'
                                           THEN 0 END) AS BONUS
FROM HR_EMPLOYEES A
INNER JOIN SC B ON A.EMP_NO = B.EMP_NO
ORDER BY A.EMP_NO


