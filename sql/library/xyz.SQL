
CREATE TABLE leser (
    leser_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    adresse VARCHAR(255),
    geburtsdatum DATE

CREATE TABLE buecher (
    buch_id INT PRIMARY KEY AUTO_INCREMENT,
    titel VARCHAR(200) NOT NULL,
    erscheinungsjahr INT,
    verlag_id INT,
    CONSTRAINT fk_buch_verlag FOREIGN KEY (verlag_id) REFERENCES verlage(verlag_id)

CREATE TABLE ausleihen (
    ausleih_id INT PRIMARY KEY AUTO_INCREMENT,
    buch_id INT NOT NULL,
    ausleihdatum DATE NOT NULL,
    rueckgabedatum DATE,
    CONSTRAINT fk_ausleih_buch FOREIGN KEY (buch_id) REFERENCES buecher(buch_id) ON DELETE CASCADE
