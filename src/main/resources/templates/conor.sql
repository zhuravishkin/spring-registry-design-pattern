drop table if exists subscribers;

truncate subscribers;

create table subscribers
(
    phone_number varchar          not null,
    first_name   varchar          not null,
    sur_name     varchar          not null,
    age          integer          not null,
    email        varchar          not null,
    balance      double precision not null,
    event_time   timestamp        not null,
    primary key (phone_number)
);

insert into subscribers (phone_number, first_name, sur_name, age, email, balance, event_time)
values ('79306661000', 'Sam', 'Winchester', 25, 'dean@gmail.com', 100.0, '2019-02-13 18:01:01'),
       ('79306661001', 'Dean', 'Winchester', 30, 'sam@gmail.com', 530.5, '2019-02-21 18:05:01'),
       ('79306661003', 'Fergus Roderick', 'MacLeod', 43, 'crowley@gmail.com', 5000.0, '2019-05-30 18:11:01');