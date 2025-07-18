package dailypractice.july18;

public class CountCharaExceptSpace {

    public static void main(String[] args) {

        String str = "Hey There ";
        str=str.replace(" ","");
        int count=0;
        char[] cha = str.toCharArray();
        for(int i=0;i<cha.length;i++){
            count++;
        }
        System.out.println("Number of character : "+count);

    }
}
