package org.cap.apps.jdbcdemo.entities;

public class Employee {
    private Integer id;
    private String name;
    private Double balance;
    private Integer did;

    public Employee(){

    }

    public Employee(Integer id, String name, Double balance, Integer did){
        this.id=id;
        this.name=name;
        this.balance=balance;
        this.did=did;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}
