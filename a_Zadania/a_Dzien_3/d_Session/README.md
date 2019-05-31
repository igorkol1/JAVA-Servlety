<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE  - SESJA
### Zadania.

Rozwiązania zadań umieszczaj we wcześniej utworzonym projekcie.

#### Zadanie 1 - rozwiązywane z wykładowcą

W projekcie stwórz trzy servlety:
 - `Sess01Set` dostępny pod adresem `/sess01Set`, 
 - `Sess01Get` dostępny pod adresem `/sess01Get` ,
 - `Sess01Del`  dostępny pod adresem `/sess01Del`.

1. Pierwszy ma nastawiać informacje w sesji pod kluczem ```counter``` na `0`.
2. Drugi ma wyświetlać zawartość sesji pod kluczem ```counter``` i zwiększać ją o `1`. 
Jeżeli nie ma takich danych w sesji, to strona powinna wyświetlić informację: `EMPTY`.
3. Trzeci ma usuwać dane z sesji (tylko te trzymane pod kluczem ```counter```).

#### Zadanie 2 - rozwiązywane z wykładowcą

W projekcie stwórz servlet `Sess02` dostępny pod adresem `/sess02`.
1. W metodzie `doGet` wyświetl formularz z możliwością wpisania oceny. 
2. Po zatwierdzeniu formularza dodaj ocenę do sesji. Oceny trzymaj w liście, którą będziesz wkładać do sesji.
3. Wylicz średnią z ocen (pamiętaj o właśnie dodanej ocenie).
4. Wszystkie zapamiętane oceny i ich średnia powinny być wyświetlane po zatwierdzeniu formularza.

-------------------------------------------------------------------------------

#### Zadanie 3.
W projekcie stwórz  `Sess03_Add` dostępny pod adresem `/addToSession` oraz servlet `Sess03_All`
 dostępny pod adresem `/showAllSession`. Następnie:
1. Dodaj do servletu `Sess03_Add` do niego następujący formularz:  
    ```html
    <form action="" method="POST">
        <label>
            Klucz:
            <input type="text" name="key">
        </label>
        <label>
            Wartość:
            <input type="text" name="value">
        </label>
        <input type="submit">
    </form>
    ```
2. Dodaj do servletu `Sess03_Add` funkcjonalność, 
która po zatwierdzeniu formularza metodą POST doda nową zmienną sesyjną o podanej nazwie i wartości. 
3. Dodaj do servletu `Sess03_All` funkcjonalność,
 która wyświetli w formie tabeli wszystkie dane znajdujące się w sesji (zarówno klucz jak i wartość). 
Do przechowywania kluczy wszystkich wartości w sesji użyj dodatkowej zmiennej sesyjnej, 
która będzie przechowywać w tablicy lub liście wszystkie klucze.

#### Zadanie 4

W projekcie stwórz servlet `Sess04` oraz stronę HTML `index_04.html`.
1. Dodaj do strony formularz, zawierający jedno pole tekstowe (nazwa) oraz dwa pola liczbowe (ilość i cena) 
służące do dodawania produktu do koszyka. Formularz powinien przekierować do servletu metodą POST.
2. Po odebraniu danych POST w servelecie, dodaj do sesji przedmiot. 
Pamiętaj, że przedmiotów będzie więcej, więc użyj do tego tablicy lub kolekcji. 
3. Dodaj do servletu funkcjonalność, która wyświetli zawartość naszego koszyka.

Przykładowy koszyk:
```
Produkt 1 - 4 x 5.20zł = 20.80zł
Produkt 2 - 1 x 9.99zł =  9.99zł
Produkt 3 - 1 x 2.20zł =  2.20zł
                   SUMA: 32.99zł
```

Informacje o produkcie możesz przechowywać w dodatkowej klasie: `CartItem` zawierającej pola `name`, `quantity`, `price`.

#### Zadanie 5

W projekcie stwórz servlet `Sess05`. Następnie:
1. Dodaj do niego formularz z 3 polami tekstowymi (imię, nazwisko, mail) oraz polem numerycznym,
 do którego będzie wpisywana captcha: wynik działania matematycznego. 
2. Nad polem numerycznym do wpisania zabezpieczenia widnieje informacja:
 `Wpisz poniżej sumę {liczba1} + {liczba2}`.
  Liczby powinny być losowe z zakresu od 0 do 100. 
  Servlet powinien obliczyć sumę tych liczb i zapisać wynik do sesji pod kluczem `captcha`
3. Po przesłaniu formularza aplikacja sprawdzi czy wpisany przez użytkownika wynik zgadza 
się z tym z sesji i wyświetli odpowiedni komunikat.



[lorempixel]:http://lorempixel.com/
