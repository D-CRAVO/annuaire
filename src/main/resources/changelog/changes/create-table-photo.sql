CREATE TABLE photo (
    id BIGSERIAL PRIMARY KEY,
    file TEXT,
    a_user_id BIGINT REFERENCES a_user(id)
);