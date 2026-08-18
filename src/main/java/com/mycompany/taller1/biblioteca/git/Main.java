package com.mycompany.taller1.biblioteca.git;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Client> clients = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
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

    public static void deleteClient() {
        System.out.print("Enter client ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == id) {

                System.out.print("Are you sure you want to delete this client? (yes/no): ");
                String confirmation = sc.nextLine();

                if (confirmation.equalsIgnoreCase("yes")) {
                    clients.remove(i);
                    System.out.println("Client deleted successfully.");
                } else {
                    System.out.println("Deletion cancelled.");
                }

                return;
            }
        }

        System.out.println("Client not found.");
    }

    public static void createBook() {
        System.out.print("Enter book code: ");
        String code = sc.nextLine();

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter publication year: ");
        String publicationYear = sc.nextLine();

        System.out.print("Enter book author: ");
        String author = sc.nextLine();

        System.out.print("Is the book available? (true/false): ");
        boolean available = sc.nextBoolean();
        sc.nextLine();

        Book book = new Book(code, title, publicationYear, author, available);

        books.add(book);

        System.out.println("Book created successfully.");
    }

    public static void listBooks() {
        for (Book book : books) {
            System.out.println("Code: " + book.getCode());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Publication Year: " + book.getPublicationYear());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Available: " + book.isAvailable());
            System.out.println("--------------------");
        }
    }

    public static void searchBook() {
        System.out.print("Enter book code: ");
        String code = sc.nextLine();

        for (Book book : books) {
            if (book.getCode().equalsIgnoreCase(code)) {
                System.out.println("Code: " + book.getCode());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Publication Year: " + book.getPublicationYear());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Available: " + book.isAvailable());
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public static void updateBook() {
        System.out.print("Enter book code: ");
        String code = sc.nextLine();

        for (Book book : books) {
            if (book.getCode().equalsIgnoreCase(code)) {

                System.out.print("Enter new title: ");
                book.setTitle(sc.nextLine());

                System.out.print("Enter new publication year: ");
                book.setPublicationYear(sc.nextLine());

                System.out.print("Enter new author: ");
                book.setAuthor(sc.nextLine());

                System.out.print("Is the book available? (true/false): ");
                boolean available = sc.nextBoolean();
                sc.nextLine();
                book.setAvailable(available);

                System.out.println("Book updated successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public static void deleteBook() {
        System.out.print("Enter book code: ");
        String code = sc.nextLine();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getCode().equalsIgnoreCase(code)) {

                System.out.print("Are you sure you want to delete this book? (yes/no): ");
                String confirmation = sc.nextLine();

                if (confirmation.equalsIgnoreCase("yes")) {
                    books.remove(i);
                    System.out.println("Book deleted successfully.");
                } else {
                    System.out.println("Deletion cancelled.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }
}
