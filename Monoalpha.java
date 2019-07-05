/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monoalpha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Monoalpha {

    /**
     * Monoalpha cipher
     */
    public static void main(String[] args) {
       char orig[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i','j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v','w', 'x', 'y', 'z' };
       char repl[] = {'B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A'};
       String s;
       Scanner sc = new Scanner(System.in);
       s = sc.next();
       System.out.println("Encryption");
       char c[] = new char[s.length()];
       for(int i=0;i<s.length();i++){
       for(int j=0;j<26;j++){
       if(orig[j] == s.charAt(i))
           c[i] = repl[j];
       }}
       String a = new String(c);
       System.out.println(a);
       System.out.println("Decryption");
       char p[] = new char[a.length()];
       for(int i=0;i<a.length();i++){
       for(int j=0;j<26;j++){
       if(repl[j] == a.charAt(i))
       {p[i] = orig[j];}
       }}
       System.out.println(new String(p));
    }
    
}
