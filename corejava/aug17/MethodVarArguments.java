package corejava.aug17;

public class MethodVarArguments {
    public static void main(String[] args) {

    }
    public int sum(int ... values){
        int sum=0;
        for(int value:values){
            sum=sum+value;
        }
        return sum;
    }
}
