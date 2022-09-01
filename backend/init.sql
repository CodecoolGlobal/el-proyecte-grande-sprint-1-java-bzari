--
-- PostgreSQL database dump
--

-- Dumped from database version 12.12 (Ubuntu 12.12-0ubuntu0.20.04.1)
-- Dumped by pg_dump version 12.12 (Ubuntu 12.12-0ubuntu0.20.04.1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: application_user; Type: TABLE; Schema: public; Owner: aron
--

CREATE TABLE public.application_user (
    id bigint NOT NULL,
    email character varying(255),
    password character varying(255),
    type character varying(255),
    username character varying(255)
);


ALTER TABLE public.application_user OWNER TO aron;

--
-- Name: application_user_id_seq; Type: SEQUENCE; Schema: public; Owner: aron
--

CREATE SEQUENCE public.application_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.application_user_id_seq OWNER TO aron;

--
-- Name: application_user_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: aron
--

ALTER SEQUENCE public.application_user_id_seq OWNED BY public.application_user.id;


--
-- Name: comment; Type: TABLE; Schema: public; Owner: aron
--

CREATE TABLE public.comment (
    id bigint NOT NULL,
    message character varying(255),
    "timestamp" timestamp without time zone,
    upvote integer NOT NULL,
    post_id bigint,
    user_id bigint
);


ALTER TABLE public.comment OWNER TO aron;

--
-- Name: comment_id_seq; Type: SEQUENCE; Schema: public; Owner: aron
--

CREATE SEQUENCE public.comment_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.comment_id_seq OWNER TO aron;

--
-- Name: comment_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: aron
--

ALTER SEQUENCE public.comment_id_seq OWNED BY public.comment.id;


--
-- Name: continent; Type: TABLE; Schema: public; Owner: aron
--

CREATE TABLE public.continent (
    id bigint NOT NULL,
    altitude numeric(19,2),
    longitude numeric(19,2),
    name character varying(255)
);


ALTER TABLE public.continent OWNER TO aron;

--
-- Name: continent_id_seq; Type: SEQUENCE; Schema: public; Owner: aron
--

CREATE SEQUENCE public.continent_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.continent_id_seq OWNER TO aron;

--
-- Name: continent_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: aron
--

ALTER SEQUENCE public.continent_id_seq OWNED BY public.continent.id;


--
-- Name: location; Type: TABLE; Schema: public; Owner: aron
--

CREATE TABLE public.location (
    id bigint NOT NULL,
    altitude numeric(19,2),
    climate character varying(255),
    crisis text,
    description text,
    longitude numeric(19,2),
    name character varying(255),
    sound character varying(255),
    video character varying(255),
    continent_id bigint
);


ALTER TABLE public.location OWNER TO aron;

--
-- Name: location_id_seq; Type: SEQUENCE; Schema: public; Owner: aron
--

CREATE SEQUENCE public.location_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.location_id_seq OWNER TO aron;

--
-- Name: location_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: aron
--

ALTER SEQUENCE public.location_id_seq OWNED BY public.location.id;


--
-- Name: post; Type: TABLE; Schema: public; Owner: aron
--

CREATE TABLE public.post (
    id bigint NOT NULL,
    content character varying(255),
    reply_count integer NOT NULL,
    "timestamp" timestamp without time zone,
    title character varying(255),
    view_count integer NOT NULL,
    topic_id bigint,
    user_id bigint
);


ALTER TABLE public.post OWNER TO aron;

--
-- Name: post_id_seq; Type: SEQUENCE; Schema: public; Owner: aron
--

CREATE SEQUENCE public.post_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.post_id_seq OWNER TO aron;

--
-- Name: post_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: aron
--

ALTER SEQUENCE public.post_id_seq OWNED BY public.post.id;


--
-- Name: topic; Type: TABLE; Schema: public; Owner: aron
--

CREATE TABLE public.topic (
    id bigint NOT NULL,
    description character varying(255),
    "timestamp" timestamp without time zone,
    title character varying(255),
    user_id bigint
);


ALTER TABLE public.topic OWNER TO aron;

--
-- Name: topic_id_seq; Type: SEQUENCE; Schema: public; Owner: aron
--

CREATE SEQUENCE public.topic_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.topic_id_seq OWNER TO aron;

--
-- Name: topic_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: aron
--

ALTER SEQUENCE public.topic_id_seq OWNED BY public.topic.id;


--
-- Name: wildlife; Type: TABLE; Schema: public; Owner: aron
--

CREATE TABLE public.wildlife (
    id bigint NOT NULL,
    crisis text,
    description text,
    lifetime double precision NOT NULL,
    lifetime_interval character varying(255),
    name character varying(255),
    status character varying(255),
    type character varying(255),
    location_id bigint
);


ALTER TABLE public.wildlife OWNER TO aron;

--
-- Name: wildlife_id_seq; Type: SEQUENCE; Schema: public; Owner: aron
--

CREATE SEQUENCE public.wildlife_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.wildlife_id_seq OWNER TO aron;

--
-- Name: wildlife_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: aron
--

ALTER SEQUENCE public.wildlife_id_seq OWNED BY public.wildlife.id;


--
-- Name: application_user id; Type: DEFAULT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.application_user ALTER COLUMN id SET DEFAULT nextval('public.application_user_id_seq'::regclass);


--
-- Name: comment id; Type: DEFAULT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.comment ALTER COLUMN id SET DEFAULT nextval('public.comment_id_seq'::regclass);


--
-- Name: continent id; Type: DEFAULT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.continent ALTER COLUMN id SET DEFAULT nextval('public.continent_id_seq'::regclass);


--
-- Name: location id; Type: DEFAULT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.location ALTER COLUMN id SET DEFAULT nextval('public.location_id_seq'::regclass);


--
-- Name: post id; Type: DEFAULT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.post ALTER COLUMN id SET DEFAULT nextval('public.post_id_seq'::regclass);


--
-- Name: topic id; Type: DEFAULT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.topic ALTER COLUMN id SET DEFAULT nextval('public.topic_id_seq'::regclass);


--
-- Name: wildlife id; Type: DEFAULT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.wildlife ALTER COLUMN id SET DEFAULT nextval('public.wildlife_id_seq'::regclass);


--
-- Data for Name: application_user; Type: TABLE DATA; Schema: public; Owner: aron
--

COPY public.application_user (id, email, password, type, username) FROM stdin;
1	asd@gmail.com	asd	ADMIN	IamGod666
2	anot@gmail.com	asd	USER	IamNotGod666
\.


--
-- Data for Name: comment; Type: TABLE DATA; Schema: public; Owner: aron
--

COPY public.comment (id, message, "timestamp", upvote, post_id, user_id) FROM stdin;
1	they will eat you:)	2022-08-30 13:21:40.685082	0	1	1
\.


