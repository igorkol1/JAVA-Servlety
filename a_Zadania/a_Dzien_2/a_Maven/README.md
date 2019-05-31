<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Java Zaawansowana - Maven
Pamiętaj aby rozwiązania do zadań umieszczać w odpowiednich plikach `java`, przygotowanych do zadań.


#### Zadanie 1 - rozwiązywane z wykładowcą.

1. Utwórz projekt Maven, następnie dodaj zależność do biblioteki log4j (biblioteka ta powinna być w wersji 1).
2. Utwórz plik log4.properties - możesz skorzystać z załączonego pliku. 
Umieść go w katalogu`/src/main/resources` utworzonego projektu. 
3. Przetestuj działanie.

-----------------------------------------------------------------------------

#### Zadanie 2

1. Za pomocą pliku pom.xml dołącz do projektu bibliotekę `jsoup` - poznaną podczas pierwszych warsztatów.
2. Przetestuj działanie korzystając z poniższego kodu:
    ````java
    Connection connect = Jsoup.connect("http://www.onet.pl/");
    try {
        Document document = connect.get();
        Elements links = document.select("span.title");
        for (Element elem : links) {
            System.out.println(elem.text());
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    ````

#### Zadanie 3

1. Za pomocą pliku pom.xml dołącz do projektu bibliotekę `guava`.
2. Sprawdź poniższy kod korzystający z możliwości biblioteki:
````
List<String> names = Lists.newArrayList("Arek", "Czarek", "Darek");
List<String> reversed = Lists.reverse(names);
System.out.println(reversed);
````
3. Zapoznaj się z jej możliwościami i wypróbuj wybraną z nich.
Więcej informacji znajdziesz:
    * https://www.baeldung.com/guava-lists
    * https://github.com/google/guava/wiki
    * http://zetcode.com/articles/guava/
    * https://www.tutorialspoint.com/guava/index.htm


#### Zadanie 4

1. Za pomocą pliku pom.xml skonfiguruj plugin `maven-assembly-plugin`, plugin ten służy do tworzenia różnego rodzaju archiwów zawierających nasz projekt, np. zip, jar.
2. Wykorzystamy go do utworzenia wykonywalnego archiwum jar z naszego projektu. Plik ten będzie zawierał w sobie wszystkie wymagane do uruchomienia zależności.
3. Uzupełnij plik pom o definicję pluginu:
    ```xml
    <build>
        <plugins>
            <plugin>
                <artifactId>maven-assembly-plugin</artifactId>
                <version>3.0.0</version>
                <configuration>
                    <archive>
                        <manifest>
                            <mainClass>pl.coderslab.Example</mainClass>
                        </manifest>
                    </archive>
                    <descriptorRefs>
                        <descriptorRef>jar-with-dependencies</descriptorRef>
                    </descriptorRefs>
                </configuration>
            </plugin>
        </plugins>
    </build>
    ```
    Nazwę **pl.coderslab.Example** - zamień na własną klasę z metodą main.

4. Z konsoli lub IntelliJ wykonaj następującą komendę:
mvn clean compile assembly:single
5. Po poprawnym wykonaniu w folderze target otrzymamy plik jar
6. Uruchom program wykonując polecenie java -jar <nazwa pliku z rozszerzeniem jar>


#### Zadanie 5

1. Zapoznaj się z popularnymi bibliotekami dostępnymi w repozytorium:
https://mvnrepository.com/popular
2. Nie musisz znać wszystkich - warto jednak wiedzieć że są rozwiązania, które mogą Ci pomóc w pracy.

**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. 
Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**
