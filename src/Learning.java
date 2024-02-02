public class Learning {
    public int Calculator(int num1,int num2, String op){
        int result =0;
        if(op.equals("a")){
             result =num1+num2;
        }
        else if(op.equals("s")){
             result = num1-num2;
        }

        return result ;
    }
}
