--Teams--
--A
INSERT INTO team (id, name, small_name, goals_for, goals_against, yellow_cards, red_cards, group_name) VALUES(1, 'Qatar', 'QAT', 0, 0, 0, 0, 'A');
INSERT INTO team (id, name, small_name, goals_for, goals_against, yellow_cards, red_cards, group_name) VALUES(2, 'Ecuador', 'ECU', 0, 0, 0, 0, 'A');
INSERT INTO team (id, name, small_name, goals_for, goals_against, yellow_cards, red_cards, group_name) VALUES(3, 'Senegal', 'SEN', 0, 0, 0, 0, 'A');
INSERT INTO team (id, name, small_name, goals_for, goals_against, yellow_cards, red_cards, group_name) VALUES(4, 'Nederland', 'NED', 0, 0, 0, 0, 'A');

--Match Stats--
--A
INSERT INTO match_stats (id, goals, possession, yellow_cards, red_cards) VALUES (1, 0, 0, 0, 0);
INSERT INTO match_stats (id, goals, possession, yellow_cards, red_cards) VALUES (2, 0, 0, 0, 0);
INSERT INTO match_stats (id, goals, possession, yellow_cards, red_cards) VALUES (3, 0, 0, 0, 0);
INSERT INTO match_stats (id, goals, possession, yellow_cards, red_cards) VALUES (4, 0, 0, 0, 0);
INSERT INTO match_stats (id, goals, possession, yellow_cards, red_cards) VALUES (5, 0, 0, 0, 0);
INSERT INTO match_stats (id, goals, possession, yellow_cards, red_cards) VALUES (6, 0, 0, 0, 0);
INSERT INTO match_stats (id, goals, possession, yellow_cards, red_cards) VALUES (7, 0, 0, 0, 0);
INSERT INTO match_stats (id, goals, possession, yellow_cards, red_cards) VALUES (8, 0, 0, 0, 0);
INSERT INTO match_stats (id, goals, possession, yellow_cards, red_cards) VALUES (9, 0, 0, 0, 0);
INSERT INTO match_stats (id, goals, possession, yellow_cards, red_cards) VALUES (10, 0, 0, 0, 0);
INSERT INTO match_stats (id, goals, possession, yellow_cards, red_cards) VALUES (11, 0, 0, 0, 0);
INSERT INTO match_stats (id, goals, possession, yellow_cards, red_cards) VALUES (12, 0, 0, 0, 0);

--Matches--
--A
INSERT INTO match (id, id_home_team, id_away_team, id_home_match_stats, id_away_match_stats, date, phase, stadium, ended) VALUES(1, 1, 2, 1, 2, '2022-11-20 05:00:00', 1, 'Al Bayt Stadium', false);
INSERT INTO match (id, id_home_team, id_away_team, id_home_match_stats, id_away_match_stats, date, phase, stadium, ended) VALUES(2, 3, 4, 3, 4, '2022-11-21 11:00:00', 1, 'Al Thumama Stadium', false);
INSERT INTO match (id, id_home_team, id_away_team, id_home_match_stats, id_away_match_stats, date, phase, stadium, ended) VALUES(3, 1, 3, 5, 6, '2022-11-25 08:00:00', 1, 'Al Thumama Stadium', false);
INSERT INTO match (id, id_home_team, id_away_team, id_home_match_stats, id_away_match_stats, date, phase, stadium, ended) VALUES(4, 4, 2, 7, 8, '2022-11-25 11:00:00', 1, 'Khalifa International Stadium', false);
INSERT INTO match (id, id_home_team, id_away_team, id_home_match_stats, id_away_match_stats, date, phase, stadium, ended) VALUES(5, 4, 1, 9, 10, '2022-11-29 10:00:00', 1, 'Al Bayt Stadium', false);
INSERT INTO match (id, id_home_team, id_away_team, id_home_match_stats, id_away_match_stats, date, phase, stadium, ended) VALUES(6, 2, 3, 11, 12, '2022-11-29 10:00:00', 1, 'Khalifa International Stadium', false);
