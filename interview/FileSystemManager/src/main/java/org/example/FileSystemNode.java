package org.example;

import java.util.HashMap;

public abstract class FileSystemNode{
    String name;
    HashMap<String, FileSystemNode> files;

    public FileSystemNode(String name) {
        this.name = name;
        this.files = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension(){
        String[] words = name.split("\\.");
        if (words.length > 0) {
            return words[words.length - 1];
        }
        return name;
    }

    public void add(String name, FileSystemNode fileSystemNode) {
        this.files.put(name, fileSystemNode);
    }

    public void update() {

    }

    public void getChildren() {

    }

}
