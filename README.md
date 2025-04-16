1. Installer IntelliJ Ultimate
2. Créer un projet Spring Initializer avec les dépendances JPA, H2, Spring Web et Lombock

Consigne concernant le fonctionnement de Lombock :
Pour s'assurer que Lombock fonctionne correctement avec les dernières version de Java, il faudrait ajouter la version de lombock dans pom.xml comme suit :

<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
   <optional>true</optional>
   <version>1.18.34</version> <!-- Ligne à ajouter manuellement-->
</dependency>
 

et Aussi  ajouter la même version dans la partie plugins :

<configuration>
  <annotationProcessorPaths>
    <path>
       <groupId>org.projectlombok</groupId>
       <artifactId>lombok</artifactId>
       <version>1.18.34</version> <!-- Ligne à ajouter manuellement-->
    </path>
</annotationProcessorPaths>
</configuration>
  
3. Créer l'entité JPA Product ayant les attributs :
       - id de type Long
       - name de type String
       - price de type double
       - quantity de type int
4. Configurer l'unité de persistance dans le ficher application.properties 
5. Créer l'interface JPA Repository basée sur Spring data
6. Tester quelques opérations de gestion de patients :
    - Ajouter des produits
    - Consulter tous les produits
    - Consulter un produit
    - Chercher des produits
    - Mettre à jour un patient 
    - supprimer un produit
