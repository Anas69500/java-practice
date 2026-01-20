package DSAPractice.JCFPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employees{
    int id;
    int age;
    int salary;
    String name;

    Employees(int id, int age, int salary, String name){
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.name = name;
    }
    public String toString(){
        return "Employee [ id = "+ id + ", Age = "+ age + ", Name = "+ name + ", Salary = "+ salary + " ]";
    }
}


public class ComparatorPractice {
    public static void main(String[] args){
        Comparator<Employees> em = new Comparator<Employees>() {

            public int compare(Employees o1, Employees o2) {
                return Integer.compare(o1.id, o2.id);
            }
        };

        List<Employees> ls = new ArrayList<>();
        ls.add(new Employees(1,24,30000,"Owais"));
        ls.add(new Employees(2,21,35000,"Adnan"));
        ls.add(new Employees(4,26,40000,"Sohail"));
        ls.add(new Employees(3,25,25000,"Adil"));

        Collections.sort(ls, em);

        for (Employees s: ls){
            System.out.println(s);
        }
    }
}
