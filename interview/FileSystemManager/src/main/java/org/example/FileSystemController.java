package org.example;


import java.util.Arrays;
import java.util.List;

public class FileSystemController {
    public FolderNode root;

    public FileSystemController() {
        root = new FolderNode("/");
    }

    public FolderNode getRoot() {
        return root;
    }

    public void addFile(String fileName, String path) {
        FileSystemNode curr = dfs(path);
        FileNode file = new FileNode(fileName);
        curr.add(fileName, file);
        System.out.println("Added file : " + fileName);

    }

    public void addFolder(String folderName, String path) {
        FileSystemNode curr = dfs(path);
        FolderNode file = new FolderNode(folderName);
        curr.add(folderName, file);
        System.out.println("Added folder : " + folderName);

    }

    private FileSystemNode dfs(String path) {
        System.out.println("Given path :" + path);
        List<String> words = Arrays.stream(path.split("/")).toList();
        System.out.println("Path :" + words);

        FileSystemNode curr = root;
        for (String word: words) {
            if (word.isBlank()) {
                continue;
            }
            if (curr.files.containsKey(word)) {
                curr = curr.files.get(word);
            } else {
                throw new IllegalArgumentException("Invalid file path given");
            }
        }
        return curr;
    }


    public void printDirectory(FileSystemNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.name);
        for (String fileName: node.files.keySet()) {
            System.out.print("/");
            this.printDirectory(node.files.get(fileName));
        }
        System.out.println();
    }
}
