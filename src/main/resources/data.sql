INSERT INTO users (id, email, password, username) VALUES (1, 'asd@gmail.com', 'asd', 'IamGod666');
INSERT INTO topic (description, title, user_id) VALUES ('General discussion', 'General discussion', 1);
INSERT INTO post (content, reply_count, timestamp, title, view_count, topic_id, user_id) VALUES ('Are they dangerous?', 0, current_timestamp,'Rabbits', 0, 1, 1);
INSERT INTO comment (message, upvote, post_id, user_id) VALUES ('they will eat you:)', 0, 1, 1);