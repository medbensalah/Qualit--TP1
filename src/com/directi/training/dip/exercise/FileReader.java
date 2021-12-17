package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.util.Base64;

public class FileReader implements IReader{

    @Override
    public String read() throws IOException {
        StringBuilder text = new StringBuilder();
        BufferedReader reader = new BufferedReader(
                new java.io.FileReader("src/com/directi/training/dip/exercise/beforeEncryption.txt")
        );
        String aLine;
        while ((aLine = reader.readLine()) != null) {
            text.append(new StringBuilder(aLine + '\n'));
        }
        reader.close();
        return text.toString();
    }
}
