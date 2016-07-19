-- 创建用户表
create table users(username varchar(50) not null primary key,password varchar(500) not null,enabled boolean not null);
-- 创建角色表
create table authorities (username varchar(50) not null,authority varchar(50) not null,constraint fk_authorities_users foreign key(username) references users(username));
-- 关联表
create unique index ix_auth_username on authorities (username,authority);
-- 插入两个用户
insert users  VALUES('admin','admin',1);
insert users  VALUES('guest','guest',1);
-- 赋予guest权限ROLE_USER
insert authorities VALUES('guest','ROLE_USER');