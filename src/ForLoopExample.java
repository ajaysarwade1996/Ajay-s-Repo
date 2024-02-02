import java.sql.SQLOutput;

public class ForLoopExample {

    public static void main(String[] args){

        for(int i=4;i>=1;i--){

            System.out.println("MSDHONI "+ i);

            for (int j=1;j<=4;j++){
                System.out.println("MAHI BHAI IS ALWAYS BEST "+ j);

            }
        }

    }
}

//JVM main mdhe janar...i chi value initialize zali as 4...condition check zali as 4 is greater
//than 1 ahe...loop mdhe janar MSDHONI  print honar and i chi value print honar as 4...

//Mg inner for loop mdhe entry ghenar...j initialize zala as value 1...condition check zali
///1 is less than or equals to 4 ahe...loop mdhe janar and statement print krnar...and j chi value print
//honar ahe as 1 then...increament operator work honar...ata j chi value 2 zali memory mdhe...
//2<=4 so punha inner loop mdhe firnar ahe...as 4 vela inner loop execute honar...
//and punha outer loop chi condition check honar...and so on upto outer loop chi condition false hot nahi...


// for loop mdhe initialization and condition adhi execute hotat mg loop mdhe jato JVM and body execute hote
// and then mg increament operator work krt...