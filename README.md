
---

# Project Title: Design Patterns and Mini-Project

## Overview

This project consists of two exercises focusing on software design patterns and a mini-project titled **Astronaut Schedule Organizer**. The goal is to demonstrate a solid understanding of design principles, coding standards, and best practices in software development using Java.

---

## Exercise 1: Design Patterns

### Overview

In this exercise, six different use cases were developed to illustrate various software design patterns. The patterns include two behavioral, two creational, and two structural design patterns.

### Command-Line Instructions to Create Files

To set up the directory structure for Exercise 1, you can use the following commands:

```bash
mkdir -p design-pattern-examples/behavioral
mkdir -p design-pattern-examples/creational
mkdir -p design-pattern-examples/structural
mkdir design-pattern-examples/main
```

Next, create the necessary Java files as follows:

- **Behavioral Patterns:**
  - `ObserverPattern.java`
  - `StrategyPattern.java`

- **Creational Patterns:**
  - `SingletonPattern.java`
  - `ShapeFactory.java`

- **Structural Patterns:**
  - `AdapterPattern.java`
  - `DecoratorPattern.java`

- **Main Class:**
  - `Main.java`

### Directory Structure

```
/design-pattern-examples
│
├── behavioral
│   ├── ObserverPattern.java      // Implements the Observer pattern for monitoring state changes.
│   ├── StrategyPattern.java       // Implements the Strategy pattern for defining a family of algorithms.
│
├── creational
│   ├── SingletonPattern.java       // Implements the Singleton pattern to ensure a class has only one instance.
│   ├── ShapeFactory.java           // Implements the Factory pattern to create different shapes.
│
├── structural
│   ├── AdapterPattern.java         // Implements the Adapter pattern to allow incompatible interfaces to work together.
│   ├── DecoratorPattern.java       // Implements the Decorator pattern to add new functionality to existing objects.
│
└── main
    └── Main.java                  // The entry point of the application to demonstrate the design patterns.
```

### File Explanations

1. **ObserverPattern.java**:
   - Implements the **Observer** design pattern.
   - Defines a subject and observer interface, allowing objects to be notified of changes in the subject's state.
   - Useful in scenarios where a change in one object should be reflected in multiple dependent objects.

2. **StrategyPattern.java**:
   - Implements the **Strategy** design pattern.
   - Defines a family of algorithms, encapsulating each algorithm within a separate class and making them interchangeable.
   - This allows the client to choose an algorithm at runtime, promoting flexibility and reducing coupling.

3. **SingletonPattern.java**:
   - Implements the **Singleton** design pattern.
   - Ensures that a class has only one instance and provides a global point of access to it.
   - Commonly used for configuration classes, logging classes, or any shared resource.

4. **ShapeFactory.java**:
   - Implements the **Factory** design pattern.
   - Provides an interface for creating objects, allowing subclasses to alter the type of objects that will be created.
   - This is useful for creating instances of shapes (like Circle, Square) without specifying the exact class of object that will be created.

5. **AdapterPattern.java**:
   - Implements the **Adapter** design pattern.
   - Allows incompatible interfaces to work together by wrapping an existing class with a new interface.
   - Useful for integrating new functionality into existing code without altering the original codebase.

6. **DecoratorPattern.java**:
   - Implements the **Decorator** design pattern.
   - Allows behavior to be added to individual objects dynamically without affecting the behavior of other objects from the same class.
   - This is useful for enhancing the functionalities of objects in a flexible manner.

7. **Main.java**:
   - The entry point of the application.
   - Contains the `main` method where instances of various design patterns are created and demonstrated.
   - Serves as a demonstration of how each pattern can be utilized in practice.

---

## Exercise 2: Mini-Project

### Overview

The **Astronaut Schedule Organizer** is a console-based application designed to manage tasks and schedules for astronauts. This project emphasizes logic and code quality while utilizing best practices in software design.

### Command-Line Instructions to Create Files

To set up the directory structure for Exercise 2, use the following command:

```bash
mkdir astronaut-schedule-organizer
```

Next, create the necessary Java files as follows:

- `Task.java`
- `TaskFactory.java`
- `ScheduleManager.java`
- `Observer.java`
- `TaskObserver.java`
- `Main.java`

### Directory Structure

```
/astronaut-schedule-organizer
│
├── Task.java               // Represents a task with attributes like name, duration, and priority.
├── TaskFactory.java        // Implements the Factory pattern to create different types of tasks.
├── ScheduleManager.java    // Manages the scheduling of tasks and provides functionalities to add, remove, and update tasks.
├── Observer.java           // Defines the Observer interface for implementing the Observer pattern.
├── TaskObserver.java       // Implements the Observer interface to observe changes in task statuses.
└── Main.java               // The entry point of the application, where the scheduling functionality is executed.
```

### File Explanations

1. **Task.java**:
   - Represents a task with properties such as name, duration, and priority.
   - Provides methods to get task details and manage task states.

2. **TaskFactory.java**:
   - Implements the **Factory** design pattern.
   - Responsible for creating various types of tasks based on specific criteria.
   - This decouples the task creation logic from the task management logic, enhancing maintainability.

3. **ScheduleManager.java**:
   - Manages the overall scheduling of tasks.
   - Provides methods to add, remove, and update tasks in the schedule.
   - Responsible for ensuring that tasks are organized and can be executed efficiently.

4. **Observer.java**:
   - Defines the **Observer** interface.
   - Includes methods that observers must implement to react to state changes in the subject (tasks).

5. **TaskObserver.java**:
   - Implements the **Observer** interface.
   - Observes changes in the task status and updates accordingly, providing feedback to the user.

6. **Main.java**:
   - The entry point of the application.
   - Contains the `main` method where the task management functionality is executed.
   - Demonstrates the interaction between tasks and the scheduling manager, as well as the observer pattern.

---

## Conclusion

This project has solidified the understanding and application of design patterns, coding standards, and best practices in software development. The code for both exercises has been uploaded to GitHub for review.

**GitHub Link**: [Insert GitHub Repository Link Here]

## Walkthrough

I am prepared to walk through the codebase, explaining the design decisions made throughout the development process. Creativity and spontaneity were key factors considered during the implementation of this project.

---

Feel free to replace the placeholder with your actual GitHub repository link. If you need any more adjustments or additional details, just let me know!