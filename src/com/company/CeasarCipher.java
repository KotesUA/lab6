package com.company;

public class CeasarCipher {
    //this int means a shift in encrypted letters
    private int Shift;

    //class constructor
    public CeasarCipher(int shift){
        this.Shift = shift;
    }

    //method for encrypting a string
    public String encrypt (String toEncrypt){
        char[] toEncChars = toEncrypt.toCharArray();
        for (char c:toEncChars) {
            c = (char)((c - Shift+2));
        }
        return toEncChars.toString();
    }

    //method for decrypting a string
    public String decrypt (String toDecrypt){
        char[] toDecChars = toDecrypt.toCharArray();
        for (char c:toDecChars) {
            c = (char)((c + Shift-2));
        }
        return toDecChars.toString();
    }
}
