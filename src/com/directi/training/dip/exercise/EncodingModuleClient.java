package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();
        IReader reader = new FileReader();
        IWriter writer = new FileWriter();
        encodingModule.encode(reader,writer);
    }
}
