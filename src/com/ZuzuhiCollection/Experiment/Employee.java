package com.ZuzuhiCollection.Experiment;

public class Employee implements Comparable {
    private String name;
    private int age;
    private MyDate birthday;


    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public MyDate getBirthday() {
        return birthday;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    //按照姓名的大小排序
    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee employee = (Employee) o;
            return this.name.compareTo(employee.name);
        } else {
            throw new RuntimeException("您输入的类型不一致");
        }

    }
}
