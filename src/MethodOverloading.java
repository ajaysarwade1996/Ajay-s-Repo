public class MethodOverloading {


        public int add(int n1,int n2,int n3)
        {
//            int result = n1 + n2 + n3;
//            return result;
            return n1 + n2 + n3;
        }
        public int add(int n1 , int n2)
        {
            return n1 + n2;
        }

        public static void main(String[] args)
        {
        MethodOverloading obj = new MethodOverloading();
        int r1 = obj.add(3,7,8);
            System.out.println(r1);

            int r2 = obj.add(18,45);
            System.out.println(r2);

        }
}


//method overloading - same method name gheu shkto fct different parameters asayla havet...
// type off parameters suddha change krun method overload kru shkto - mhanje int chya aivaji double use
//krun tyapaddhatine data use karaycha...smja int + double value chi addition doubble mdhe ghyavi lagel...
//tyasathi method suddha double return krnar ahe as sangaycha ahe...
