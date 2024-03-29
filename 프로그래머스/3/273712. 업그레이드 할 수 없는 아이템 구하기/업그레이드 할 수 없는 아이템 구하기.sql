-- 코드를 작성해주세요
-- ITEMTREE 테이블에 없는걸 출력하면 된다.

SELECT A.ITEM_ID,	A.ITEM_NAME,	A.RARITY
FROM ITEM_INFO A
LEFT JOIN ITEM_TREE B ON A.ITEM_ID = B.PARENT_ITEM_ID
WHERE B.PARENT_ITEM_ID IS NULL
ORDER BY ITEM_ID DESC