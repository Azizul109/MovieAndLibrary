

--
-- Database: `database`
--



-- This is movie system account

CREATE TABLE `account` (
  `name` varchar(255) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` int(18) DEFAULT NULL,
  `sec_q` varchar(255) DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL

) ENGINE=InnoDB DEFAULT CHARSET=latin1;



INSERT INTO `account` (`name`, `username`, `password`, `sec_q`, `answer`) 
VALUES
('arif', 'arif109', '123', 'what is your favourite country?', 'bd'),
('miru', 'mirukiru', '12', 'what is your favourite country?', 'bd');




ALTER TABLE `account`
  ADD PRIMARY KEY (`name`);


ALTER TABLE `account`
  MODIFY `name` varchar(255) NOT NULL;


-- This is new movie list


CREATE TABLE `newmovie` (
  `id` int(18) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `language` varchar(255) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  `rating` varchar(255) DEFAULT NULL,
  `year` int(18) DEFAULT NULL,
  `release_date` varchar(255) DEFAULT NULL,
  `earnings` varchar(255) DEFAULT NULL

) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `newmovie` (`id`, `name`, `language`, `link`, `rating`, `year`, `release_date`, `earnings`) 
VALUES
('1', 'Deadpool', 'English', 'https://en.wikipedia.org/wiki/Deadpool_(film)', '7.8', '2016', 'Jun-2016', '$890million');


ALTER TABLE `newmovie`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `newmovie`
  MODIFY `id` int(18) NOT NULL;


-- This is favourite movie list


CREATE TABLE `favourite` (
  `id` int(18) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `watch` varchar(255) DEFAULT NULL,
  `director` varchar(255) DEFAULT NULL,
  `actor` varchar(255) DEFAULT NULL,
  `year` int(18) DEFAULT NULL,
  `actress` varchar(255) DEFAULT NULL,
  `imdb_rating` varchar(255) DEFAULT NULL

) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `favourite` (`id`, `name`, `watch`, `director`, `actor`, `year`, `actress`, `imdb_rating`) 
VALUES
('1', 'Joker', 'https://en.wikipedia.org/wiki/Joker_(2019_film)', 'Todd Phillips', 'Joaquin Phoenix', '2019', 'Zazie Beetz', '8.5');


ALTER TABLE `favourite`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `favourite`
  MODIFY `id` int(18) NOT NULL;


-- This is tv series list

CREATE TABLE `tv` (
  `id` int(18) NOT NULL,
  `year` int(18) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `season` varchar(255) DEFAULT NULL,
  `episode` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL

) ENGINE=InnoDB DEFAULT CHARSET=latin1;



INSERT INTO `tv` (`id`, `year`, `name`, `season`, `episode`, `category`) 
VALUES
('1', '2018', 'The Big Bang Theory', 'Season 11', '23', 'Comedy'),
('2', '2019', 'The Big Bang Theory', 'Season 12', '23', 'Comedy'),
('3', '2016', 'Two and a half man', 'Season 10', '20', 'Comedy'),
('4', '2017', 'Two and a half man', 'Season 11', '22', 'Comedy');




ALTER TABLE `tv`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `tv`
  MODIFY `id` int(18) NOT NULL;


-- This is library account list


CREATE TABLE `liaccount` (
  `name` varchar(255) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` int(18) DEFAULT NULL


) ENGINE=InnoDB DEFAULT CHARSET=latin1;



INSERT INTO `liaccount` (`name`, `username`, `password`) 
VALUES
('arif', 'arif109', '123'),
('miru', 'mirukiru', '12');




ALTER TABLE `liaccount`
  ADD PRIMARY KEY (`name`);


ALTER TABLE `liaccount`
  MODIFY `name` varchar(255) NOT NULL;



-- This is category list


CREATE TABLE `category` (

  `ID` int(18) NOT NULL,
  `catname` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL


) ENGINE=InnoDB DEFAULT CHARSET=latin1;



INSERT INTO `category` (`ID`, `catname`, `status`) 
VALUES
('1', 'Java', 'Programming'),
('2', 'Python', 'Programming'),
('3', 'Anna-karenina', 'Romance'),
('4', 'Sherlock-homes', 'Thriller'),
('5', 'Sachin', 'Biography'),
('6', '1984', 'Sci-fi');




ALTER TABLE `category`
  ADD PRIMARY KEY (`ID`);


ALTER TABLE `category`
  MODIFY `ID` int(18) NOT NULL;



-- This is author list


CREATE TABLE `author` (

  `ID` int(18) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL


) ENGINE=InnoDB DEFAULT CHARSET=latin1;



INSERT INTO `author` (`ID`, `name`, `address`, `phone`) 
VALUES
('1', 'Azizul arif', 'Dhaka, Bangladesh', '13281056901'),
('2', 'Sulaiman sukhon', 'Dhaka, Bangladesh', '01726058935'),
('3', 'Robi Thakur', 'Kolkata, India', 'Not applicable'),
('4', 'R.R Martin', 'London, UK', 'Not applicable'),
('5', 'Tony Morrison', 'Manchester, UK', 'Not applicable'),
('6', 'Kazi nazrul', 'Dhaka, Bangladesh', 'Not applicable');




ALTER TABLE `author`
  ADD PRIMARY KEY (`ID`);


ALTER TABLE `author`
  MODIFY `ID` int(18) NOT NULL;



-- This is favourite book list


CREATE TABLE `book` (

  `name` varchar(255) NOT NULL,
  `contents` varchar(255) DEFAULT NULL,
  `page` int(18) DEFAULT NULL,
  `edition` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `authorname` varchar(255) DEFAULT NULL


) ENGINE=InnoDB DEFAULT CHARSET=latin1;



INSERT INTO `book` (`name`, `contents`, `page`, `edition`, `category`, `authorname`) 
VALUES
('Thinking in Java', 'Programming book', '1148', '2nd', 'Programming', 'Bruce'),
('Don Quixote', 'Spanish Literature', '863', '1st', 'Novel', 'Miguel');




ALTER TABLE `book`
  ADD PRIMARY KEY (`name`);


ALTER TABLE `book`
  MODIFY `name` varchar(255) NOT NULL;



-- This is semester book list


CREATE TABLE `semester` (

  `name` varchar(255) NOT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `author` varchar(18) DEFAULT NULL,
  `semester` varchar(255) DEFAULT NULL,
  `year` int(18) DEFAULT NULL,
  `download` varchar(255) DEFAULT NULL


) ENGINE=InnoDB DEFAULT CHARSET=latin1;



INSERT INTO `semester` (`name`, `subject`, `author`, `semester`, `year`, `download`) 
VALUES
('Thinking in java', 'OOP', 'Bruce', '2nd', '2017', 'https://sgp1.digitaloceanspaces.com/proletarian-library/books/d11b8e6d3546c0e2148974072477afe8.pdf');





ALTER TABLE `semester`
  ADD PRIMARY KEY (`name`);


ALTER TABLE `semester`
  MODIFY `name` varchar(255) NOT NULL;







