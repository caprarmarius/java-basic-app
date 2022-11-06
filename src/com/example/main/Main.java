/**
 * This is a simple java application to prove the use of primitive datatypes
 *  There are 8 primitive datatypes in Java language. They belong directly to the syntax of the language, that's why they are called primitive.
 *  Unlike any other datatype, the primitive datatypes are the only ones that are not treated as objects, thus making Java not 100% object oriented
 *  IMPORTANT: A variable of primitive datatype holds a value and not a reference! (we will see that most of Java variables are actually references to objects )
 * @version 17
 * @author Marcap
 */

package com.example.main;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        //how to print a text to screen
        System.out.println("Hello stupid!");

        //the boolean datatype is used to store the logical value of a condition or statement; it can be either true or false, thus having only 2 possible values
        //the memory size of a boolean variable is 1 bit in theory, but in practice it is JVM-dependent
        boolean t = true;
        boolean f = false;

        //the byte datatype is used to store 1 byte (8 bits) of information; mainly for memory limited applications
        byte b = 55;
        System.out.println("Size of byte primitive type: " + Byte.BYTES);

        //the short datatype is used to store 2 bytes (16 bits) of information; also for memory limited applications
        short s = 22;
        System.out.println("Size of short primitive type: " + Short.BYTES);

        //the char datatype is used to store an ASCII character (a letter, a digit or a symbol); its size is 2 bytes
        char c = 'A';
        System.out.println("Size of char primitive type: " + Character.BYTES);

        //the int datatype is the most used primitive datatype to represent integer numeric values; its size is 4 bytes and range: -2,147,483,648 to 2,147,483,647
        int i = 24;
        System.out.println("Size of int primitive type: " + Integer.BYTES);

        //the long datatype is the same as int but can take a larger range of values; its size is 8 bytes and range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //used for applications that needs integer values that go beyond the range supported by int
        //IMPORTANT: it requires an L (or l) at the end of the value to specify to the compiler that the value is a long,
        // otherwise it type converts it to int, therefore throwing an error
        long l = 1232412402149L;
        System.out.println("Size of long primitive type: " + Long.BYTES);

        //the float datatype is used to represent floating point numbers; its size is 4 bytes
        //IMPORTANT: it requires an F (or f) at the end of the value, otherwise is will be converted to double
        float fl = 3.55f;
        System.out.println("Size of float primitive type: " + Float.BYTES);

        //the double datatype is the most used to represent floating points number; it is more precise than float, but has a size of 8 bytes
        double simple_double = 3.141596;
        double exponential_represented_double = 24.5E5; //means 24.5*(10^5); E (or e) in a double stands for exponential and it means *10^(whatever comes after E)
        System.out.println("Size of double primitive type: " + Double.BYTES);

        //ENUMS: they are not really primitive datatypes, but it is a way to represent a "list" of some known constant values
        //very useful as category tags and when you have values that you know aren't going to change, like week days, month days, colors, deck of cards, etc.
        enum Week {
                MONDAY,
                TUESDAY,
                WEDNSDAY,
                THURSDAY,
                FRIDAY,
                SATURDAY,
                SUNDAY
        }

        System.out.println("Weekend days are " + Week.SATURDAY + " and " + Week.SUNDAY);

        //Primitive datatypes arrays in java. We will give as example an int array, but it works the same for every primiive datatype
        int intArray[]; //here we declare an array variable
        intArray = new int[10]; //here we allocate memory for 10 position in our int array using the word "new"

        intArray[0] = 55;
        intArray[1] = 24;
        intArray[2] = 18;
        intArray[3] = 66;
        intArray[4] = 90;
        intArray[5] = 106;
        intArray[6] = 78;
        intArray[7] = 22;
        intArray[8] = 909;
        intArray[9] = 3001;

        //the for each java statement is similar to for loop in arrays, but without the need of a variable to retain the index,
        // thus focusing on the elements themselves rather than the index
        //the for each was introduced in JAVA SE5 (or Java 1.5)
        /*
            for(type:array){
            //code
            }

            It takes each element of the array and allows it to be manipulated
            DO NOT USE when there is the need to know the index of the element or to modify the array

            Commonly used for Collections as we'll see further
         */
        for (int element:intArray){
            System.out.println(element);
        }

    }
}
