package com.bridgelabz.string.level1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateFriomString {


    public String removeDuplicatesFromString(String input){ // method to remove duplicates from a given string using linkedhashset
        StringBuilder result= new StringBuilder();
        LinkedHashSet<Character> seen=new LinkedHashSet<Character>();
        
        for(char ch:input.toCharArray()){
            if(seen.add(ch)){
                result.append(ch); // only add unique characters to the result stringbuilder
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        RemoveDuplicateFriomString duplicateRemover =new RemoveDuplicateFriomString(); // creating object of the class
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter any string : "); // taking user input
        String userInput=scanner.nextLine();
        System.out.println("Original String : "+userInput); // printing original string
        System.out.println("After removing duplicates : "+duplicateRemover.removeDuplicatesFromString(userInput)); // calling method and passing argument

    }
}
