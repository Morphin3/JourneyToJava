package com.taoism.journeytojava.chapter4;

import java.util.Random;

/**
 * Created by Morphin3 on 1/19/15.
 */
public class ConstructorTest4_5 {
    public static void main(String[] args){
        Employee[] staff=new Employee[3];
        staff[0]=new Employee("Harry",40000);
        staff[1]=new Employee(60000);
        staff[2]=new Employee();

        for(Employee e:staff){
            System.out.println("name"+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }
    }

}

class Employee{
    private static int nextId;

    private int id;
    private String name ="";   //instance field initialization
    private double salary;

    //static initialization block

    static{
        Random generator = new Random();
        //set nextId to a random number between 0 and 9999
        nextId=generator.nextInt(10000);
    }

    //object initialization block
    {
        id=nextId;
        nextId++;
    }


    //three overload constructors

    public Employee(String n,double s){
        name=n;
        salary=s;
    }


    public Employee(double s){
        //calls the Employee(String,double) constructor
        this("Employee #"+nextId,s);
    }

    // the default constructor

    public Employee(){

    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
