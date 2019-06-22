package pl.coderslab.a_Dzien_4.c_JDBC;

import pl.coderslab.a_Dzien_4.b_MVC.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDao {

    private static final String USER = "root";
    private static final String PASSWORD = "password";
    private static final String DB_NAME = "demo_db";
    private static final String DB_HOST = "jdbc:mysql://localhost:3306/";
    private static final String DB_OPTIONS = "?useSSL=false&characterEncoding=utf8&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    private static final String CREATE_BOOK_QUERY = "insert into books(title, author, isbn) values (?,?,?)";
    private static final String DELETE_BOOK_QUERY = "DELETE FROM books WHERE id = ?";
    private static final String FIND_ALL_BOOKS_QUERY = "SELECT * FROM books";
    private static final String FIND_ALL_BOOKS_BY_TITLE = "select * from books where title like ?";

    public Book create(Book book) {
        try (Connection conn = getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(CREATE_BOOK_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthor());
            statement.setInt(3, book.getIsbn());
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                book.setId(resultSet.getInt(1));
            }
            return book;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void delete(int bookId) {
        try (Connection conn = getConnection()) {
            PreparedStatement statement = conn.prepareStatement(DELETE_BOOK_QUERY);
            statement.setInt(1, bookId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Book> findAll() {
        try (Connection conn = getConnection()) {
            PreparedStatement statement = conn.prepareStatement(FIND_ALL_BOOKS_QUERY);
            ResultSet resultSet = statement.executeQuery();
            return mapResultSetToBookList(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Book> findAllWithTitle(String searchTitle) {
        searchTitle = "%"+searchTitle+"%";
        try (Connection conn = getConnection()) {
            PreparedStatement statement = conn.prepareStatement(FIND_ALL_BOOKS_BY_TITLE);
            statement.setString(1,searchTitle);
            ResultSet resultSet = statement.executeQuery();
            return mapResultSetToBookList(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private Book mapResultSetToBook(ResultSet resultSet) throws SQLException {
        Book book = new Book();
        book.setId(resultSet.getInt("id"));
        book.setTitle(resultSet.getString("title"));
        book.setAuthor(resultSet.getString("author"));
        book.setIsbn(resultSet.getInt("isbn"));
        return book;
    }

    private List<Book> mapResultSetToBookList(ResultSet resultSet) throws SQLException {
        List<Book> bookList = new ArrayList<>();
        while (resultSet.next()) {
            bookList.add(mapResultSetToBook(resultSet));
        }
        return bookList;
    }

/*

    private static final String CREATE_USER_QUERY = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
    private static final String READ_USER_QUERY = "SELECT * FROM users where id = ?";
    private static final String UPDATE_USER_QUERY = "UPDATE users SET username = ?, email = ?, password = ? where id = ?";
    private static final String DELETE_USER_QUERY = "DELETE FROM users WHERE id = ?";
    private static final String FIND_ALL_USERS_QUERY = "SELECT * FROM users";
    private static final String FIND_ALL_USERS_WITH_EMPTY_GROUP_QUERY = "SELECT * FROM users WHERE group_id IS NULL";
    private static final String FIND_ALL_USERS_IN_GROUP_QUERY = "SELECT * FROM users WHERE group_id=?";
    private static final String ASSIGN_USER_GROUP_QUERY = "UPDATE users SET group_id=? WHERE id=?";
    private static final String RESIGN_USER_GROUP_QUERY = "UPDATE users SET group_id=NULL WHERE id=?";
    private static final String FIND_USER_BY_EMAIL_QUERY = "select * from users where email=?";

    public User create(User user) {
        try (Connection conn = dbUtils.getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(CREATE_USER_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                user.setId(resultSet.getInt(1));
            }
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


 */

    private Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        return DriverManager.getConnection(
                DB_HOST + DB_NAME + DB_OPTIONS,
                USER, PASSWORD);
    }


}
