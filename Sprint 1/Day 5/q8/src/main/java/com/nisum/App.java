package com.nisum;

import com.nisum.util.DBconnection;

import java.sql.*;


class Student{
    private  Integer id;
    private  String name;
    private  Integer age;

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void insertNewStudent(Student s1){
        try(Connection con = DBconnection.getConnection()){
            String query = "INSERT INTO students VALUES (?, ?, ?)";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setInt(1,s1.getId());
            stm.setString(2,s1.getName());
            stm.setInt(3,s1.getAge());
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Connection was Unsuccessfull");
        }
    }

    public static void updateStudent(Student s1){
        try(Connection con = DBconnection.getConnection()){
            String query = "UPDATE students SET name = ? , age = ? WHERE id = ?";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1,s1.getName());
            stm.setInt(2,s1.getAge());
            stm.setInt(3,s1.getId());
            stm.executeUpdate();
        }catch (SQLException ex){
            ex.printStackTrace();
            System.out.println("Connection was Unsuccessfull");
        }
    }

    public static void deleteById(Integer id){
        try(Connection con = DBconnection.getConnection()){
            String query = "DELETE FROM students WHERE id = ?";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setInt(1,id);
            stm.executeUpdate();
        }catch (SQLException ex){
            ex.printStackTrace();
            System.out.println("Connection was Unsuccessfull");
        }
    }

    public static void searchByFirstLetter(String ch){
        try(Connection con = DBconnection.getConnection()){
            String query = "SELECT * FROM students WHERE name LIKE ?";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1,ch + '%');
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt("age"));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("Connextion was Unsuccessfull");
        }
    }

    public static void insertIntoStudentAndCourse(Student s1, Course c1) throws SQLException {
        Connection con = null;
        try{
            con = DBconnection.getConnection();
            con.setAutoCommit(false);

            String query = "INSERT INTO students VALUES (?, ?, ?)";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setInt(1,s1.getId());
            stm.setString(2,s1.getName());
            stm.setInt(3,s1.getAge());
            stm.executeUpdate();

            String query1 = "INSERT INTO courses VALUES (?, ?, ?)";
            PreparedStatement stm1 = con.prepareStatement(query1);
            stm1.setInt(1,c1.getId());
            stm1.setString(2,c1.getCourseName());
            stm1.setInt(3,c1.getCourseCredits());
            stm1.executeUpdate();
            con.commit();
        }catch (SQLException ex){
            con.rollback();
            ex.printStackTrace();
            System.out.println("Connextion was Unsuccessfull");
        }

    }

}

class Course{
    private Integer id;
    private String courseName;
    private Integer CourseCredits;

    public Course(Integer id, String courseName, Integer courseCredits) {
        this.id = id;
        this.courseName = courseName;
        CourseCredits = courseCredits;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseCredits() {
        return CourseCredits;
    }

    public void setCourseCredits(Integer courseCredits) {
        CourseCredits = courseCredits;
    }
}

public class App {
    public static void main(String[] args) throws SQLException {
        Student s1 = new Student(1,"Chirayu",21);
        Student.insertNewStudent(s1);
        Student s2 = new Student(1,"Chirayu",22);
        Student.updateStudent(s2);
        Student.searchByFirstLetter("Ch");
        Student.deleteById(1);
        Student s3 = new Student(2,"Hirayu",22);
        Course c1 = new Course(1,"Maths",3);
        Student.insertIntoStudentAndCourse(s3,c1);

    }
}
