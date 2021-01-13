package org.example;

public class Main {
    public static void main(String[] args) {
        StringUtilities utils = new StringUtilities();
        StringBuilder s = new StringBuilder();
        while(s.length() < 10) {
            utils.addChar(s, 'a');
        }
        System.out.println(s);
        String str = s.toString();
        String result = utils.upperAndPrefix(utils.addSuffix(str));
    }

}
