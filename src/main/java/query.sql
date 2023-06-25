CREATE TABLE customer (
  customer_id INTEGER,
  firstname VARCHAR(50),
  lastname VARCHAR(50),
  register_date DATE,
  birth_date DATE,
  address VARCHAR(255),
  city VARCHAR(50)
);

CREATE TABLE purchase_order (
  order_id INTEGER,
  #customer_id INTEGER,
  date DATE
);

CREATE TABLE order_product (
  #order_id INTEGER,
  #product_id INTEGER
);

CREATE TABLE product (
  product_id INTEGER,
  #product_category_id INTEGER,
  name VARCHAR(50),
  description VARCHAR(255),
  price DECIMAL(5,2),
  available_stock INTEGER
);

CREATE TABLE product_category (
  product_category_id INTEGER,
  name VARCHAR(50),
  description VARCHAR(255)
);
Modifier la requête sql pour sélectionner tous les produits (product) ayant un prix strictement supérieur à 100.
Le résultat doit être trié par ordre décroissant de prix (price).
Afficher uniquement les colonnes CUSTOMER_ID, FIRSTNAME, LASTNAME et AVG le nombre d'article acheté

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
