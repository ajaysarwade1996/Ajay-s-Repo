public class EnhancedForLoop
{


   class Student
    {
        int studentRollNumber;
        String studentName;
        int getStudentMarks;
    }
    Student obj1 = new Student();


    public static void main(String[] args)
    {
        int nums[] = new int[4];
        nums[0] = 2;
        nums[1] = 4;
        nums[2] = 8;
        nums[3] = 16;


        for (int n : nums)
        //nums mdhe jya kahi values ahet tya one at a time n mdhe ghe and print kr as sangto ahot apn...
        {
            System.out.println(n);
        }
    }
}


//one at a time asha  mla fct values de from this nums..
//and that one value will go into n at a time...