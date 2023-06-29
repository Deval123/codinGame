--Extraire la liste des provinces 'state_province' de la table 'location'.
-- Colonne attendue: 'state_province'. Trier les lignes dans l'ordre alphabetique.
--SQL request(s) below
SELECT DISTINCT state_province
FROM location
ORDER BY state_province ASC ;