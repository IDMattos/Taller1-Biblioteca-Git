package com.mycompany.taller1.biblioteca.git;

public class Client extends Person {

    private String email;

    public Client(int id, String name, String phone, String email) {
        super(id, name, phone);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
