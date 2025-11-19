package dailypractice.nov.nov19;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("banana"));
    }

    public static String removeDuplicates(String str){
        StringBuilder sb = new StringBuilder();

        for (char c:str.toCharArray()){
            if(sb.indexOf(String.valueOf(c))==-1)
                sb.append(c);
        }
        return sb.toString();
    }
}
