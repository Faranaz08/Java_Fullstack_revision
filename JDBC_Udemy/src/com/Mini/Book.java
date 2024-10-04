package com.Mini;

import java.sql.*;
import java.util.*;

public class Book {
	private Connection connection;

	public Book (Connection connection) {
		this. connection= connection;
	}
		// Create operation for books
	public void addBook(String title, int authorId) {
		
		try {
			String sql = "INSERT INTO books (title, author_id) VALUES (?, ?) ";
			PreparedStatement statement = connection. prepareStatement (sql) ;
			statement. setString (1, title) ;

			statement.setInt(2, authorId) ;
			statement . executeUpdate () ;
			statement . close () ;
			}catch(SQLException e){
		e.printStackTrace();
			}}
		//Update operation for books

public void updateBook(int id, String newTitle, int newAuthorId) {
	try {
		String sql = "UPDATE books SET title = ? , author_id = ? WHERE id = ? ";
		PreparedStatement statement = connection. prepareStatement (sql) ;
		statement . setString (1, newTitle) ;
		statement . setInt (2, newAuthorId) ;
		statement. setInt (3, id) ;
		statement . executeUpdate () ;
		statement . close();
	}catch(

				SQLException e)
				{
					e.printStackTrace();
			}
}

		//Delete operation for books
		public void deleteBook(int id) {
			try {
				String sql = "DELETE FROM books WHERE id = ? ";
				PreparedStatement statement = connection.prepareStatement(sql);
				statement.setInt(1, id);
				statement.executeUpdate();
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// Read operation for books
		public List<String> getAllBooks() {
			List<String> books = new ArrayList<>();
			try {
				String sql = "SELECT * FROM books";
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);
				while (resultSet.next()) {
					int id = resultSet.getInt("id");
					String title = resultSet.getString("title");
					int authorId = resultSet.getInt("author_id");
					books.add("Book ID: " + id + ", Title: " + title + ", Author ID:" + authorId);
				}
				resultSet.close();
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return books;

		}
	}