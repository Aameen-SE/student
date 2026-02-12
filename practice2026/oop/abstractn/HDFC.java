package practice2026.oop.abstractn;

public class HDFC extends Bank{
    @Override
    int getInterestRate() {
        return 8;
    }

    public static void main(String[] args) {
        Bank hdfc = new HDFC();
        Bank sbi = new SBI();
        System.out.println(hdfc.getInterestRate());
        System.out.println(sbi.getInterestRate());
    }
}
