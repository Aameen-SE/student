package dailypractice.july18;

public class NoOfVowelsAndConsonants {

    public static void main(String[] args) {

        String str = "Java is a Programming Language";
        str=str.replace(" ","");
        String newString = str.toLowerCase();
        int vowels =0;
        int consonants =0;
        char[] ch = newString.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                vowels++;
            }
            consonants++;
        }

        System.out.println("No of Vowels : "+vowels);
        System.out.println("No of Consonants : "+consonants);
    }
}
