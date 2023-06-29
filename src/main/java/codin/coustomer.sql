-- Modify the query to select all customers who purchased an average of more than 2 items per order.
-- The result should be sorted in descending order of average number of items.
-- The average number of items must be given in decimal numbers.
-- Display only 'CUSTOMER_ID', 'FIRSTNAME', 'LASTNAME', and 'AVG' (average number of items) columns.
-- SQL request(s) below
SELECT
  customer.customer_id,
  customer.firstname,
  customer.lastname,
  AVG(COUNT(order_product.product_id)) AS avg_items
FROM
  customer
JOIN
  purchase_order ON customer.customer_id = purchase_order.customer_id
JOIN
  order_product ON purchase_order.order_id = order_product.order_id
GROUP BY
  customer.customer_id,
  customer.firstname,
  customer.lastname
HAVING
  AVG(COUNT(order_product.product_id)) > 2
ORDER BY
  avg_items DESC;


-- Modifier la requête sql pour sélectionner tous les produits (product) ayant un prix strictement supérieur à 100.
-- Le résultat doit être trié par ordre décroissant de prix (price).
-- Afficher uniquement les colonnes CUSTOMER_ID, FIRSTNAME, LASTNAME et AVG le nombre d'article acheté
-- SQL request(s) below
SELECT
    c.customer_id AS CUSTOMER_ID,
    c.firstname AS FIRSTNAME,
    c.lastname AS LASTNAME,
    AVG(op.product_id) AS AVG_NUM_ARTICLES_PURCHASED
FROM
    customer c
        JOIN
    purchase_order po ON c.customer_id = po.customer_id
        JOIN
    order_product op ON po.order_id = op.order_id
        JOIN
    product p ON op.product_id = p.product_id
WHERE
        p.price > 100
GROUP BY
    c.customer_id,
    c.firstname,
    c.lastname
ORDER BY
    p.price DESC;
-- pour tous les produits calculer la valeur unitaire value/ available_stock sous forme de nombre decimal
-- s'il n'y a pas de stock, renvoyer la valeur nulle trier les lignes par  ordre décroissant de unit_value, plus par ordre croissant de product_id
-- SQL request(s) below
SELECT product_id, ROUND(CAST(value AS DECIMAL) / available_stock, 2) AS unit_value
FROM product;