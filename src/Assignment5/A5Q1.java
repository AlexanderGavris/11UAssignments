/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author gavra1029
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // i did this to stop nthe program 
        //tWord mean translated word
        while (true) {
            //ask for a word
            System.out.println("Enter a word to translate");
            String tWord = input.nextLine();
            boolean foundVowel = false;

            if (tWord.equals("EXIT")) {
                break;
            }
            // convert to lowercase
            tWord = tWord.toLowerCase();
          
            String translated = "";
            for (int i = 0; i < tWord.length(); i++) {
                // look for a vowel at spot i
                if ((tWord.charAt(i) == 'a' || tWord.charAt(i) == 'e' || tWord.charAt(i) == 'i'
                        || tWord.charAt(i) == 'o' || tWord.charAt(i) == 'u') && foundVowel == false) {
                    
                    // assemble translation
                    translated = translated + "ub" + tWord.charAt(i);
                    foundVowel = true;

                } else {
                    // this ment for double vowels

                    if ((tWord.charAt(i) == 'a' || tWord.charAt(i) == 'e' || tWord.charAt(i) == 'i'
                            || tWord.charAt(i) == 'o' || tWord.charAt(i) == 'u') && foundVowel == true) {
                        translated = translated + tWord.charAt(i);

                    } else {
                        translated = translated + tWord.charAt(i);
                        foundVowel = false;
                    }
                }
            }

            System.out.println(tWord + " in Ubbi Dubbi is " + translated);
        }
    }
}
