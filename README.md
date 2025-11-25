# Library Management System (Console-Based)

📌 Overview

This is a **Java Console-Based Library Management System** designed to help manage basic library operations. It allows the user to **add books, view books, search books,delete books and exit the system** — all through a simple text-based interface.

This project is ideal for learning:

* Core Java
* OOP concepts
* Arrays / ArrayList
* File handling 
---

## 🎯 Features

### ✔ Add New Books

* Enter book details like ID, Title, Author, Quantity.
* Stores all books in an in-memory list/array.

### ✔ Display All Books

* Shows all available books in a neat tabular format.

### ✔ Search Book

* Search using **Book ID / Title**.

### ✔ Issue Book

* Issues a book if available.
* Decreases quantity.

### ✔ Return Book

* Returns and increases quantity.

### ✔ Delete Book (Optional)

* Remove a book record from the list if needed.

### ✔ Exit

* Terminates the program.

---

## 🛠️ Technologies Used

* **Java (JDK 8 or later)**
* Console I/O (Scanner class)

---

## 📂 Project Structure

```
LibraryProject/
│-- Library.java        # Main file containing logic
│-- Book.java           # Model class for Book (if used)
│-- README.md           # Documentation
```

---

## ▶️ How to Run

1. Open terminal in project folder.
2. Compile the Java file:

   ```bash
   javac Library.java
   ```
3. Run the program:

   ```bash
   java Library
   ```

---

## 📘 Code Highlights

* Uses Object-Oriented approach.
* Easily extendable (e.g., add file handling or database later).
* Clean menu-driven structure.

---

## 🌟 Future Enhancements

* Add **file handling** to store books permanently.
* Convert console app to **Swing/JavaFX GUI**.
* Connect with **MySQL** for real database operations.
* Add **Librarian login system**.

---

## ✨ Author

Shweta Pawar

---


