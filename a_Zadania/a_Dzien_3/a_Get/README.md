<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE  - GET

### Zadania.

Rozwiązania zadań umieszczaj we wcześniej utworzonym projekcie.

#### Zadanie 1 - rozwiązywane z wykładowcą

1. W projekcie stwórz servlet `Get1`, dostępny pod adresem **/get1**,
 który pobierze z adresu dwa parametry: ```start``` i ```end``` . 
2. Po uruchomieniu aplikacji na serwerze, w przeglądarce wyświetlą się wszystkie liczby od ```start``` do ```end```. 
(dla uproszczenia załóżmy, że będziemy przesyłać tylko liczby całkowite).
Jeżeli zmienne nie są przesłane, to strona ma wypisać informację `BRAK`.
3. Przykładowy adres wywołania: `http://localhost:8080/get1?start=1&end=12`;


#### Zadanie 2  - rozwiązywane z wykładowcą

1. W projekcie stwórz servlet `Get2`, dostępny pod adresem **/get2**, który wyświetli listę przesłanych w zapytaniu (request) parametrów i ich wartość
 (niezależnie od liczby przesłanych parametrów). Wykorzystaj poniższy kod:
 ````
  Map<String, String[]> parameterMap = request.getParameterMap();
 ````
 
-------------------------------------------------------------------------------

#### Zadanie 3

1. W projekcie stwórz servlet `Get3`, dostępny pod adresem **/get3**, który ma pobierać dwie zmienne o nazwach ```width``` i ```height```.
Jeżeli informacje nie są przesłane to ```width = 5``` i ```height = 10```. 
2. Następnie wygeneruj tabliczkę mnożenia o podanej wysokości i szerokości i wyświetl ją w przeglądarce.


#### Zadanie 4

1. W projekcie stwórz servlet `Get4`, dostępny pod adresem **/get4** .
W katalogu `main` utwórz katalog o nazwie `webapp`.  
Umieść w nim plik HTML o nazwie `index.html`, zawierający formularz:

```html
<form action="" method="GET">
    <label>
        Page:
        <input type="text" name="page">
    </label>
    <input type="submit">
</form>
```
2. Uzupełnij odpowiednio atrybut **action** formularza,
3. W metodzie  `doGet` servletu pobierz przesłany parametr.
4. Wyświetl na stronie dzielniki całkowite przesłanej liczby.


#### Zadanie 5
W projekcie stwórz servlet `Get5`, dostępny pod adresem **/get5**,
 oraz stronę HTML `index.html`, w której umieścisz link do servletu z dodatkowymi parametrami    
``` ?company=coderslab&learn=php&learn=java&learn=ruby&learn=python ```    
po wysłaniu formularza wyświetl informacje w następujący sposób:
````
company:
  - coderslab
learn:
  - php 
  - java
  - ruby
  - python
````