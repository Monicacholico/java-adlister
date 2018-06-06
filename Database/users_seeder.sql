USE adlister_db;
INSERT INTO users (username, email, password) VALUES ('Miriam', 'miriam@email.com', 'miri04'),
  ('Chester', 'chester@email.com', 'chestercheetos'), ('mario', 'mario@email.com', 'mariocasillas'),
  ('Kelly', 'kelly@email.com', 'kellyfirst'), ('arthur', 'arthur@email.com', 'arthurking');


INSERT INTO ads (user_id, title,description) VALUES
  (2,'For sale', 'Selling an Opel, 2003 originally made in Belgium'),
  (2,'For lease', 'Studio on RiverWalk, Downtown San Antonio'),
  (2,'Help wanted', 'Looking for math tutoring for college freshman student'),
  (2,'Tickets for sale', 'ColdPlay tickets for sale for Concert in Austin'),
  (2,'Dog founded', 'Nice labradoodle founded two blocks away from Phill Hardberger Park');