/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodreference;

/**
 *
 * @author P0502878
 */
interface Parser {

    String parse(String str);
}

class StringParser {

    public static String convert(String s) {
        if (s.length() >= 3) {
            s = s.toUpperCase();
        } else {
            s = s.toLowerCase();
        }
        return s;
    }
    public static String convert2(String s) {
        if (s.length() >= 3) {
            s = s.toUpperCase();
        } else {
            s = s.toLowerCase();
        }
        return s;
    }
}

class MyPrinter {

    public void print(String str, Parser p) {

        str = p.parse(str);
        System.out.println(str);
    }
}

public class MethodReferenceTest {

    public static void main(String arg[]) {

        String str = "Dumindas Hettiarchchi";

        MyPrinter mp = new MyPrinter();

        mp.print(str, new Parser() {

            public String parse(String s) {
                return StringParser.convert(s);
            }
        });

        mp.print(str,  s -> {
            return StringParser.convert(s);
        });
        
        mp.print(str, StringParser::convert);
    }

}
