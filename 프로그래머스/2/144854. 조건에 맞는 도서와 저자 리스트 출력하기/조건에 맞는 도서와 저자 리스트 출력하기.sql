
SELECT A.BOOK_ID, B.AUTHOR_NAME, DATE_FORMAT(A.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK A
INNER JOIN AUTHOR B ON A.AUTHOR_ID = B.AUTHOR_ID
WHERE CATEGORY = "경제"
ORDER BY A.PUBLISHED_DATE
