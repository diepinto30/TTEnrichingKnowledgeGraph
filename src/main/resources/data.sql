--
-- PostgreSQL database dump
--

-- Dumped from database version 12.1
-- Dumped by pg_dump version 12.1

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
-- Name: repositorynew; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.repositorynew (
    idrepository integer NOT NULL,
    origin character varying(45) NOT NULL,
    namerepository character varying(45) NOT NULL,
    resource text NOT NULL,
    state integer NOT NULL
);


--
-- Data for Name: repositorynew; Type: TABLE DATA; Schema: public; Owner: -
--

COPY public.repositorynew (idrepository, origin, namerepository, resource, state) FROM stdin;
1	externo	example1		1
2	externo	example2	example.xml	1
3	externo	example3	example.csv	0
4	externo	example3	example.doc	0
\.


--
-- Name: repositorynew repositorynew_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.repositorynew
    ADD CONSTRAINT repositorynew_pkey PRIMARY KEY (idrepository);


--
-- PostgreSQL database dump complete
--

