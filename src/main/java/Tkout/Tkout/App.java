package Tkout.Tkout;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A"); 
        StringBuffer b = new StringBuffer("B"); 
        operator(a, b); 
        System.out.println(a + "," + b); 
    } 
    public static void operator(StringBuffer x, StringBuffer y) { 
        x.append(y); y = x; 
    }
}


