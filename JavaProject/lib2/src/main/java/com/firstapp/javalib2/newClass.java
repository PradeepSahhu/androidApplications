package com.firstapp.javalib2;

//import package.name.class; // for a single class in the package
//import package.name.*; for the whole package.


public class newClass {

    public static void main(String[] args) {
    /*
    Packages are divided into two categories:
    - built-in packages ( packages from the hava API)
    - user-defined packages (create your own packages)
     */

//        Scanner scanner = new Scanner(System.in);
//        String userName = scanner.nextLine();
//
//        System.out.println("Hello "+userName);

        Car c1 = new Car("Grey",2015);
        System.out.println(c1.getColor());
        System.out.println(c1.getModelYear());

        c1.horn();
    }
}
