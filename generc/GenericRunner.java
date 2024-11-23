package generc;

public class GenericRunner {
    public static void main(String[] args) {
        MyCustomList<String> list= new MyCustomList<>();
        list.addElement("Element 1");
        String value = list.get(0);
        System.out.println(value);

        MyCustomList<Integer> list1= new MyCustomList<>();

        list1.addElement(Integer.valueOf(25));
        list1.addElement(Integer.valueOf(2));
        Integer num = list1.get(0);
        System.out.println(num);
    }
}
