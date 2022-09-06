package com.kata;

public class Weird {

    public String Print(int number) {
        String result ="";
      
        if (number % 2 != 0 || (number % 2 == 0 && (number <= 20 && number >= 6))) {
            result ="Weird";
         } else {
            result = "not Weird";
         }
           return result;
      

}

}

