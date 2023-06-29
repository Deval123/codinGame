Annotation un à plusieurs parent-side @OneToMany

`isBlank` method de la classe `java.lang.String` qui permet de tester si une chaîne de caractère est vide ou contient les espaces.

`docker build -t webportal:1.0 .` permet de construire une image Docker ayant pour nom `webportal` et pour tag `1.0` à partir du Dockerfile disponible dans le reperoire courant 

`ContextLostEvent` c'est l'événement du cycle de vie de l'application qui n'existe pas dans Spring Framework. 
Car nous avons : `ContextRefreshedEvent`, `ContextStartedEvent`, `ContextStoppedEvent`, `ContextClosedEvent`, et `RequestHandledEvent`.

Pour injecter un bean Spring dans une classe, vous pouvez utiliser l'annotation `@Autowired` ou `@Inject`.

Un bean annoté `@Lazy` est initialisé quand : `Quand il est référencé par un autre bean`, `Quand il est explicitement récupéré de la bean factory associée`    

Vous utilisez la commande `git add` pour ajouter les fichiers modifiés à la `staging area`, également appelée `l'index`.


La commande `git commit` : commite les changements de la `staging area` vers le `dépôt local` 

Le garbage collector garanti qu'il a suffissament de mémoire pour exécuter un programme java : `Faux` 

Vous avez besoin de l'image 'nginx' avec tag 'latest' dans votre docker storage local.  
Vous decidez de récupérer cette image depuis un dépôt public. 
Quelle commande utiliseriez vous ?: `docker pull nginx:latest`

La commande suivante permet de se connecter au Docker Registry "docker-registry.compagny.com" en utilisant l'utilisateur "jerry": `docker login -u jerry -h docker-registry.compagny.com`

Un utilisateur vous indique que le service 'billing-manager' d'un docker swarm a cessé de fonctionner correctement. 
Votre cluster utilise les drivers de logs par défaut. 
Quelle commande utilisierez vous pour récolter des informations utiles pour trouver l'origine de la panne ? : `docker service logs billing-manager`

Quel est l'interêt de l'ajout de l'annotation @SprinBootTest à une classe de test ? :  `Cela met en place un contexte d'application complet pour les tests d'integration` 

Vous souhaitez faire une sauvegarde d'une ou plusieurs images de votre storage docker local sous forme d'une archive tar. 
Quelle commande vous paraît appropriée : `docker image save`.

Quelle annotation peut-être utilisée pour s'assurer qu'une interface est fonctionnelle :  `@FunctionalInterface`.

Un attribut `privée` est visible depuis les `sous-classes` : `Faux` 

Pour communiquer avec une machine via TCP/IP, on peut utiliser la ou les classes : `Socket`

Une `classe Java` peut avoir plusieurs `classes parentes` : `Faux` 

Une `classe abstraite` peut contenir des `méthodes concrètes` : `Vrai` 

Quelle `méthode` est appelée lorsqu'un thread est exécuté ? : `run` 

Quelle classe client ReST Spring fournit-elle pour faire des appels aux API externes ? : `RestTemplate` et `WebClient`

    Quelle méthodes vont être interceptées par ce pointcut ?
    @Pointcut("execution(public * find*(..))")
    private void someOperation(){}
Voici quelques exemples de méthodes qui seraient interceptées :

`public String findName()`

`public char[] findPassword(boolean cache)`

`public void findData()`

`public Object findOne(String id)`

`public List<Object> findAll(int limit)`

`public void findSomething(Object param1, int param2)`


Le code ci-dessous est supposé faire un appel à une méthode statique d'une classe communément
utilisée de Spring Security ( `XXX`  dans l'image) pour récupérer le nom de l'utilisateur actuellement loggué.
Quelle est cette classe ?

String name =  `SecurityContextHolder`.getContext().getAuthentication().getName();