--
-- Data for Name: continent; Type: TABLE DATA; Schema: public; Owner: aron
--

COPY public.continent (id, altitude, longitude, name) FROM stdin;
1	495.00	-25.00	Australia-Oceania
2	-100.00	40.00	North-America
3	-420.00	190.00	South-America
4	10.00	50.00	Europe
5	20.00	10.00	Africa
6	85.00	35.00	Asia
\.


--
-- Data for Name: location; Type: TABLE DATA; Schema: public; Owner: aron
--

COPY public.location (id, altitude, climate, crisis, description, longitude, name, sound, video, continent_id) FROM stdin;
1	512.00	Tropic	Rising ocean temperatures driven by human emissions of greenhouse gases have caused five mass bleaching events along the reef in 1998, 2002, 2016, 2017 and 2020. Hughes told the Guardian he believes a sixth mass bleaching event is now unfolding, and that it was not mild or local.	Great Barrier Reef, Extensive complex of coral reefs, shoals, and islets in the Pacific Ocean, off the northeastern coast of Australia. The largest deposit of coral in the world, it extends for more than 1,250 mi (2,000 km) along the coast of Queensland and has an area of some 135,000 sq mi (350,000 sq km).	-20.00	Great Barrier reef	\N	\N	1
2	505.00	Tropical	Deforestation is a major threat to the Daintree Rainforest. Trees are getting cut down every single day! Animals and their habitats are getting affected by this condition.	The Daintree Rainforest is a landscape with striking diversity. From the dense rainforest and mountain ranges to fast flowing streams, waterfalls and gorges. With such a rich array of flora and fauna set amongst stunning scenery, there is a rich and colourful world here waiting to be discovered. The purpose of the tall helmet or casque is unknown but it may indicate dominance and age, as it continues to grow throughout life.	-25.00	Daintree Rainforest	\N	\N	1
3	510.00	Rural	No current crisis	The Scenic Rim region is a thriving rural paradise set in the foothills of the Great Dividing Range and surrounded by World Heritage-listed national parks. Home to a population of more than 40,000 the region covers 4254sq km and is located an hour south of Brisbane and an hour inland from the Gold Coast.	-35.00	Scenic Rim	\N	\N	1
\.


