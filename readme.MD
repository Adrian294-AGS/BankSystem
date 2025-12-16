# Student Management System

## Project Overview

**Purpose:**
- Demonstrate Java OOP concepts

**what it does:**
- Add students with grade levels
- Store and compute grades
- Display student info and averages
- Demonstrates OOP principles

## System Features
- Input student details using Scanner
- Store grades in 2D arrays
- Compute averages with methods
- Display info using overridden methods
- Uses packages, enums, arrays of objects

## Sample output:
```MD
=== Student Management System ===
Enter number of students: 2

Enter details for Student 1
Name: Adrian
ID: 1
Grade Level (FIRST_YEAR, SECOND_YEAR, THIRD_YEAR, FOURTH_YEAR): second_year
Enter grade for Term 1, Subject 1: 78
Enter grade for Term 1, Subject 2: 78
Enter grade for Term 1, Subject 3: 89
Enter grade for Term 2, Subject 1: 87
Enter grade for Term 2, Subject 2: 67
Enter grade for Term 2, Subject 3: 65

Enter details for Student 2
Name: Lanther
ID: 2
Grade Level (FIRST_YEAR, SECOND_YEAR, THIRD_YEAR, FOURTH_YEAR): third_year
Enter grade for Term 1, Subject 1: 89
Enter grade for Term 1, Subject 2: 78
Enter grade for Term 1, Subject 3: 89
Enter grade for Term 2, Subject 1: 90
Enter grade for Term 2, Subject 2: 91
Enter grade for Term 2, Subject 3: 92

=== Student List (FOR-EACH) ===
- Student[name=Adrian, id=1, level=SECOND_YEAR]
- Student[name=Lanther, id=2, level=THIRD_YEAR]

Enter ID to search or type 404 to exit: 2
Found: Student[name=Lanther, id=2, level=THIRD_YEAR]

Enter ID to search or type 404 to exit: 404
Student not found.

=== Student Averages ===
Adrian's overall average: 77.33
Lanther's overall average: 88.17
```

