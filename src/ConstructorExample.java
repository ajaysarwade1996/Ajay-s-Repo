import javax.xml.namespace.QName;

class Example {
    int number;
    String name;

    public Example()
    {
        System.out.println("In Constructor");
        number = 7;
        name = "Dhoni";//ya variables chya bydefalut values ata ya 2 assign kelya ahet apn..adhi 0 and null hotya
    }

    public Example(int a , String n) //Parameterized Constructor
    {
        number = a;
        name = n;
    }



}
public class ConstructorExample
{
    public static  void main(String[] args)
    {
        Example obj = new Example();
        Example obj1 = new Example(18 ,"Kohli");//ithe direct values pass kelya ahet bydefault nkot mhnun.

        System.out.println(obj.name +"   "+ obj.number);
        System.out.println(obj1.name + "   "+ obj1.number);

//        System.out.println(obj.name);///apn check kel ki bydefault value ky ahe that is null...
    }
}

//Jevha  apn object create krto tevha bydefault int variable la 0 vaue aste and String la null value aste...
//but what if mla jr object create krtanach values pass karaychya ahet...mhanje mla null values nko ahet...
//bydefault jya null values yetat tya yenyapeksha me swata value instert krnar ahe at the time of object creation


//Constructor create krun apn values pass kru shkto at the time of object creation...
//Constructor is looks like a method itself...Constructor create krtana apn return type specify krt nahi...
//karan Coonstructor never returns anything...

//Constructor name should  be same as a ClassName;

//Everytime u create an object it will call the constructor...
//smja me 2 object create kele tr 2 vela constructor la call jail...