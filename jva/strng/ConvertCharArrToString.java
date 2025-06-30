package jva.strng;

public class ConvertCharArrToString {
    public static void main(String[] args) {
        //Wap to convert char array to String
        char[] ch ={'A','A','M','E','E','N'};
        String word = new String(ch);
        System.out.println(word);

        // another way using stringbuilder

        StringBuilder sb = new StringBuilder();
        for(char c:ch){
            sb.append(c);
        }
        String result = sb.toString();
        System.out.println("Result using string builder : "+result);


    }
}
