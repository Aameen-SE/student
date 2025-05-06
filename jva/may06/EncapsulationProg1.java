package jva.may06;
class Encapsu{
    private int num;
    private String name;
    Encapsu(int num , String name){
        this.num=num;
        this.name=name;
    }
    public void setNum(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }

    public void setNAME(){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return "Num : " +getNum()+ " Name : "+getName();
    }
}
public class EncapsulationProg1 {
    public static void main(String[] args) {
        Encapsu encap = new Encapsu(12,"Aameen");
        System.out.println(encap.toString());
    }
}
