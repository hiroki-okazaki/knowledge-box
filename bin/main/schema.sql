CREATE TABLE IF NOT EXISTS language (
language_id int NOT NULL AUTO_INCREMENT COMMENT '言語ID',  
name varchar(255) NOT NULL COMMENT '言語名',   
note varchar(255) COMMENT '備考',
PRIMARY KEY (language_id) );