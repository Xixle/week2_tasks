package com.company;

public abstract class User {
    private int userId;
    private String password;
    private String email;
    private String loginStatus;

    public User (int userId, String password, String email, String loginStatus){
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.loginStatus = loginStatus;
    }

    public int getUserId(){
        return userId;
    }
    public void setUserId(int userId){
        this.userId = userId;
    }
    public String getPassword(){
        return password;
    }

    public void setPassword (String password){
        this.password = password;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail (String email){
        this.email = email;
    }
    public String getLoginStatus(){
        return loginStatus;
    }

    public void setLoginStatus (String loginStatus){
        this.loginStatus = loginStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userId +
                ", loginStatus='" + loginStatus + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password +
                '}';
    }

}
