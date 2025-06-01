package com.nisum;

import com.nisum.util.DBconnection;
import java.sql.Connection;
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
            String query = String.format("INSERT INTO students VALUES (%d, '%s', %d)" , s1.getId(),s1.getName(),s1.getAge());
            Statement stm = con.createStatement();
            stm.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Connection was Unsuccessfull");
        }
    }


}



public class App {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Chirayu",21);
        Student.insertNewStudent(s1);

    }
}
