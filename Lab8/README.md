# Pytanie 3.1.
## Czy testy przestałyby działać, gdyby zmieniono adnotację przy metodzie setUp z BeforeEach na BeforeAll? Uzasadnij swoją odpowiedź.

Tak, ponieważ adnotacji BeforeAll można używać tylko na statycznych metodach. Jeśli natomiast mielibyśmy pewność, że metoda setUp zadziała poprawnie i zwróci taki sam wynik, co w przypadku BeforeEach, to testy działałyby dalej w taki sam sposób - this.calculator stworzyłby się i zainicjował tylko raz, a nie raz na każdy wywołany test.

# Pytanie 4.1.
## Która metoda zostanie oznaczona jako Failure, a która jako Error?

Metoda test1() zostanie oznaczona jako Failure, a metoda test2() jako Error.

# Pytanie 4.2
## Na jaką klasę rzucanego obiektu oczekuje JUnit by stwierdzić, że test się nie powiódł w sensie kategorii Failure?
JUnit oczekuje na org.opentest4j.AssertionFailedError.

# Pytanie 5.1.
## Jaki to typ testowania: blackbox czy whitebox?

Ten typ testowania to whitebox.

# Pytanie 5.2.
## Ile możliwych ścieżek działania znajduje się w metodzie calculate, zakładając, że punkt startowy to początek metody, a punkt końcowy to jej koniec?

Są cztery ścieżki działania.