package objct.comparable;
//Create a Magazine class with fields title and issueNumber. Sort magazines by issue number ascending.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Magazine implements Comparable<Magazine>{
    private String title;
    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        this.title = title;
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return  "title=" + title +  ", issueNumber=" + issueNumber ;
    }


    @Override
    public int compareTo(Magazine o) {
        return this.issueNumber-o.issueNumber;
    }
}
public class MagazineMain {

    public static void main(String[] args) {

        List<Magazine> magazines = new ArrayList<>();

        magazines.add(new Magazine("Today",123));
        magazines.add(new Magazine("Times India",453));

        Collections.sort(magazines);

        for(Magazine m: magazines){
            System.out.println(m);
        }
    }
}
