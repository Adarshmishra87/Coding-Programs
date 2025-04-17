class students {
    int marks;
    String name;
    int rollno;
}

public class foreach {
    public static void main(String[] args) {

        students s1 = new students();
        students s2 = new students();
        students s3 = new students();
        s1.name = "Kria";
        s1.marks = 25;
        s1.rollno = 101;

        s2.name = "shna";
        s2.marks = 687;
        s2.rollno = 10;

        s3.name = "Radha";
        s3.marks = 80;
        s3.rollno = 8;

        students Students[]=new students[3];
        Students[0]=s1;
        Students[1]=s2;
        Students[2]=s3;


        //////////////
        /// 
    
        for (students students2 : Students) {
            System.out.println(students2.name+"  "+ students2.marks+" ");
        }


    }
}
