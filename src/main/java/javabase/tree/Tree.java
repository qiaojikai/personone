package javabase.tree;

import java.io.File;

public class Tree {

    public static void main(String[] args) {
        // 打印当前目录
        if (args == null || args.length == 0) {
            displayFiles(new File("."), 0);
        } else {
            displayFiles(new File(args[0]), 0);
        }
        System.out.println("helloWorld");
    }

    private static void displayFiles(File directory, int depth) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                for (int i = 0; i < depth - 1; ++i) {
                    System.out.print("|   ");
                }
                if (depth != 0) {
                    System.out.print("|-- ");
                }
                System.out.println(file.getName());

                if (file.isDirectory()) {
                    displayFiles(file, depth + 1);
                }
            }
        }
    }
}
