public class MultidimensionalArrayExample {

    public static void main(String[] args){

        int nums[][] = new int[3][4];

        //1 multidimensional array ahe jyamdhe 3 arrays ahet jyamdhe pratyeki 4 values store krnar ahot apn

        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[0][2] = 3;
        nums[0][3] = 4;

        nums[1][0] = 5;
        nums[1][1] = 6;
        nums[1][2] = 7;
        nums[1][3] = 8;
//
//        nums[2][0] = 9;
//        nums[2][1] = 10;
//        nums[2][2] = 11;
//        nums[2][3] = 12;

        //3rd array la values assign nahi kelya apn and by default values 0 asnar ahe...

        for (int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            {

            System.out.print(nums[i][j] + " ");

            }

            System.out.println();


        }
    }
}
