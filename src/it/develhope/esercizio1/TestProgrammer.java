package it.develhope.esercizio1;




public class TestProgrammer {


    public static void main(String[] args) {


        Programmer GlassesDetails =new Programmer();

        GlassesDetails.age = 51;
        GlassesDetails.name = "Andrea";
        GlassesDetails.wearGlasses =true;

        GlassesDetails.printDetails();
        GlassesDetails.hasGlasses();


        Programmer DetailsCoffe = new Programmer();
        DetailsCoffe.wearGlasses= false;
        DetailsCoffe.name="Paolo";
        DetailsCoffe.age =46;
        System.out.println("");
        DetailsCoffe.printDetails();
        DetailsCoffe.hasGlasses();
        System.out.println("");
        DetailsCoffe.drinkCoffe();

    }
}
