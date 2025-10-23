package dailypractice.oct.oct21.String;

public class CountVowelConsonant {

    public static void main(String[] args) {

        int vowels =0;
        int consonant =0;

        String str = "Aameen Hussain";

        str=str.toLowerCase();

        for(int i=0;i<str.length();i++){

            char c= str.charAt(i);

            if(c>='a' &&c <='z'){
                if(c == 'a' || c =='e' ||c=='i'||c=='o'||c=='u'){
                    vowels++;
                }else
                    consonant++;

            }
        }


        System.out.println("No of vowels in String :"+vowels);
        System.out.println("No of consonant in String :"+consonant);
    }
}
