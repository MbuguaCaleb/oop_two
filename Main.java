package com.codewithcaleb;

public class Main {

    public static void main(String[] args) {

        //syntax to Instantiate a class
        //Remember Java is a Strict Programming Language
        //The class type will be TextBox which is the name of the class
        //TextBox textBox1 = new TextBox();

        //Better Syntax
        //Var is not the JavaScript One
        var textBox1 = new TextBox();
        textBox1.setText("Box One");
        System.out.println(textBox1.text.toUpperCase());


        var textBox2 = new TextBox();
        textBox2.setText("Box Two");
        System.out.println(textBox2.text.toUpperCase());



    }
}
