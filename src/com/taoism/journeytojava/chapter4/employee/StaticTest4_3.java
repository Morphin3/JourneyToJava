package com.taoism.journeytojava.chapter4.employee;

/**
 * Created by Morphin3 on 1/9/15.
 */
public class StaticTest4_3 {

    public static void main(String[] args){
        Employee[] staff=new Employee[3];
        staff[0]=new Employee("陶喆",10000);
        staff[1]=new Employee("王力宏",70000);
        staff[2]=new Employee("周杰伦",30000);

        for(Employee e:staff){
            e.setId();
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }

        int n=Employee.getNextId();
        System.out.println("Next available id = "+n);
    }
}



class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id=0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args){
        Employee e= new Employee("Harry", 50000);
        System.out.println(e.getName()+" "+e.getSalary());
    }


}