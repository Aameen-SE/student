package dailypractice.nov.nov19;

public class RecursionPrint {
    public static void main(String[] args) {

        int num =1;
        //3️⃣ Without using loops, print numbers from 1 to 100 (use recursion).
        recursPrint(num);
    }
    public static void recursPrint(int num){
        if(num>100){
            return;
        }
        System.out.println(num);
        recursPrint(num+1);

    }
}
