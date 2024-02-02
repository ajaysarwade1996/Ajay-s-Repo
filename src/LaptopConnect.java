public class LaptopConnect
{
    public static void main(String[] args)
    {
        Laptop objlap1 = new Laptop();
        objlap1.laptopBrand = "Dell";
        objlap1.operatingSystem = "Windows11";

        Laptop.keyboardButtons = 104;


        Laptop objlap2 = new Laptop();
        objlap2.laptopBrand = "HP";
        objlap2.operatingSystem = "Windows11";


        Laptop objlap3 = new Laptop();
        objlap3.laptopBrand = "Dell";
        objlap3.operatingSystem = "Windows11";

        objlap1.laptopDetaiils();
        objlap2.laptopDetaiils();
        objlap3.laptopDetaiils();

    }
}
