# Collabify – Plateforme Microservices
Présentation du projet

Collabify est une application de gestion de projets et de tâches collaboratives développée avec une architecture microservices basée sur Spring Boot et Spring Cloud.

Ce projet démontre :

la décomposition en microservices
la découverte de services (Eureka)
la gestion des routes via API Gateway
la séparation frontend / backend
la conteneurisation avec Docker
l’intégration CI/CD avec GitHub Actions
 Architecture du système

L’application est composée de plusieurs modules :

🔹 Microservices Backend
API Gateway : point d’entrée unique de l’application
Discovery Service (Eureka Server) : registre des services
Event Service : gestion des événements
Project Service : gestion des projets
Task Service : gestion des tâches
🔹 Backend principal (ancien module)
backend_Gl : backend monolithique contenant la logique principale (authentification et modules de base)
🔹 Frontend
Application React (Vite) permettant :
authentification (login / register)
tableau de bord
gestion des projets
gestion des tâches
gestion des membres
paramètres utilisateur
- Technologies utilisées
Backend
Java 17
Spring Boot
Spring Cloud (Eureka, Gateway)
Spring Data JPA
Maven
Frontend
React (Vite)
JavaScript (ES6)
CSS
DevOps
Docker & Docker Compose
GitHub Actions (CI/CD)
- Architecture Docker

Le projet est conteneurisé avec Docker.

Les services incluent :

Eureka Server
API Gateway
Event Service
Project Service
Task Service
Frontend React
- Comment exécuter le projet
1) Cloner le projet
git clone https://github.com/fatimazahrabaali/collabify-microservices-platform.git
cd collabify-microservices-platform
2) Lancer les microservices backend

Assurez-vous d’avoir Java 17 et Maven installés.

Démarrer Eureka :

cd discovery-service
mvn spring-boot:run

Puis lancer les autres services :

api-gateway
event-service
project-service
task-service
3) Lancer le frontend
cd frontend_Gl
npm install
npm run dev

Le frontend sera accessible sur :

http://localhost:5173
4) (Optionnel) Lancer avec Docker
docker-compose up --build
🌐 Ports des services
Service	Port
Eureka Server	8761
API Gateway	8080
Event Service	8081
Project Service	8082
Task Service	8083
Frontend	5173
📊 CI/CD (GitHub Actions)

Le projet intègre une pipeline CI/CD avec GitHub Actions permettant :

compilation automatique
tests
validation du build

Fichier concerné :

.github/workflows/ci.yml
📁 Structure du projet
collabify-microservices-platform/
│
├── api-gateway/
├── discovery-service/
├── event-service/
├── project-service/
├── task-service/
├── backend_Gl/
├── frontend_Gl/
├── docker-compose.yml
├── docs/figma/
└── .github/workflows/
- Fonctionnalités

✔ Architecture microservices
✔ Service Discovery (Eureka)
✔ API Gateway
✔ APIs REST (projets, tâches, événements)
✔ Interface React
✔ Conteneurisation Docker
✔ Pipeline CI/CD

👨‍🎓 Contexte académique

Ce projet a été réalisé dans un cadre académique afin de démontrer :

la conception d’une architecture distribuée
la communication entre microservices
les pratiques DevOps modernes
⭐ Remarques importantes

Pour exécuter correctement le projet :

Lancer Eureka en premier
Lancer API Gateway
Lancer les microservices
Lancer le frontend
🚀 Fin
