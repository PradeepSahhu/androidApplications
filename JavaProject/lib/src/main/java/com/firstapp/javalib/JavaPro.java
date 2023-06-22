package com.firstapp.javalib;

public class JavaPro {

    public static void main(String[] args){

        // Single Line comment.
        /* Multi Line comment. */
        // type variable name = value;

        String name = "Pradeep";
        int age = 21;
        System.out.println("Hello "+ name);
        System.out.println("The age of "+name+" is : "+age);
//        System.out.print(8+4);
        byte b = 127;
        short s = 12222;
        int c = 123;
        long sj = 2312L;
        System.out.println(sj);

        float f = 22.22f;
        double d = 1232d;

        boolean bo = true; // false
        System.out.println(bo);
        System.out.println(b>s);

        // Character Datatype.
        char cha = 'P';
        char acsii = 49;
        System.out.println(cha);
        System.out.println(acsii);

//        int zero;
//        System.out.println(zero);

        // Type Casting
        //       Widening casting (automatically) - converting a smaller type to a larger type size
        //              byte  -> short -> char -> int -> long -> float -> double


        // narrowing casting (manually) - converting a larger type to a smaller size type
        //        double -> float -> long -> int ->  char -> short -> byte


        double a = 295.04;
        int ba = 300;
        byte ca= (byte)a;
        byte da = (byte)ba;
        System.out.println(ca+" "+da);


        int number = 10;
        double ff = number; // automatic casting : int to double.

        double dd = 12.45d;
        int du = (int) dd; // Manuel casting : double to int.

        // one dimensional arrays.
        int[] numbers = {1,2,3,4,5};

        for(int i = 0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        // multi-dimensional arrays.
        int[][] matrix = {
                {1,2,3,4,5,6},
                {7,8,9,10,11},
                {12,13,14,15},
        };
        System.out.println("******************************************************");
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                System.out.println(matrix[i][j]);
            }

        }
        System.out.println("*************************************************************");
        // for Each loops in java;

        String[] cars = {"mercedes","BMW","Jaguar","Maruti"};


        for(int i : numbers){
            System.out.println(i);
        }
        for(String i: cars){
            System.out.println(i);
        }

        System.out.println("For each for 2d Arrays");

        for(int j[] : matrix){
            for(int i : j){
                System.out.println(i);
            }
        }
        System.out.println("***************************");
        System.out.println(5+(15/3*2)-8%3);


       int array_variable[] = new int[10];
       for(int i = 0;i<10;++i){
           array_variable[i] = i;
           System.out.print(array_variable[i]+" ");
           i++;
       }
       System.out.println();

       // Java Oops Concept.

        // A method (function) is a block of code which only runs when it is called ( functions)


    sayHello();

        



    }

    public static void sayHello(){
        System.out.println("hello user");
    }
}




