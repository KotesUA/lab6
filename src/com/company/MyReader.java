package com.company;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class MyReader extends FilterReader {
    private  CeasarCipher ceasarCipher;

    protected MyReader(Reader in, CeasarCipher cc) {
        super(in);
        this.ceasarCipher = cc;
    }

    @Override
    public int read(char[] out) throws IOException {
        int temp = super.read(out);
        out = ceasarCipher.decrypt(out.toString()).toCharArray();
        return temp;
    }
}
