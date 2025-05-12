package jva.may12;
class Test {
    public static void subNum(int a, int b){
        System.out.println(b-a);
    }
}
public class OverRidingTest extends Test {
    public static void main(String[] args) {
        // different class , same methodName, same argument , IS-A relationship
        subNum(12,34);
    }
    public static void subNum(int a, int b){
        System.out.println(b-a);
    }
}
