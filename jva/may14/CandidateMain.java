package jva.may14;
class Stream {
    public void printStream(){
        System.out.println("Stream : Science");
    }
}
public class CandidateMain extends Stream{
    public static void main(String[] args) {
        Candidate candidate = new Candidate();
        candidate.setName("Aameen");
        candidate.setRollNo(123);
        candidate.setEmail("aameen@gmail.com");

        Stream stream =new Stream();
        stream.printStream();

        candidate.display();


    }
}
