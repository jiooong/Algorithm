
# SELECT B.USER_ID AS USER_ID, B.NICKNAME, CONCAT(B.CITY," ", B.STREET_ADDRESS1, " ", B.STREET_ADDRESS2) AS 전체주소, 
# CONCAT_WS("-",SUBSTRING(TLNO,1,3),SUBSTRING(TLNO,4,4),SUBSTRING(TLNO,7,4)) AS 전화번호 
# FROM USED_GOODS_BOARD A
# INNER JOIN USED_GOODS_USER B ON A.WRITER_ID = B.USER_ID
# GROUP BY A.WRITER_ID
# HAVING COUNT(A.WRITER_ID)>=3
# ORDER BY B.USER_ID DESC


SELECT B.user_id,B.nickname
,concat(B.city,' ',B.street_address1,' ',B.street_address2) AS 전체주소
,concat(LEFT(tlno,3), '-', MID(tlno,4,4),'-', RIGHT(tlno,4)) AS 전화번호
FROM used_goods_board A join used_goods_user B ON A.writer_id = B.user_id
GROUP BY writer_id
HAVING count(writer_id) >= 3
ORDER BY B.user_id DESC