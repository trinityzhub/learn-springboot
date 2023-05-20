-- Drop user first if they exist
DROP USER if exists 'springstudent'@'172.18.0.17' ;

-- Now create user with prop privileges
CREATE USER 'springstudent'@'172.18.0.17' IDENTIFIED BY 'springstudent';

GRANT ALL PRIVILEGES ON * . * TO 'springstudent'@'172.18.0.17';