package com.company;

public class Customer extends User {
    private String customerName;
    private String address;
    private double  accountBalance;
    private int phone;

    public Customer(int userId, String password, String email, String loginStatus, String customerName,
                    String address, double accountBalance, int phone){
        super(userId, password, email, loginStatus);
        this.customerName = customerName;
        this.address = address;
        this.accountBalance = accountBalance;
        this.phone = phone;
    }

    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }
    public int getPhone(){
        return phone;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
