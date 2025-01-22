package ListMethods;

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

    public static String getLastStudent()
    {
        Student student = students.get(students.size()-1);

        return student.name;
    }

    public static int getClassSize()
    {
        return students.size();
    }

    public static String getStudent(int index)
    {
        Student student = students.get(index);

        return student.name;
    }

    public static void addStudent(int index, Student student)
    {

        if(students.contains(student))
        {
            students.remove(student);
        }

        students.add(index, student);

    }
}
