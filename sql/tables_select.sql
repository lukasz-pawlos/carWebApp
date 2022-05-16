SELECT * FROM cars;
SELECT * FROM advertisements;
SELECT * FROM parameters;

-- Brands & models
SELECT car_body, model_name, country, brand_name FROM car_models
JOIN car_brands cb on car_models.car_brand_id = cb.id;

-- Cars
SELECT brand_name, model_name, car_body, country, color, power FROM cars
JOIN car_models cm on cars.car_model_id = cm.id
JOIN car_brands cb on cm.car_brand_id = cb.id
JOIN parameters p on cars.parameters_id = p.id;

-- Advertisements
SELECT price, brand_name, model_name, car_body, country, color, power, description FROM advertisements
JOIN cars c on advertisements.car_id = c.id
JOIN car_models cm on c.car_model_id = cm.id
JOIN car_brands cb on cm.car_brand_id = cb.id
JOIN parameters p on c.parameters_id = p.id;

-- Advertisements with filtration
SELECT brand_name, model_name, car_body, color, price, power, vintage, mileage, fuel FROM advertisements
JOIN cars c on advertisements.car_id = c.id
JOIN car_models cm on c.car_model_id = cm.id
JOIN car_brands cb on cm.car_brand_id = cb.id
JOIN parameters p on c.parameters_id = p.id
WHERE price BETWEEN 80000 AND 2000000
AND power BETWEEN 200 AND 400
AND vintage BETWEEN 2014 AND 2022
AND mileage BETWEEN 100000 AND 1000000
AND fuel LIKE 'petrol';