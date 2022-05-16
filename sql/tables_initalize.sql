INSERT INTO car_brands (brand_name, country) VALUES ('Mercedes', 'Germany');
INSERT INTO car_brands (brand_name, country) VALUES ('BMW', 'Germany');
INSERT INTO car_brands (brand_name, country) VALUES ('Porsche', 'Germany');
INSERT INTO car_brands (brand_name, country) VALUES ('Ferrari', 'Italy');
INSERT INTO car_brands (brand_name, country) VALUES ('Skoda', 'Czech Republic');
INSERT INTO car_brands (brand_name, country) VALUES ('Ford', 'United States');
INSERT INTO car_brands (brand_name, country) VALUES ('Peugeot', 'France');
INSERT INTO car_brands (brand_name, country) VALUES ('Aston Martin', 'United Kingdom');
INSERT INTO car_brands (brand_name, country) VALUES ('Mazda', 'Japan');

INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Coupe', 'CLA', 1);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('SUV', 'G-class', 1);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Sedan', 'S-class', 1);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Coupe', 'E46', 2);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('SUV', 'X5', 2);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Sedan', 'I7', 2);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Roadster', 'Cayman', 3);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Coupe', 'Carrera GT', 3);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Coupe', 'Italia', 4);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Coupe', 'Enzo', 4);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Sedan', 'Octavia', 5);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('SUV', 'Kodiaq', 5);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Coupe', 'Mustang', 6);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Sedan', 'Focus', 6);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Coupe', 'GT', 6);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Sedan', '605', 7);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('SUV', '3008', 7);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Coupe', 'DB9', 8);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Coupe', 'Lagonda', 8);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Coupe', 'DB11', 8);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Coupe', 'RX8', 9);
INSERT INTO car_models (car_body, model_name, car_brand_id) VALUES ('Sedan', 'RX7', 9);

INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('silver', 2019, 120000, 300, 'petrol');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('black', 2017, 163000, 250, 'diesel');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('white', 2020, 1170000, 350, 'petrol');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('dark-blue', 2021, 200000, 200, 'petrol');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('yellow', 2014, 81000, 270, 'diesel');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('green', 2016, 43000, 410, 'diesel');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('yellow', 2013, 147000, 370, 'diesel');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('purple', 2019, 139000, 290, 'petrol');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('red', 2021, 35000, 370, 'diesel');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('red', 2020, 75000, 320, 'petrol');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('white', 2009, 300000, 190, 'diesel');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('black', 2011, 260000, 200, 'diesel');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('red', 2017, 150000, 290, 'diesel');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('brown', 2016, 190000, 200, 'petrol');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('pink', 2020, 100000, 450, 'diesel');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('yellow', 2014, 290000, 200, 'petrol');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('silver', 2012, 3450000, 230, 'diesel');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('green', 2021, 50000, 450, 'diesel');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('red', 2019, 100000, 200, 'petrol');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('gold', 2020, 75000, 230, 'diesel');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('black', 2017, 83000, 230, 'petrol');
INSERT INTO parameters(color, vintage, mileage, power, fuel) VALUES('orange', 2006, 480000, 230, 'diesel');

INSERT INTO cars(car_model_id, parameters_id) VALUES(1, 1);
INSERT INTO cars(car_model_id, parameters_id) VALUES(2, 2);
INSERT INTO cars(car_model_id, parameters_id) VALUES(3, 3);
INSERT INTO cars(car_model_id, parameters_id) VALUES(4, 4);
INSERT INTO cars(car_model_id, parameters_id) VALUES(5, 5);
INSERT INTO cars(car_model_id, parameters_id) VALUES(6, 6);
INSERT INTO cars(car_model_id, parameters_id) VALUES(7, 7);
INSERT INTO cars(car_model_id, parameters_id) VALUES(8, 8);
INSERT INTO cars(car_model_id, parameters_id) VALUES(9, 9);
INSERT INTO cars(car_model_id, parameters_id) VALUES(10, 10);
INSERT INTO cars(car_model_id, parameters_id) VALUES(11, 11);
INSERT INTO cars(car_model_id, parameters_id) VALUES(12, 12);
INSERT INTO cars(car_model_id, parameters_id) VALUES(13, 13);
INSERT INTO cars(car_model_id, parameters_id) VALUES(14, 14);
INSERT INTO cars(car_model_id, parameters_id) VALUES(15, 15);
INSERT INTO cars(car_model_id, parameters_id) VALUES(16, 16);
INSERT INTO cars(car_model_id, parameters_id) VALUES(17, 17);
INSERT INTO cars(car_model_id, parameters_id) VALUES(18, 18);
INSERT INTO cars(car_model_id, parameters_id) VALUES(19, 19);
INSERT INTO cars(car_model_id, parameters_id) VALUES(20, 20);
INSERT INTO cars(car_model_id, parameters_id) VALUES(21, 21);
INSERT INTO cars(car_model_id, parameters_id) VALUES(22, 22);

