
CREATE TABLE parameters(
    id          SERIAL          PRIMARY KEY,
    color       VARCHAR(20)     not null,
    vintage     INT             not null,
    mileage     INT             not null,
    power       INT             not null,
    fuel        VARCHAR(10)     not null
);

CREATE TABLE car_brands(
    id          SERIAL             PRIMARY KEY,
    country     VARCHAR(20)        not null,
    brand_name  VARCHAR(20)        not null unique
);

CREATE TABLE car_models(
    id              SERIAL             PRIMARY KEY,
    car_body        VARCHAR(20)        not null,
    model_name      VARCHAR(20)        not null unique,
    car_brand_id    BIGINT             not null,
    FOREIGN KEY(car_brand_id) REFERENCES car_brands(id)
);

CREATE TABLE cars(
    id              SERIAL      PRIMARY KEY,
    car_model_id    BIGINT      not null,
    parameters_id   BIGINT      not null,
    FOREIGN KEY(car_model_id) REFERENCES car_models(id),
    FOREIGN KEY(parameters_id) REFERENCES parameters(id)
);

CREATE TABLE advertisements(
    id              SERIAL             PRIMARY KEY,
    title           VARCHAR(30)        not null,
    description     VARCHAR(200)        not null,
    phone           VARCHAR(15)        not null,
    email           VARCHAR(50)        not null,
    price           INT                not null,
    secret_key      VARCHAR(255)       not null,
    car_id          BIGINT             not null,
    FOREIGN KEY(car_id) REFERENCES cars(id)
);

