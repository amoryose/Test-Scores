// Avraham Moryose
// CS 207_3
// Assignment 5

package testscores;

import java.util.Scanner;

public class TestScores
{
   public static void main(String [] args)
   {
      int [][] scores = new int [3][4];
            
      System.out.println("Before average: ");
         
      loadArray(scores);
      displayArray(scores);
             
      calcAverage(scores);
      System.out.println("\nAfter average: ");
      displayArray(scores);   
   }
   
   public static void loadArray(int [][] a)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your score: ");
       
       for(int row = 0; row < a.length; row++)
       {
           for(int col = 0; col < a[row].length - 1; col++)
           {
               a[row][col] = input.nextInt();
           }
           System.out.println();
       }
   }
   
   public static void calcAverage(int [][] a)
   {
     int row = 0;
     int col = 0;
     int sum = 0;
     int avg = 0;
     
     for(row = 0 ; row <a.length; row++) // how many students.  how many row
     {
         for(col = 0; col <a[row].length - 1; col++)
         {
             sum = sum + a[row][col]; 
         }
         avg = sum / (a[row].length - 1);  // how many elements on a row.  how many test scores
         a[row][col] = avg;
         sum = 0;  // resets sum to 0 for the next row
     }
   }
   
   public static void displayArray(int [][] a)
   {
     int row = 0;
     int col = 0;
     
     for(row = 0 ; row < a.length; row++)
     {
         for(col = 0; col < a[row].length; col++)
         {
             System.out.print(a[row][col] + "\t");
         }
         System.out.println();
     }
   }     
}