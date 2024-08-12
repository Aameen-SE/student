package corejava.aug12;

public class RemoveGivenString {
    public static void main(String[] args) {
        //Wap to remove start from a String
        String str = "This is a start string";
        System.out.println("Original String :"+str);
        System.out.println("Removing Start from String : "+str.replace("start",""));
    }
}
