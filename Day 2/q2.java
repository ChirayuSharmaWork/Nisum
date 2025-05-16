import java.util.ArrayList;
import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.Stack;


class StudentGrades{
    protected char maths;
    protected char science;
    protected char sst;
    protected char cs;
    StudentGrades(char maths,char science,char sst,char cs){
        this.maths = maths;
        this.science = science;
        this.sst = sst;
        this.cs = cs;
    }
}



public static int idtag = 1;
class Student{
    protected String name;
    protected int id;
    protected StudentGrades Grades;


    Student(String name){
        this.name  = name;
        this.id = idtag++;
    }


    public void addGrades(char maths,char science,char sst,char cs){
        StudentGrades temp = new StudentGrades(maths,science,sst,cs);
        Grades = temp;
    }


}


class StudentList{
    ArrayList<Student> list = new ArrayList<>();


    public void addStudent(Student s1){
        list.add(s1);
    }
    public void DisplayAllStudents(){
        for(Student x : list){
            System.out.println(x.name);
        }
    }
    public void SearchStudent(int id){
        for(Student x : list){
            if(x.id == id){
                System.out.println(x.name);
            }
        }
    }
    public void DeleteStudent(int id){
        for(int i = 0; i < list.size();i++){
            if(list.get(i).id == id){
                list.remove(i);
                break;
            }
        }


    }


}


public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempid; //for storing temporary ids


        Student s1 = new Student("chirayu");
        s1.addGrades('A','B','C','D');
        Student s2 = new Student("Ahana");
        s2.addGrades('A','A','A','A');
        Student s3 = new Student("Adeeb");
        s3.addGrades('B','B','C','A');
        Student s4 = new Student("Samay");
        s4.addGrades('C','B','B','D');


        StudentList Students = new StudentList();
        Students.addStudent(s1);
        Students.addStudent(s2);
        Students.addStudent(s3);
        Students.addStudent(s4);


        Students.DisplayAllStudents();


        System.out.println("Search by id :- ");
        tempid = sc.nextInt();


        Students.SearchStudent(tempid);


        System.out.println("Remove by id :- ");
        tempid = sc.nextInt();


        Students.DeleteStudent(tempid);


        Students.DisplayAllStudents();




    }
}
