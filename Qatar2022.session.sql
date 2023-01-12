--Teams--
INSERT INTO team (id, name, small_name, goals_for, goals_against, yellow_cards, red_cards, group_name) VALUES(1, 'Qatar', 'QAT', 0, 0, 0, 0, 'A');
INSERT INTO team (id, name, small_name, goals_for, goals_against, yellow_cards, red_cards, group_name) VALUES(2, 'Ecuador', 'ECU', 0, 0, 0, 0, 'A');

--Match Stats--
INSERT INTO match_stats (id, goals, possession, yellow_cards, red_cards) VALUES (1, 0, 0, 0, 0);
INSERT INTO match_stats (id, goals, possession, yellow_cards, red_cards) VALUES (2, 0, 0, 0, 0);

--Matches--
INSERT INTO match (id, id_home_team, id_away_team, id_home_match_stats, id_away_match_stats, date, phase, stadium, ended) VALUES(1, 1, 2, 1, 2, '2022-11-20 05:00:00', 1, 'Al Bayt Stadium', false);