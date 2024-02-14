CREATE TABLE photo (
    id BIGSERIAL PRIMARY KEY,
    file BYTEA,
    user_id BIGINT REFERENCES a_user(id)
);