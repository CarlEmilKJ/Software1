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

Medarbejdere identificeres i systemet ved hjælp af **initialer på op til 4 bogstaver**. Eksempler på sådanne initialer kan være `huba` (Hubert Baumeister), `wilo` (William Lopez) og `anda` (Annemette A. Damgaard). Initialerne fungerer som den unikke identifikation af medarbejdere i systemet.

Projekter skal tildeles et **projektnummer automatisk af systemet**. Projektnummeret skal have formen *årstal efterfulgt af et løbenummer*. Eksempler på projektnumre kan være `26001`, `26002` osv. Derudover skal hvert projekt også kunne have **et projektnavn**.

Systemet er beregnet til **internt brug i virksomheden**, og derfor er der ikke behov for egentlig adgangskontrol. Brugere skal derfor kun angive deres **initialer** for at benytte systemet, og der kræves ikke passwords.

Listen over medarbejdere importeres fra virksomhedens **HR-system** via en fil. I denne fil indeholder hver linje ét medarbejderinitial. Derfor er det ikke nødvendigt, at systemet har funktionalitet til manuel oprettelse af medarbejdere. Systemet skal som minimum indeholde medarbejderen med initialerne `huba`.

---

## 5.2 Afgrænsning

Som minimum ønsker kunden, at systemet gør det muligt for en medarbejder at **oprette et projekt** samt **oprette og tilføje aktiviteter til projektet**. Det skal derefter være muligt at **tilføje medarbejdere til en aktivitet** og **tilknytte en projektleder til projektet**. Medarbejdere skal kunne **registrere arbejdstid på aktiviteter**, så deres tidsforbrug kan følges.

Derudover skal systemet kunne **generere en rapport**, der viser hvor meget tid der allerede er brugt på et projekt sammenlignet med den **budgetterede tid**.

Det er ikke et krav, at systemet kan **gemme data i en fil eller i en database**. Systemet skal have en **brugergrænseflade**, men det er heller ikke et krav, at denne er grafisk. Det betyder, at systemet eksempelvis kan implementeres med en **tekstbaseret brugergrænseflade**.