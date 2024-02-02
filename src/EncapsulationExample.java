class Human
{
    private int age;
    private String name;

   public int getAge()
    {
        return age;
    }
   public void setAge(int a)
    {
        age = a;//apn ji value pass krnar ahot ti value a la assign hoil and then it will be assign to name...
    }

     public void setName(String n)
    {
        name = n;//ji value apn pass krnar ahot ti adhi n mdhe ghyaychi and then name la assign karaychi ahe...
    }

     public String getName()
    {
        return name;
    }

}

public class EncapsulationExample
{
    public static void main(String[] args)
    {
        Human obj = new Human();
//        obj.age = 7;
//        obj.name = "Dhamane";
//        System.out.println(obj.name);//private variables direct access kru shknar nahi pn...

        obj.setAge(7);
        obj.setName("Dhamane");
        System.out.println(obj.getAge() + " : "+ obj.getName());

    }
}
//jr apn variables private kele tr that variables is accessible only in the same class...

//Note - Jevha kdhi Instance variables ap create krto then make it private...

//private variables la directly acces krta yet nahi but indirect way ahe access krnyacha 1...
//with the help of methods apn access kru shkto...
//Same class mdhe method declare karaychi and main method mdhe access krtana method access karaychya ahet...


//yamdhe variables la jya values assign kelya ahet tya suddha with the help of methods kelya ahet...
//setAge and setName ya 2 methods ahet assign krnyasathi...
//&
//We are getting the values with the help of methods getAge and getName ya 2 methods...

//Encapsulation - We are encapsulating or hiding the data and methods from the outside world...Only we can access
//the data by using variables...

//getAge and getName are getters and setName and setAge are setters...