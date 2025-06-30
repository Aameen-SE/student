package jva.strng;

public class StringIntroProg {
    public static void main(String[] args) {
        String name = "Aameen";
        String name1 = new String("Aameen");

        // comparing using equal operator :-
        if(name==name1){
            System.out.println("Equal ");
        }else
            System.out.println("Not equal using equal operator ");

        // comparing using equal() method

        if(name.equals(name1)){
            System.out.println("Equal using equal method ");
        }else
            System.out.println("Not equal :");
    }

}
