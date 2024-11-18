--CREATE SCHEMA healenium AUTHORIZATION healenium_user;
--GRANT USAGE ON SCHEMA healenium TO healenium_user;

CREATE DATABASE healenium;
CREATE USER healenium_user WITH ENCRYPTED PASSWORD 'mahesh';
GRANT ALL PRIVILEGES ON DATABASE healenium TO healenium_user;
ALTER USER healenium_user WITH SUPERUSER;
