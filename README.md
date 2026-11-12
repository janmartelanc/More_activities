# Razvoj mobilnih aplikacij – Naloga 5: Delo z različnimi aktivnostmi

Ta projekt je Android aplikacija, izdelana v okolju Android Studio z uporabo programskega jezika Java. Glavni namen aplikacije je prikazati zasnovo, povezovanje ter prenos podatkov med več različnimi aktivnostmi (*Activities*) ter implementacija potezne navigacije (*Swipe*).

---

## 🚀 Funkcionalnosti aplikacije

* **Števec na glavnem zaslonu (`MainActivity`):** Omogoča uporabniku povečevanje vrednosti števca s pritiskom na gumb `COUNT` ter sprotno posodabljanje prikaza na zaslonu.
* **Eksplicitni prehodi in prenos podatkov (`Intent`):** S klikom na gumbe aplikacija preklaplja med tremi različnimi zasloni in s pomočjo metod `putExtra()` ter `getIntExtra()` prenaša trenutno vrednost števca iz glavne aktivnosti v ostale.
* **Druga aktivnost (`HelloActivity`):** Prikaže pozdravno besedilo *"Hello!"*, trenutno vrednost števca, preneseno iz prve aktivnosti, ter ponuja gumb za vrnitev na začetni zaslon.
* **Tretja aktivnost (`ThirdActivity`):** Prikaže naslov *"Activity 3"* in preneseno vrednost števca. Omogoča navigacijo nazaj na prvo ali drugo aktivnost na dva načina:
  * **S klikom na gumb** (`GO TO ACTIVITY 1` / `GO TO ACTIVITY 2`).
  * **S potezno navigacijo (Swipe):** Poteg s prstom v levo sproži prehod na prvo aktivnost (`MainActivity`), poteg v desno pa prehod na drugo aktivnost (`HelloActivity`).
  
---

## 🛠️ Uporabljene tehnologije

* **Razvojno okolje:** Android Studio
* **Programski jezik:** Java
* **Uporabniški vmesnik:** XML (`ConstraintLayout`, `LinearLayout`, `TextView`, `Button`)
* **Ključni Android gradniki:** `Activity`, `Intent`, `GestureDetector`

Slike : <img width="201"  alt="image" src="https://github.com/user-attachments/assets/431e363b-5ed3-4ad6-9fa5-2a805b7277af" />
<img width="201"  alt="image" src="https://github.com/user-attachments/assets/8417d412-58e1-4f74-8482-fe32c648ff4a" />
<img width="201"  alt="image" src="https://github.com/user-attachments/assets/0308dbc1-4dba-4f04-b22b-fee39fa06038" />





