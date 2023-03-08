package com.fizzbuzz;

public class FizzBuzz {
    private Integer number;
    
    public  FizzBuzz(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

 
    
    public static void main (String[] args){
        int numb;
        System.out.println("Serie de números");
        System.out.println("del 1 al 100");
        System.out.println("Serie:");

        for (numb=1;numb<=100;numb++){
            System.out.println(numb +",");
        }

    public String fizz (){
        if(this.number % 3 == 0) {
            return "fizz";
        } 
        return String.valueOf(this.number);


    }
    
    public String buzz(){
        if(this.number % 5 == ){
            return "buzz";
        }
        return String.valueOf(this.number);
    }

    public String fizzbuzz(){
        if(this.number % 5 == 0 && this.number % 3 == 0 ){
            return "fizzbuzz";
        }
        return String.valueOf(this.number);
   }






}








}




