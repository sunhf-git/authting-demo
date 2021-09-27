
create table casbin_model
(
    pid bigserial
        primary key,
    id varchar(32) not null,
    model_status varchar(20) default 'INFORCE' null,
    create_time timestamp null,
    modify_time timestamp null,
    model_def text null
);

