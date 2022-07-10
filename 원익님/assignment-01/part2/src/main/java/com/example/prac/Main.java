package com.example.prac;

public class Main {
    public static void main(String[] args) {
        FileUtil fileUtil = new SimpleFileUtil();

        String filePath = "somePath";
        String defContent = "some DefContent";

        int result = fileUtil.createFile(filePath, defContent);
    }
}
