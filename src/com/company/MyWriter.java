package com.company;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class MyWriter extends FilterWriter {
    private  CeasarCipher ceasarCipher;

    protected MyWriter(Writer out, CeasarCipher cc) {
        super(out);
        this.ceasarCipher = cc;
    }

    @Override
    public void write(char[] input) throws IOException {
        input = ceasarCipher.encrypt(input.toString()).toCharArray();
        super.write(input);
    }
}