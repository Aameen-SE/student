package Project.emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private String alternateEmail;
    private int mailBoxCapacity = 500;
    private String companySuffix = "aeycompany.com";

    // constructor to recieve the firstname and last name
    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        //  System.out.println("Email Created : "+this.firstName+" "+this.lastName);

        // creating method to call the department and ask
        this.department=setDepartment();
        //   System.out.println("Department : "+this.department);

        // call a method that returns a random password
        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your Password : "+this.password);


        // combine element to generate email
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        //    System.out.println("Your Email is : "+email);
    }
    // Ask the department
    private String setDepartment(){
        System.out.print("\nEnter the department code : \n1 for the Sales \n2 for the Development " +
                "\n3 For the ACcounting \n4 for none \n");
        Scanner in = new Scanner(System.in);
        int depChoice=  in.nextInt();
        if(depChoice==1){ return "sales";}
        else if (depChoice==2) { return "development";}
        else if (depChoice==3) { return "Accounting";}
        else { return  "" ;}
    }
    // generate the random password

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXY0123456789!@#$%&";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
            int ran=   (int)  (Math.random() *passwordSet.length());
            password[i]=passwordSet.charAt(ran);
        }
        return new String (password);
    }

    //set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity=capacity;
    }
    // set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }
    // change the password

    public void changePassword(String password){
        this.password=password;
    }

    public int getMailBoxCapacity(){ return mailBoxCapacity; }
    public String getAlternateEmail(){ return alternateEmail; }
    public String getPassword(){ return password; }

    public String showInfo(){
        return "Display Name : "+firstName +" "+lastName+
                "\nCompany Email : "+email +
                "\nMailBox Capacity : "+ mailBoxCapacity + "mb";
    }
}
