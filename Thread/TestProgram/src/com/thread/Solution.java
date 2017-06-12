package com.thread;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   
  private static final char keys[][]={
      {'0','0','0'},
      {'1','1','1'},
      {'A','B','C'},
      {'D','E','F'},
      {'G','H','I'},
      {'J','K','L'},
      {'M','N','O'},
      {'P','R','S'},
      {'T','U','V'},
      {'W','X','Y'}
  };
      
  
  private static final char getCharKey(int telephoneKey,int place){
    if(place <1 || place >3) throw new IllegalArgumentException("Argument 'place' is between 1-3 (both inclusive)");
    if(telephoneKey <0 || telephoneKey >9) throw new IllegalArgumentException("Argument 'telephoneKey' is between 0-9 (both inclusive)");
   	
    return keys[telephoneKey][place-1]; 
  }
  
  /*
   * Complete the function below.
   */

      static TreeSet<String> generatePermutations(int[] telephoneNumber) {
  		TreeSet<String> allPermutations= new TreeSet<String>(); // I want unique sorted permutations
//  		TreeSet allPermutations= new TreeSet(); // I want unique sorted permutations
  		
  		
  		System.out.println(allPermutations);
        
        // your code goes here 
        
        
        	return allPermutations;
      }

      public static void main(String[] args) throws IOException{
          Scanner in = new Scanner(System.in);
//          final String fileName = System.getenv("OUTPUT_PATH");
          final String fileName = System.getenv("N://PTC//input001.txt");
          BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
          
          int _telephoneNumber_size = Integer.parseInt(in.nextLine());
          int[] _telephoneNumber = new int[_telephoneNumber_size];
          int _telephoneNumber_item;
          for(int _telephoneNumber_i = 0; _telephoneNumber_i < _telephoneNumber_size; _telephoneNumber_i++) {
              _telephoneNumber_item = Integer.parseInt(in.nextLine());
              _telephoneNumber[_telephoneNumber_i] = _telephoneNumber_item;
          }
          
          TreeSet<String> res = generatePermutations(_telephoneNumber);
          for(String permutation:res) {
              bw.write(permutation);
              bw.newLine();
          }
          
          bw.close();
      }
}