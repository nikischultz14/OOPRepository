package com.astontech;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //notes:    private static method for the lesson

           Lesson  ();
    }







    private static void LessonExceptions() throws Exception{
        //todo:     simple unhandled exception
        //String firstName = "Niki";
        //int x = Integer.parseInt(firstName);

        //System.out.println("Integer value: ");
       // System.out.println(x);

        //todo:     try - catch block
        //String firstName = "Niki";
        //try {
            //int x = Integer.parseInt(firstName);

            //System.out.println("Integer value: ");
            //System.out.println(x);
        //} catch(NumberFormatException ex) {
            //System.out.println("Exception: Invalid Number");
        //}

        //todo:     try - catch with multiple catch blocks
        //String firstName = "niki";
        //try {
          //  int x = Integer.parseInt(firstName);

         //   System.out.println("Integer value: ");
       //     System.out.println(x);
       // }
       // catch (NumberFormatException ex)
       // {
        //    System.out.println("Exception: Number Format Error");
       // }
       // catch (IllegalArgumentException ex)
       // {
       //     System.out.println("Exception: String was null or empty");
        //}

        //catch (Exception ex)
       // {
        //    System.out.println("Exception: Generic Exception");
       // }


        //todo: try - catch with multiple catch and finally block
       // String firstName = "9";
        //try {
       //     int x = Integer.parseInt(firstName);

      //      System.out.print("Integer value: ");
      //      System.out.println(x);
      //  }
      //  catch (IllegalArgumentException ex)
      //  {
     //       System.out.println("Exception: String was null or empty");
     //   }
     //   catch (NullPointerException ex)
     //   {
      //      System.out.println("Exception: Null Pointer");
      //  }
      //  catch (Exception ex)
      //  {
      //      System.out.println("Exception: Generic Exception");
      //  }
      //  finally
       // {
       //     System.out.println("Program has been completed regardless of exceptions.");
      //  }

        //todo:  exception object
        //notes: base exception class
       // String firstName = "niki";
       // try {
        //    int x = Integer.parseInt(firstName);

       //     System.out.println("Integer value: ");
       //     System.out.println(x);
       // }
      //  catch (IllegalArgumentException ex)
      //  {
       //     System.out.println("Exception: " + ex.toString());
       // }
       // catch (NullPointerException ex)
       // {
       //     System.out.println("Exception: " + ex.toString());
      //  }
       // catch (Exception ex)
       // {
       //     System.out.println("Exception: " +ex.toString());
      //  }
      //  finally
      //  {
     //       System.out.println("Program has been completed regardless of exceptions.");
     //   }

//todo:     throwing an exception
        String firstName = null;
        try {
            int x = Integer.parseInt(firstName);

            System.out.println("Integer values: ");
            System.out.println(x);
        }
        catch (Exception ex)
        {
            throw new Exception("A custom exception from LessonExceptions method.", ex);
        }










    }


    private static void LessonFlowControl() {
        //notes:    IF - ELSE
        String name = "niki";
        if(name.equals("Nik")) {
            System.out.println("correct first name");
            System.out.println("another line");
        } else {
            System.out.println("incorrect first name");
        }
            if(name.length() > 10) {
                System.out.println("very long first name");
            } else if(name.length() > 5) {
                System.out.println("long first name");
            } else {
                System.out.println("short first name");
            }



    //notes:    CASE SWITCH
        switch(name)
        {
            case "niki":
                System.out.println("cool first name");
                break;

            case "bob":
            case "fred":
            case "todd":
                System.out.println("first name is todd, bob, or fred");
                break;

            default:
                System.out.println("Some other first name");
                break;
        }



    }


    private static void LessonOperators() {
        //notes:    plus / minus
        int val = 10;
        System.out.println(val + 10);
        System.out.println(val - 10);

        //notes:    modulus (%) the remainder
        int modVal = 10 % 3; //the remainder of 10 / 3 which is 1
        System.out.println(modVal);

        //notes:    increment (++) / decrement (--)
        System.out.println("increment after: ");
        System.out.println(val++); //10
        System.out.println(val++); //11
        System.out.println(val++); //12
        System.out.println(val);   //val = 13;

        val = 10;
        System.out.println("increment before: ");
        System.out.println(++val);  //11
        System.out.println(++val);  //12
        System.out.println(++val);  //13
        System.out.println(val);    //val = 13;

        val = 10;
        System.out.println("decrement after: ");
        System.out.println(val--); //10
        System.out.println(val--); //9
        System.out.println(val--); //8
        System.out.println(val);   //val = 7;

        val = 10;
        System.out.println("decrement before: ");
        System.out.println(--val);  //9
        System.out.println(--val);  //8
        System.out.println(--val);  //7
        System.out.println(val);    //val = 7;


        //notes:    logical equals (==) / logical not equal (!=)
        val = 10;
        int anotherVal = 10;

        if(val != anotherVal)
            System.out.println("Not Equals");
        else
            System.out.println("Equals");


        //notes:    logical AND (&&) / logical OR (||)
        if(val == 10 && anotherVal == 10 || val == 11)
            System.out.println("true!");
        else
            System.out.println("not true!");

        //note:     negation (!)
        boolean boolVar = true;
        if (!boolVar)
            System.out.println("is true");
        else
            System.out.println("not true");








    }


