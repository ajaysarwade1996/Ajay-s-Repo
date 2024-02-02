public class ArrayOfObjectsExample
{

    public static void main(String[] args)
    {
    Student s1 = new Student();
    s1.studentName = "Parag";
    s1.studentRollNumber = 7;
    s1.studentMarks = 88;

        Student s2 = new Student();
        s2.studentName = "Parya";
        s2.studentRollNumber = 8;
        s2.studentMarks = 77;

        Student s3 = new Student();
        s3.studentName = "Par";
        s3.studentRollNumber = 9;
        s3.studentMarks = 66;




        Student students[] = new Student[3]; //js apn int cha array bnvla hota tsa ithe student ne create kela
        students[0] =s1;
        students[1] = s2;
        students[2] = s3;
        // students[] cha array create kela ahe apn...jyamdhe objects che reference dile ahet...
        //We have to manually create objects and assign them to array...


//        for (int i=0;i< students.length;i++)
//        {
//            System.out.println();
//        }

    }


}

class Student
{
    int studentRollNumber;
    String studentName;
    int studentMarks;

}
