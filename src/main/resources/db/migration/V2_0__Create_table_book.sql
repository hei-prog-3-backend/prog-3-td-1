create table book
(
    id     serial,
    author_ref int,
    FOREIGN KEY  (author_ref) REFERENCES author(id),
    page_number int not null default 0,
    category_ref int,
    FOREIGN KEY (category_ref) REFERENCES category(id),
    release_date date,
    primary key (id)
);