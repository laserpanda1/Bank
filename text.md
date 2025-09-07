Стартовые для файла data.sql(Когда приложение будет готово , для тестов)

-- Очищаем таблицы (если нужно)
DELETE FROM transaction;
DELETE FROM bank_account_transactions;
DELETE FROM bank_account;
DELETE FROM bank_accounts;
DELETE FROM app_user;  -- если вы переименовали user в app_user
DELETE FROM bank;

-- Заполняем банки
INSERT INTO bank (name, city, country, rating) VALUES
('Сбербанк', 'Москва', 'Россия', 'AAA'),
('ВТБ', 'Москва', 'Россия', 'AA'),
('Тинькофф', 'Москва', 'Россия', 'A');

-- Заполняем пользователей
INSERT INTO app_user (name, surname, email) VALUES
('Иван', 'Иванов', 'ivan@mail.ru'),
('Петр', 'Петров', 'petr@gmail.com'),
('Мария', 'Сидорова', 'maria@yandex.ru');

-- Заполняем банковские счета
INSERT INTO bank_account (account_number, account_type, currency, balance, bank_id, user_id, created_at) VALUES
('40817810099910004312', 'CURRENT', 'RUB', 150000.50, 1, 1, NOW()),
('40817810188820005678', 'SAVINGS', 'RUB', 500000.00, 2, 2, NOW()),
('40817810277730006999', 'CURRENT', 'USD', 5000.00, 3, 3, NOW());

-- Заполняем транзакции
INSERT INTO transaction (amount, currency, type, status, source_account_id, target_account_id) VALUES
(5000.00, 'RUB', 'TRANSFER', 'VERIFY', 1, 2),
(1000.00, 'RUB', 'DEPOSIT', 'VERIFY', NULL, 1),
(200.00, 'USD', 'WITHDRAWAL', 'DENY', 3, NULL);