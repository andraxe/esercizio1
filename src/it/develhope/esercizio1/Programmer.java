package it.develhope.esercizio1;

public class Programmer {

    String name;
    int age;
    boolean  wearGlasses;


    public void drinkCoffe (){

    System.out.println("Espresso is the secret!");

    }

    public void  printDetails() {
    System.out.println( name +" " + "is a " +age +" years old programmer");

    }
    public void hasGlasses(){

  //System.out.println("Is" +"." + Name + "." + "wearing glasses?" + "-" + wearGlasses);
        System.out.printf("Is %s Wearing Glasses?  %s",  name, wearGlasses);
    }



}