private static void LessonLists() {
        //notes:    collections / lists
    List<String> myStringCollection = new ArrayList<String>();

    myStringCollection.add("1st String");
    myStringCollection.add("2nd String");
    myStringCollection.add("3rd String");
    myStringCollection.add("4th String");
    myStringCollection.add("5th String");

    for(String singleString : myStringCollection) {
        System.out.println(singleString);
    }

    List<Integer> myIntCollection = new ArrayList<Integer>();

    myIntCollection.add(10);
    myIntCollection.add(20);
    myIntCollection.add(30);
    myIntCollection.add(40);
    myIntCollection.add(50);

    System.out.println(myIntCollection);

    for(int singleInt : myIntCollection) {
        System.out.println(singleInt);
    }

    //notes:        arrays
    String[] myStringArray = new String[5];

    myStringArray[0] = "1st";
    myStringArray[1] = "2nd";
    myStringArray[2] = "3rd";
    myStringArray[3] = "4th";
    myStringArray[4] = "5th";

    System.out.println(myStringArray);

    for(String singleString : myStringArray) {
        System.out.println(singleString);
    }






}


    private static void LessonStrings() {
        //notes:        Strings have a value or not
        String firstString = "";
        //firstString = "something";
        firstString = null;

        if(firstString == null || firstString.isEmpty()) {
            System.out.println("String is empty");
        } else {
            System.out.println("String has a value");
        }

        //notes:      immutable - unable to be changed
        firstString = "another value";    //this creates a new string

        for(int x = 0; x <= 100; x++) {
            firstString = "new value: " + Integer.toString(x);
            System.out.println(firstString);   //we are creating a new string for every iteration! 100 strings
            //very inefficient!!!

        }

            //notes:    StringBuilder()
        StringBuilder myStringBuilder = new StringBuilder();

        for(int x = 0; x <= 100; x++) {
            myStringBuilder.append("new values with string builder: ")
                            .append(Integer.toString(x))
                            .append("\n");
        }

        System.out.println(myStringBuilder);



        //notes:    Searching string (indexOf, lastIndexOf)
        String myName = "Niki";
        /*

            string can be visualized as an array of characters.
             N   I   K   I
            (0) (1) (2) (3)

            note that the array is zero based (starts at zero)
            character at index 2 is the letter 'k'

         */

        int indexOf = myName.indexOf("i");
        System.out.print(indexOf);

        int lastIndexOf = myName.lastIndexOf("N");
        System.out.println(lastIndexOf);




        //notes:    enumerating a string
        String largeString ="This is a longer string than before";
        for(char c : largeString.toCharArray()) {
            System.out.println(c);
        }


        //notes:    substring(beginning index) or substring(beginning index, end index)
        String partOfLargerString = largeString.substring(8, 16);
        System.out.println(partOfLargerString);


    }


    private static void LessonDataTypes() {
        //notes:    primitive data types
        //          int (number)
        //          float (floating point number or decimal ...)
        //          double (larger number)
        //          boolean (true / false)
        //          char (character)

        //notes:    common data types
        boolean myBool = false;
        int myInt = 4;
        String myString = "some words";
        Date myDate = new Date();

        System.out.println(myBool);
        System.out.println(myInt);
        System.out.println(myString);
        System.out.println(myDate);

        //notes:    parsing / converting data types
        //notes:    string --> int

        String numberString = "341";
        int intFromString = Integer.parseInt(numberString);

        System.out.println(intFromString);


        //notes:    int --> string
        int i = 312;
        String stringFromInt = Integer.toString(i);

        System.out.println(stringFromInt);



        //notes:    date --> string
        String stringFromDate = myDate.toString();

        System.out.println(stringFromDate);





    }


    private static void LessonVariables() {
        //notes:      use variable declared outside of this scope


        //notes:   declaring multiple variables and set them
        String lastName = "Butala", firstName = "Bipin";

        //notes:   output to the console
        System.out.println(firstName + " " + lastName);

        //notes:    create a Scanner object
        Scanner reader = new Scanner(System.in);

        //notes:    prompt the user
        System.out.print("Enter your name: ");

        //notes:    read input from the user and store it in a variable
        String input = reader.nextLine();

        //notes:    print the value back to the screen
        System.out.println("Hello " + input);
    }


}
