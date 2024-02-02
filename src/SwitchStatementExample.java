public class SwitchStatementExample {

    public static void main(String[] args){

//        int n = 2;
        String day = "Monday";
        String result = "";
       result = switch (day){
//            case 1: System.out.println("Print 1st case if condition is right");
//            break;
//            case 2: System.out.println("Print 2nd case if condition is right");
//            break;
//            case 3: System.out.println("Print 3rd case if condition is right");

           case "Monday" , "Sunday" -> "set alarm at 6 am";
         //case  "Monday" , "Sunday" : yield "Set alarm at 6 am";
        case  "Tuesday " -> "set alarm at 7 am";
           default -> "Set alarm at 6.18 am";

        };
        System.out.println(result);
    }
}

//Ithe jr break lavla nahi after each case tr smja 2nd case right ahe tr 2nd case tr execute honarch ahe pn tyanntr
//chi case suddha execute hoil kiva tyanntr jitkya cases astil titkya execute hotil...
//mhnun break apply karaych after each casse jenekrun jevha condition match hote tevhach program thambto...



//2nd type mdhe apn adhi condition dili ahe and nntr ky print honar te dil ahe...
//case lihitana jr -> ha symbol nsel use karaycha tr : yield use kru shkto...