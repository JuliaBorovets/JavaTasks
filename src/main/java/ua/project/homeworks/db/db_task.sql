--------------------- 1----------------------
SELECT COUNT(items) AS 'SUM'
FROM (SELECT r_id AS 'items' FROM bd_task.reviews
UNION ALL
SELECT n_id AS 'items'FROM bd_task.news) AS result;

--------------------- 2----------------------

SELECT nc_name, COUNT(n_id)
FROM bd_task.news_categories 
LEFT JOIN bd_task.news ON bd_task.news.n_category = bd_task.news_categories.nc_id
GROUP BY nc_name;

--------------------- 3----------------------

SELECT rc_name, COUNT(r_id)
FROM bd_task.reviews_categories 
LEFT JOIN bd_task.reviews ON r_category = rc_id
GROUP BY rc_name;

--------------------- 4----------------------

SELECT rc_name AS 'category_name' , MAX(r_dt) AS 'last_date' 
FROM  bd_task.reviews_categories 
INNER JOIN bd_task.reviews ON r_category = rc_id
GROUP BY rc_name
UNION ALL
SELECT nc_name AS 'category_name' , MAX(n_dt) AS 'last_date' 
FROM bd_task.news_categories 
INNER JOIN bd_task.news ON n_category = nc_id
GROUP BY nc_name;

--------------------- 5----------------------
SELECT p_name, bannersPages.b_id, b_url
FROM bd_task.pages 
LEFT JOIN (SELECT p_id, banners.b_id, b_url 
FROM bd_task.m2m_banners_pages 
RIGHT JOIN bd_task.banners USING(b_id)) AS bannersPages USING(p_id)
WHERE p_parent IS NULL;

--------------------- 6----------------------

SELECT DISTINCT p_name 
FROM bd_task.pages 
RIGHT JOIN bd_task.m2m_banners_pages USING (p_id);

--------------------- 7----------------------

SELECT DISTINCT p_name
FROM bd_task.pages 
LEFT JOIN bd_task.m2m_banners_pages USING (p_id) 
WHERE b_id IS NULL;

--------------------- 8----------------------

SELECT DISTINCT b_id, b_url
FROM bd_task.banners
RIGHT JOIN bd_task.m2m_banners_pages USING(b_id);

--------------------- 9----------------------

SELECT DISTINCT b_id, b_url
FROM bd_task.banners
LEFT JOIN bd_task.m2m_banners_pages USING(b_id) 
WHERE p_id IS NULL;

--------------------- 10----------------------

SELECT b_id, b_url, b_click/b_show*100 AS rate
FROM bd_task.banners 
HAVING rate >= 80;

--------------------- 11----------------------

SELECT DISTINCT p_name
FROM bd_task.m2m_banners_pages 
JOIN bd_task.pages USING(p_id)
JOIN bd_task.banners USING(b_id)
WHERE b_text IS NOT NULL;

--------------------- 12----------------------

SELECT DISTINCT p_name
FROM bd_task.m2m_banners_pages 
JOIN bd_task.pages USING(p_id)
JOIN bd_task.banners USING(b_id)
WHERE b_pic IS NOT NULL;

--------------------- 13----------------------

SELECT n_header AS header, n_dt AS date
FROM bd_task.news 
WHERE n_dt LIKE '2011%'
UNION ALL SELECT r_header AS header, r_dt AS date
FROM bd_task.reviews 
WHERE r_dt LIKE '2011%';

--------------------- 14----------------------

SELECT nc_name AS category
FROM bd_task.news_categories 
LEFT JOIN bd_task.news ON nc_id = n_category 
WHERE n_category IS NULL
UNION ALL SELECT rc_name AS category
FROM bd_task.reviews_categories 
LEFT JOIN bd_task.reviews ON rc_id = r_category 
WHERE r_category IS NULL;

--------------------- 15----------------------

SELECT n_header , n_dt
FROM bd_task.news_categories 
LEFT JOIN bd_task.news ON nc_id = n_category
WHERE nc_name LIKE 'Логистика' AND n_dt LIKE '2012%';

--------------------- 16----------------------

SELECT year(n_dt) AS 'year' , count(n_dt)
FROM bd_task.news 
GROUP BY year 
ORDER BY year;

--------------------- 17----------------------

SELECT DISTINCT b_url, b_id FROM  bd_task.banners
WHERE b_url in (select b_url FROM bd_task.banners group by b_url having count(b_url)>=2);

--------------------- 18----------------------

SELECT p_name, b_id,  b_url 
FROM bd_task.m2m_banners_pages 
JOIN bd_task.pages USING(p_id)
JOIN bd_task.banners USING (b_id)  
WHERE p_parent=1;

--------------------- 19----------------------

SELECT b_id, b_url, b_click/b_show AS rate
FROM bd_task.banners 
WHERE b_pic IS NOT NULL 
ORDER BY rate desc;

--------------------- 20----------------------

SELECT header, date
FROM ((SELECT r_header AS header, r_dt  AS 'date' FROM bd_task.reviews) 
UNION ALL 
(SELECT n_header AS header, n_dt AS 'date' FROM bd_task.news)) AS uniontable
ORDER BY date ASC LIMIT 1;

--------------------- 21----------------------

SELECT b_url, b_id
FROM bd_task.banners 
GROUP BY b_url 
HAVING count(b_url)=1;

--------------------- 22----------------------

SELECT p_name, count(p_id) AS 'banners_count'
FROM bd_task.pages 
JOIN bd_task.m2m_banners_pages USING(p_id)
JOIN bd_task.banners USING(b_id) 
GROUP BY p_id 
ORDER BY count(p_id) DESC, p_name ASC;

--------------------- 23----------------------

(SELECT r_header AS 'header', r_dt AS 'date'
FROM bd_task.reviews 
ORDER BY r_dt DESC LIMIT 1)
UNION
(SELECT n_header AS 'header', n_dt AS 'date'
FROM bd_task.news 
ORDER BY n_dt DESC LIMIT 1);

--------------------- 24----------------------

SELECT b_id, b_url, b_text
FROM bd_task.banners 
WHERE LOCATE(b_text, b_url);

--------------------- 25----------------------

SELECT p_id, p_name, b_url, b_id
FROM  bd_task.pages 
RIGHT JOIN bd_task.m2m_banners_pages USING(p_id)
LEFT JOIN bd_task.banners USING(b_id) 
ORDER BY b_click/b_show DESC LIMIT 1;

--------------------- 26----------------------

SELECT AVG(b_click/b_show) 
FROM  bd_task.banners;

--------------------- 27----------------------

SELECT AVG(b_click/b_show) 
FROM  bd_task.banners 
WHERE b_pic IS NULL;

--------------------- 28----------------------

SELECT COUNT(p_id) AS 'COUNT'
FROM  bd_task.pages 
RIGHT JOIN bd_task.m2m_banners_pages USING(p_id)
LEFT JOIN bd_task.banners USING(b_id) 
WHERE p_parent IS NULL;

--------------------- 29----------------------

SELECT b_id, b_url, COUNT(b_url) AS 'COUNT'
FROM bd_task.banners 
RIGHT JOIN bd_task.m2m_banners_pages USING(b_id) 
GROUP BY b_url 
ORDER BY COUNT(b_url) DESC LIMIT 1;

--------------------- 30----------------------

SELECT COUNT(p_id) AS 'COUNT', p_name
FROM  bd_task.pages 
RIGHT JOIN bd_task.m2m_banners_pages USING(p_id)
GROUP BY p_name 
ORDER BY COUNT(p_id) DESC LIMIT 1;






