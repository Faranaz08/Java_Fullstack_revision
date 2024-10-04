package com.Mini;

import java.sql.*;
import java.util.*;

public class MiniProjectJDBC {
    public static void main(String[] args) {
        DBConnector connector = new DBConnector();
        Connection connection = connector.getConnection();
        
        if (connection != null) {
            System.out.println("Connection Successful");

            Author author = new Author(connection);
            Book book = new Book(connection);

            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\nMenu: Library Management System");
                System.out.println("1. Add Author");
                System.out.println("2. Update Author");
                System.out.println("3. Delete Author");
                System.out.println("4. List All Authors");
                System.out.println("5. Add Book");
                System.out.println("6. Update Book");
                System.out.println("7. Delete Book");
                System.out.println("8. List All Books");
                System.out.println("9. Exit");
                System.out.print("Enter your choice: ");
                
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter author name: ");
                        String authorName = scanner.nextLine();
                        author.addAuthor(authorName);
                        System.out.println("Author added successfully!");
                        break;
                    
                    case 2:
                        System.out.print("Enter author ID: ");
                        int authorIdToUpdate = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        System.out.print("Enter new author name: ");
                        String newAuthorName = scanner.nextLine();
                        author.updateAuthor(authorIdToUpdate, newAuthorName);
                        System.out.println("Author updated successfully!");
                        break;
                    
                    case 3:
                        System.out.print("Enter author ID to delete: ");
                        int authorIdToDelete = scanner.nextInt();
                        author.deleteAuthor(authorIdToDelete);
                        System.out.println("Author deleted successfully!");
                        break;
                    
                    case 4:
                        System.out.println("List of Authors:");
                        for (String a : author.getAllAuthors()) {
                            System.out.println(a);
                        }
                        break;

                    case 5:
                        System.out.print("Enter book title: ");
                        String bookTitle = scanner.nextLine();
                        System.out.print("Enter author ID: ");
                        int authorIdForBook = scanner.nextInt();
                        book.addBook(bookTitle, authorIdForBook);
                        System.out.println("Book added successfully!");
                        break;
                    
                    case 6:
                        System.out.print("Enter book ID: ");
                        int bookIdToUpdate = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        System.out.print("Enter new book title: ");
                        String newBookTitle = scanner.nextLine();
                        System.out.print("Enter new author ID: ");
                        int newAuthorIdForBook = scanner.nextInt();
                        book.updateBook(bookIdToUpdate, newBookTitle, newAuthorIdForBook);
                        System.out.println("Book updated successfully!");
                        break;
                    
                    case 7:
                        System.out.print("Enter book ID to delete: ");
                        int bookIdToDelete = scanner.nextInt();
                        book.deleteBook(bookIdToDelete);
                        System.out.println("Book deleted successfully!");
                        break;
                    
                    case 8:
                        System.out.println("List of Books:");
                        for (String b : book.getAllBooks()) {
                            System.out.println(b);
                        }
                        break;
                    
                    case 9:
                        System.out.println("Exiting... \nThanks for visiting!");
                        break;
                    
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 9);

            connector.closeConnection();
        }
    }
}
