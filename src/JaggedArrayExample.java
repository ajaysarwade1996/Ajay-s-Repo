public class JaggedArrayExample {
    public static void main(String[] args){

        int nums[][] = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[5];

//        for(int i=0;i< nums.length;i++)
//        {
//            for (int j=0;j< nums[i].length;j++) {
//                nums[i][j] = (int) (Math.random() * 10);
//            }
//        }

        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[0][2] = 3;

        nums[1][0] = 4;
        nums[1][1] = 5;
        nums[1][2] = 6;
        nums[1][3] = 7;

        nums[2][0] = 8;
        nums[2][1] = 9;
        nums[2][2] = 8;
        nums[2][3] = 7;
        nums[2][4] = 6;




        for (int i=0;i<nums.length;i++)
        {
            for (int j=0;j<nums.length;j++)
            {
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
