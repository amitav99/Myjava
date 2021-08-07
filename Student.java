public class Student
{
    public int roll_NO;
    public String  name;
    public String course;
    public int m1, m2, m3;

    public int total()
    {
        return m1+m2+m3;
    }
    public float average ()
    {
        return (float)total()/3;
    }
    public char grade()
    {
        if (average()>70)
        {
            return 'A';
        }
        else 
        {
            return 'B';
        }
    }
    public String details()
        {
            return "roll number :  "+roll_NO +"\n"+"Name : "+name+"\n"+ "course : "+course;
        }
    public static void main (String args[])
    {
        Student ob =new Student();
        ob.roll_NO=1;
        ob.name ="Amitav";
        ob.course ="computer Science";
        ob.m1=90;
        ob.m2=85;
        ob.m3=80;  
        
        System.out.println("Student details : "+ ob.details()); 
        System.out.println("Total marks : "+ ob.total());
        System.out.println("Average : "+ ob.average());
        System.out.println("Grade : "+ ob.grade());
    }
} 