# CSC120: Object-Oriented Programming
## A6 Checklist

Listed below are various aspects of the assignment.  When you turn in your work, please indicate the status of each item

- **YES** : indicates that the item is fully complete
- **NO** : indicates that the item is not attempted
- **PART** : indicates that the item is attempted but not fully complete


## Assignment Points:

___yes__ 1 pt: The `House`, `Library`, and `Cafe` classes all `extend` the modified `Building` class.

### Level 1: Method `Overrides` (4 pts)

__yes___ 1 pt: The `House`, `Library`, and `Cafe` classes all override the `showOptions()` method to include their additional interactive methods

___YES__ 1 pt: The `Library` class has a `goToFloor(...)` method that allows movement between non-adjacent floors

__YES___ 1 pt: The `House` class has a `goToFloor(...)` method that allows movement between non-adjacent floors only if an elevator is present

__YES___ 1 pt: The `Cafe` class has a `goToFloor(...)` method that doesn't permit movement off the first floor (we assume that any additional floors are for storage / accessible only to employees)

### Level 2: Method `Overloads` (3 pts)

__YES___ 1 pt: The `House` class includes at least 2 overloaded methods

__YES___ 1 pt: The `Library` class includes at least 2 overloaded methods

__YES__ 1 pt: The `Cafe` class includes at least 2 overloaded methods

### Level 3: `CampusMap.java` (2 pts)

__YES___ 1 pt: The `main(...)` method in `CampusMap.java` has been modified to include at least 10 `Building`s (or `Building` subclasses)

_YES___ 1 pt: The `CampusMap` includes at least one instance of each class: a `House`, a `Library`, a `Cafe`, and a `Building` (demonstrating that each constructor works as expected)



## General Items:

__Yes___ 4 pts: Programs compile without errors or warnings

___YES__ 2 pts: Executes fully & consistently without crashing (exception/freeze)

__YES___ 2 pt: Complies with style guidelines (missing items 1 pt each):

      ___YES__ Classes & class members all have Javadoc header comments

      __YES___ Clear and consistent indentation of bracketed sections

      ___YES__ Adheres to Java conventions on naming & capitalization

      __YES___ Methods & variables all have clear and accurate names

      ___YES__ Methods avoid confusing side effects

__YES___ 1 pt: All required files included with submission (including completed `rubric.md` file)

__YES___ 1 pt: `reflection.md` contains your reflection on the assignment
