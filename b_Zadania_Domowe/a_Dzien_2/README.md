<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

### Zadania.

1. utwórz projekt Mavena:
- groupId - **pl.coderslab**
- artifactId - **jee-servlet**.

#### Zadanie 1

1. Za pomocą pliku pom.xml dołącz do projektu bibliotekę `apache commons io`.
2. Zapoznaj się z jej możliwościami i wypróbuj wybraną z nich.
    http://commons.apache.org/proper/commons-io/

#### Zadanie 2

1. Za pomocą pliku pom.xml skonfiguruj plugin `maven-javadoc-plugin`, plugin ten służy do tworzenia różnego rodzaju archiwów zawierających nasz projekt, np. zip, jar.
2. Wykorzystamy go do utworzenia wykonywalnego archiwum jar z naszego projektu. Plik ten będzie zawierał w sobie wszystkie wymagane do uruchomienia zależności.
3. Uzupełnij plik pom o definicję pluginu:
    ```xml
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-javadoc-plugin</artifactId>
                <version>2.10.4</version>
                <configuration>

                </configuration>
            </plugin>
        </plugins>
    </build>
    ```
4. Z konsoli lub eclipse wykonaj następującą komendę:
mvn javadoc:javadoc
5. Po poprawnym wykonaniu w folderze target otrzymamy folder site - w którym znajduje się dokumentacja z naszych klas w formacie html.
https://maven.apache.org/plugins/maven-javadoc-plugin/index.html

<!-- Links -->
[zone-date-time]:https://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html 
[date-example1]:https://www.mkyong.com/java/java-convert-date-and-time-between-timezone/
[date-example2]:https://dzone.com/articles/deeper-look-java-8-date-and
[dao-wiki]:https://pl.wikipedia.org/wiki/Data_Access_Object
[lorem-ipsum]:http://pl.lipsum.com/

#### Zadanie 3

W projekcie stwórz servlet `Servlet23`, dostępny pod adresem **/servlet23**,  
Servlet wczyta zawartość pliku oop.txt, a następnie wyświetli jego zawartość na stronie. 
Jest to lista języków programowania, które wzorują się na [paradygmacie obiektowym][oop-paradygmat] pobrana z [Wikipedii][oop-wiki].


#### Zadanie 4

W projekcie stwórz servlety `Servlet241`, `Servlet242`, dostępne odpowiednio pod adresami
 **/Servlet241**, **/Servlet242**.  
Dopisz następującą funkcjonalność:
* Na pierwszej stronie (`Servlet241`) wygeneruj linki do strony `Servlet242`, 
które będą przesyłały metodą GET id szukanego produktu (wygeneruj dla id z zakresu od `0` do `7`).
* Druga strona (`Servlet242`) po odebraniu danych powinna odnaleźć w przygotowanej tablicy lub liście produkt (zakładamy że id kolejny element). 
Poniżej znajduje się przykładowa tablica z produktami:
    ```java
    String products[] = {
        "Asus Transformr;2999.99",
        "iPhone 6';3499.18",
        "Converse Sneakers;125.00",
        "LG OLED55B6P OLED TV;6493.91",
        "Samsung HT-J4100;800.99",
        "Alpine Swiss Dress Belt;99.08",
        "60 Watt LED;1.50",
        "Arduino Nano;3.26",
    };
    ```
* Jeśli produkt znajduje się w tablicy powinna zostać wyświetlona jego nazwa i cena np.`Asus Transformer - 2999.99zł`
* Jeśli wybierzemy produkt spoza zakresu powinien zostać wyświetlony komunikat `Product not found.`



#### Zadanie 5

W projekcie stwórz servlet `Servlet25` dostępny pod adresem **/servlet25**, 
który wylosuje 10 liczb z zakresu 1-100. Następnie Wyświetl dwie tabelki z tymi liczbami:
1. Pierwsza tabelka powinna wyświetlić wartości w kolejności jakiej zostały wylosowane.
2. Druga tabelka powinna wyświetlać wartości posortowane (od najmniejszej do największej).


#### Zadanie 6
1. W projekcie stwórz servlet `Servlet26` dostępny pod adresem **/servlet26**,
2. Przy pomocy kodu:
    ````java
    Map<String, String> map = new HashMap<String, String>();
    
            Enumeration headerNames = request.getHeaderNames();
            while (headerNames.hasMoreElements()) {
                String key = (String) headerNames.nextElement();
                String value = request.getHeader(key);
                map.put(key, value);
            }
    
            return map;
        }
    ````
    utworzysz mapę wszystkich wartości nagłówka.
3. Wyświetl wszystkie informacje w formacie: `nazwaNagłówka : wartość`.

<!-- Links -->
[oop-paradygmat]:https://pl.wikipedia.org/wiki/Programowanie_obiektowe
[oop-wiki]:https://en.wikipedia.org/wiki/List_of_object-oriented_programming_languages
