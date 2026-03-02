SELECT * FROM currency;
SELECT * FROM currency WHERE abbr='ILS';
SELECT COUNT(*) AS number_of_currencies FROM currency;

SELECT abbr,name,conversion_to_EUR 
FROM currency 
ORDER BY conversion_to_EUR DESC
LIMIT 1;
