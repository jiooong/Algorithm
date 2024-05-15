SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS A
WHERE SKILL_CODE & (SELECT SUM(CODE)
                    FROM SKILLCODES
                    WHERE CATEGORY = 'Front End'
                                        ) 
ORDER BY ID