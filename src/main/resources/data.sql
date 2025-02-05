-- Initialisation des tables
INSERT INTO PERSONNE(nom, prenom, poste, superieur) VALUES
    ('Lamine', 'Elyes', 'Directeur', null),
    ('Bastide', 'Rémi', 'Enseignant', 1),
    ('Pécatte', 'Jean-Marie', 'Enseignant', 1);

INSERT INTO PROJET(nom, debut, fin) VALUES
    ('Changement de DB', '2025-01-10', '2025-01-11'),
    ('Nouveau site internet', '2025-02-02', '2025-02-03');

INSERT INTO PARTICIPATION(role, pourcentage, id_personne, id_projet) VALUES
	('Chef de projet', 0.5, 1, 1),
	('Développeur fullstack', 0.5, 2, 1),
	('Administrateur réseau', 0.3, 3, 2),
	('Intégrateur', 0.7, 2,2);