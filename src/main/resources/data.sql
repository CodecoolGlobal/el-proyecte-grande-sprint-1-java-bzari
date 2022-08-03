INSERT INTO users (id, email, password, username) VALUES (1, 'asd', 'asd', 'testUsername');
INSERT INTO topic (description, title, user_id) VALUES ('asd', 'testTopic', 1);
INSERT INTO post (content, reply_count, title, view_count, topic_id, user_id) VALUES ('asd', 0, 'testPostTitle', 0, 1, 1);
INSERT INTO comment (message, upvote, post_id, user_id) VALUES ('testComment', 0, 1, 1);