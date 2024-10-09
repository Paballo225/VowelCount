/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcounter;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class VowelCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        
        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels:" + vowelCount);
        
        sc.close();
    }
}