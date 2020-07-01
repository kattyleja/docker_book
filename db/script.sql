CREATE USER book password 'book';
CREATE DATABASE docker_book owner=book;
--
-- PostgreSQL database dump
--
\c docker_book
--
-- PostgreSQL database dump
--
 
-- Dumped from database version 12.2 (Ubuntu 12.2-4)
-- Dumped by pg_dump version 12.2 (Ubuntu 12.2-4)

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
-- Name: clientes; Type: TABLE; Schema: public; Owner: book
--

CREATE TABLE public.clientes (
    id bigint NOT NULL,
    nombre character varying,
    giro character varying,
    rut character varying,
    direccion character varying,
    telefono character varying
);


ALTER TABLE public.clientes OWNER TO book;

--
-- Name: clientes_id_seq; Type: SEQUENCE; Schema: public; Owner: book
--

CREATE SEQUENCE public.clientes_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.clientes_id_seq OWNER TO book;

--
-- Name: clientes_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: book
--

ALTER SEQUENCE public.clientes_id_seq OWNED BY public.clientes.id;


--
-- Name: clientes id; Type: DEFAULT; Schema: public; Owner: book
--

ALTER TABLE ONLY public.clientes ALTER COLUMN id SET DEFAULT nextval('public.clientes_id_seq'::regclass);


--
-- Data for Name: clientes; Type: TABLE DATA; Schema: public; Owner: book
--

COPY public.clientes (id, nombre, giro, rut, direccion, telefono) FROM stdin;
1	Luis Ramirez	Persona Natural	5666w22-2	Pedro Alarcon 818	93050316
2	Ambar Cofre	Persona Natural	2334455-K	Pedro Alarcon 818	930050316
3	Lucas Ramirez	Persona Natural	2099292-K	Pedro Alarcon 818	930050316
4	Matias Ramirez	Persona Natural	2099292-K	Pedro Alarcon 818	930050316
5	Consuelo Ramirez	Persona Natural	2099292-K	Pedro Alarcon 818	930050316
6	Juanito Gonzalez	Persona Natural	2099292-K	Pedro Alarcon 818	930050316
7	Pedro Gonzalez	Persona Natural	2099292-K	Pedro Alarcon 818	930050316
8	Manuel Gonzalez	Persona Natural	2099292-K	Pedro Alarcon 818	930050316
9	Katty Gonzalez	Persona Natural	2099292-K	Pedro Alarcon 818	930050316
10	Andrea Muñoz	Persona Natural	2099292-K	Pedro Alarcon 818	930050316
11	Dream Theater	Persona Natural	2099292-K	Pedro Alarcon 818	930050316
12	Pink Floyd	Persona Natural	2099292-K	Pedro Alarcon 818	930050316
\.


--
-- Name: clientes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: book
--

SELECT pg_catalog.setval('public.clientes_id_seq', 12, true);


--
-- PostgreSQL database dump complete
--

