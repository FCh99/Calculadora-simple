package com.example.faustocheca.myapplication;

/**
 * Created by faustocheca on 1/4/16.
 */
public class Calculator {

    private int result;
    private int num1;
    private int num2;

// se puede quitar los parámetros y ponerlos en los métodos

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {

        result = num1 + num2;
        return result;
    }

    public int multiply(){
        result = num1 * num2;
        return result;


    }



}
