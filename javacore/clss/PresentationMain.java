package javacore.clss;

public class PresentationMain {
    public static void main(String[] args) {
        Presentation presentation = new Presentation();

        presentation.setPresentationId(234);
        presentation.setBookedCompanyId(45);
        presentation.setBookedRoomId(278);

        System.out.println("PresentationId : "+presentation.getPresentationId()+" BookedCompanyId : "+presentation.getBookedCompanyId()+" " +
                " BookedRoomId : "+presentation.getBookedRoomId());
    }
}
