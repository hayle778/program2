/*
prompt the user
.create 2 arrays with 6 numbers each
. random print out 2 elements from each array
. store it in a third day
. print out third array

*/

import java.util.Scanner;

import static java.lang.System.*;

public class Arrayprog2 {
public static void main(String[]args) {
    Scanner input = new Scanner( System.in );
    int[] intarray = new int[6];
    int[] intarray2 = new int[6];
    int[]  intarray3 = new int[4];
    System.out.println( "print out the number" + null );
    System.out.println( "print out the number" + null );
    int ran = 0;

    for (int i = 0; i < 6; i++) {
        System.out.println( "Random element for array1:"  );
        intarray[i] = input.nextInt();
        ran += intarray[i];
        input.nextInt();


    }


    for (int i = 0; i < 6; i++) {
        System.out.println( "Random element for array2:"  );
        intarray2[i] = input.nextInt();
        ran += intarray2[i];
        input.nextInt();


    }

  for (int i = 0; i< 4; i++) {
System.out.println( "thirdarray"  );
intarray3[i] = input.nextInt();
  ran += intarray3[i];
  input.nextInt();

  }
}}





















