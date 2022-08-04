--Forum

INSERT INTO users (id, email, password, username) VALUES (1, 'asd@gmail.com', 'asd', 'IamGod666');
INSERT INTO topic (description, title, user_id) VALUES ('General discussion', 'General discussion', 1);
INSERT INTO post (content, reply_count, timestamp, title, view_count, topic_id, user_id) VALUES ('Are they dangerous?', 0, current_timestamp,'Rabbits', 0, 1, 1);
INSERT INTO comment (message, upvote, post_id, user_id) VALUES ('they will eat you:)', 0, 1, 1);

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- Australia-Oceania - continentId:1
INSERT INTO continent (name) VALUES ('Australia-Oceania');

-- Great Barrier reef - locationId:1
    INSERT INTO location (climate, crisis, description, name, sound, video, continent_id) VALUES ('Tropic','Rising ocean temperatures driven by human emissions of greenhouse gases have caused five mass bleaching events along the reef in 1998, 2002, 2016, 2017 and 2020. Hughes told the Guardian he believes a sixth mass bleaching event is now unfolding, and that it was not mild or local.', 'Great Barrier Reef, Extensive complex of coral reefs, shoals, and islets in the Pacific Ocean, off the northeastern coast of Australia. The largest deposit of coral in the world, it extends for more than 1,250 mi (2,000 km) along the coast of Queensland and has an area of some 135,000 sq mi (350,000 sq km).', 'Great Barrier reef', null, null, 1);
    -- Manta Ray
        INSERT INTO wildlife (crisis, description, lifetime, lifetime_interval, name, status, type, location_id) VALUES ('No current crisis', 'Manta rays are large rays belonging to the genus Mobula (formerly its own genus Manta). The larger species, M. birostris, reaches 7 m (23 ft) in width, while the smaller, M. alfredi, reaches 5.5 m (18 ft). Both have triangular pectoral fins, horn-shaped cephalic fins and large, forward-facing mouths. They are classified among the Myliobatiformes (stingrays and relatives) and are placed in the family Myliobatidae (eagle rays). They have the largest brains and brain to body ratio of all fish, and can pass the mirror test.', 40, 'year', 'Manta Ray', null, null, 1);
    -- Clownfish
        INSERT INTO wildlife (crisis, description, lifetime, lifetime_interval, name, status, type, location_id) VALUES ('No current crisis', 'The clownfish can be many different colours, depending on its species, including yellow, orange, red, and black. Most have white details. They are smaller fish, with the smallest around 7 to 8cm long and the longest 17cm long.  ', 8, 'years', 'Clownfish', null, null, 1);
    -- Potato Cod
        INSERT INTO wildlife (crisis, description, lifetime, lifetime_interval, name, status, type, location_id) VALUES ('No current crisis', 'As it is very large, has distinctive markings and is quite friendly, the potato cod is a favourite with divers. As this species has been fished out from most other parts of the world, we are very lucky in Western Australia that divers can still come face to face with them in places such as the Rowley Shoals Marine Park. Named after the large potato-shaped markings on its body, the potato cod (Epinephelus tukula) is one of the biggest members of the groper family.', 37, 'year on average', 'Potato Cod', null, null, 1);

-- Daintree Rainforest - locationId:2
    INSERT INTO location (climate, crisis, description, name, sound, video, continent_id) VALUES ('Tropical', 'Deforestation is a major threat to the Daintree Rainforest. Trees are getting cut down every single day! Animals and their habitats are getting affected by this condition.', 'The Daintree Rainforest is a landscape with striking diversity. From the dense rainforest and mountain ranges to fast flowing streams, waterfalls and gorges. With such a rich array of flora and fauna set amongst stunning scenery, there is a rich and colourful world here waiting to be discovered. The purpose of the tall helmet or casque is unknown but it may indicate dominance and age, as it continues to grow throughout life.', 'Daintree Rainforest', null, null, 1);
    -- Southern cassowary
        INSERT INTO wildlife (crisis, description, lifetime, lifetime_interval, name, status, type, location_id) VALUES ('No current crisis', 'The Southern Cassowary Casuarius casuarius johnsonii is a flightless bird with glossy black plumage, a tall, brown casque (helmet) on top of its head, a vivid blue and purple neck, long drooping red wattles and amber eyes.', 60, 'year', 'Southern cassowary', null, null, 2);

-- Scenic Rim - locationId:3
    INSERT INTO location(climate, crisis, description, name, sound, video, continent_id) VALUES ('Rural', 'No current crisis', 'The Scenic Rim region is a thriving rural paradise set in the foothills of the Great Dividing Range and surrounded by World Heritage-listed national parks. Home to a population of more than 40,000 the region covers 4254sq km and is located an hour south of Brisbane and an hour inland from the Gold Coast.', 'Scenic Rim', null, null, 1);
    -- INSERT INTO wildlife (crisis, description, lifetime, lifetime_interval, name, status, type, location_id) VALUES ('No current crisis', 'test', 60, 'year', 'Fish', null, null, 1);
        INSERT INTO wildlife (crisis, description, lifetime, lifetime_interval, name, status, type, location_id) VALUES ('No current crisis', 'Description. Koalas are well-known for their large round head, big furry ears and big black nose. Their fur is usually grey-brown in colour with white fur on the chest, inner arms, ears and bottom. They have no fur on their nose or the palms of their paws.', 15, 'year on average', 'Koala', null, null, 3);
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- North-America - ContinentId:2
INSERT INTO continent (name) VALUES ('North-America');
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- North-America - ContinentId:3
INSERT INTO continent (name) VALUES ('South-America');
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- North-America - ContinentId:4
INSERT INTO continent (name) VALUES ('Europe');
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- North-America - ContinentId:5
INSERT INTO continent (name) VALUES ('Africa');
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- North-America - ContinentId:6
INSERT INTO continent (name) VALUES ('Asia');
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
