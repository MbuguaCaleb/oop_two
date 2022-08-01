package com.codewithcaleb;


//Classes should always have the Camel Casing Convention

//Public is the access modifier --->A public class is visible to all other classes in the Project
//It determines whether other classes can use this class or Not
public class TextBox {

    //Attributes in a class are also known as fields
    //You can set fields with default values
    public String text =""; //Field

    //this comes in when my method params has the same name as what i am passing
    public void setText (String text){
        this.text = text;
    }

    public void clear(){
        text= "";
    }
}
