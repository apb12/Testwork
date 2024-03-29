create table item (
 id  bigserial not null,
 name varchar(255),
 primary key (id)
 );
create table purchase (
 id  bigserial not null,
 age int4,
 amount numeric(19, 2),
 count int4,
 last_name varchar(255),
 name varchar(255),
 purchase_date timestamp,
 purchase_item_id int8,
  primary key (id)
    );
 alter table if exists purchase
 add constraint purchase_item_FK
 foreign key (purchase_item_id)
  references item;
