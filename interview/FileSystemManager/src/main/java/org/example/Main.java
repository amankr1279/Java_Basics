package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("File System Manager");

        FileSystemController controller = new FileSystemController();
        controller.printDirectory(controller.getRoot());

        controller.addFile("temp.txt", "/");
        controller.printDirectory(controller.getRoot());

        controller.addFolder("home", "/");
        controller.printDirectory(controller.getRoot());

        controller.addFolder("/aman", "/home/");
        controller.printDirectory(controller.getRoot());
    }
}