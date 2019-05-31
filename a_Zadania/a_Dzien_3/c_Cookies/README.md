<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE  - COOKIES

### Zadania.

Rozwiązania zadań umieszczaj we wcześniej utworzonym projekcie.

#### Zadanie 1 - rozwiązywane z wykładowcą

W projekcie stwórz trzy servlety `Cookie1Set`, `Cookie1Get`, `Cookie1Del`. Następnie:
1. Servlet `Cookie1Set` ma być dostępny pod adresem `/setCookie`. Ma nastawiać ciasteczko o nazwie ```User``` na `Coders Lab`, z ważnością `24h`.
2. Servlet `Cookie1Get` ma być dostępny pod adresem `/showCookie`. Ma wyświetlać zawartość ciasteczka ```User```. Jeżeli nie ma takiego ciasteczka, to powinna się  wyświetlić odpowiednia informacje.
3. Servlet `Cookie1Del` ma być dostępny pod adresem  `/deleteCookie` ma kasować ciasteczko o nazwie ```User```. Jeżeli nie ma takiego ciasteczka, to powinna się  wyświetlić odpowiednia informacje.
  
#### Zadanie 2 - rozwiązywane z wykładowcą.
W projekcie stwórz servlet `Cookie2`, dostępny pod adresem `/addToCookie`, oraz plik 
`index2.html`, który wyświetli następujący formularz:  
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
Po zatwierdzeniu formularza metodą POST dodajemy nowe ciasteczko o podanej nazwie i wartości.    

-------------------------------------------------------------------------------

#### Zadanie 3 

1. W projekcie stwórz servlet `Cookie3`, dostępny pod adresem `/cookie3` oraz stronę HTML `index_3.html`,
 strona ma zawierać formularz z polami jak w zadaniu 2, oraz dodatkowym polem:
````
<select name="time">
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
</select>
````
2. W servlecie pobierz parametry `key`, `value`, `time` a następnie utwórz ciasteczko :
 - o nazwie = `key`
 - o wartości = `value`
 - o czasie życia = `time` - przyjmujemy że time jest podany w godzinach. Musisz dokonać przekształcenia.

Hint: Żeby sprawdzić czy ciasteczko jest poprawnie zapisane, przejdź do konsoli deweloperskiej Twojej przeglądarki (`ctrl + shift + i`), 
następnie do zakładki `Application` i wybierz Cookies z tabelki po prawej stronie.
Wyświetlą Ci się wtedy wszystkie ciasteczka jakie są trzymane w Twojej przeglądarce. 


#### Zadanie 4

W projekcie stwórz servlet `Cookie4Show`, dostępny pod adresem `/showAllCookies` i `Cookie4Del`, dostępny pod adresem `/removeCookie`.
1. W servlecie `Cookie4Show` wyświetl wszystkie ciasteczka. 
2. Przy każdym z nich wygeneruj link do drugiego servletu `Cookie4Del`. **Pamiętaj o przekazaniu w danych GET nazwy tego ciasteczka**. 
3. W servlecie `Cookie4Del` usuń ciasteczko. 

#### Zadanie 5

W projekcie stwórz dwa servlety `Cookie51`, dostępny pod adresem `/cookie51` i `Cookie52`, dostępny pod adresem `/cookie51`.
1. Wymagamy aby użytkownik najpierw odwiedził stronę wygenerowaną przez servlet `Cookie51`,
 a dopiero potem mógł przejść do strony wygenerowanej przez `Cookie52`.
2. Gdy użytkownik wejdzie na pierwszą stronę, zapisz informację w ciasteczku pod kluczem `cookie51` oraz wyświetl link do drugiego servletu.
3. Przy wejściu na stronę wygenerowaną przez servlet `Cookie52` sprawdź czy ciasteczko istnieje:
    * Jeżeli istnieje to je usuń oraz wypisz komunikat `Witamy na stronie Cookie52`
    * jeżeli ciasteczka nie ma przekieruj użytkownika przy użyciu metody `sendRedirect` na adres servletu `Cookie51` 
      przekazując jednocześnie parametr o nazwie `msg` o wartości:  `FirstVisitCookie51`.
      

Hint: Przetestuj servlety w różnych przeglądarkach, manualnie usuwając ciasteczka (możesz to zrobić w konsoli deweloperskiej).

Dla przekierowania wykorzystaj poniższy kod:

``
String message = "Nie odwiedziles jeszcze tej strony";
response.sendRedirect("Cookie51?msg=" + URLEncoder.encode(message));``


