<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE  - Servlety

### Zadania.

1. Stwórz projekt `servletjee`. Rozwiązania zadań powinny znajdować się w tym projekcie.
2. Utwórz pakiet `pl.coderslab` - servlety umieszczaj w tym pakiecie lub pakietach podrzędnych.

#### Zadanie 1 - rozwiązywane z wykładowcą

1. Stwórz projekt a w nim servlet `Servlet11`, dostępny pod adresem **/servlet11**,
który wyświetli na konsoli "Hello First Servlet", jednocześnie wyświetli w przeglądarce `Content11`.
3. Adres strony powinien być określony za pomocą adnotacji.
2. Skonfiguruj IntelliJ wraz z serwerem Tomcat.
3. Uruchom projekt.

#### Zadanie 2 

1. W projekcie stwórz servlet `Servlet12`, dostępny pod adresem **/servlet12**, 
2. Wyświetl na stronie: `Content12`. 
3. Adres strony powinien być określony za pomocą odpowiedniego wpisu w deskryptorze wdrożenia (podpowiedź znajdziesz w Snippetach).


-------------------------------------------------------------------------------

#### Zadanie 3

1. W projekcie stwórz servlet `Servlet13` dostępny pod adresem **/servlet13**,
 który wyświetli w przeglądarce lokalny czas.
Wykorzystaj `LocalTime.now()` .


#### Zadanie 4
1. W projekcie stwórz servlet `Servlet14` dostępny pod adresem **/servlet14**,
2. Wyświetl w przeglądarce poniższe informacje (wykorzystaj metodę **getHeader** obiektu typu **HttpServletRequest**):
    * Adres IP
    * Przeglądarkę
    * Aktualny czas (wykorzystaj `LocalTime.now()` )
