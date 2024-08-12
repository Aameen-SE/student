package corejava.aug12;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        //Wap to remove all special characters from String (Note: accept alphabets lower case or upper case, all other characters are special
        //		characters).

        String str =" ? This ! is  * a! S***tring ";

        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(i)<'A'||str.charAt(i)>'Z'&&str.charAt(i)<'a'||str.charAt(i)>'z')
            {
                str = str.substring(0, i) + str.substring(i + 1);
                i--;
            }
        }
        System.out.println(str);
    }
}
