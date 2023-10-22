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

Vous avez besoin de l'image 'nginx' avec tag 'latest' dans votre docker storage local.<br> 
Vous decidez de récupérer cette image depuis un dépôt public. .<br>
Quelle commande utiliseriez vous ?: `docker pull nginx:latest`

La commande suivante permet de se connecter au Docker Registry "docker-registry.compagny.com" en utilisant l'utilisateur "jerry": `docker login -u jerry -h docker-registry.compagny.com`

Un utilisateur vous indique que le service 'billing-manager' d'un docker swarm a cessé de fonctionner correctement.<br> 
Votre cluster utilise les drivers de logs par défaut.<br>
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

En Java 8, les interfaces peuvent contenir des méthodes implémentées. `Vrai`


Quelle classe représente le résultat incomplet d'un appel de méthode asynchrone en Java ?  : `java.util.concurrent.CompletableFuture<T>`


Les méthodes définies avec le mot-clef default peuvent-elle être outrepassées (overridden) ? : `Oui, elles peuvent l'être`


Quelle classe peut être utilisée pour stocker des valeurs spécifiques au thread ? `ThreadLocal`

Les méthodes ne peuvent pas être déclarées comme volatiles. `Vrai`

Que devez-vous utiliser pour exécuter un code une seule fois, au moment où la classe est chargée ? `Un bloc statique`

Quelle valeur retourne read() quand on arrive à la fin d'un flux ? `-1`

private static class A {}.<br>
Dans quel cas cette classe est correcte ? `Une classe interne`

J2SE fournit une API pour communiquer avec les serveurs HTTP. `Vrai`

Combien de méthodes abstraites sont à définir dans une interface fonctionnelle ? `1`


Un attribut `protégé (protected)` est visible depuis une classe appartenant au même package. `Vrai`

En Java 8, quelle `interface` par défaut peut être utilisée comme une fonction à un argument qui retourne
un booléen ?  `Predicate`<br>

Quelle classe peut représenter une méthode anonyme qui effectue un test sur un objet et renvoie un
résultat seulement sous forme de booléen ? `Predicate`


En Java, quelle classe permet de tester la validité d'une chaîne de caractères vis-à-vis d'une expression
régulière telle que celle-ci :<br>
String regex = "z.*t?";  `java.util.regex.Pattern`

Quelle classe permet de représenter la présence ou l'absence d'un objet sans qu'il soit nécessaire de
vérifier si l'objet est null ou non ? `java.util.Optional<T>` 

Tapez le nom de la méthode de java.io.InputStream qui retourne un InputStream qui ne renvoit
aucun octet.  `nullInputStream()`

Quand un objet devient-il éligible pour la garbage collection ?   `Lorsque cet objet n'est plus accessible depuis un objet racine (root object)`

Quelle classe client ReST Spring fournit-elle pour faire des appels aux API externes ? : `RestTemplate` et `WebClient`

    Quelle méthodes vont être interceptées par ce pointcut ?<br>
    @Pointcut("execution(public * find*(..))")<br>
    private void someOperation(){}<br>
Voici quelques exemples de méthodes qui seraient interceptées :<br>

`public String findName()`.<br>

`public char[] findPassword(boolean cache)`.<br>

`public void findData()`.<br>

`public Object findOne(String id)`.<br>

`public List<Object> findAll(int limit)`.<br>

`public void findSomething(Object param1, int param2)`.<br>


