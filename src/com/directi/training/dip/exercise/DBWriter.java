package com.directi.training.dip.exercise;

import java.io.IOException;

public class DBWriter implements IWriter{
    @Override
    public void write(String encodedLine) throws IOException {
        MyDatabase database = new MyDatabase();
        database.write(encodedLine);
    }
}
