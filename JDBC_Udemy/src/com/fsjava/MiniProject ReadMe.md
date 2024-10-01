A Mini Project: Library Management System
*********************
Database Management System: MySQL
Programming Language: Java with JDBC API
Database / Data source name: library
In this mini project, we will create a simple library management system with two tables:
(1) books and (2) authors.

### `authors` Table:
| Field | Type          | Null | Key  | Default | Extra          |
|-------|---------------|------|------|---------|----------------|
| id    | int           | NO   | PRI  | NULL    | auto_increment |
| name  | varchar(255)  | YES  |      | NULL    |                |

### `books` Table:
| Field     | Type          | Null | Key  | Default | Extra          |
|-----------|---------------|------|------|---------|----------------|
| id        | int           | NO   | PRI  | NULL    | auto_increment |
| title     | varchar(255)  | YES  |      | NULL    |                |
| author_id | int           | YES  |      | NULL    |                |


Java Classes :
1. DBConnector - connection establishment
2. Author - CRUD operations
3. Book - CRUD operations
4. Main - ( starting point)
package name: librarymanagementsystem
Menu CRUD Operations :
Menu: Library Management Susyem
1. Add Author
2. Update Author
3. Delete Author
4. List All Authors
5. Add Book
6. Update Book
7. Delete Book
8. List ALL Books
9. Exit
    
Enter your choice:
Enter your choice: 4
List of Authors:
Author ID: 31, Name: Dennis R
Author ID: 32, Name: BG Swamy
Author ID: 33, Name: SS Rao
Enter your choice: 8
List of Books:
Book ID: 31, Title: C ProgrammIng, Author ID: 31
Book ID: 32, Title: Java Demystified , Author ID: 33
Book ID: 34, Title: Object Oriented Programming using C++, Author ID: 32
Book ID: 35, Title: 00P using Java, Author ID: 32
Enter your choice: 1
Enter author name: Galvin
Author added successfully!
Enter your choice: 5
Enter book title: Operating Systems
Enter author ID: 34
Book added successfully!

Enter your choice: 4
List of Authors:
Author ID: 31, Name: Dennis R
Author ID: 32, Name: BG Swamy
Author ID: 33, Name: SS Rao
Author ID: 34, Name: Galvin
Enter your choice: 6
Enter book ID: 37
Enter new book title: Operating System Concepts
Enter new author ID: 34
Book updated successfully!
Enter your choice: 7
Enter book ID to delete: 37
Book deleted successfully!
Enter your choice: 9
Exiting. . .
Thanks for visiting! !
