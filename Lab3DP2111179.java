/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author Atheer
 */
package lab3.dp.pkg2111179;

import java.util.Scanner;

interface DocumentTemplate extends Cloneable {

    DocumentTemplate makeCopy();

    void generateDocument();
}

class Article implements DocumentTemplate {
    private String documentId;
    private String content;
    private String style;

    public Article() {
        documentId = this.documentId;
        content = this.content;
        style = this.style;
    }
    @Override
    public DocumentTemplate makeCopy() {
        System.out.println("Writing an Article....");
        Article article = null;
        try {
            article = (Article) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return article;
    }
    @Override
    public void generateDocument() {
        System.out.println("Generating the article document...");
    }
}

class Report implements DocumentTemplate {
    
    private String documentId;
    private String content;
    private String style;

    public Report() {
        documentId = this.documentId;
        content = this.content;
        style = this.style;
    }
    @Override
    public DocumentTemplate makeCopy() {
        System.out.println("Writing a report....");
        Report report = null;
        try {
            report = (Report) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
       return report;
    }
    @Override
    public void generateDocument() {

        System.out.println("Generating the report ...");
    }
}

class Brochure implements DocumentTemplate {

    private String documentId;
    private String content;
    private String style;
    public Brochure() {
        documentId = this.documentId;
        content = this.content;
        style = this.style;
    }
    @Override
    public DocumentTemplate makeCopy() {
        System.out.println("Writing a brochure....");
        Brochure brochure = null;
        try {
            brochure = (Brochure) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return brochure;
    }
    @Override
    public void generateDocument() {

        System.out.println("Generating the brochure ...");
    }
}

class Main {
    public static void main(String[] args) {

        System.out.println("Choose the type of document to create:");
        System.out.println("1. Article");
        System.out.println("2. Report");
        System.out.println("3. Brochure");
        System.out.print("Enter your choice (1 or 2 or 3): ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        DocumentTemplate documentTemplate = null;

        if (choice == 1) {
            documentTemplate = new Article();
            System.out.println("Enter document ID, content, and style: ");
            String documentId = scanner.nextLine();
            String content = scanner.nextLine();
            String style = scanner.nextLine();

            documentTemplate.generateDocument();
            scanner.close();
        } else if (choice == 2) {
            documentTemplate = new Report();
            System.out.println("Enter document ID, content, and style: ");
            String documentId = scanner.nextLine();
            String content = scanner.nextLine();
            String style = scanner.nextLine();
            documentTemplate.generateDocument();

        } else if (choice == 3) {
            documentTemplate = new Brochure();
            System.out.println("Enter document ID, content, and style: ");
            String documentId = scanner.nextLine();
            String content = scanner.nextLine();
            String style = scanner.nextLine();
            documentTemplate.generateDocument();
        } else {
            System.out.println("Invalid choice. Exiting program.");
            System.exit(0);
        }

    }
}
