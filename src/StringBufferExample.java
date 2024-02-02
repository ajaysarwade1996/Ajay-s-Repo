public class StringBufferExample
{
//    StringBuffer ashi string aste jyachi value apn change kru shkto...
    public static void main(String[] args)
    {
        String s1 = "Anuradha";
        System.out.println(s1);

        StringBuffer sb = new StringBuffer("Dhamane");
        sb.append(" Aniruddha"); //String connect/add krnyasathi append method use krtat
        System.out.println(sb.capacity());
        System.out.println(sb);

//        Bydefault string capacity 16 ahe and jr apn string add keli...yamdhe jshi Dhamane add keli ahe tshi
//        tr string capacity vadhte 16+ jevdhe characters apn use krtoy tevdhe...
//        Stringbuffer navatch ahe ki  te buffer ghuen chalte 16 capacity cha...
//        and jr heap memory mdhe continuous memory location nsel bhetat tyala tr tithli location change
//        hote and somewhere else jithe jaga ahe asha thikani save hote (Heap memory mdhech)...


//        String str = sb;     we can't convert from Stringbuffer to  String...

        String str = sb.toString();
//        toString is use to convert StringBuffer data to String

        System.out.println(str);

        sb.deleteCharAt(0);
        System.out.println("                     "+sb);





    }
}
