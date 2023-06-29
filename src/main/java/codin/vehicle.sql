--Extraire la liste de véhicules 'vehicle' par marque 'make'.
--Seules les marques qui comptent 2 véhicules ou plus doivent être affichées.
--SQL request(s) below
SELECT make, COUNT(*) AS vehicle_make_count
FROM vehicle
GROUP BY make
HAVING count(*) >= 2;

--Extraire les véhicules 'vehicle' n'ayant aucune pièce 'vehicle_part' associée. colonne attendu vehicle_id
--SQL request(s) below
SELECT vehicle_id
FROM vehicle
WHERE vehicle_id NOT IN (SELECT vehicle_id FROM vehicle_part);

--Extraire les emplacements des pièces de véhicule 'vehicle_part_location' pour lesquels 'location_id' est égale à
-- 3, 6, OU 12 et ayant une date de sortie (left_timestamp) définie.
--SQL request(s) below
SELECT vehicle_part_id, arrived_timestamp
FROM vehicle_part_location
WHERE location_id IN (3, 6, 12) AND left_timestamp IS NOT NULL;