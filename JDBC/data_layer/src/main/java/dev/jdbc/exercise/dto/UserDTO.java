package dev.jdbc.exercise.dto;

public class UserDTO {

    private int id_user;

    private String user;

    private String password;

    public UserDTO() {
    }

    public UserDTO(int id_user) {
        this.id_user = id_user;
    }

    public UserDTO(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public UserDTO(int id_user, String user, String password) {
        this.id_user = id_user;
        this.user = user;
        this.password = password;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id_user=" + id_user +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
