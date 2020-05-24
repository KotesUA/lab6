package com.company;

import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MyReaderTest {
    MyReaderTest() throws IOException {
        String path = "C:\\Users\\Kotes\\Desktop\\java_labs_kotes\\lab6\\text.txt";
        CeasarCipher ceasarCipher = new CeasarCipher(2);
        MyReader myReader = new MyReader(new FileReader(path), ceasarCipher);

        String expected = "String to encrypt";
        char[] chars = new char[17];

        myReader.read(chars);

        assertEquals(expected, chars.toString());
    }
}