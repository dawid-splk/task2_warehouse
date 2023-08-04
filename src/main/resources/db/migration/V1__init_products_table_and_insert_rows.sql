drop table if exists products;
create table products(
    id bigint primary key not null,
    quantity float not null
);