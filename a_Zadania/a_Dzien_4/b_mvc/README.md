<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java Servlety - MVC

### Zadania.

Rozwiązania zadań umieszczaj we wcześniej utworzonym projekcie.

#### Zadanie 1 - rozwiązywane z wykładowcą

W projekcie stwórz stronę `jsp1.jsp`.
1. Dołącz do projektu biblioteki **jstl**
2. W projekcie stwórz servlet `Mvc11` dostępny pod adresem **/mvc11**
3. W servlecie pobierz wartość GET o nazwie `role` a następnie ustaw atrybut o nazwie **role**.
4. Ustaw plik **jsp** jako plik widoku dla tego servletu.
5. W przypadku braku wartości ma się wyświetlić napis `guest`.

#### Zadanie 2 - rozwiązywane z wykładowcą

W projekcie stwórz servlet `Mvc12` dostępny pod adresem **/mvc12** , który wczyta dwie zmienne GET : ```start``` i ```end``` . Następnie: 
1. W servlecie zwiększ obie wartości o wartość `10`, przekaż zwiększone zmienne do widoku JSP .
2. W widoku wyświetl  wszystkie liczby  ```start``` do ```end```. 

-----------------------------------------------------------------------------

#### Zadanie 3

W projekcie stwórz servlet `Mvc13` dostępny pod adresem **/mvc13**. 
1. W widoku stwórz formularz zawierający pola o nazwach (title, author, isbn).
 Formularz ma przesłać dane metodą POST do tego samego servletu (do metody `doPost`).
2. Stwórz klasę `Book` zawierającą pola zgodne z polami wcześniej utworzonego formularza.
3. Odbierz dane i na ich podstawie stwórz obiekt klasy Book.
4. Przekaż obiekt do widoku `result.jsp`. 
5. Wyświetl właściwości nowo dodanego obiektu: `title`, `author`, `isbn`.


#### Zadanie 4

W projekcie stwórz servlet `Mvc14` dostępny pod adresem **/mvc14**. 
1. W widoku wyświetlanym metodą `GET` o nazwie `form.jsp` stwórz formularz zawierający pola o nazwach (title1, author1, isbn1),
 (title2, author2, isbn2), itd do 5. 
Formularz ma być przesłany metodą POST do servletu `Mvc14`.
2. Zaimportuj wcześniej stworzoną klasę `Book`.
3. W servlecie `Mvc14` odbierz dane i na ich podstawie stwórz obiekty klasy Book.
4. Obiekty umieść w liście lub tablicy, którą następnie przekaż do widoku `result.jsp`. 
5. W pętli wyświetl właściwości wszystkich obiektów `title`, `author`, `isbn`.

