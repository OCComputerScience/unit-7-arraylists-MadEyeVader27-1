package ListMethods;

public class Main
{
    public static void main(String[] args)
    {
        Student student1 = new Student ("Will K", 11);
        Student student2 = new Student ("Will Kane", 11);
        Student student3 = new Student ("Liam Kane", 11);
        Student student4 = new Student ("William Kane", 11);

        Student.getStudent(3);
        Student.getLastStudent();
        Student.getClassSize();
        Student.addStudent(3, student1);

    }
}
