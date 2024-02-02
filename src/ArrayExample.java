public class ArrayExample {
    public static void main(String[] args){

        int numbers[] = {3,7,8};

        System.out.println(numbers[0]);

        numbers[0] = 18; //ithe 0th number change kela ahe...mhanje 3 change kela & 18 kela...

        System.out.println(numbers[0]);

        int nums[] = new int[4]; //he zal dynamic array creation.yamdhe values insert nahi kelya.4 cha array ahe.

        nums[0] = 45;
        nums[1] = 18;
        nums[2] = 22;
        nums[3] = 17;

        for (int i=0;i<4;i++) {
            System.out.println(nums[i]); //All values print krnyasathi apn asa for loop use kela...
        }
    }

}
