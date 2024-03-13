INSERT INTO AUTHOR (id, first_name, last_name) VALUES (1, 'J.K.', 'Rowling');
INSERT INTO AUTHOR (id, first_name, last_name) VALUES (2, 'George R.R.', 'Martin');
INSERT INTO AUTHOR (id, first_name, last_name) VALUES (3, 'Agatha', 'Christie');
INSERT INTO AUTHOR (id, first_name, last_name) VALUES (4, 'Haruki', 'Murakami');
INSERT INTO AUTHOR (id, first_name, last_name) VALUES (5, 'Chimamanda Ngozi', 'Adichie');
INSERT INTO AUTHOR (id, first_name, last_name) VALUES (6, 'Stephen', 'King');
INSERT INTO AUTHOR (id, first_name, last_name) VALUES (7, 'Gabriel García', 'Márquez');
INSERT INTO AUTHOR (id, first_name, last_name) VALUES (8, 'Jane', 'Austen');
INSERT INTO AUTHOR (id, first_name, last_name) VALUES (9, 'Murilo', 'Rubião');
INSERT INTO AUTHOR (id, first_name, last_name) VALUES (10, 'Paulo', 'Coelho');

INSERT INTO BOOK (id, name) VALUES (1, 'Harry Potter and the Sorcerer''s Stone');
INSERT INTO BOOK (id, name) VALUES (2, 'A Game of Thrones');
INSERT INTO BOOK (id, name) VALUES (3, 'Murder on the Orient Express');
INSERT INTO BOOK (id, name) VALUES (4, 'Norwegian Wood');
INSERT INTO BOOK (id, name) VALUES (5, 'Half of a Yellow Sun');
INSERT INTO BOOK (id, name) VALUES (6, 'It');
INSERT INTO BOOK (id, name) VALUES (7, 'One Hundred Years of Solitude');
INSERT INTO BOOK (id, name) VALUES (8, 'Pride and Prejudice');
INSERT INTO BOOK (id, name) VALUES (9, 'The Ex-Magician');
INSERT INTO BOOK (id, name) VALUES (10, 'The Alchemist');

INSERT INTO AUTHOR_BOOK (author_id, book_id) VALUES (1, 1);
INSERT INTO AUTHOR_BOOK (author_id, book_id) VALUES (2, 2);
INSERT INTO AUTHOR_BOOK (author_id, book_id) VALUES (3, 3);
INSERT INTO AUTHOR_BOOK (author_id, book_id) VALUES (4, 4);
INSERT INTO AUTHOR_BOOK (author_id, book_id) VALUES (5, 5);
INSERT INTO AUTHOR_BOOK (author_id, book_id) VALUES (6, 6);
INSERT INTO AUTHOR_BOOK (author_id, book_id) VALUES (7, 7);
INSERT INTO AUTHOR_BOOK (author_id, book_id) VALUES (8, 8);
INSERT INTO AUTHOR_BOOK (author_id, book_id) VALUES (9, 9);
INSERT INTO AUTHOR_BOOK (author_id, book_id) VALUES (10, 10);

-- Inserts para a tabela BOOK_TYPE
INSERT INTO BOOK_TYPE (id, description) VALUES (1, 'Fantasia');
INSERT INTO BOOK_TYPE (id, description) VALUES (2, 'Fantasia');
INSERT INTO BOOK_TYPE (id, description) VALUES (3, 'Mistério');
INSERT INTO BOOK_TYPE (id, description) VALUES (4, 'Ficção');
INSERT INTO BOOK_TYPE (id, description) VALUES (5, 'Ficção');
INSERT INTO BOOK_TYPE (id, description) VALUES (6, 'Terror');
INSERT INTO BOOK_TYPE (id, description) VALUES (7, 'Realismo Mágico');
INSERT INTO BOOK_TYPE (id, description) VALUES (8, 'Romance');
INSERT INTO BOOK_TYPE (id, description) VALUES (9, 'Fantasia');
INSERT INTO BOOK_TYPE (id, description) VALUES (10, 'Ficção');


-- Inserts para a tabela BOOK_BOOK_TYPE
INSERT INTO BOOK_BOOK_TYPE (book_id, book_type_id) VALUES (1, 1);
INSERT INTO BOOK_BOOK_TYPE (book_id, book_type_id) VALUES (2, 2);
INSERT INTO BOOK_BOOK_TYPE (book_id, book_type_id) VALUES (3, 3);
INSERT INTO BOOK_BOOK_TYPE (book_id, book_type_id) VALUES (4, 4);
INSERT INTO BOOK_BOOK_TYPE (book_id, book_type_id) VALUES (5, 5);
INSERT INTO BOOK_BOOK_TYPE (book_id, book_type_id) VALUES (6, 6);
INSERT INTO BOOK_BOOK_TYPE (book_id, book_type_id) VALUES (7, 7);
INSERT INTO BOOK_BOOK_TYPE (book_id, book_type_id) VALUES (8, 8);
INSERT INTO BOOK_BOOK_TYPE (book_id, book_type_id) VALUES (9, 9);
INSERT INTO BOOK_BOOK_TYPE (book_id, book_type_id) VALUES (10, 10);

COMMIT;
