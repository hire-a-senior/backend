--
-- PostgreSQL database dump
--

-- Dumped from database version 15.3
-- Dumped by pg_dump version 15.3

-- Started on 2023-10-07 21:58:27

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

INSERT INTO accounts (id, availability, created_at, email, first_name, password, title, verified) VALUES ('306da18a-dgf2-5739-a6h5-128dgaf8ede1xn', 'Weekends and evenings', '2021-10-07 21:58:27.0000', 'test@gmail.com', 'test', '$2a$10$KOM/UIP3miRVUUozw5kCJummkn7ijg5DU6fRxsvPjr0HFJIwbpjBe', 0, true);
INSERT INTO accounts (id, availability, created_at, email, first_name, password, title, verified) VALUES ('5043dgza-wfhs-4479-b733-1dh5dfgse21sxb', 'Only Evenings from 9 - 11 UTC', '2021-10-07 21:58:27.0000', 'test@gmail.com', 'test123', '$2a$10$KOM/UIP3miRVUUozw5kCJummkn7ijg5DU6fRxsvPjr0HFJIwbpjBe', 0, true);
INSERT INTO accounts (id, availability, created_at, email, first_name, password, title, verified) VALUES ('4sdq18dqb-zqd2-3532-m351-64hdbf8ed11g4', '', '2021-10-07 21:58:27.0000', 'test@gmail.com', 'test321', '$2a$10$KOM/UIP3miRVUUozw5kCJummkn7ijg5DU6fRxsvPjr0HFJIwbpjBe', 1, false);
