package org.example.repository.query;

public interface UserQuery {

    public final String INSERT_USER = "INSERT INTO users (username, password, secQ, secA, words, conversations) VALUES (?, ?, ?, ?, ?, ?)";

    public final String UPDATE_USER = "";

    public final String DELETE_USER_BY_USERNAME = "DELETE FROM users WHERE username = ?";

    public final String GET_USER_BY_USERNAME = "SELECT * FROM users WHERE username = ?";

    public final String AUTHENTICATE_USER = "SELECT * FROM users WHERE username = ? AND password = ?";

    public final String UPDATE_USER_CONVERSATION_WORDS = "UPDATE users SET words = ?, conversations = ? WHERE username = ? ";

}