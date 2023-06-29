CREATE TABLE product_category (
  product_category_id INTEGER,
  name VARCHAR(50),
  description VARCHAR(255)
);

CREATE TABLE product (
  product_id INTEGER,
  #product_category_id INTEGER,
  name VARCHAR(50),
  description VARCHAR(255),
  price DECIMAL(5,2),
  available_stock INTEGER
);


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
  order_id INTEGER,
  product_id INTEGER
);

-- Modify the query to select all customers who purchased an average of more than 2 items per order.
-- The result should be sorted in descending order of average number of items.
-- The average number of items must be given in decimal numbers.
-- Display only 'CUSTOMER_ID', 'FIRSTNAME', 'LASTNAME', and 'AVG' (average number of items) columns.
--SQL request(s) below
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

