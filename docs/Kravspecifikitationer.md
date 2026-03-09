# Kravspecifikation – Tidsregistrerings- og Projektstyringssystem

## 1. Baggrund

Softwarehuset A/S anvender i dag et ældre system til timeregistrering og projektstyring.  
Systemet er tungt at arbejde med, og flere problemer er blevet identificeret:

- Medarbejdere oplever, at det er besværligt at registrere arbejdstimer på aktiviteter.
- Projektledere har svært ved at få overblik over medarbejdernes tilgængelighed.
- Det er derfor vanskeligt at bemande projekter effektivt.

Virksomheden har:

- Ca. **50 udviklingsmedarbejdere**
- Ca. **30 igangværende projekter**

Nogle projekter varer få måneder, mens andre kan strække sig over flere år.

Formålet er at udvikle et **nyt system**, der gør timeregistrering enklere og giver bedre overblik over projektplanlægning og bemanding.

---

# 2. Projektstruktur

## 2.1 Projekter

Et projekt oprettes, når der skal arbejdes på en opgave.

Et projekt kan være:

- Et **kundeprojekt**
- Et **internt projekt** for Softwarehuset A/S

Ved oprettelse af et projekt:

- Er information om aktiviteter og starttidspunkt **ikke nødvendigvis fuldstændig**
- Projektlederen **behøver ikke være udpeget fra starten**

---

## 2.2 Projektleder

Hvert projekt har en **projektleder**, som vælges blandt udviklingsmedarbejderne.

En medarbejder kan:

- være **projektleder i ét projekt**
- være **almindelig medarbejder i et andet projekt**

Projektlederens ansvar inkluderer:

- Opdeling af projektet i aktiviteter
- Planlægning af aktiviteter
- Bemanding af aktiviteter
- Opfølgning på timeforbrug

---

# 3. Aktiviteter

## 3.1 Generelle egenskaber

Et projekt består af aktiviteter såsom:

- Kravspecifikation
- Projektledelse
- Analyse
- Design
- Programmering
- Test

Typisk:

- Et projekt har omkring **30 aktiviteter**
- Nogle projekter kan have **op til 100 aktiviteter**

Aktiviteter oprettes **gradvist**, efterhånden som projektet planlægges.

---

## 3.2 Planlægning af aktiviteter

For hver aktivitet skal følgende kunne registreres:

- **Budgetteret arbejdstid** (forventet antal timer)
- **Starttidspunkt**
- **Sluttidspunkt**

Tidsplanlægningen skal ske på **ugenummerniveau**.

### Eksempel

Aktiviteten **Kravspecifikation**

- Budget: **100 timer**
- Periode: **3 uger**
- Start: **Uge 10, 2026**
- Slut: **Uge 12, 2026**

Planerne skal kunne **ændres hyppigt**, da projekter udvikler sig løbende.

---

# 4. Bemanding af aktiviteter

Systemet skal understøtte planlægning af bemanding.

Projektlederen eller medarbejdere skal kunne:

- tilføje medarbejdere til aktiviteter
- planlægge bemanding **i god tid**

Der kan være:

- **flere medarbejdere på samme aktivitet**

---

## 4.1 Fleksibel deltagelse

Systemet skal tillade, at en medarbejder registrerer arbejdstid på en aktivitet:

- selvom medarbejderen **ikke er tilknyttet aktiviteten**

Dette kan være nødvendigt hvis:

- en medarbejder hjælper en kollega

---

# 5. Ressourceoverblik

Systemet skal hjælpe projektledere med at bemande projekter ved at vise:

- hvilke medarbejdere der **forventes at være ledige**
- hvilke medarbejdere der **allerede er optaget**

Overblikket skal tage højde for:

- planlagte aktiviteter
- andre projekter
- faste aktiviteter

---

# 6. Arbejdsbelastning

Typisk arbejdsbelastning:

- En medarbejder arbejder på **under 10 aktiviteter ad gangen**
- En aktivitet varer typisk **2–3 uger**

Systemet skal dog **tillade undtagelser**, hvor:

- en medarbejder kan arbejde på **mere end 10 aktiviteter i samme uge**

---

# 7. Faste aktiviteter

Systemet skal understøtte faste aktiviteter som ikke er knyttet til projekter.

Eksempler:

- Ferie
- Sygdom
- Kurser

Disse registreres med:

- **Startdato**
- **Slutdato**

---

# 8. Timeregistrering

Medarbejdere skal **dagligt registrere arbejdstid**.

Registreringen skal have følgende egenskaber:

- Nøjagtighed på **½ time**
- Skal være **hurtig og enkel**

Systemet skal gøre det muligt at:

- se om alle timer er registreret for dagen
- rette tidligere registreringer
- registrere fremtidige aktiviteter (fx ferie)

---

# 9. Projektopfølgning

Projektlederen skal kunne bruge systemet til **opfølgning på projekter**.

Systemet skal give overblik over:

- timeforbrug pr. aktivitet
- samlet timeforbrug for projektet

---

# 10. Rapportering

Systemet skal kunne generere rapporter til:

- **Softwarehuset A/S’ ugentlige projektmøder**

Rapporter skal vise:

- fremdrift i projektet
- udvikling i timeforbrug
- forventet **restarbejde på projektet**


## 5.1 Lidt data

- Medarbejdere identificeres i systemet ved **initialer på op til 4 bogstaver**.
- Initialerne fungerer som **unik identifikation** i systemet.

**Eksempler:**
- `huba` – Hubert Baumeister
- `wilo` – William Lopez
- `anda` – Annemette A. Damgaard

### Projekter
- Projektnumre tildeles **automatisk af systemet**.
- Format: **årstal + løbenummer**

**Eksempler:**
- `26001`
- `26002`

- Projekter skal også kunne have et **projektnavn**.

### Adgang til systemet
- Systemet er **kun til internt brug**.
- Der kræves **ingen adgangskontrol**.
- Brugere identificerer sig kun ved **initialer**.
- **Passwords er ikke nødvendige**.

### Medarbejderdata
- Medarbejderlisten **importeres fra HR-systemet**.
- Import sker via **en fil** hvor:
  - hver linje indeholder **ét medarbejderinitial**.
- Systemet skal **ikke understøtte manuel oprettelse af medarbejdere**.
- Systemet skal som minimum indeholde medarbejderen:
  - `huba`

---

## 5.2 Afgrænsning

Systemet skal som minimum understøtte følgende funktioner:

### Projektstyring
- En medarbejder kan **oprette et projekt**.
- En medarbejder kan **oprette en aktivitet i et projekt**.
- En medarbejder kan **tilføje aktiviteter til et projekt**.

### Ressourcestyring
- En medarbejder kan **tilføje medarbejdere til en aktivitet**.
- En medarbejder kan **tilknytte en projektleder til et projekt**.

### Timeregistrering
- Medarbejdere kan **registrere arbejdstid på aktiviteter**.

### Rapportering
- Systemet kan **generere en rapport** der viser:
  - hvor meget tid der er brugt på projektet
  - sammenligning mellem **faktisk tidsforbrug og budgetteret tid**

### Databehandling
- Det er **ikke et krav**, at systemet kan:
  - gemme data i filer
  - gemme data i en database

### Brugergrænseflade
- Systemet skal have **en brugergrænseflade**.
- Det er **ikke et krav**, at brugergrænsefladen er grafisk.
- Systemet kan derfor implementeres med en **tekstbaseret brugergrænseflade (CLI)**.