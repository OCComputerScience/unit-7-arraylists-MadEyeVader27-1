package ClassList;

import java.util.ArrayList;

public class Student
{
    private String name;
    private int grade;
    private static ArrayList<Student> students = new ArrayList<Student>();

    public Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;

        students.add(this);
    }

    public static void printClassList()
    {
        for(Student student : students)
        {
            System.out.println(student.name);
        }
    }

}