Le code ci-dessous est supposé faire un appel à une méthode statique d'une classe communément
utilisée de Spring Security ( `XXX`  dans l'image) pour récupérer le nom de l'utilisateur actuellement loggué.<br>
Quelle est cette classe ?<br>

String name =  `SecurityContextHolder`.getContext().getAuthentication().getName();<br>

Saisissez le nom de la méthode remplaçant <method> dans le code ci-dessous, qui permet à ce bloc de
code d'empêcher les objets indésirables d'être désérialisés.<br>

try (ObjectInputStream objInputStream = new ObjectInputStream(inputStream)) {<br>
objInputStream.<method>(MyClass::callback);<br>
/* other logic */<br>
}  `setObjectInputFilter`

Quel type de classe interne (nested class) permet à ses instances d'accéder aux instances de sa classe
externe ? <br> `Classe interne non statique (inner-class)`

TreeSet<A> set = new TreeSet<A>();<br>
set.add(new A());<br>
Saisissez le nom de l'interface que devrait implémenter la classe A.<br> `Comparable<A>`

Lorsque l'on utilise des streams en parallèle, combien de threads sont utilisés pour le traitement de la
streamed collection ? <br> Cela dépend du nombre de cœurs du CPU


Quel est le nom de la classe qui représente n'importe quelle méthode anonyme qui accepte un objet et
renvoie un objet ? : `Function`

En Java9+, quelle classe permet de définir une redirection des logs générés par Java vers un système de
logging tiers ? `java.lang.System.LoggerFinder`

Quelle classe est similaire à AtomicLong mais a de meilleures performances lors de la collecte de
statistiques en grande quantité depuis plusieurs threads ?  `LongAdder`

Quelle classe permet d'accèder à une région d'un fichier directement en mémoire ? `java.nio.MappedByteBuffer`

Saisissez le nom de l'interface qui est le point d'entrée d'une chaîne d'appels de méthodes qui
permettent le filtrage et l'application d'opérations de map-reduce sur une liste d'objets.  `PreparedStatement`

Sélectionnez la methode qui retoune la liste des classes et interfaces internes d'une classe.  `Class.getNestMembers()`

Quelle méthode de Stream permet de vérifier si un certain prédicat correspond à l'un des éléments du
stream ?  `anyMatch()`

Vous écrivez une application qui devra réaliser des cocktails. Un cocktail contient différents ingrédients<br>
(en fonction de la commande) et il peut vite devenir complexe à préparer. Néanmoins, les étapes du
processus de préparation restent toujours les mêmes : ajouter un alcool, ajouter un sirop etc.<br>
Si vous connaissez un patron de conception (design pattern) approprié pour préparer ces cocktails,<br>
saisissez son nom (1 mot seulement) dans le champ texte. <br> `Builder`, `constructor`, `monteur`

En Java 8, quel symbole peut être utilisé pour référencer une méthode ? `::`


`Open Closed Principle (OCP)` <br> Tout module (package, classe, méthode) doit être ouvert aux modifications mais fermé aux extensions. `Faux`<br>

`Single Responsibility Principle (SRP)`<br> Une classe ne devrait avoir qu'une seule raison de changer. `Vrai`

Si deux objets sont égaux alors ils devraient avoir le même hashcode. `Vrai`

Quand on parcourt les objets insérés dans un HashSet, ils sont ordonnés selon leur ordre d'insertion. `Faux`

Quel est le résultat de l'opération 2 >> 1 ? `1`

Le contrat liant `equals()` et `hashcode()` dit que deux objets ayant le même hashcode doivent être égaux.  `Faux`

Quelle méthode permet de libérer tous les verrous `(monitor lock)` des objets détenus par un thread ? `wait()`

En supposant que vous travailliez en Java 11+, quelle est la meilleure méthode pour supprimer les <br>
caractères d'espacement de début et de fin d'une chaîne de caractères ? <br>
Example: <br>
String str = " Hello world. "; <br>  `str.strip()`


Saisissez le nom de la classe appartenant à l'API J2SE qui permet de créer dynamiquement des
implémentations d'interfaces Java. <br>  `Proxy`

Est-il possible d'intercepter des exceptions d'un autre thread ? `Oui, en utilisant Thread.UncaughtExceptionHandler`

Est-il possible de passer un thread executor personnalisé en essayant d'appeler la méthode <br>
parallelStream() sur une collection ?  `Cela n'est pas possible`

Quelle est l'implémentation de List la plus performante lorsque l'on anticipe l'ajout et la suppression <br>
d'éléments quelconques de la liste ?  `LinkedList`

Choisissez la méthode la plus appropriée en Java 9+ pour accéder aux frames cachées d'une stack et
faciliter l'application de filtres `map-reduce` sur les frames de cette stack.  `StackWalker.walk`

Quel est le résultat de l'opération `1 << 2` ?<br>
L'opération `1 << 2` effectue un décalage de bits vers la gauche sur la valeur `1` en utilisant l'opérateur de décalage binaire à gauche `(<<)`.<br>
Chaque décalage d'un bit vers la gauche est équivalent à une multiplication par 2.<br>
Ainsi, le résultat de l'opération `1 << 2` est `4`.