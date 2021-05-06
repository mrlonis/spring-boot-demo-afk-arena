CREATE TABLE AfkArena_Heroes
(
    HeroId bigint NOT NULL IDENTITY ( 1,1 ) ,
    HeroName nvarchar(20) NOT NULL ,
    AscensionLevel nvarchar(2) ,
    OnCrystal bit NOT NULL ,
    Copies smallint NOT NULL ,
    CONSTRAINT AfkArena_Heroes_PrimaryKey PRIMARY KEY  CLUSTERED (HeroId ASC),
    CONSTRAINT AfkArena_Heroes_UniqueHeroes UNIQUE (HeroName  ASC, AscensionLevel  ASC)
)
GO

INSERT INTO AfkArena_Heroes
    (HeroName, AscensionLevel, OnCrystal, Copies)
VALUES
    ('Athalia', 'L+', 1, 0),
    ('Elijah & Lailah', 'L', 1, 0),
    ('Orthos', 'E', 0, 0),
    ('Talene', 'A', 1, 0),
    ('Wu Kong', 'M+', 1, 0),
    ('Flora', 'L', 1, 1),
    ('Zaphrael', 'E', 0, 0),
    ('Alna', 'E', 0, 0),
    ('Ezizh', 'L', 1, 0),
    ('Mehira', 'E+', 0, 1),
    ('Zolrath', 'E+', 0, 0),
    ('Khazard', 'E+', 1, 0),
    ('Mezoth', null, 0, 0),
    ('Lucretia', 'E+', 0, 0),
    ('Mortas', null, 0, 0),
    ('Estrilda', 'L+', 1, 0),
    ('Belinda', 'A1', 1, 0),
    ('Raine', 'L+', 1, 0),
    ('Fawkes', 'A', 1, 0),
    ('Lucius', 'A2', 1, 1),
    ('Thane', 'A1', 1, 1),
    ('Hendrik', 'L+', 1, 2),
    ('Rowan', 'A2', 1, 0),
    ('Gwyneth', 'A', 1, 0),
    ('Rosaline', 'A', 1, 1),
    ('Cecilia', 'L+', 1, 2),
    ('Rigby', 'E+', 0, 1),
    ('Oscar', 'E', 0, 0),
    ('Brutus', 'A1', 1, 1),
    ('Khasos', 'L+', 1, 0),
    ('Vurk', 'L+', 1, 3),
    ('Numisu', 'L+', 1, 4),
    ('Skreg', 'L+', 1, 0),
    ('Warek', 'A', 1, 1),
    ('Antandra', 'E+', 0, 0),
    ('Safiya', 'A', 1, 1),
    ('Satrana', 'E+', 1, 0),
    ('Tidus', 'L+', 1, 1),
    ('Drez', 'L', 1, 1),
    ('Skriath', 'A1', 1, 1),
    ('Anoki', 'L+', 1, 4),
    ('Nemora', 'A1', 1, 0),
    ('Kaz', 'L+', 1, 0),
    ('Lyca', 'A2', 1, 1),
    ('Tasi', 'A3', 1, 0),
    ('Ulmus', 'L+', 1, 0),
    ('Seirus', 'L+', 0, 0),
    ('Eironn', 'A2', 1, 0),
    ('Gorvo', 'A2', 1, 1),
    ('Lorsan', 'E+', 1, 1),
    ('Saurus', 'L+', 1, 6),
    ('Solise', 'E', 0, 0),
    ('Pippa', 'L+', 0, 4),
    ('Grezhul', 'A1', 1, 0),
    ('Shemira', 'A1', 1, 1),
    ('Thoran', 'L+', 1, 1),
    ('Isabella', 'L+', 1, 1),
    ('Nara', 'L+', 1, 5),
    ('Ferael', 'A1', 1, 0),
    ('Baden', 'L+', 1, 2),
    ('Kelthur', 'E+', 1, 0),
    ('Oden', 'L+', 0, 1),
    ('Izold', 'L+', 1, 1),
    ('Torne', 'E+', 0, 1),
    ('Daimon', 'A', 1, 0),
    ('Theowyn', 'L+', 0, 0),
    ('Silas', 'E+', 0, 1);

CREATE TABLE GenshinImpact_CharacterExpLookup
(
    LookupId bigint NOT NULL IDENTITY ( 1,1 ) ,
    LevelRangeMin bigint NOT NULL ,
    LevelRangeMax bigint NOT NULL ,
    HeroesWit bigint NOT NULL ,
    AdventurersExperience bigint NOT NULL ,
    WanderersAdvice bigint NOT NULL ,
    ExpNeeded bigint NOT NULL ,
    ExpFromEnemies bigint NOT NULL ,
    Mora bigint NOT NULL ,
    CONSTRAINT GenshinImpact_CharacterExpLookup_PrimaryKey PRIMARY KEY  CLUSTERED (LookupId ASC)
)
GO

INSERT INTO GenshinImpact_CharacterExpLookup
    (LevelRangeMin, LevelRangeMax, HeroesWit, AdventurersExperience, WanderersAdvice, ExpNeeded, ExpFromEnemies, Mora)
VALUES
    (1, 20, 6, 0, 0, 120175, 175, 24000),
    (20, 40, 28, 3, 3, 578325, 325, 115600),
    (40, 50, 28, 3, 4, 579100, 100, 115800),
    (50, 60, 42, 2, 4, 854125, 125, 170800),
    (60, 70, 59, 3, 0, 1195925, 925, 239000),
    (70, 80, 80, 2, 1, 1611875, 875, 322200),
    (80, 90, 171, 0, 3, 3423125, 125, 684600);