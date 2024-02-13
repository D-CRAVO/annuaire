CREATE TABLE a_user(
    id BIGSERIAL PRIMARY KEY,
    firstname TEXT,
    lastname TEXT NOT NULL,
    address TEXT,
    zip_code TEXT,
    city TEXT
);