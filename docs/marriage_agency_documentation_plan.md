# marriageAgency.MarriageAgency Modelling Exercise --- Documentation Plan

## Overview

This document describes the architecture, responsibilities, and
interactions of the classes defined in the modelling exercise for the
**marriageAgency.MarriageAgency application**. The goal is to translate the UML class
diagram and sequence diagrams into a clear implementation structure in
Java.

The system implements a use case called **Find Matches**, where a
customer searches for compatible partners in a marriage agency database.

------------------------------------------------------------------------

# 1. System Purpose

The system allows a customer to search for potential matches based on
age compatibility.\
The architecture follows a simple object‑oriented design consisting of:

-   `marriageAgency.Customer`
-   `marriageAgency.MarriageAgency`

The behaviour of the system must allow two execution scenarios:

1.  A matching customer is found
2.  No matching customer exists

Both scenarios are illustrated in the sequence diagrams in the modelling
exercise.

------------------------------------------------------------------------

# 2. Architecture Overview

## Core Classes

### marriageAgency.MarriageAgency

Responsible for managing customers and searching for matches.

Responsibilities:

-   Store registered customers
-   Iterate through the customer list
-   Ask a customer if another customer is a match
-   Return a list of compatible customers

Main method:

    findMatches(marriageAgency.Customer): List<marriageAgency.Customer>

------------------------------------------------------------------------

### marriageAgency.Customer

Represents a person registered in the marriage agency.

Attributes:

    age : int

Responsibilities:

-   Store personal attributes (currently age)
-   Determine if another customer is compatible
-   Provide age information when requested

Main methods:

    match(marriageAgency.Customer): boolean
    appropriateAge(marriageAgency.Customer): boolean
    getAge(): int

------------------------------------------------------------------------

# 3. Dependency Structure

The dependency flow of the system is:

    User
      ↓
    marriageAgency.MarriageAgency
      ↓
    marriageAgency.Customer.match()
      ↓
    marriageAgency.Customer.appropriateAge()
      ↓
    marriageAgency.Customer.getAge()

Explanation:

1.  The user interacts only with the `marriageAgency.MarriageAgency`.
2.  `marriageAgency.MarriageAgency` coordinates the matching process.
3.  The `marriageAgency.Customer` class performs the compatibility logic.
4.  `getAge()` provides the data required for comparison.

------------------------------------------------------------------------

# 4. Execution Flow

## Scenario 1 --- Match Found

Execution steps:

1.  User calls `findMatches(c1)`
2.  marriageAgency.MarriageAgency creates a result list
3.  Agency iterates over registered customers (`c2`)
4.  `c1.match(c2)` is called
5.  `appropriateAge(c2)` compares ages
6.  If the result is `true`
7.  `c2` is added to the found list
8.  The list containing matches is returned

Result:

    found = [c2]

------------------------------------------------------------------------

## Scenario 2 --- No Match Found

Execution steps:

1.  User calls `findMatches(c1)`
2.  Agency loops through customers
3.  `match(c2)` returns `false`
4.  Loop continues until all customers are checked
5.  No customers are added to the result list
6.  An empty list is returned

Result:

    found = []

------------------------------------------------------------------------

# 5. Class Responsibilities

## marriageAgency.MarriageAgency

Responsibilities:

-   Maintain a collection of customers
-   Control the matching process
-   Return all matching customers

Key methods:

    addCustomer(marriageAgency.Customer)
    findMatches(marriageAgency.Customer)

------------------------------------------------------------------------

## marriageAgency.Customer

Responsibilities:

-   Store attributes
-   Determine compatibility
-   Provide data for comparisons

Key methods:

    match(marriageAgency.Customer)
    appropriateAge(marriageAgency.Customer)
    getAge()

------------------------------------------------------------------------

# 6. Data Flow

The data used in matching is minimal.

    marriageAgency.Customer.age

Matching logic compares:

    age(c1)
    age(c2)

Example compatibility rule:

    |age1 - age2| <= 10

This rule can be replaced by more advanced logic in future versions.

------------------------------------------------------------------------

# 7. Design Decisions

### Separation of Responsibilities

marriageAgency.MarriageAgency: - Controls process - Stores customers

marriageAgency.Customer: - Implements matching logic

This separation follows the **Single Responsibility Principle**.

------------------------------------------------------------------------

# 8. Possible Extensions

Future improvements could include:

-   Gender preferences
-   Interests or hobbies
-   Geographic location
-   Match scoring system
-   Database storage

------------------------------------------------------------------------

# 9. Summary

The system design is intentionally simple:

-   `marriageAgency.MarriageAgency` manages and coordinates matching.
-   `marriageAgency.Customer` encapsulates compatibility logic.
-   Matching is performed through a loop over registered customers.
-   The system supports both successful and unsuccessful match
    scenarios.

This architecture directly reflects the UML class diagram and sequence
diagrams provided in the modelling exercise.
