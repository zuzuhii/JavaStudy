package com.ZuzuhiCollection.Experiment;

import com.sun.org.apache.xpath.internal.operations.Minus;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {
    @Test
    public void Test1() {
        TreeSet treeSet = new TreeSet();
        Employee e1 = new Employee("liudehua", 55, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("zhangxueyou", 43, new MyDate(1987, 5, 4));
        Employee e3 = new Employee("guofucheng", 44, new MyDate(1987, 5, 9));
        Employee e4 = new Employee("liming", 51, new MyDate(1954, 8, 12));
        Employee e5 = new Employee("liangzhaowei", 21, new MyDate(1978, 12, 4));
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void Test2() {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;
                    MyDate myDate = e1.getBirthday();
                    MyDate myDate1 = e2.getBirthday();
                    int minusYear = myDate.getYear() - myDate1.getYear();
                    if (minusYear != 0) {
                        return minusYear;
                    }
                    int minusmouth = myDate.getMouth() - myDate1.getMouth();
                    if (minusmouth != 0) {
                        return minusmouth;
                    }
                    int minusday = myDate.getDay() - myDate1.getDay();
                    if (minusday != 0) {
                        return minusday;
                    }
                }throw new RuntimeException("您输入的格式不一致");
            }
        });
        Employee e1 = new Employee("liudehua", 55, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("zhangxueyou", 43, new MyDate(1987, 5, 4));
        Employee e3 = new Employee("guofucheng", 44, new MyDate(1987, 5, 9));
        Employee e4 = new Employee("liming", 51, new MyDate(1954, 8, 12));
        Employee e5 = new Employee("liangzhaowei", 21, new MyDate(1978, 12, 4));
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);
    }
}
