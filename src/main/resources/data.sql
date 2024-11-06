INSERT INTO eco_user (user_id, user_name, email, password, age, green_score, reminder_frequency, green_coins) VALUES
(UUID_GENERATE_V4(), 'AliceGreen', 'alice.green@example.com', 'password123', 25, 75.0, 'MONTHLY', 20),
(UUID_GENERATE_V4(), 'BobEco', 'bob.eco@example.com', 'securepass456', 30, 60.5, 'WEEKLY', 20),
(UUID_GENERATE_V4(), 'CharliePlanet', 'charlie.planet@example.com', 'mypassword789', 28, 45.0, 'DAILY', 20),
(UUID_GENERATE_V4(), 'DianaSustain', 'diana.sustain@example.com', 'pass321', 32, 82.3, 'MONTHLY', 20),
(UUID_GENERATE_V4(), 'EveEco', 'eve.eco@example.com', 'evepassword12', 27, 95.5, 'WEEKLY', 20),
(UUID_GENERATE_V4(), 'FrankGreen', 'frank.green@example.com', 'mypassword345', 35, 55.0, 'DAILY', 20),
(UUID_GENERATE_V4(), 'GraceNature', 'grace.nature@example.com', 'securepassword678', 22, 70.0, 'MONTHLY', 20),
(UUID_GENERATE_V4(), 'HankSave', 'hank.save@example.com', 'hankpass987', 29, 65.5, 'WEEKLY', 20),
(UUID_GENERATE_V4(), 'IvyEarth', 'ivy.earth@example.com', 'password12345', 31, 89.2, 'DAILY', 20),
(UUID_GENERATE_V4(), 'JackEco', 'jack.eco@example.com', 'passwordeco', 26, 50.8, 'MONTHLY', 20);



-- Inserting Energy Consumption data for Users
INSERT INTO energy_consumption (entry_id, user_id, month, electricity_units, no_of_gas_cylinders, carbon_emissions) VALUES
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='AliceGreen'), 'JANUARY', 120, 50, 30.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='AliceGreen'), 'FEBRUARY', 110, 45, 28.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='AliceGreen'), 'NOVEMBER', 140, 35, 29.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='BobEco'), 'JANUARY', 150, 60, 35.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='BobEco'), 'FEBRUARY', 190, 75, 38.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='BobEco'), 'MARCH', 210, 65, 32.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='BobEco'), 'APRIL', 130, 50, 31.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='BobEco'), 'SEPTEMBER', 120, 60, 26.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='BobEco'), 'DECEMBER', 130, 40, 48.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='CharliePlanet'), 'AUGUST', 130, 25, 35.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='CharliePlanet'), 'JUNE', 150, 55, 52.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='CharliePlanet'), 'JULY', 110, 65, 46.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='CharliePlanet'), 'OCTOBER', 120, 25, 32.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='CharliePlanet'), 'NOVEMBER', 135, 65, 36.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='DianaSustain'), 'JANUARY', 145, 60, 33.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='DianaSustain'), 'FEBRUARY', 140, 50, 35.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='DianaSustain'), 'MAY', 170, 45, 45.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='DianaSustain'), 'OCTOBER', 125, 55, 45.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='EveEco'), 'AUGUST', 125, 52, 31.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='EveEco'), 'MAY', 145, 65, 34.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='EveEco'), 'JUNE', 165, 62, 21.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='EveEco'), 'JULY', 155, 57, 64.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='FrankGreen'), 'JANUARY', 115, 67, 29.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='FrankGreen'), 'FEBRUARY', 135, 54, 69.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='FrankGreen'), 'MARCH', 140, 40, 46.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='FrankGreen'), 'APRIL', 120, 28, 50.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='FrankGreen'), 'MAY', 125, 50, 47.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='FrankGreen'), 'JUNE', 165, 30, 36.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='GraceNature'), 'MARCH', 135, 59, 25.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='GraceNature'), 'OCTOBER', 180, 43, 34.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='GraceNature'), 'NOVEMBER', 145, 67, 32.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='GraceNature'), 'DECEMBER', 175, 47, 74.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='HankSave'), 'JANUARY', 150, 60, 37.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='HankSave'), 'JUNE', 175, 68, 33.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='HankSave'), 'JULY', 145, 70, 47.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='HankSave'), 'NOVEMBER', 150, 56, 56.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='HankSave'), 'DECEMBER', 180, 45, 67.0),
-- Continue for remaining users up to 8 months data.


