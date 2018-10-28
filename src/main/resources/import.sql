INSERT INTO restaurants (name, location, lat, lng) VALUES ('test', 'Bandung', 212, 411);

INSERT INTO menus (restaurant_id, menu_date, title, menu_text) VALUES (1, CURRENT_DATE(), 'Soups', 'Hello, World Kotlin!');