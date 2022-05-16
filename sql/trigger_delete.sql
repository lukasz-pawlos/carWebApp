CREATE FUNCTION delete_advert() RETURNS TRIGGER AS $_$
BEGIN
    DELETE FROM cars WHERE cars.id = OLD.car_id;
    RETURN OLD;
END $_$ LANGUAGE 'plpgsql';

CREATE TRIGGER delete_advert
AFTER DELETE ON advertisements
FOR EACH ROW
EXECUTE PROCEDURE delete_advert();

CREATE FUNCTION delete_car() RETURNS TRIGGER AS $_$
BEGIN
    DELETE FROM parameters WHERE parameters.id = OLD.parameters_id;
    RETURN OLD;
END $_$ LANGUAGE 'plpgsql';

CREATE TRIGGER delete_car
AFTER DELETE ON cars
FOR EACH ROW
EXECUTE PROCEDURE delete_car();

DELETE FROM advertisements WHERE advertisements.id = 2;
