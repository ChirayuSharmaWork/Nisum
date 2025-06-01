package com.nisum;

import com.nisum.util.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


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


}



public class App {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Chirayu",21);
        Student.insertNewStudent(s1);
        Student s2 = new Student(1,"Chirayu",22);
        Student.updateStudent(s2);
        Student.deleteById(1);
    }
}
