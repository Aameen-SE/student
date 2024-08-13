package corejava.aug12;

public class RemoveIntegerString {
    public static void main(String[] args) {
        //Wap to remove all integers from a String
            String str ="123Aameen456Hussain789";
        System.out.println("Original String :"+str);
            char[] charArray=str.toCharArray();
            String result="";

            for(int i=0;i<charArray.length;i++){
                if(!Character.isDigit(charArray[i]))
                {
                    result=result+charArray[i];
                }
            }
        System.out.println("Result of the string after removing integer :"+result);
    }
}
