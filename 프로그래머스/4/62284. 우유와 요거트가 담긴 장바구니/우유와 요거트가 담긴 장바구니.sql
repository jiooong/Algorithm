-- 일단 카트 아이디로 묶어야 한다.
-- NAME 에 우유와 요거트가 둘 다 있는지 확인해야한다. -> 먼저 요거트가 있는지 확인하고 다시 확인

-- 요거트 있는거 먼저 찾아

# SELECT CART_ID
# FROM CART_PRODUCTS
# WHERE CART_ID IN (SELECT CART_ID
# FROM CART_PRODUCTS
# WHERE NAME = "Milk"
# UNION
# SELECT CART_ID
# FROM CART_PRODUCTS
# WHERE NAME = "Yogurt")
# GROUP BY CART_ID
# ORDER BY CART_ID

# SELECT CART_ID
# FROM CART_PRODUCTS
# WHERE NAME = "Yogurt" OR NAME = "Milk"
# GROUP BY CART_ID
# HAVING COUNT(CART_ID) = 2
# ORDER BY CART_ID

SELECT CART_ID
  FROM CART_PRODUCTS
 WHERE NAME IN ('Milk','Yogurt')
 GROUP BY CART_ID
 HAVING COUNT(DISTINCT NAME)=2




