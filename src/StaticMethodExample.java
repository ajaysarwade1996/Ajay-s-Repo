import org.w3c.dom.ls.LSOutput;

public class StaticMethodExample
{
    public static void main(String[] args)
    {
        Cricket objref1 = new Cricket();
        objref1.playing11 = "MSDplayingXI";

        Cricket.noOfPlayers = 11; //static variable ahe mhnun by using ClassName call kela ahe ha...

        Cricket objref2 = new Cricket();
        objref2.playing11 = "KingKohliplayingXI";

        Cricket objref3 = new Cricket();
        objref3.playing11 = "HitmanplayingXI";


        objref1.showData();
        objref2.showData();
        objref3.showData();

        Cricket.showData1(); //This is how we can call a static method by using ClassName.



    }
}

class Cricket
{
    String playing11;
    static int noOfPlayers;


    public void showData()
    {
        System.out.println(playing11 + "--->" + noOfPlayers);
        System.out.println();
    }

    public static void showData1()
    {
        System.out.println("We call static method by using ClassName and not by ObjectName");
    }

}


//main method nehmich static  aste karan main la call krnyasathi object create krnyachi grjch nahi padali pahije
//Ask to parya regarding this.