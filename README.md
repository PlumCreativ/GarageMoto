# 🏍️ GarageMoto  
**Application de gestion de garage moto – BTS SIO SLAM**

---

## 📌 Sommaire

- [Contexte du projet](#-contexte-du-projet)
- [Objectifs](#-objectifs)
- [Fonctionnalités](#-fonctionnalités)
- [Interface utilisateur](#-interface-utilisateur)
- [Technologies utilisées](#-technologies-utilisées)
- [Architecture et organisation](#-architecture-et-organisation)
- [Arborescence du projet](#-arborescence-du-projet)
- [Base de données](#-base-de-données)
- [Installation et exécution](#-installation-et-exécution)
- [Tests et validation](#-tests-et-validation)
- [Compétences BTS SIO SLAM mobilisées](#-compétences-bts-sio-slam-mobilisées)
- [Améliorations possibles](#-améliorations-possibles)

---

## 🎯 Contexte du projet

Ce projet a été réalisé dans le cadre du **BTS SIO – option SLAM**.  
Il s’inscrit dans une situation professionnelle simulée visant à répondre aux besoins d’un **garage moto**, notamment la gestion des clients, des rendez-vous et des réparations.

L’application est développée en **Java** avec une interface graphique **JavaFX** et une base de données **MySQL**.

---

## 🧠 Objectifs

- Concevoir une application de gestion métier
- Mettre en place une interface graphique ergonomique
- Manipuler une base de données relationnelle
- Structurer un projet Java avec Maven
- Appliquer les bonnes pratiques de développement

---

## ✨ Fonctionnalités

### 👤 Gestion des clients
- Création d’un client (nom, mail, adresse, téléphone)
- Modification des informations client
- Suppression d’un client
- Affichage des clients dans un tableau

### 📅 Prise de rendez-vous
- Enregistrement des rendez-vous
- Association d’un rendez-vous à un client
- Ajout de commentaires et motifs de réparation

### 🔧 Gestion des réparations et pièces
- Ajout d’une ou plusieurs pièces
- Gestion du type de pièce
- Gestion des prix
- Message interne du garage

---

## 🖥️ Interface utilisateur

L’application dispose d’une **interface graphique JavaFX**, comprenant :

- Champs de saisie pour les clients et rendez-vous
- Boutons d’actions (Enregistrer, Modifier, Supprimer)
- TableView affichant l’ensemble des données
- Zone de messages pour la communication interne du garage

📸 *Exemple de l’interface :*  
![Interface GarageMoto](GarageMoto.png)

---

## 🧰 Technologies utilisées

| Élément | Technologie |
|------|------------|
| Langage | Java |
| Interface graphique | JavaFX |
| Base de données | MySQL |
| Gestion de projet | Maven |
| IDE | IntelliJ IDEA / Eclipse |
| Versioning | Git / GitHub |

---

## 🏗️ Architecture et organisation

Le projet est organisé de manière à séparer :
- l’interface graphique
- la logique métier
- l’accès aux données
- la configuration du projet

L’utilisation de **Maven** permet :
- une gestion propre des dépendances
- une structure standardisée
- une meilleure maintenabilité

---

## 🗂️ Arborescence du projet

GarageMoto/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── controller/ # Contrôleurs JavaFX
│ │ │ ├── model/ # Classes métier
│ │ │ ├── dao/ # Accès aux données (MySQL)
│ │ │ └── Main.java # Point d’entrée de l’application
│ │ │
│ │ └── resources/
│ │ ├── fxml/ # Interfaces JavaFX
│ │ └── css/ # Styles
│
├── pom.xml # Configuration Maven
└── README.md # Documentation


---

## 🗄️ Base de données

- **SGBD** : MySQL
- Base relationnelle
- Tables principales :
  - `client`
  - `rendez_vous`
  - `piece`
  - `reparation`

Les échanges avec la base sont réalisés via des **DAO** (Data Access Object).

---

## ⚙️ Installation et exécution

### Prérequis
- Java JDK 17 (ou compatible)
- MySQL
- Maven
- IDE Java (IntelliJ, Eclipse…)

### Étapes

1. Cloner le dépôt :
```bash
git clone https://github.com/PlumCreativ/GarageMoto.git
