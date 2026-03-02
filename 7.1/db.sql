DROP DATABASE IF EXISTS currency_converter;
CREATE DATABASE currency_converter;
USE currency_converter;

CREATE TABLE currency (
abbr VARCHAR(3) NOT NULL,
name VARCHAR(30) NOT NULL,
conversion_to_EUR DECIMAL(10,2) NOT NULL,
PRIMARY KEY (abbr)
);

INSERT INTO currency (abbr,name,conbersion_to_EUR) VALUES
('USD', 'United States Dollar', 0.85),
('AUD', 'Australian Dollar', 0.60),
('CAD', 'Canadian Dollar', 0.62),
('GBP', 'British Pound', 1.14),
('CNY', 'Chinese Yuan', 0.12),
('JPY', 'Japanese Yen', 0.01),
('RUB', 'Russian Ruble', 0.01),
('INR', 'Indian Rupee', 0.01),
('ILS', 'Israeli New Sheqel', 0.28);

DROP USER IF EXISTS 'appuser'@'localhost';
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'password';
GRANT SELECT ON currency_converter.currency TO 'appuser'@'localhost';
