SELECT CATEGORY,PRICE AS MAX_PRICE,PRODUCT_NAME
FROM FOOD_PRODUCT
WHERE (price, CATEGORY) IN (SELECT MAX(PRICE) , CATEGORY
                            FROM FOOD_PRODUCT
                            WHERE CATEGORY IN ('과자', '국', '김치', '식용유')
                            GROUP BY CATEGORY
                            )
ORDER BY MAX_PRICE DESC

