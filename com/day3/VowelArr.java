package com.day3;

import java.util.Scanner;
public class VowelArr {
	String sentence;
    void acceptData(){
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Enter any string: ");
           sentence = sc.nextLine();

           sc.close();
    }

    void displayData(){
        int [] ch = new int[5];

           for(int i=0; i<sentence.length(); i++){
            switch(sentence.toLowerCase().charAt(i)){
                case 'a':
                    ch[0]++;
                    break;
                case 'e':
                    ch[1]++;
                    break;
                case 'i':
                    ch[2]++;
                    break;
                case 'o':
                    ch[3]++;
                    break;
                case 'u':
                    ch[4]++;
                    break;
            }


           }

           System.out.println("Total a's: " + ch[0]);
           System.out.println("Total e's: " + ch[1]);
           System.out.println("Total i's: " + ch[2]);
           System.out.println("Total o's: " + ch[3]);
           System.out.println("Total u's: " + ch[4]);
           System.out.println("Total vowels in the sentence is: " + (ch[0] + ch[1] + ch[2] + ch[3] + ch[4]));
    }
    public static void main(String[] args) {
        VowelArr obj = new VowelArr();

        obj.acceptData();
        obj.displayData();
    }

}
