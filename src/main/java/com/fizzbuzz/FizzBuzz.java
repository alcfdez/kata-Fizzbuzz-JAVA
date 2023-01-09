package com.fizzbuzz;

public class FizzBuzz {
    private Integer TestNumber = 0;

    public FizzBuzz(Integer testNumber) {
        this.TestNumber = testNumber;
    }

    public Integer getTestNumber() {
        return TestNumber;
    }

    public void setTestNumber(Integer testNumber) {
        this.TestNumber = testNumber;
    }
    
    public String TestFizzBuzz(Integer numberToTest){
        if(numberToTest % 3 == 0 && numberToTest % 5 == 0) return "FizzBuzz";
        if(numberToTest % 3 == 0 || verifyIncludeNumber(numberToTest) == "three") return "Fizz";
        if(numberToTest % 5 == 0 || verifyIncludeNumber(numberToTest) == "five") return "Buzz";
        
        String numberCast= Integer.toString(numberToTest);
        return numberCast;
    }
    public String verifyIncludeNumber(Integer testNumber){
        String numberCast = Integer.toString(testNumber);

        if(numberCast.contains("3")) return "three";

        if(numberCast.contains("5")) return "five";

        return numberCast;
    }
}
