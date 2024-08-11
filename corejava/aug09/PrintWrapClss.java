package corejava.aug09;

public class PrintWrapClss {
    public static void main(String[] args) {

        Integer integer= new Integer(12);
        Integer integer1 = Integer.valueOf(12);
        Integer int2 = new Integer("12");
       Character ch1 = new Character('A');
       Float fl1 = new Float(12.4f);
       Float fl2 = new Float(12.4);
       Float fl3 = new Float("1234");

        System.out.println("Integer :"+integer+" ; integer1 :"+integer1+" ; int2 :"+int2+" ; ch1 :"+ch1+
                "; fl1 :"+fl1+" ; fl2 :"+fl2+" ; fl3 :"+fl3);

        // Auto Boxing in wrapper class and constant : max value min value sixe 
        Integer svn = Integer.valueOf(7);
        Integer seven =7;
        Integer seven2=7;
        System.out.println("Auto Boxing in Wrapper Class "+ (seven==seven2));

    }
}