-- Inserting Transportation Log data for Users
INSERT INTO transportation_log (log_id, user_id, transportation_mode, fuel_type, distance_km, frequency, month, carbon_emissions) VALUES
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='AliceGreen'), 'CAR', 'PETROL', 120.5, 'WEEKLY', 'JANUARY', 18.2),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='AliceGreen'), 'BIKE', 'EV', 28.0, 'DAILY', 'FEBRUARY', 1.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='AliceGreen'), 'BUS', 'DIESEL', 125.5, 'MONTHLY', 'SEPTEMBER', 15.2),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='AliceGreen'), 'BIKE', 'EV', 24.0, 'DAILY', 'OCTOBER', 1.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='AliceGreen'), 'AUTO', 'DIESEL', 140.5, 'WEEKLY', 'NOVEMBER', 18.2),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='AliceGreen'), 'BIKE', 'EV', 30.0, 'DAILY', 'DECEMBER', 1.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='BobEco'), 'BUS', 'DIESEL', 200.0, 'WEEKLY', 'JANUARY', 24.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='BobEco'), 'TRAIN', 'EV', 300.0, 'MONTHLY', 'FEBRUARY', 10.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='BobEco'), 'BIKE', 'PETROL', 200.0, 'DAILY', 'MARCH', 24.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='BobEco'), 'FLIGHT', 'JET_FUEL', 300.0, 'MONTHLY', 'APRIL', 10.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='CharliePlanet'), 'FLIGHT', 'JET_FUEL', 500.0, 'MONTHLY', 'AUGUST', 100.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='CharliePlanet'), 'BUS', 'DIESEL', 500.0, 'DAILY', 'JUNE', 100.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='CharliePlanet'), 'BIKE', 'EV', 500.0, 'WEEKLY', 'JULY', 100.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='DianaSustain'), 'AUTO', 'DIESEL', 70.0, 'DAILY', 'JANUARY', 5.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='DianaSustain'), 'BUS', 'DIESEL', 70.0, 'DAILY', 'FEBRUARY', 5.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='DianaSustain'), 'BIKE', 'EV', 70.0, 'WEEKLY', 'MAY', 5.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='DianaSustain'), 'CAR', 'PETROL', 70.0, 'MONTHLY', 'OCTOBER', 5.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='DianaSustain'), 'BUS', 'DIESEL', 70.0, 'DAILY', 'NOVEMBER', 5.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='EveEco'), 'CAR', 'PETROL', 85.0, 'DAILY', 'AUGUST', 12.8),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='EveEco'), 'BIKE', 'PETROL', 85.0, 'DAILY', 'MAY', 12.8),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='EveEco'), 'AUTO', 'DIESEL', 85.0, 'WEEKLY', 'JUNE', 12.8),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='FrankGreen'), 'BUS', 'DIESEL', 150.0, 'WEEKLY', 'JANUARY', 8.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='FrankGreen'), 'BIKE', 'EV', 150.0, 'WEEKLY', 'FEBRUARY', 8.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='FrankGreen'), 'CAR', 'PETROL', 150.0, 'MONTHLY', 'MARCH', 8.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='FrankGreen'), 'BUS', 'DIESEL', 150.0, 'DAILY', 'APRIL', 8.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='FrankGreen'), 'BUS', 'DIESEL', 150.0, 'WEEKLY', 'JUNE', 8.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='FrankGreen'), 'AUTO', 'DIESEL', 150.0, 'DAILY', 'OCTOBER', 8.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='GraceNature'), 'BIKE', 'EV', 25.0, 'DAILY', 'MARCH', 1.2),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='GraceNature'), 'CAR', 'PETROL', 25.0, 'WEEKLY', 'OCTOBER', 1.2),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='GraceNature'), 'BUS', 'DIESEL', 25.0, 'WEEKLY', 'NOVEMBER', 1.2),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='HankSave'), 'BUS', 'DIESEL', 210.0, 'DAILY', 'AUGUST', 25.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='HankSave'), 'AUTO', 'DIESEL', 210.0, 'DAILY', 'SEPTEMBER', 25.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='HankSave'), 'TRAIN', 'EV', 210.0, 'MONTHLY', 'OCTOBER', 25.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='HankSave'), 'BIKE', 'EV', 210.0, 'WEEKLY', 'NOVEMBER', 25.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='HankSave'), 'BUS', 'DIESEL', 210.0, 'WEEKLY', 'JANUARY', 25.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='HankSave'), 'AUTO', 'DIESEL', 210.0, 'DAILY', 'FEBRUARY', 25.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='HankSave'), 'BIKE', 'EV', 210.0, 'DAILY', 'MARCH', 25.0),
-- Continue for each user for different months and transport modes up to 8 months.



