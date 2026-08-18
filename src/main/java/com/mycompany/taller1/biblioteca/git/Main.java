package com.mycompany.taller1.biblioteca.git;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Client> clients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Aquí irá el menú
    }

    public static void createClient() {
        System.out.print("Enter client ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter client name: ");
        String name = sc.nextLine();

        System.out.print("Enter client phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter client email: ");
        String email = sc.nextLine();

        Client client = new Client(id, name, phone, email);

        clients.add(client);

        System.out.println("Client created successfully.");
    }
    public static void listClients() {
    for (Client client : clients) {
        System.out.println("ID: " + client.getId());
        System.out.println("Name: " + client.getName());
        System.out.println("Phone: " + client.getPhone());
        System.out.println("Email: " + client.getEmail());
        System.out.println("--------------------");
    }   
}
    public static void searchClient() {
    System.out.print("Enter client ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    for (Client client : clients) {
        if (client.getId() == id) {
            System.out.println("ID: " + client.getId());
            System.out.println("Name: " + client.getName());
            System.out.println("Phone: " + client.getPhone());
            System.out.println("Email: " + client.getEmail());
            return;
        }
    }

    System.out.println("Client not found.");
}
    public static void updateClient() {
    System.out.print("Enter client ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    for (Client client : clients) {
        if (client.getId() == id) {

            System.out.print("Enter new name: ");
            client.setName(sc.nextLine());

            System.out.print("Enter new phone: ");
            client.setPhone(sc.nextLine());

            System.out.print("Enter new email: ");
            client.setEmail(sc.nextLine());

            System.out.println("Client updated successfully.");
            return;
        }
    }

    System.out.println("Client not found.");
}
}
