# AnimalHierarchy

**AnimalHierarchy** is a Java-based program that models a hierarchy of animals, demonstrating key principles of Object-Oriented Programming (OOP). The program allows users to explore animal behaviors, manage ownership, and showcase polymorphism and inheritance.

---

## Table of Contents
1. [Features](#features)
2. [Installation and Setup](#installation-and-setup)
3. [How It Works](#how-it-works)
4. [Example Usage](#example-usage)
5. [Future Improvements](#future-improvements)

---

## Features

### 1. Animal Hierarchy
- Implements a multi-level class structure:
  - `Animal` (base class)
  - `Mammal`, `Bird`, `Reptile` (intermediate classes)
  - Specific animals like `Dog`, `Cat`, `Parrot`, `Snake`, etc.
- Each animal has shared attributes:  
  `name`, `age`, and `color`.  

### 2. Unique Behaviors
- Common methods:  
  - **`eat()`**: Each animal type has its own eating behavior.  
  - **`sleep()`**: Custom sleep behavior for each animal.  
- Unique methods:
  - Birds can **`fly()`**.
  - Reptiles can **`crawl()`**.
  - Dogs can **`bark()`**.

### 3. Ownership
- Some animals (e.g., dogs, cats) have an associated `Owner` object with attributes:  
  - `name`  
  - `phone`.  

### 4. Polymorphism
- Demonstrates polymorphism using an `ArrayList` to store multiple types of animals.
- Iterates through the list, calling shared and type-specific methods dynamically.

### 5. Deep Cloning and Equality
- Overrides **`equals()`**: Compares animals based on their attributes.  
- Implements deep cloning in **`clone()`**, ensuring independence between original and cloned animals.  

### 6. User Interaction
- Simulates actions like feeding animals, invoking their unique behaviors, and managing owners.

---

## Installation and Setup

1. **Clone the repository**:  
   ```bash
   git clone https://github.com/yourusername/AnimalHierarchy.git
