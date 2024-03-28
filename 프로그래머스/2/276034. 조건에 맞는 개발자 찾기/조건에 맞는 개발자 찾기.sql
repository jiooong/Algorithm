-- 코드를 작성해주세요
SELECT ID, EMAIL,FIRST_NAME,LAST_NAME
FROM DEVELOPERS
WHERE SKILL_CODE & (SELECT CODE
                    FROM SKILLCODES
                    WHERE NAME = 'Python') OR  SKILL_CODE & (SELECT CODE
                                                             FROM SKILLCODES
                                                             WHERE NAME = 'C#')
ORDER BY ID
# SELECT d.ID, d.EMAIL, d.FIRST_NAME, d.LAST_NAME
# FROM DEVELOPERS d
# WHERE d.SKILL_CODE &
# (
# SELECT CODE
# FROM SKILLCODES
# WHERE NAME = 'Python'
# )
# OR d.SKILL_CODE &
# (
# SELECT CODE
# FROM SKILLCODES
# WHERE NAME = 'C#'
# )
# ORDER BY d.ID ASC
