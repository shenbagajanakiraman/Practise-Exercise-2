package com.stackroute.pe2;

class Member {
    String name;
    int age;
    double salary;

    //Getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

}



public class MemberVariable extends Member{

            public static void main(String[] args) {

            Member details = new Member();

                details.setName("Mr.Someone");
                details.setAge(25);
                details.setSalary(5000000);

                System.out.println(details.getName());
                System.out.println(details.getAge());
                System.out.println(details.getSalary());

        }


    }