--
-- Data for Name: post; Type: TABLE DATA; Schema: public; Owner: aron
--

COPY public.post (id, content, reply_count, "timestamp", title, view_count, topic_id, user_id) FROM stdin;
1	Are they dangerous?	0	2022-08-30 13:21:40.683055	Rabbits	0	1	1
\.


--
-- Data for Name: topic; Type: TABLE DATA; Schema: public; Owner: aron
--

COPY public.topic (id, description, "timestamp", title, user_id) FROM stdin;
1	Generally discussing things	2022-08-30 13:21:40.681372	General discussion	1
\.


--
-- Data for Name: wildlife; Type: TABLE DATA; Schema: public; Owner: aron
--

COPY public.wildlife (id, crisis, description, lifetime, lifetime_interval, name, status, type, location_id) FROM stdin;
1	No current crisis	Manta rays are large rays belonging to the genus Mobula (formerly its own genus Manta). The larger species, M. birostris, reaches 7 m (23 ft) in width, while the smaller, M. alfredi, reaches 5.5 m (18 ft). Both have triangular pectoral fins, horn-shaped cephalic fins and large, forward-facing mouths. They are classified among the Myliobatiformes (stingrays and relatives) and are placed in the family Myliobatidae (eagle rays). They have the largest brains and brain to body ratio of all fish, and can pass the mirror test.	40	year	Manta Ray	\N	\N	1
2	No current crisis	The clownfish can be many different colours, depending on its species, including yellow, orange, red, and black. Most have white details. They are smaller fish, with the smallest around 7 to 8cm long and the longest 17cm long.  	8	years	Clownfish	\N	\N	1
3	No current crisis	As it is very large, has distinctive markings and is quite friendly, the potato cod is a favourite with divers. As this species has been fished out from most other parts of the world, we are very lucky in Western Australia that divers can still come face to face with them in places such as the Rowley Shoals Marine Park. Named after the large potato-shaped markings on its body, the potato cod (Epinephelus tukula) is one of the biggest members of the groper family.	37	year on average	Potato Cod	\N	\N	1
4	No current crisis	The Southern Cassowary Casuarius casuarius johnsonii is a flightless bird with glossy black plumage, a tall, brown casque (helmet) on top of its head, a vivid blue and purple neck, long drooping red wattles and amber eyes.	60	year	Southern cassowary	\N	\N	2
5	No current crisis	Description. Koalas are well-known for their large round head, big furry ears and big black nose. Their fur is usually grey-brown in colour with white fur on the chest, inner arms, ears and bottom. They have no fur on their nose or the palms of their paws.	15	year on average	Koala	\N	\N	3
\.


--
-- Name: application_user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: aron
--

SELECT pg_catalog.setval('public.application_user_id_seq', 2, true);


--
-- Name: comment_id_seq; Type: SEQUENCE SET; Schema: public; Owner: aron
--

SELECT pg_catalog.setval('public.comment_id_seq', 1, true);


--
-- Name: continent_id_seq; Type: SEQUENCE SET; Schema: public; Owner: aron
--

