package training;

public class LogicalOperator {
    public static void main(String[] args) {



        /* wap to cvheck between two number
      //  if(num1<=num2){
            System.out.println("num1 : "+num1);
        }
        else {
            System.out.println("num2 : "+num2);
        }*/

        int num1 = 32;
        int num2 = 42;
        int num3 =78;

        if(num1!=num2){
            System.out.println("num1  is not equal to num2");
        }
        else {
            System.out.println("num1 is equal to num2");
        }


        // SYNTAX IF ELSE
        if(num1<num2 || num1<num3){
            System.out.println("num1 : "+num1);
        }
        else if(num2<num1||num2<num3){
            System.out.println("num2 : "+num2);
        }
        else {
            System.out.println("num3 : "+num3);

        }


        // SYNTAX OF IF ELSE

        //if (num1<num2){
        //
        // sout("num1 is lessser than num2 ")}
        // else{
        // sout("num2 is lesser than num1 ")
        // }

        // Logical Opearator
        // ! = NOT
        // NUM1 != NUM2;

        // NUM1 !=NUM2;
        // FALSE


        //OR = ||
        // TRUE - FALSE = TRUE
        // FALSE - TRUE = TRUE
        // TRUE - TRUE = TRUE
        // FALSE - FALSE = FALSE
        // NUM<NUM2 || NUM<NUM3{
        // SOUT " NUM IS LEESSER THAN }
        //

        //AND && :- NUM1<NUM2 && NUM1<NUM2
        //{ SOUT -> NUM1 IS LESSER THAN }
        // TRUE - FALSE = FALSE
        // FALSE - TRUE = FALSE
        // TRUE - TRUE = TRUE
        // FALSE - FALSE = FALSE
    }
}
