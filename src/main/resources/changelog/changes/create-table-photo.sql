CREATE TABLE photo (
    id BIGSERIAL PRIMARY KEY,
    file TEXT,
    user_id BIGINT REFERENCES a_user(id)
);