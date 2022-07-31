package com.bank;

public class pattern2 {  
    static void pyramid(int n)
       {
           int i, j, num, gap;


           for (i = n; i >= 1; i--) {

               for (gap = n - 1; gap >= i; gap--) {
                   System.out.print(" ");
                   System.out.print(" ");
               }

               num = 'A';

               // loop to print characters on
               // left side of pyramid
               for (j = 1; j <= i; j++) {
                   System.out.print((char)num++ + " ");
               }

               // loop to print characters on
               // right side of pyramid
               for (j = i - 1; j >= 0; j--) {
                   System.out.print((char)--num + " ");
               }

               System.out.println("");
           }
       }

       /* Driver program to test above function */
       public static void main(String[] args)
       {
           int n = 4;
           pyramid(n);

       }
}
   