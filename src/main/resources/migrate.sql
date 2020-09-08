-- NO_AUTO_CREATE_USERを消す事で、存在しないユーザーにGRANT文を発行した場合自動的に新規ユーザーを作成しGRANT文が発行されるように設定
SET GLOBAL sql_mode = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE DATABASE {project_name} CHARACTER SET utf8;