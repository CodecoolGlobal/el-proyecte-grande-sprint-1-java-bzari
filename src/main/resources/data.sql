INSERT INTO users (id, email, password, username) VALUES (1, 'asd', 'asd', 'asd');
INSERT INTO topic (description, title, user_id) VALUES ('asd', 'asd', 1);
INSERT INTO post (reply_count, view_count, topic_id, user_id) VALUES (0, 0, 1, 1);
INSERT INTO comment (upvote, post_id, user_id) VALUES (0, 1, 1);