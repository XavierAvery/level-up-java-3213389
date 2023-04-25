package com.linkedin.javacodechallenges;

/**
 * Hello world!
 *
 */
public class App 
{
    public static boolean isEven(int n){
        // todo: check if even
        // if (n % 2 == 0){
        //     return true;
        // } else {
        //     return false;
        //}
        return n % 2 == 0;
         
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        System.out.println(isEven(2));

        System.out.println(isEven(9));
    }
}
