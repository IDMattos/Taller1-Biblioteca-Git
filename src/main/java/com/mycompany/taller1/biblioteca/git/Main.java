package com.mycompany.taller1.biblioteca.git;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Client> clients = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Loan> loans = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int option;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Client management");
            System.out.println("2. Book management");
            System.out.println("3. Loan management");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    clientMenu();
                    break;

                case 2:
                    System.out.println("Book management selected.");
                    break;

                case 3:
                    System.out.println("Loan management selected.");
                    break;

                case 0:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 0);
    }

    public static void clientMenu() {

        int option;

        do {
            System.out.println("\n===== CLIENT MANAGEMENT =====");
            System.out.println("1. Create client");
            System.out.println("2. List clients");
            System.out.println("3. Search client");
            System.out.println("4. Update client");
            System.out.println("5. Delete client");
            System.out.println("0. Back");
            System.out.print("Select an option: ");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    createClient();
                    break;
                case 2:
                    listClients();
                    break;
                case 3:
                    searchClient();
                    break;
                case 4:
                    updateClient();
                    break;
                case 5:
                    deleteClient();
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 0);
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

    public static void createLoan() {
        System.out.print("Enter loan ID: ");
        String id = sc.nextLine();

        System.out.print("Enter client ID: ");
        int clientId = sc.nextInt();
        sc.nextLine();

        Client selectedClient = null;

        for (Client client : clients) {
            if (client.getId() == clientId) {
                selectedClient = client;
                break;
            }
        }

        if (selectedClient == null) {
            System.out.println("Client not found.");
            return;
        }

        System.out.print("Enter book code: ");
        String bookCode = sc.nextLine();

        Book selectedBook = null;

        for (Book book : books) {
            if (book.getCode().equalsIgnoreCase(bookCode)) {
                selectedBook = book;
                break;
            }
        }

        if (selectedBook == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!selectedBook.isAvailable()) {
            System.out.println("Book is not available.");
            return;
        }

        Loan loan = new Loan(
                id,
                selectedClient,
                selectedBook,
                java.time.LocalDate.now(),
                "ACTIVE"
        );

        loans.add(loan);

        selectedBook.setAvailable(false);

        System.out.println("Loan registered successfully.");
    }

    public static void returnLoan() {
        System.out.print("Enter loan ID: ");
        String id = sc.nextLine();

        for (Loan loan : loans) {
            if (loan.getId().equalsIgnoreCase(id)) {

                if (loan.getStatus().equalsIgnoreCase("RETURNED")) {
                    System.out.println("Loan has already been returned.");
                    return;
                }

                loan.setStatus("RETURNED");
                loan.getBook().setAvailable(true);

                System.out.println("Loan returned successfully.");
                return;
            }
        }

        System.out.println("Loan not found.");
    }

    public static void listLoans() {
        if (loans.isEmpty()) {
            System.out.println("No loans registered.");
            return;
        }

        for (Loan loan : loans) {
            System.out.println("Loan ID: " + loan.getId());
            System.out.println("Client: " + loan.getClient().getName());
            System.out.println("Book: " + loan.getBook().getTitle());
            System.out.println("Date: " + loan.getDate());
            System.out.println("Status: " + loan.getStatus());
            System.out.println("--------------------");
        }
    }
}
