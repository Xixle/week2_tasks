package com.company;

public class Admin extends User {
    private String adminName;

    public Admin(int userId, String password, String email, String loginStatus, String adminName){
        super(userId, password, email, loginStatus);
        this.adminName = adminName;
    }

    public String getAdminName(){
        return adminName;
    }
    public void setAdminName(String adminName){
        this.adminName = adminName;
    }

    @Override
    public String toString(){
        return "Admin{" +
                "adminName'"+ adminName + '\'' +
                '}';
    }

}
