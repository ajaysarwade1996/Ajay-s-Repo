public class MobileConnect
{
    public static void main(String[] args)
    {
        Mobile1 obj1 = new Mobile1();
        obj1.brandName = "Apple";
//        obj1.category = "Smartphone";
        Mobile1.category = "Smartphone";

        //ithe category he 1 static variable ahe...so called by using ClassName...& not using object
        //static belongs to class & not to the object...

        obj1.price = 77000;

        Mobile1 obj2 = new Mobile1();
        obj2.brandName = "Samsung";
//        obj2.category = "Smartphone";
        obj2.price = 88000;

        Mobile1 obj3 = new Mobile1();
        obj3.brandName = "Google";
//        obj3.category = "Smartphone";
        obj3.price = 99000;


        obj1.show();
        obj2.show();
        obj3.show();


    }
}




class Mobile1 {
    String brandName;
    static String category;
    int price;

    public void show()
    {
        System.out.println(brandName + " - "+ price + " - "+ category);
        System.out.println();
    }


}
