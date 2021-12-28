# Exemple microservice 1

Exemple microservice 1

## Made with

* [Java 8](https://www.java.com/fr/download/) - JDK 8
* [Spring initializr](https://start.spring.io/) - 2.6.2 
* [IntelliJ IDEA Utlimate](https://www.jetbrains.com/fr-fr/idea/) - Edition 2021.2.2 
* [Docker](https://www.docker.com/) - version 20.10.10 

## Versions

- **Dernière version stable :** 1.0.0
- **Dernière version :** 1.0.0
The list of versions : [Click to display](https://github.com/lorince-tawamba/gescom-config-server/tags) 

## About this Service

**Microservice de gestion de configuration** 

## Deployment

**Créer le package (Jar files)**

```bash
  mvn clean install
```

You’ll have to do this for both application. After this command executes, you’ll see the jar file available in the target folder. The file names will be:

- exemple-spring-boot-microservice1-1.0.0

**Create the docker image**

```bash
  docker build -t lorincetawamba/exemple-spring-boot-microservice1:1.0.0 -f Dockerfile .
```

**Lister toutes les images Docker sur la machine**

```bash
  docker images 
  ou 
  docker image ls
```

**Démarre une image Docker**

```bash
  docker run -d -p 8081:8081 -t lorincetawamba/exemple-spring-boot-microservice1:1.0.0
```

**Lister tous les conteneurs en cour d’execution sur la machine**

```bash
  docker container ls
``` 

**Connectez-vous avec votre identifiant Docker sur DockerHub**

```bash
  docker login -u lorincetawamba -p votre-mot-de-passe-ici
```

**Pousser l’image sur le DokerHub**

```bash
  docker image push lorincetawamba/exemple-spring-boot-microservice1:1.0.0
```

# Authors

* **SATIC SARL / Lorince TAWAMBA** _alias_ [@lorince-tawamba](https://github.com/lorince-tawamba)

Read the list of [contributors](https://github.com/lorince-tawamba/gescom/contributors) to see who helped with the project ! 

# License

Ce document est placé sous licence CC BY-NC-SA :  [Creative Commons
Attribution - Pas d'Utilisation Commerciale - Partage dans les Mêmes Conditions](https://creativecommons.org/licenses/by-nc-sa/4.0/)

![Logo](https://licensebuttons.net/l/by-nc-sa/3.0/88x31.png)

En savoir plus sur [les licences Creative Commons](https://creativecommons.org/licenses/?lang=fr-FR)...
