# Difference Between Objects and Classes (Java)

## Main Post (Discussion 1)

In Java, a **class** is the blueprint. It defines what data something has (fields/instance variables) and what it can do (methods). The class itself isn’t a “real thing” yet — it’s the design for making real things. An **object** is the real thing: it’s an instance created from a class at runtime. Objects live in memory and hold actual values for the fields defined in the class. In other words, the class describes the structure and behavior, and the object is the working, living example built from it (National University System, n.d.-a).

Conceptually, the difference comes down to **template vs. instance**. One class can produce many objects, and each object has its own independent state. In this project, `Dog` is the **class** (blueprint). Then `dog1` and `dog2` are **objects** created from that class. Both objects share the same methods like `bark()` and `showInfo()`, because those behaviors come from the class. But they can store different values for `name`, `breed`, and `age` because each object holds its own state in memory (National University System, n.d.-b).

This is also why OOP is practical: classes keep the program organized and reusable, and objects let you model real situations by creating multiple independent instances. You can call the same method on different objects and get different results based on each object’s state. You can also change one object (like giving `dog1` a birthday) without changing the other object (`dog2`)—because they are separate instances (National University System, n.d.-a).

## What This Project Demonstrates
- **Class**: `Dog` defines fields + methods (blueprint)
- **Objects**: `dog1`, `dog2` are instances with different state
- Same behaviors, different state, independent memory

## How to Run
1. Open the project in your IDE.
2. Run `Main.java`.

## Files
- `Dog.java` — class definition (fields + methods)
- `Main.java` — creates objects and demonstrates differences

## References
Horstmann, C. S. (2017). Big Java: Late objects (2nd ed.). John Wiley & Sons.  ￼
National University. (n.d.). Objects, Classes, Inheritance, and Polymorphism [HTML lecture].  ￼
National University. (n.d.). Chapter 8 – Objects and Classes [PowerPoint slides].  ￼
National University. (n.d.). Chapter 9 – Inheritance and Interfaces [PowerPoint slides]
