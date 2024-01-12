SELECT 
    DATE_FORMAT(SALES_DATE, '%Y-%m-%d') AS SALES_DATE, 
    PRODUCT_ID, 
    USER_ID, 
    SALES_AMOUNT
FROM 
    ONLINE_SALE
WHERE 
    DATE(SALES_DATE) BETWEEN '2022-03-01' AND '2022-03-31'

UNION ALL

SELECT 
    DATE_FORMAT(SALES_DATE, '%Y-%m-%d') AS SALES_DATE, 
    PRODUCT_ID, 
    NULL AS USER_ID, 
    SALES_AMOUNT
FROM 
    OFFLINE_SALE
WHERE 
    DATE(SALES_DATE) BETWEEN '2022-03-01' AND '2022-03-31'

ORDER BY 
    SALES_DATE ASC, 
    PRODUCT_ID ASC, 
    USER_ID ASC;