-- Inserting Waste Production data for Users
INSERT INTO waste_production (waste_id, user_id, month, waste_type, quantity_kgs, carbon_emissions) VALUES
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='AliceGreen'), 'JANUARY', 'FOOD', 10.0, 2.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='AliceGreen'), 'FEBRUARY', 'NON_FOOD', 5.0, 1.2),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='AliceGreen'), 'NOVEMBER', 'FOOD', 8.0, 2.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='BobEco'), 'JANUARY', 'NON_FOOD', 6.0, 1.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='BobEco'), 'FEBRUARY', 'FOOD', 11.0, 2.7),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='BobEco'), 'MARCH', 'FOOD', 6.0, 1.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='BobEco'), 'APRIL', 'NON_FOOD', 11.0, 2.7),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='BobEco'), 'MAY', 'NON_FOOD', 6.0, 1.5),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='BobEco'), 'JUNE', 'FOOD', 11.0, 2.7),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='CharliePlanet'), 'AUGUST', 'NON_FOOD', 7.0, 1.6),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='CharliePlanet'), 'JUNE', 'FOOD', 12.0, 3.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='CharliePlanet'), 'JULY', 'NON_FOOD', 7.0, 1.6),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='CharliePlanet'), 'SEPTEMBER', 'FOOD', 12.0, 3.0),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='DianaSustain'), 'JANUARY', 'NON_FOOD', 8.0, 1.9),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='DianaSustain'), 'FEBRUARY', 'NON_FOOD', 8.0, 1.9),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='DianaSustain'), 'MARCH', 'NON_FOOD', 8.0, 1.9),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='DianaSustain'), 'APRIL', 'NON_FOOD', 8.0, 1.9),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='DianaSustain'), 'MAY', 'NON_FOOD', 8.0, 1.9),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='EveEco'), 'AUGUST', 'FOOD', 9.5, 2.4),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='EveEco'), 'MAY', 'NON_FOOD', 4.5, 1.1),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='EveEco'), 'JUNE', 'FOOD', 9.5, 2.4),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='EveEco'), 'JULY', 'NON_FOOD', 4.5, 1.1),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='EveEco'), 'OCTOBER', 'FOOD', 9.5, 2.4),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='EveEco'), 'NOVEMBER', 'NON_FOOD', 4.5, 1.1),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='FrankGreen'), 'JANUARY', 'NON_FOOD', 7.5, 2.4),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='FrankGreen'), 'FEBRUARY', 'NON_FOOD', 7.5, 2.4),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='FrankGreen'), 'MARCH', 'NON_FOOD', 7.5, 2.4),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='GraceNature'), 'OCTOBER', 'NON_FOOD', 4.5, 1.1),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='GraceNature'), 'NOVEMBER', 'NON_FOOD', 4.5, 1.1),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='GraceNature'), 'DECEMBER', 'NON_FOOD', 4.5, 1.1),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='GraceNature'), 'JANUARY', 'NON_FOOD', 4.5, 1.1),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='HankSave'), 'JUNE', 'FOOD', 7.5, 2.4),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='HankSave'), 'JULY', 'NON_FOOD', 7.5, 2.4),
(UUID_GENERATE_V4(), (SELECT user_id FROM eco_user WHERE user_name='HankSave'), 'NOVEMBER', 'NON_FOOD', 7.5, 2.4),

-- Continue for each user for both waste types up to 8 months.


--goals

