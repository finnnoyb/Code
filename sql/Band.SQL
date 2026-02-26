            --
    -- Tabellenstruktur für Tabelle `gorillaz`
    --

    CREATE TABLE `gorillaz` (
    `Bandname` varchar(100) NOT NULL,
    `Genre` varchar(100) NOT NULL,
    `Auflösungsjahr` varchar(100) NOT NULL,
    `Name` varchar(100) NOT NULL,
    `Vorname` varchar(100) NOT NULL,
    `Geschlecht` varchar(100) NOT NULL,
    `Instrumentbezeichnung` varchar(100) NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

    --
    -- Daten für Tabelle `gorillaz`
    --

    INSERT INTO `gorillaz` (`Bandname`, `Genre`, `Auflösungsjahr`, `Name`, `Vorname`, `Geschlecht`, `Instrumentbezeichnung`) VALUES
    ('STIM', 'Hyperpop', '-', 'ben', '-', 'Männlich', 'Gesang/Gitarre'),
    ('STIM', 'Hyperpop', '-', 'jordan', '-', 'Männlich', 'Gesang/Gitarre'),

    -- --------------------------------------------------------

    --
    -- Tabellenstruktur für Tabelle `linkinpark`
    --

    CREATE TABLE `linkinpark` (
    `Bandname` varchar(100) NOT NULL,
    `Genre` varchar(100) NOT NULL,
    `Auflösungsjahr` varchar(100) NOT NULL,
    `Name` varchar(100) NOT NULL,
    `Vorname` varchar(100) NOT NULL,
    `Geschlecht` varchar(100) NOT NULL,
    `Instrumentbezeichnung` varchar(100) NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

    --
    -- Daten für Tabelle `linkinpark`
    --

    INSERT INTO `linkinpark` (`Bandname`, `Genre`, `Auflösungsjahr`, `Name`, `Vorname`, `Geschlecht`, `Instrumentbezeichnung`) VALUES
    ('Linkin Park', 'Metal/Rock', '-', 'Armstrong', 'Emily', 'Weiblich', 'Gesang/Gitaree'),
    ('Linkin Park', 'Metal/Rock', '-', 'Brittain', 'Colin', 'Männlich', 'Schlagzeug'),
    ('Linkin Park', 'Metal/Rock', '-', 'Delson', 'Brad', 'Männlich', 'Lead-Gitarre'),
    ('Linkin Park', 'Metal/Rock', '-', 'Farell', 'Dave', 'Männlich', 'E-Bass'),
    ('Linkin Park', 'Metal/Rock', '-', 'Hahn', 'John', 'Männlich', 'DJ'),
    ('Linkin Park', 'Metal/Rock', '-', 'Shinoda', 'Mike', 'Männlich', 'Gesang/Gitarre/Keyboard/Klavier');

    -- --------------------------------------------------------

    --
    -- Tabellenstruktur für Tabelle `queen`
    --

    CREATE TABLE `queen` (
    `Bandname` varchar(100) NOT NULL,
    `Genre` varchar(100) NOT NULL,
    `Auflösungsjahr` varchar(100) NOT NULL,
    `Name` varchar(100) NOT NULL,
    `Vorname` varchar(100) NOT NULL,
    `Geschlecht` varchar(100) NOT NULL,
    `Instrumentbezeichnung` varchar(100) NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

    --
    -- Daten für Tabelle `queen`
    --

    INSERT INTO `queen` (`Bandname`, `Genre`, `Auflösungsjahr`, `Name`, `Vorname`, `Geschlecht`, `Instrumentbezeichnung`) VALUES
    ('Queen', 'Rock', '1991', 'Grose', 'Mike', 'Männlich', 'E-Bass'),
    ('Queen', 'Rock', '1991', 'Mercury', 'Freddy', 'Männlich', 'Leadgesang'),
    ('Queen', 'Rock', '1991', 'Taylor', 'Roger', 'Männlich', 'Schlagzeug'),
    ('Quenn', 'Rock', '1991', 'May', 'Brian', 'Männlich', 'Gitarre');

    --
    -- Indizes der exportierten Tabellen
    --

    --
    -- Indizes für die Tabelle `gorillaz`
    --
    ALTER TABLE `gorillaz`
    ADD PRIMARY KEY (`Bandname`,`Name`,`Vorname`,`Instrumentbezeichnung`);

    --
    -- Indizes für die Tabelle `linkinpark`
    --
    ALTER TABLE `linkinpark`
    ADD PRIMARY KEY (`Bandname`,`Name`,`Vorname`,`Instrumentbezeichnung`);

    --
    -- Indizes für die Tabelle `queen`
    --
    ALTER TABLE `queen`
    ADD PRIMARY KEY (`Bandname`,`Name`,`Vorname`,`Instrumentbezeichnung`);
    COMMIT;

    /*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
    /*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
    /*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;



das is alles scuffed
