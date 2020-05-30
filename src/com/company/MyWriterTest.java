package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MyWriterTest {
    MyWriterTest() throws IOException {
        String path = "C:\\Users\\Kotes\\Desktop\\java_labs_kotes\\lab6\\text.txt";
        CeasarCipher ceasarCipher = new CeasarCipher(2);
        MyWriter myWriter = new MyWriter(new FileWriter(path), ceasarCipher);

        String toEncrypt = "String to encrypt";
        String expected = "[C@b1bc7ed";
        char[] chars = new char[17];

        myWriter.write(toEncrypt.toCharArray());

        FileReader fr = new FileReader(path);
        fr.read(chars);

        assertEquals(expected, chars.toString());
    }
}