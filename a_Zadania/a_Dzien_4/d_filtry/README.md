<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java Servlety - filtry

### Zadania.

Rozwiązania zadań umieszczaj we wcześniej utworzonym projekcie.

#### Zadanie 1 - rozwiązywane z wykładowcą

1. Utwórz filtr, który będzie ustawiał kodowanie dla obiektu żądania i odpowiedzi na `utf-8`.

#### Zadanie 2 - rozwiązywane z wykładowcą

1. Utwórz filtr, który będzie wyświetlał informacje o wykorzystywanej przez użytkownika przeglądarce,
 wykorzystaj nagłówek `User-Agent`.
2. Obliczaj i wyświetlaj w konsoli czas wywołania żądania.
Wykorzystaj poniższy kod w metodzie filtra:
````java
long startTime = System.currentTimeMillis();
chain.doFilter(request, response);
long stopTime = System.currentTimeMillis();
````

-----------------------------------------------------------------------------

#### Zadanie 3

Zmodyfikuj filtr z zadania 2, tak, by pozyskane w filtrze dane zapisywał do bazy danych:
    - przeglądarkę użytkownika
    - datę i godzinę żądania
    - wszystkie parametry żądania (zastanów się w jaki sposób przechowywać te dane w bazie)
    - czas wykonania żądania
    
#### Zadanie 4

1. Dodaj filtr o nazwie `AuthFilter`, który będzie miał mapowanie na wszystkie adresy z przedrostkiem `/admin/*`.
 Jeżeli w sesji nie ma klucza o nazwie `username`, przekieruj na stronę wyświetlającą formularz logowania.
2. Umieść w deskryptorze wdrożenia `login` oraz `password`.
3. Dodaj formularz logowania, zawierający pola `login` oraz `password`.
4. Dodaj servlet `LoginServlet`, w którym będzie się sprawdzanie poprawności podanych w formularzu danych (możesz pominąć hashowanie hasła).
5. Jeżeli dane są poprawne, zapisz nazwę użytkownika do sesji pod kluczem `username`.
6. Dodaj servlet `Logout`, który będzie usuwał dane z sesji.
