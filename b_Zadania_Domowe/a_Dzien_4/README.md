<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

### Zadania.

Rozwiązania zadań umieszczaj w utworzonym wcześniej projekcie **jee-servlet**.

#### Zadanie 1

W projekcie stwórz stronę jsp `index41.jsp`. Następnie:
1. Pobierz wartość parametru GET o nazwie `author`.
2. Sprawdź czy parametr istnieje oraz czy nie jest pusty.
3. Wyświetl informacje w postaci:
    ```html
    <p>Wybrany autor <Pobrana wartość></p>
    ```

#### Zadanie 2

W projekcie stwórz stronę jsp `index42.jsp`. 
Za pomocą pętli forEach wyświetl na stronie liczby w taki sposób by uzyskać poniższy wynik.
 Wykorzystaj dodatkowe atrybuty pętli `begin` oraz `step`.    
```html
2 
4 
6 
8 
10 
```

#### Zadanie 3

W projekcie stwórz stronę jsp `index43.jsp`. Następnie:
1. Za pomocą odpowiedniej funkcji jstl sprawdź czy ustawiony za pomocą poniższego tagu ciąg znaków zawiera napis `coderslab`:
    ```html
    <c:set var="someName" value="Witaj w coderslab."/>  
    ```
2. Jeżeli napis zawiera `coderslab` w instrukcji sterującej wypisz na stronie `<p>OK</p>`.

#### Zadanie 4

W projekcie stwórz servlet `Servlet411` oraz `Servlet412`. Następnie:
1. Na pierwszej stronie (`Servlet411`) stwórz formularz z elementem `select`
 oraz opcjami wyboru zgodnymi z kluczami poniższej mapy:
   ```java
   Map<String, String> lang = new  HashMap<>();
   lang.put("en", "Hello");
   lang.put("pl", "Cześć");
   lang.put("de", "Ehre");
   lang.put("es", "Hola");
   lang.put("fr", "Bienvenue");
   ```
2. Strona ma przesyłać dane za pomocą `POST` do drugiej strony (`Servlet412`),
 która ma ustawić ciasteczko `language` na wartość wybraną przez użytkownika.
3. Po ponownym wejściu na pierwszą powinna być wyświetlana informacja powitalna w wybranym przez użytkownika języku.
4. Gdy ciasteczko nie istnieje, wiadomość powitalna powinna być wyświetlana w języku polskim.

Hint: Odpowiednie dane przekaż i przetwórz w pliku widoku.

  
#### Zadanie 5

1. Umieść na stronie dostępnej pod adresem **/newsletter** dowolny tekst, możesz skorzystać z generatora: [lorem-ipsum].
2. Umieść na stronie formularz z możliwością zapisu użytkownika na newsletter.
Formularz musi mieć następujące pola:
  * email (Adres email),
  * name (Imię i nazwisko).
3. Formularz powinien wyświetlać się dla użytkownika raz na 24 godziny - wykorzystaj w tym celu ciasteczka.
4. Napisz obsługę formularza - dane zapisz do bazy.
5. Zapytania tworzące tabele w bazie danych umieść w pliku `query.sql`.
 
 
#### Zadanie 6

Celem zadania jest udostępnienie funkcjonalności księgi gości.

1. Utwórz servlet wyświetlający listę wpisów z księgi gości. Ma być dostępny pod adresem **/guest-book**
2. Wyświetlane mają być wpisy w kolejności od najnowszego do najstarszego.
3. Informacje o wpisach mają być pobierane z bazy danych.
4. Zapytania tworzące tabele w bazie danych umieść w pliku `query.sql`.
5. Dane dostępowe do bazy danych umieść w parametrach inicjalizacji dla całej aplikacji - sprawdź snippety aby dowiedzieć się jak zapisać i odczytać parametry.
6. Na stronie nad wpisami umieść formularz umożliwiający dodawanie nowego wpisu (nazwa oraz opis). 



<!-- Links -->
[zone-date-time]:https://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html 
[date-example1]:https://www.mkyong.com/java/java-convert-date-and-time-between-timezone/
[date-example2]:https://dzone.com/articles/deeper-look-java-8-date-and
[dao-wiki]:https://pl.wikipedia.org/wiki/Data_Access_Object
[lorem-ipsum]:http://pl.lipsum.com/



