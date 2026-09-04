create TABLE images(
    id BIGINT auto_increment PRIMARY KEY,
    path VARCHAR (255) not null,
    article_id BIGINT,
    foreign key (article_id) references articles(id)
)