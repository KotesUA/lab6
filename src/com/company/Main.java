package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        CeasarCipher cc = new CeasarCipher(2);
        String path = "C:\\Users\\Kotes\\Desktop\\java_labs_kotes\\lab6\\text.txt";
        String toEncrypt = "String to encrypt";
        MyReader myReader = new MyReader(new FileReader(path), cc);
        MyWriter myWriter = new MyWriter(new FileWriter(path), cc);

        myWriter.write(toEncrypt.toCharArray());
        myWriter.flush();

        FileReader fr = new FileReader(path);
        char[] chars = new char[10];
        fr.read(chars);
        System.out.println(chars);

        myReader.read(chars);
        System.out.println(chars);

        myReader.read(toEncrypt.toCharArray());
    }
}