-- Mercedes
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 1', 'Do sprzedania Mercedes, fajny', '123 456 789', 'przyklad1@gmail.com', 150000, '3ec09be8-0198-4ce5-b5da-28acee8ec6bc', 1);
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 2', 'G-klasa idealna na wycieczki', '234 567 891', 'przyklad2@gmail.com', 600000, '8d18379b-fe84-4b69-8447-8cec413ac15e', 2);
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 3', 'Luksus Panie, luksus', '345 678 912', 'przyklad3@gmail.com', 500000, '2ec0952d-e067-41a1-9597-d444aa0cbdac', 3);

-- BMW
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 4', 'Do sprzedania BMW, fajne', '123 456 789', 'przyklad4@gmail.com', 200000, '00b09599-8f3c-4ac9-9582-90731d496283', 4);
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 5', 'X5 idealna na wycieczki', '234 567 891', 'przyklad5@gmail.com', 170000, '3db15a23-24bb-4ebc-a5d1-4a82130875ce', 5);
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 6', 'Niemiec płakał jak sprzedawał', '345 678 912', 'przyklad6@gmail.com', 60000, '0129a1f9-46c6-480b-8b4d-68404f3044c3', 6);

-- Porsche
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 7', 'Przykładowy opis 7', '123 456 789', 'przyklad7@gmail.com', 300000, '8d05f257-7264-44b0-ab18-9a96675ba13a', 7);
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 8', 'Przykładowy opis 8', '234 567 891', 'przyklad8@gmail.com', 800000, 'acf720e7-a2dd-410c-b57a-38214755ea60', 8);

-- Ferrari
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 9', 'Przykładowy opis 9', '876 543 219', 'przyklad9@gmail.com', 2000000, 'd5f4230f-f630-4236-9a87-02fd55abd13c', 9);
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 10', 'Przykładowy opis 10', '987 654 321', 'przyklad10@gmail.com', 3500000, '47cb2ed8-02ef-4646-bdb4-9263be7219c8', 10);

-- Skoda
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 11', 'Przykładowy opis 11', '876 523 219', 'przyklad11@gmail.com', 8000, 'fe4897d9-b33b-4d88-ab26-ca2f7f6f98af', 11);
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 12', 'Przykładowy opis 12', '987 154 391', 'przyklad12@gmail.com', 13000, '7d844d91-b9cf-4c9b-89fe-cec02d5a8e6b', 12);

-- Ford
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 13', 'Przykładowy opis 13', '163 476 719', 'przyklad13@gmail.com', 320000, '3e807105-a8e0-438c-8188-4d0c634b2c4d', 13);
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 14', 'Przykładowy opis 14', '234 267 890', 'przyklad14@gmail.com', 180000, 'feb057ac-b0d0-40eb-913a-d1755b3352b4', 14);
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 15', 'Przykładowy opis 15', '445 676 912', 'przyklad15@gmail.com', 735000, '575830ab-9436-40a4-a2d0-83bd8d11332e', 15);

-- Peugeot
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 16', 'Przykładowy opis 16', '176 528 313', 'przyklad16@gmail.com', 21000, 'cf81a015-2b55-4a9c-8eee-49df593d6188', 16);
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 17', 'Przykładowy opis 17', '927 104 396', 'przyklad17@gmail.com', 24700, 'b9f76d1f-79be-4418-aa4e-f1784f62d182', 17);

-- Aston Martin
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 18', 'Przykładowy opis 18', '463 336 119', 'przyklad18@gmail.com', 620000, 'd3b6d47d-2254-4f32-9a98-9c0e5f0bcb11', 18);
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 19', 'Przykładowy opis 19', '934 067 090', 'przyklad19@gmail.com', 1100000, 'f13c97db-1ef9-4c7c-bfc2-98608ce05e08', 19);
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 20', 'Przykładowy opis 20', '645 672 917', 'przyklad20@gmail.com', 4300000, '235ac9d3-a5ac-47a6-bbc1-310d8e2fb72d', 20);

-- Mazda
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 21', 'Przykładowy opis 21', '136 528 713', 'przyklad21@gmail.com', 63000, '4c3b3315-c284-46e0-af99-0a08376e8dde', 21);
INSERT INTO advertisements(title, description, phone, email, price, secret_key, car_id)
VALUES('Ogloszenie 22', 'Przykładowy opis 22', '927 154 395', 'przyklad22@gmail.com', 82000, '7a820a23-4847-4dc3-8e5c-f868155ebfe2', 22);