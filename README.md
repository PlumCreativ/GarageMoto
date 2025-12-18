# 🏍️ GarageMoto

**Application de gestion de garage moto** – Projet BTS SIO SLAM  
*Gestion complète des clients, rendez-vous, réparations et pièces automobiles*

---

## 📋 Table des matières

- [À propos du projet](#-à-propos-du-projet)
- [Contexte et objectifs](#-contexte-et-objectifs)
- [Fonctionnalités](#-fonctionnalités)
- [Technologies et dépendances](#-technologies-et-dépendances)
- [Architecture](#-architecture)
- [Structure du projet](#-structure-du-projet)
- [Base de données](#-base-de-données)
- [Installation](#-installation)
- [Configuration](#-configuration)
- [Exécution](#-exécution)
- [Utilisation](#-utilisation)
- [Compétences mobilisées](#-compétences-mobilisées)
- [Amélirations futures](#-améliorations-futures)
- [Auteurs et contributeurs](#-auteurs-et-contributeurs)

---

## 📖 À propos du projet

**GarageMoto** est une application de gestion complète pour un garage moto. Elle permet de gérer efficacement les clients, les rendez-vous, les réparations et les pièces détachées. L'application offre une interface graphique intuitive pour faciliter la gestion quotidienne du garage.

### Cas d'usage principal
Un gérant de garage moto peut :
- Enregistrer et gérer ses clients
- Prendre et planifier des rendez-vous
- Gérer les réparations et les pièces utilisées
- Communiquer en interne avec l'équipe via une zone de messages

---

## 🎯 Contexte et objectifs

Ce projet a été développé dans le cadre du **BTS SIO (Services Informatiques aux Organisations)**, spécialité **SLAM (Solutions Logicielles et Applications Métier)**.

### Objectifs pédagogiques

✅ Concevoir une application de gestion métier professionnelle  
✅ Implémenter une interface graphique ergonomique avec JavaFX  
✅ Manipuler une base de données relationnelle (MySQL)  
✅ Structurer un projet Java avec Maven et respecter l'architecture MVC  
✅ Appliquer les bonnes pratiques de développement  
✅ Gérer le versioning avec Git et GitHub  

---

## ✨ Fonctionnalités

### 👤 Gestion des clients
- ✏️ **Création** : Ajouter un client avec ses informations personnelles
  - Nom et prénom
  - Adresse email
  - Numéro de téléphone
  - Adresse postale
- 📝 **Modification** : Mettre à jour les données d'un client existant
- 🗑️ **Suppression** : Retirer un client de la base de données
- 📊 **Affichage** : Consulter la liste complète dans un tableau interactif
- 🔍 **Recherche** : Filtrer les clients rapidement

### 📅 Gestion des rendez-vous
- 📆 **Création** : Planifier un rendez-vous pour un client
  - Association client automatique
  - Choix de la date et heure
  - Sélection du type de réparation
- 📝 **Commentaires** : Ajouter des notes et précisions sur la réparation
- 💬 **Motifs** : Documenter le motif de visite
- 📊 **Historique** : Consulter tous les rendez-vous passés et futurs
- 🔄 **Modifications** : Editer ou annuler un rendez-vous

### 🔧 Gestion des réparations et pièces
- ➕ **Ajout de pièces** : Enregistrer les pièces utilisées lors d'une réparation
  - Référence de la pièce
  - Désignation et type
  - Prix unitaire
- 💰 **Gestion des prix** : Suivre le coût des réparations
- 🏷️ **Classification** : Catégoriser les pièces par type
- 📋 **Traçabilité** : Historique complet des pièces utilisées par réparation
- 📊 **Rapport** : Générer des statistiques sur les réparations

### 💬 Communication interne
- 📢 **Messagerie interne** : Zone de messages pour la communication entre employés du garage
- 📌 **Notes** : Documenter les problèmes ou points importants
- 👥 **Notifications** : Alertes importantes pour l'équipe

---

## 🖥️ Interface utilisateur

L'application propose une interface moderne et intuitive construite avec **JavaFX** :

### Écrans principaux
1. **Écran d'accueil / Connexion** : Authentification utilisateur
2. **Gestion des clients** : TableView avec boutons CRUD
3. **Gestion des rendez-vous** : Calendrier et formulaire de réservation
4. **Gestion des réparations** : Saisie des pièces et coûts
5. **Zone de messages** : Messagerie interne du garage

### Caractéristiques de l'UI
- 🎨 Thème cohérent avec CSS personnalisé
- 📱 Responsive et adapté à différentes résolutions
- ⌨️ Navigations au clavier
- 🎯 Boutons d'action clairs (Ajouter, Modifier, Supprimer, Enregistrer, Annuler)
- ✔️ Validation des formulaires en temps réel
- 📊 Tables interactives avec tri et filtrage

---

## 🧰 Technologies et dépendances

| Composant | Technologie | Version |
|-----------|------------|---------|
| **Langage** | Java | JDK 17+ |
| **Interface graphique** | JavaFX | 21+ |
| **Base de données** | MySQL | 8.0+ |
| **Connecteur BD** | MySQL JDBC | 8.0+ |
| **Gestion de projet** | Maven | 3.6+ |
| **Versionning** | Git | - |
| **IDE recommandé** | IntelliJ IDEA ou Eclipse | - |

### Dépendances Maven (pom.xml)

```xml
<!-- JavaFX -->
<dependency>
    <groupId>org.openjfx</groupId>
    <artifactId>javafx-controls</artifactId>
    <version>21.0.1</version>
</dependency>

<!-- MySQL Connector -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
</dependency>

<!-- JUnit pour les tests -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```

---

## 🏗️ Architecture

Le projet suit le pattern **MVC (Model-View-Controller)** :

```
┌─────────────────────────────────────┐
│         INTERFACE (VIEW)             │
│    - Fichiers FXML                  │
│    - Styles CSS                     │
└──────────────────┬──────────────────┘
                   │
┌──────────────────▼──────────────────┐
│      CONTRÔLEURS (CONTROLLER)       │
│    - Gestion des événements         │
│    - Logique de présentation        │
└──────────────────┬──────────────────┘
                   │
┌──────────────────▼──────────────────┐
│    MODÈLE & MÉTIER (MODEL)          │
│    - Classes métier                 │
│    - Règles de gestion              │
└──────────────────┬──────────────────┘
                   │
┌──────────────────▼──────────────────┐
│      ACCÈS AUX DONNÉES (DAO)        │
│    - Requêtes SQL                   │
│    - Gestion de la base             │
└─────────────────────────────────────┘
```

### Principes appliqués
- **Séparation des responsabilités** : Vue, logique, données séparées
- **DAO Pattern** : Abstraction de la base de données
- **Singleton** : Gestion de la connexion à la BD
- **ObservableList** : Mise à jour automatique des tableaux
- **FXML** : Définition déclarative des interfaces

---

## 🗂️ Structure du projet

```
GarageMoto/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/plumcreativ/garagemoto/
│   │   │       ├── Main.java                 # Point d'entrée de l'application
│   │   │       │
│   │   │       ├── controller/               # Contrôleurs JavaFX
│   │   │       │   ├── MainController.java
│   │   │       │   ├── ClientController.java
│   │   │       │   ├── RendezVousController.java
│   │   │       │   ├── ReparationController.java
│   │   │       │   └── LoginController.java
│   │   │       │
│   │   │       ├── model/                    # Classes métier (entities)
│   │   │       │   ├── Client.java
│   │   │       │   ├── RendezVous.java
│   │   │       │   ├── Piece.java
│   │   │       │   ├── Reparation.java
│   │   │       │   └── Utilisateur.java
│   │   │       │
│   │   │       ├── dao/                      # Data Access Objects
│   │   │       │   ├── ClientDAO.java
│   │   │       │   ├── RendezVousDAO.java
│   │   │       │   ├── PieceDAO.java
│   │   │       │   ├── ReparationDAO.java
│   │   │       │   ├── UtilisateurDAO.java
│   │   │       │   └── DatabaseConnection.java
│   │   │       │
│   │   │       ├── util/                     # Utilitaires
│   │   │       │   ├── ValidationUtil.java
│   │   │       │   └── DateUtil.java
│   │   │       │
│   │   │       └── config/                   # Configuration
│   │   │           └── DatabaseConfig.java
│   │   │
│   │   └── resources/
│   │       ├── fxml/                         # Interfaces JavaFX
│   │       │   ├── main.fxml
│   │       │   ├── login.fxml
│   │       │   ├── client.fxml
│   │       │   ├── rendez-vous.fxml
│   │       │   ├── reparation.fxml
│   │       │   └── messages.fxml
│   │       │
│   │       ├── css/                          # Styles CSS
│   │       │   ├── style.css
│   │       │   └── theme.css
│   │       │
│   │       └── img/                          # Images et icônes
│   │           ├── logo.png
│   │           └── icons/
│   │
│   └── test/
│       ├── java/
│       │   └── com/plumcreativ/garagemoto/
│       │       ├── dao/
│       │       ├── model/
│       │       └── util/
│       │
│       └── resources/
│           └── test-database.sql
│
├── pom.xml                                   # Configuration Maven
├── mvnw & mvnw.cmd                           # Maven wrapper (Unix/Windows)
├── .gitignore                                # Fichiers ignorés par Git
├── README.md                                 # Cette documentation
├── INSTALLATION.md                           # Guide d'installation détaillé
├── API.md                                    # Documentation API
└── GarageMoto.png                            # Capture d'écran de l'application
```

---

## 🗄️ Base de données

### Architecture de la base

```sql
CREATE DATABASE garagemoto;
USE garagemoto;
```

### Tables principales

#### **Utilisateur**
```sql
CREATE TABLE utilisateur (
    id_utilisateur INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    mot_de_passe VARCHAR(255) NOT NULL,
    role ENUM('ADMIN', 'MECANICIEN', 'RECEPTION'),
    date_creation TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

#### **Client**
```sql
CREATE TABLE client (
    id_client INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    telephone VARCHAR(20),
    adresse VARCHAR(255),
    code_postal VARCHAR(5),
    ville VARCHAR(50),
    date_inscription TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

#### **RendezVous**
```sql
CREATE TABLE rendez_vous (
    id_rendez_vous INT PRIMARY KEY AUTO_INCREMENT,
    id_client INT NOT NULL,
    date_rendez_vous DATETIME NOT NULL,
    motif VARCHAR(100),
    commentaires TEXT,
    statut ENUM('PLANIFIE', 'CONFIRME', 'TERMINE', 'ANNULE') DEFAULT 'PLANIFIE',
    date_creation TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_client) REFERENCES client(id_client)
);
```

#### **Piece**
```sql
CREATE TABLE piece (
    id_piece INT PRIMARY KEY AUTO_INCREMENT,
    reference VARCHAR(50) UNIQUE NOT NULL,
    designation VARCHAR(100) NOT NULL,
    type VARCHAR(50),
    prix_unitaire DECIMAL(10, 2),
    stock INT DEFAULT 0,
    date_ajout TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

#### **Reparation**
```sql
CREATE TABLE reparation (
    id_reparation INT PRIMARY KEY AUTO_INCREMENT,
    id_rendez_vous INT NOT NULL,
    id_piece INT,
    quantite INT DEFAULT 1,
    prix_total DECIMAL(10, 2),
    date_reparation DATETIME,
    statut ENUM('EN_COURS', 'TERMINEE', 'LIVREE') DEFAULT 'EN_COURS',
    FOREIGN KEY (id_rendez_vous) REFERENCES rendez_vous(id_rendez_vous),
    FOREIGN KEY (id_piece) REFERENCES piece(id_piece)
);
```

#### **Message**
```sql
CREATE TABLE message (
    id_message INT PRIMARY KEY AUTO_INCREMENT,
    id_utilisateur INT NOT NULL,
    contenu TEXT NOT NULL,
    date_envoi TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    lire BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (id_utilisateur) REFERENCES utilisateur(id_utilisateur)
);
```

### Schéma de relations

```
Utilisateur (1) --→ (N) Message
Client (1) --→ (N) RendezVous
RendezVous (1) --→ (N) Reparation
Piece (1) --→ (N) Reparation
```

---

## 💾 Installation

### Prérequis système

- **Java JDK 17+** - [Télécharger](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- **Maven 3.6+** - [Télécharger](https://maven.apache.org/download.cgi)
- **MySQL 8.0+** - [Télécharger](https://dev.mysql.com/downloads/mysql/)
- **Git** - [Télécharger](https://git-scm.com/)
- **IDE Java** - IntelliJ IDEA, Eclipse ou VS Code avec extensions

### Vérification des prérequis

```bash
# Vérifier Java
java -version

# Vérifier Maven
mvn -version

# Vérifier Git
git --version

# Vérifier MySQL
mysql --version
```

### Étapes d'installation

#### 1. Cloner le dépôt
```bash
git clone https://github.com/PlumCreativ/GarageMoto.git
cd GarageMoto
```

#### 2. Créer la base de données
```bash
# Se connecter à MySQL
mysql -u root -p

# Créer la base (dans la console MySQL)
CREATE DATABASE garagemoto CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

#### 3. Charger le schéma de base
```bash
# Importer le fichier SQL
mysql -u root -p garagemoto < database/schema.sql
```

#### 4. Installer les dépendances Maven
```bash
mvn clean install
```

#### 5. Configurer la connexion à la base

Créer ou modifier le fichier `src/main/resources/config/database.properties` :

```properties
# Connexion MySQL
db.host=localhost
db.port=3306
db.name=garagemoto
db.user=root
db.password=votre_mot_de_passe
db.url=jdbc:mysql://${db.host}:${db.port}/${db.name}?useSSL=false&serverTimezone=UTC
```

---

## ⚙️ Configuration

### Configuration Maven (pom.xml)

Les dépendances principales sont définies dans `pom.xml` :

```xml
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.plumcreativ</groupId>
    <artifactId>garagemoto</artifactId>
    <version>1.0.0</version>
    
    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <javafx.version>21.0.1</javafx.version>
    </properties>
</project>
```

### Variables d'environnement

Optionnellement, définir des variables d'environnement :

```bash
# Linux/Mac
export DB_HOST=localhost
export DB_USER=root
export DB_PASSWORD=votre_mot_de_passe

# Windows
set DB_HOST=localhost
set DB_USER=root
set DB_PASSWORD=votre_mot_de_passe
```

---

## 🚀 Exécution

### Lancer l'application

#### Option 1 : Via Maven
```bash
mvn javafx:run
```

#### Option 2 : Via l'IDE
- Clique droit sur `Main.java` → Run
- Ou utilisez le raccourci clavier (F5 pour Eclipse, Shift+F10 pour IntelliJ)

#### Option 3 : JAR compilé
```bash
# Construire le JAR
mvn package

# Exécuter le JAR
java -jar target/garagemoto-1.0.0.jar
```

### Identifiants de test

À la première connexion, utiliser les identifiants par défaut :

| Utilisateur | Mot de passe | Rôle |
|-----------|------------|------|
| admin | admin123 | ADMIN |
| mecanicien | meca123 | MECANICIEN |
| reception | recep123 | RECEPTION |

**⚠️ Important** : Changez ces identifiants avant la mise en production !

---

## 📖 Utilisation

### Workflow utilisateur principal

```
1. Connexion
   └─→ Écran de login

2. Accueil
   └─→ Tableau de bord avec les principales actions

3. Ajouter un client
   └─→ Client → Nouveau → Remplir formulaire → Enregistrer

4. Planifier un rendez-vous
   └─→ Rendez-vous → Nouveau → Sélectionner client → Fixer date/heure

5. Enregistrer réparation
   └─→ Réparation → Nouvelle → Ajouter pièces → Confirmer coût

6. Consulter messages
   └─→ Messages → Voir et répondre aux messages internes
```

### Exemples de tâches courantes

#### Créer un nouveau client
1. Cliquer sur l'onglet "Clients"
2. Cliquer sur "Nouveau client"
3. Remplir les champs (nom, prénom, email, téléphone, adresse)
4. Cliquer sur "Enregistrer"

#### Planifier un rendez-vous
1. Cliquer sur l'onglet "Rendez-vous"
2. Cliquer sur "Nouveau rendez-vous"
3. Sélectionner le client
4. Choisir la date et l'heure
5. Décrire le motif de la visite
6. Cliquer sur "Confirmer"

#### Enregistrer une réparation
1. Cliquer sur l'onglet "Réparations"
2. Sélectionner le rendez-vous associé
3. Ajouter les pièces utilisées
4. Indiquer les quantités et prix
5. Marquer comme terminée
6. Générer le devis/facture

---

## 🎓 Compétences mobilisées

Ce projet mobilise les compétences suivantes du BTS SIO SLAM :

### Développement
- **Programmation orientée objet** (POO) en Java
- **Interfaces graphiques** avec JavaFX et FXML
- **Architecture MVC** et pattern DAO
- **Gestion de dépendances** avec Maven

### Bases de données
- **Conception relationnelle** (MCD/MLD)
- **SQL** (CREATE, INSERT, SELECT, UPDATE, DELETE)
- **Jointures** et intégrité référentielle
- **Transactions** et gestion de la concurrence

### Environnement professionnel
- **Versioning** avec Git et GitHub
- **Documentation** technique et utilisateur
- **Gestion de projet** (planning, tests)
- **Communication** et collaboration

### Bonnes pratiques
- **Conventions de codage** Java
- **Validation** et gestion d'erreurs
- **Tests unitaires** (JUnit)
- **Sécurité** (authentification, mots de passe)

---

## 🚀 Améliorations futures

### Fonctionnalités à ajouter
- [ ] **Export des données** (PDF, Excel)
- [ ] **Génération de factures** automatiques
- [ ] **Statistiques et rapports** avancés
- [ ] **Notifications par email** pour rappels RDV
- [ ] **Système de devis** et d'acceptation client
- [ ] **Gestion du stock** de pièces
- [ ] **Planning/Calendrier** visuel des RDV
- [ ] **Photos/documents** attachés aux dossiers clients

### Améliorations techniques
- [ ] **API REST** pour mobile
- [ ] **Application mobile** (Android/iOS)
- [ ] **Base PostgreSQL** en alternative MySQL
- [ ] **Docker** pour containerisation
- [ ] **Tests d'intégration** complets
- [ ] **Caching** des données
- [ ] **Logs** et monitoring
- [ ] **Authentification OAuth2**

### Performance et stabilité
- [ ] Optimisation des requêtes SQL
- [ ] Pool de connexions (HikariCP)
- [ ] Pagination des résultats
- [ ] Gestion de la mémoire (pièces volumineux)
- [ ] Backup automatique de la base

---

## 👥 Auteurs et contributeurs

**Développeur principal** : PlumCreativ  
**Contexte** : Projet BTS SIO SLAM  
**Année** : 2024-2025

### Contribuer

Les contributions sont les bienvenues ! Pour contribuer :

1. **Fork** le projet
2. Créer une branche (`git checkout -b feature/AmazingFeature`)
3. **Commit** vos modifications (`git commit -m 'Add some AmazingFeature'`)
4. **Push** vers la branche (`git push origin feature/AmazingFeature`)
5. Ouvrir une **Pull Request**

### Signaler un bug

Si vous trouvez un bug, créez une [issue](https://github.com/PlumCreativ/GarageMoto/issues) en décrivant :
- Le comportement attendu
- Le comportement observé
- Les étapes pour reproduire
- La configuration système

---

## 📄 Licence

Ce projet est fourni à titre éducatif dans le contexte du BTS SIO SLAM.  
Vous pouvez l'utiliser, le modifier et le distribuer librement.

---

## 📞 Support et contact

Pour toute question ou problème :

- 📧 **Email** : denys.lyulchak@mediaschool.me
- 🐛 **Issues GitHub** : [GarageMoto/issues](https://github.com/PlumCreativ/GarageMoto/issues)
- 💬 **Discussions** : [GarageMoto/discussions](https://github.com/PlumCreativ/GarageMoto/discussions)

---


**Dernière mise à jour** : Décembre 2024  
**Version du README** : 2.0  
**Statut du projet** : En maintenance et amélioration continue

---

*Fait avec ❤️ pour les passionnés de programmation et de motos 🏍️*