SELECT pg_catalog.setval('public.continent_id_seq', 6, true);


--
-- Name: location_id_seq; Type: SEQUENCE SET; Schema: public; Owner: aron
--

SELECT pg_catalog.setval('public.location_id_seq', 3, true);


--
-- Name: post_id_seq; Type: SEQUENCE SET; Schema: public; Owner: aron
--

SELECT pg_catalog.setval('public.post_id_seq', 1, true);


--
-- Name: topic_id_seq; Type: SEQUENCE SET; Schema: public; Owner: aron
--

SELECT pg_catalog.setval('public.topic_id_seq', 1, true);


--
-- Name: wildlife_id_seq; Type: SEQUENCE SET; Schema: public; Owner: aron
--

SELECT pg_catalog.setval('public.wildlife_id_seq', 5, true);


--
-- Name: application_user application_user_pkey; Type: CONSTRAINT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.application_user
    ADD CONSTRAINT application_user_pkey PRIMARY KEY (id);


--
-- Name: comment comment_pkey; Type: CONSTRAINT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.comment
    ADD CONSTRAINT comment_pkey PRIMARY KEY (id);


--
-- Name: continent continent_pkey; Type: CONSTRAINT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.continent
    ADD CONSTRAINT continent_pkey PRIMARY KEY (id);


--
-- Name: location location_pkey; Type: CONSTRAINT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.location
    ADD CONSTRAINT location_pkey PRIMARY KEY (id);


--
-- Name: post post_pkey; Type: CONSTRAINT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.post
    ADD CONSTRAINT post_pkey PRIMARY KEY (id);


--
-- Name: topic topic_pkey; Type: CONSTRAINT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.topic
    ADD CONSTRAINT topic_pkey PRIMARY KEY (id);


--
-- Name: wildlife wildlife_pkey; Type: CONSTRAINT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.wildlife
    ADD CONSTRAINT wildlife_pkey PRIMARY KEY (id);


--
-- Name: wildlife fk4hwvt5747v6ig1qgkksl6vrx; Type: FK CONSTRAINT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.wildlife
    ADD CONSTRAINT fk4hwvt5747v6ig1qgkksl6vrx FOREIGN KEY (location_id) REFERENCES public.location(id);


--
-- Name: location fk7o3rd75qc96dctls8c5k4kvja; Type: FK CONSTRAINT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.location
    ADD CONSTRAINT fk7o3rd75qc96dctls8c5k4kvja FOREIGN KEY (continent_id) REFERENCES public.continent(id);


--
-- Name: comment fkbxx6eohn3esfpf00wy3jaqk3r; Type: FK CONSTRAINT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.comment
    ADD CONSTRAINT fkbxx6eohn3esfpf00wy3jaqk3r FOREIGN KEY (user_id) REFERENCES public.application_user(id);


--
-- Name: post fkg0dyrcbp24pao9wma5degpx5q; Type: FK CONSTRAINT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.post
    ADD CONSTRAINT fkg0dyrcbp24pao9wma5degpx5q FOREIGN KEY (user_id) REFERENCES public.application_user(id);


--
-- Name: post fkg8ln3nj8tjclai0nuvpw5s5uw; Type: FK CONSTRAINT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.post
    ADD CONSTRAINT fkg8ln3nj8tjclai0nuvpw5s5uw FOREIGN KEY (topic_id) REFERENCES public.topic(id);


--
-- Name: topic fkjvu4mwoijqe9bql78dl1bgwy9; Type: FK CONSTRAINT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.topic
    ADD CONSTRAINT fkjvu4mwoijqe9bql78dl1bgwy9 FOREIGN KEY (user_id) REFERENCES public.application_user(id);


--
-- Name: comment fks1slvnkuemjsq2kj4h3vhx7i1; Type: FK CONSTRAINT; Schema: public; Owner: aron
--

ALTER TABLE ONLY public.comment
    ADD CONSTRAINT fks1slvnkuemjsq2kj4h3vhx7i1 FOREIGN KEY (post_id) REFERENCES public.post(id);


--
-- PostgreSQL database dump complete
--

