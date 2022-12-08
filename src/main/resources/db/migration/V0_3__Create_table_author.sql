create table author (
id BIGINT primary key,
name varchar not null
);

insert into author (id, name)
SELECT distinct min(id), author
from book
where author like '%%'
group by author
;

alter table book
add column new_author integer;

update book
set new_author = author.id
from author
where author.name = book.author;

alter table book
drop column author;

alter table book
RENAME new_author to author;

alter table book
add foreign key (author)
references author(id);

