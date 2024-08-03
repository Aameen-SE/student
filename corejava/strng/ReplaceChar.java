package corejava.strng;



public class ReplaceChar {
    public static void main(String[] args) {
      String str="Aaheen";
      char ch='m';
      int index=2 ;

      str=str.substring(0, index)+ ch + str.substring(index + 1);
        System.out.println("Modified String :"+str);
        System.out.println("");
        System.out.println("Replace method is called");
        repChar();
    }
    public static void repChar() {
        String str = "Aameen Kussain";
        System.out.println("Original String : " + str);
        String str2 = str.replace("K", "H");
        System.out.println("Modified String  : " + str2);
    }
}



