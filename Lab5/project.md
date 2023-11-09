# System aukcyjny

## Wprowadzenie

Specyfikacja wymagań funkcjonalnych w ramach informatyzacji procesu sprzedaży produktów w oparciu o mechanizm aukcyjny. 

## Procesy biznesowe

---
<a id="bc1"></a>
### BC1: Sprzedaż aukcyjna 

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Opis:** Proces biznesowy opisujący sprzedaż za pomocą mechanizmu aukcyjnego. |

**Scenariusz główny:** <br>
1. [Sprzedający](#ac1) wystawia produkt na aukcję. ([UC1](#uc1)) <br>
2. [Kupujący](#ac2) oferuje kwotę za produkt ([UC2](#uc2)) wyższą od aktualnie najwyższej oferty. ([BR1](#br1))<br>
3. [Kupujący](#ac2) wygrywa aukcję ([BR2](#br2))<br>
4. [Kupujący](#ac2) przekazuje należność Sprzedającemu. ([UC4](#uc4), [BR4](#br4))<br>
5. [Sprzedający](#ac1) przekazuje produkt Kupującemu.

**Scenariusze alternatywne:** 

2.A. Oferta Kupującego została przebita, a [Kupujący](#ac2) pragnie przebić aktualnie najwyższą ofertę. <br>
* 2.A.1. Przejdź do kroku 2.

3.A. Czas aukcji upłynął i [Kupujący](#ac2) przegrał aukcję. ([BR2](#br2)) <br>
* 3.A.1. Koniec przypadku użycia.

3.B. Aukcja została anulowana ([UC3](#uc3)) przez [Sprzedającego](#ac1). ([BR3](#br3)) <br>
* 3.B.1. Koniec przypadku użycia.

4.A. [Kupujący](#ac2) nie przekazał należności [Sprzedającemu](#ac1). ([BR4](#br4)) <br>
* 4.A.1. Koniec przypadku użycia

---

## Aktorzy

<a id="ac1"></a>
### AC1: Sprzedający

Osoba oferująca towar na aukcji.

<a id="ac2"></a>
### AC2: Kupujący

Osoba chcąca zakupić produkt na aukcji.


## Przypadki użycia poziomu użytkownika

### Aktorzy i ich cele

[Sprzedający](#ac1):<br>
* [UC1](#uc1): Wystawienie produktu na aukcję <br>
* [UC3](#uc3): Anulowanie aukcji

[Kupujący](#ac2) <br>
* [UC2](#uc2): Wystawienie oferty kupna produktu <br>
* [UC4](#uc4): Opłacenie wygranej licytacji

---
<a id="uc1"></a>
### UC1: Wystawienie produktu na aukcję

**Aktorzy:** [Sprzedający](#ac1)

**Scenariusz główny:** <br>
1. [Sprzedający](#ac1) zgłasza do systemu chęć wystawienia produktu na aukcję. <br>
2. System prosi o podanie danych produktu i ceny wywoławczej. <br>
3. [Sprzedający](#ac1) podaje dane produktu oraz cenę wywoławczą. <br>
4. System weryfikuje poprawność danych. <br>
5. System informuje o pomyślnym wystawieniu produktu na aukcję. <br>

**Scenariusze alternatywne:** 

4.A. Podano niepoprawne lub niekompletne dane produktu. <br>
* 4.A.1. System informuje o błędnie podanych danych. <br>
* 4.A.2. Przejdź do kroku 2.

---

<a id="uc2"></a>
### UC2: Wystawienie oferty kupna produktu

**Aktorzy:** [Kupujący](#ac2)

**Scenariusz główny:** <br>
1. [Kupujący](#ac2) zgłasza do systemu chęć wzięcia udziału w licytacji. <br>
2. System prosi o podanie ceny, za którą [Kupujący](#ac2) chce kupić produkt. <br>
3. [Kupujący](#ac2) podaje ofertę zgodną z regułą [BR1](#br1). <br>
4. System weryfikuje poprawność danych. <br>
5. System informuje o przyjęciu oferty kupna. <br>

**Scenariusze alternatywne:** 

4.A. Podano niepoprawne dane <br>
* 4.A.1. System informuje o błędnie podanych danych. <br>
* 4.A.2. Przejdź do kroku 2.

---

<a id="uc3"></a>
### UC3: Anulowanie aukcji

**Aktorzy:** [Sprzedający](#ac1)

**Scenariusz główny:** <br>
1. [Sprzedający](#ac1) zgłasza do systemu chęć anulowania wcześniej rozpoczętej przez siebie aukcji. <br>
2. System prosi o podanie danych aukcji.<br>
3. [Sprzedający](#ac1) podaje dane aukcji.<br>
4. System weryfikuje poprawność danych.<br>
5. System informuje o anulowaniu aukcji.<br>

**Scenariusze alternatywne:** 

4.A. Podano niepoprawne dane <br>
* 4.A.1. System informuje o błędnie podanych danych.<br>
* 4.A.2. Przejdź do kroku 2.

---

<a id="uc4"></a>
### UC4: Opłacenie wygranej licytacji

**Aktorzy:** [Kupujący](#ac2)

**Scenariusz główny:** <br>
1. [Kupujący](#ac2) zgłasza do systemu chęć opłacenia wygranej przez siebie licytacji. <br>
2. System prosi o podanie metody płatności. <br>
3. [Kupujący](#ac2) podaje dane wybranej metody płatności. <br>
4. System weryfikuje poprawność danych. <br>
5. System pobiera opłatę. <br>
6. System informuje o opłaceniu wygranej. <br>

**Scenariusze alternatywne:** 

4.A. Podano niepoprawne dane <br>
* 4.A.1. System informuje o błędnie podanych danych.<br>
* 4.A.2. Przejdź do kroku 2. <br>

5.A. Podano metodę płatności, która nie jest w stanie w pełni opłacić licytacji. <br>
* 5.A.1. System informuje o niepowodzeniu płatności. <br>
* 5.A.2. Przejdź do kroku 2.

---

## Obiekty biznesowe (inaczej obiekty dziedzinowe lub informatyczne)

### BO1: Aukcja

Aukcja jest formą zawierania transakcji kupna-sprzedaży, w której Sprzedający określa cenę wywoławczą produktu, natomiast Kupujący mogą oferować własną ofertę zakupu każdorazowo proponując kwotę wyższą od aktualnie oferowanej kwoty. Aukcja kończy się po upływie określonego czasu lub w momencie jej anulowania. Jeśli złożona została co najmniej jedna oferta zakupy produkt nabywa ten Kupujący, który zaproponował najwyższą kwotę. Jeśli aukcja kończy się poprzez jej anulowanie, żaden kupujący nie nabywa produktu.

### BO2: Produkt

Fizyczny lub cyfrowy obiekt, który ma zostać sprzedany w ramach aukcji.

<a id="bo3"></a>
### BO3: Spółka
Firma zarządzająca opisywanym systemem.

## Reguły biznesowe

<a id="br1"></a>
### BR1: Złożenie oferty

Złożenie oferty wymaga zaproponowania kwoty wyższej niż aktualnie oferowana o minimum 1,00 PLN.

<a id="br2"></a>
### BR2: Rozstrzygnięcie aukcji

Aukcję wygrywa ten z [Kupujący](#ac2)ch, który w momencie jej zakończenia (upłynięcia czasu) złożył najwyższą ofertę.

<a id="br3"></a>
### BR3: Anulowanie aukcji
W przypadku anulowania aukcji przez [Sprzedającego](#ac1), nie wygrywa jej żaden [Kupujący](#ac2).

<a id="br4"></a>
### BR4: Składanie opłaty
W przypadku wygrania aukcji przez [Kupującego](#ac2), jest on zobowiązany do zapłacenia kwoty określonej w swojej najwyższej ofercie. W przypadku braku zapłaty aukcja jest anulowana, a konto [Kupującego](#ac2) w systemie obciążane jest karą w wysokości nieuiszczonej kwoty.

### BR5: Kary
Konto [Kupującego](#ac2) obciążone karą nie może zgłaszać ofert kupna do czasu uiszczenia kwoty równej wysokości kary na rzecz Spółki([BO3](#bo3)).

## Macierz CRUDL


| Przypadek użycia                                  | Aukcja | Produkt | ... |
| ------------------------------------------------- | ------ | ------- | --- |
| UC1: Wystawienia produktu na aukcję               |    C   |    C    | ... |
| ???                                               |  ...   |  ...    | ... |


