package DSAPractice.JCFPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {
    int id;
    String name;

    Students(){
        id = 0;
        name = null;
    }

    Students(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "Students [ id = " + id + ", Name = "+ name + " ]";
    }


    public int compareTo(Students that) {
        return that.id - this.id;
    }

}

public class ComparablePractice {
    public static void main(String[] args){
        List<Students> ls = new ArrayList<>();
        ls.add(new Students(2,"Anas"));
        ls.add(new Students(7,"Anas"));
        ls.add(new Students(3,"Anas"));
        ls.add(new Students());
        ls.add(new Students());
        ls.add(new Students());

        Collections.sort(ls);

        for(Students s : ls){
            System.out.println(s);
        }
    }
}