--INSERT INTO user_goals (goal_id, goal_title, goal_description, goal_frequency, goal_difficulty, green_coins)
--VALUES
--  -- Goal 1: Reduce Energy Consumption
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa1', 'Reduce Daily Energy Usage',
--   'Turn off lights when not in use, unplug electronics, and use energy-efficient appliances to reduce your carbon footprint.',
--   'DAILY', 'EASY', 10),
--
--  -- Goal 2: Sustainable Transport
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa2', 'Use Public Transport or Carpool',
--   'Take public transport or carpool instead of driving alone to reduce emissions from your vehicle.',
--   'DAILY', 'MEDIUM', 15),
--
--  -- Goal 3: Reduce Meat Consumption
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa3', 'Eat a Plant-Based Meal',
--   'Try eating a plant-based meal once a day to lower your food-related carbon footprint.',
--   'DAILY', 'EASY', 5),
--
--  -- Goal 4: Reduce Plastic Waste
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa4', 'Minimize Plastic Use',
--   'Avoid using single-use plastics. Use reusable shopping bags, containers, and bottles to reduce waste.',
--   'DAILY', 'EASY', 8),
--
--  -- Goal 5: Plant Trees or Support Reforestation
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa5', 'Plant or Support Tree Planting',
--   'Plant trees or contribute to reforestation efforts to help absorb carbon from the atmosphere.',
--   'WEEKLY', 'MEDIUM', 20),
--
--  -- Goal 6: Reduce Water Usage
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa6', 'Conserve Water',
--   'Reduce water usage by shortening showers, fixing leaks, and using water-saving appliances.',
--   'DAILY', 'EASY', 10),
--
--  -- Goal 7: Switch to Energy-Efficient Lighting
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa7', 'Use LED Lighting',
--   'Switch to energy-efficient LED bulbs in your home to lower electricity consumption.',
--   'DAILY', 'EASY', 10),
--
--  -- Goal 8: Reduce Food Waste
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa8', 'Stop Food Waste',
--   'Plan meals better and store food properly to avoid wasting it and reduce the carbon footprint of food production.',
--   'DAILY', 'MEDIUM', 12),
--
--  -- Goal 9: Support Eco-Friendly Brands
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa9', 'Support Sustainable Brands',
--   'Buy products from brands that use sustainable and eco-friendly practices to reduce overall environmental impact.',
--   'WEEKLY', 'HARD', 25),
--
--  -- Goal 10: Switch to Renewable Energy
--  ('3fa85f64-5717-4562-b3fc-2c963f66afaa', 'Switch to Renewable Energy',
--   'Consider switching to solar or wind energy at home to reduce reliance on fossil fuels and lower carbon emissions.',
--   'MONTHLY', 'HARD', 30);
--
----user rewards
--
--INSERT INTO user_rewards (rewardId, reward_title, brand_name, redeem_cost)
--VALUES
--  -- Reward 1: Reusable Water Bottle
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa1', 'Eco-Friendly Water Bottle',
--   'HydroFlask', 100),
--
--  -- Reward 2: Solar-Powered Charger
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa2', 'Solar-Powered Charger',
--   'Goal Zero', 150),
--
--  -- Reward 3: Organic Cotton Tote Bag
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa3', 'Organic Cotton Tote Bag',
--   'EarthHero', 80),
--
--  -- Reward 4: Sustainable Fashion Gift Card
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa4', 'Sustainable Fashion Gift Card',
--   'Patagonia', 200),
--
--  -- Reward 5: Electric Bike Discount
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa5', 'Electric Bike Discount',
--   'Rad Power Bikes', 500),
--
--  -- Reward 6: Green Energy Subscription (1 Month)
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa6', 'Green Energy Subscription',
--   'Arcadia', 300),
--
--  -- Reward 7: Carbon Offset Gift
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa7', 'Carbon Offset Gift',
--   'Cool Effect', 250),
--
--  -- Reward 8: Bamboo Cutlery Set
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa8', 'Bamboo Cutlery Set',
--   'Bamboozle', 70),
--
--  -- Reward 9: Plant a Tree (Donation)
--  ('3fa85f64-5717-4562-b3fc-2c963f66afa9', 'Plant a Tree (Donation)',
--   'One Tree Planted', 120),
--
--  -- Reward 10: Compost Bin
--  ('3fa85f64-5717-4562-b3fc-2c963f66afaa', 'Compost Bin',
--   'Subpod', 180);
