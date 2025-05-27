CREATE TABLE IF NOT EXISTS accounts (
    id INTEGER PRIMARY KEY,
    name TEXT NOT NULL,
    balance DOUBLE NOT NULL
);

-- Sample data
INSERT INTO accounts (id, name, balance) VALUES (1, 'Alice', 1000.0);
INSERT INTO accounts (id, name, balance) VALUES (2, 'Bob', 500.0);
