package dailypractice.nov.nov20;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {

        //Remove duplicate characters from a string

        String str = "banana";

        remove(str);
    }

    public static void remove(String str){

        StringBuilder sb = new StringBuilder();

        for(char ch :str.toCharArray()){
            if(sb.indexOf(String.valueOf(ch))==-1)
                sb.append(ch);
        }
        System.out.println("After removing duplicates : "+sb.toString());
    }
}

