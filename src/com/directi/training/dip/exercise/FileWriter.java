package com.directi.training.dip.exercise;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter implements IWriter{
    @Override
    public void write(String encodedLine) throws IOException {
        BufferedWriter writer= new BufferedWriter(
                new java.io.FileWriter("src/com/directi/training/dip/exercise/afterEncryption.txt")
        );
        writer.append(encodedLine);
        writer.close();
    }
}
