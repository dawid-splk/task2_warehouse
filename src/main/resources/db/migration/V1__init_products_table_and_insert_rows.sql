drop table if exists product_availability;
create table product_availability(
    id bigint primary key not null,
    quantity float not null
);