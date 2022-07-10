package com.example.prac;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileUtil implements FileUtil {

    @Override
    public int createFile(String filePath, String defContent) {
        File file = new File("./some.txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("hello km");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
