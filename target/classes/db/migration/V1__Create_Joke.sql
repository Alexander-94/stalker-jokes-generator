create table JOKE (
    ID SERIAL PRIMARY KEY,
    TEXT VARCHAR NOT NULL
);

create unique index JOKE_TEXT_UK on JOKE (TEXT);
