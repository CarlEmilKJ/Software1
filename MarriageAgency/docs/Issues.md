# Project: Time Tracking & Project Management System

## Epic: Core Project Management

### Issue: Create Project
**Description**
Systemet skal gøre det muligt for en medarbejder at oprette et projekt.

**Requirements**
- Projektnummer genereres automatisk
- Format: `[år][løbenummer]` (fx 26001)
- Projektet skal kunne have et navn
- Projektleder behøver ikke være valgt ved oprettelse

**Acceptance Criteria**
- Medarbejder kan oprette projekt
- System genererer projektnummer
- Projekt kan gemmes med navn

### Issue: Assign Project Leader
**Description**
Et projekt skal kunne have en projektleder.

**Requirements**
- Projektleder vælges blandt medarbejdere
- En medarbejder kan være projektleder i ét projekt og almindelig deltager i andre

**Acceptance Criteria**
- Projektleder kan tilføjes til projekt
- Projektleder kan ændres senere

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Epic: Activity Management

### Issue: Create Activity
**Description**
Projektleder eller medarbejdere skal kunne oprette aktiviteter i et projekt.

**Requirements**
- Aktivitet skal have:
  - navn
  - budgetteret tid
  - startuge
  - slutuge
- Aktiviteter kan oprettes gradvist

**Acceptance Criteria**
- Aktivitet kan tilføjes til projekt
- Aktivitet indeholder planlagt tid og periode

### Issue: Assign Employees to Activity
**Description**
Systemet skal understøtte bemanding af aktiviteter.

**Requirements**
- Flere medarbejdere kan tilknyttes en aktivitet
- Tildeling kan ændres løbende

**Acceptance Criteria**
- Medarbejder kan tilføjes til aktivitet
- Flere medarbejdere kan være tilknyttet samme aktivitet

### Issue: Flexible Activity Participation
**Description**
Medarbejdere skal kunne registrere tid på aktiviteter selv hvis de ikke er tilknyttet.

**Acceptance Criteria**
- Medarbejder kan registrere timer på aktivitet uden at være tildelt


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Epic: Time Registration

### Issue: Register Time
**Description**
Medarbejdere skal kunne registrere arbejdstid dagligt.

**Requirements**
- Nøjagtighed på 0.5 time
- Skal være hurtig og enkel

**Acceptance Criteria**
- Timer kan registreres på aktivitet
- Registrering kan rettes senere
- System viser manglende timer for dagen

### Issue: Register Future Activities
**Description**
Systemet skal understøtte registrering af fremtidige aktiviteter.

**Examples**
- ferie
- sygdom
- kurser

**Acceptance Criteria**
- Bruger kan registrere fremtidige aktiviteter
- Aktivitet indeholder start og slutdato

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Epic: Resource Planning

### Issue: Employee Availability Overview
**Description**
Projektledere skal kunne se hvilke medarbejdere der er ledige.

**Requirements**
Systemet skal tage højde for:

- planlagte aktiviteter
- andre projekter
- faste aktiviteter

**Acceptance Criteria**
- System viser medarbejdere med ledig kapacitet


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Epic: Reporting

### Issue: Project Time Report
**Description**
Systemet skal generere rapporter over projektets tidsforbrug.

**Requirements**
Rapport skal vise:

- brugte timer pr aktivitet
- samlet projektforbrug
- budget vs faktisk forbrug

**Acceptance Criteria**
- Rapport kan genereres
- Rapport kan bruges til ugentlige projektmøder


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Epic: Employee Management

### Issue: Import Employees
**Description**
Medarbejdere importeres fra HR-system.

**Requirements**
- Import fra fil
- Én medarbejder pr linje
- Initialer på max 4 bogstaver

**Acceptance Criteria**
- System kan importere medarbejdere
- Minimum medarbejderen `huba` findes

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Epic: System Access

### Issue: Login With Initials
**Description**
Systemet kræver ikke adgangskontrol.

**Requirements**
- Brugere logger ind med initialer
- Ingen password nødvendig

**Acceptance Criteria**
- Bruger kan logge ind via initialer