package edu.itstep.run;

public class Itertools {
   public static <T> void permutations(int n, T[] elem){
       if(n == 1)printPermutations(elem);
       else{
           for(int i = 0; i < n -1; i++){
               permutations(n-1, elem);
               if(n % 2 == 0)swap(elem, i , n-1);
               else swap(elem, 0, n-1);
           }
           permutations(n-1, elem);
       }
   }


    private static <T> void swap(T[] input, int a, int b){
        T temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }

    private static <E> void printPermutations(E[] input){
        //for-each
        for(E element : input){
          //  System.out.printf("%S ", element);
        }
      //  System.out.println();
    }
    public static int factoriel(int number){
        if(number == 1) return number;
        return number * factoriel(number - 1);
    }
}
