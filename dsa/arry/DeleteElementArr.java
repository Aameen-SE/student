package dsa.arry;

public class DeleteElementArr {
    public static void main(String[] args) {

        char [] arr = new char[6];
        arr[0]='A';
        arr[1]='B';
        arr[2]='J';
        arr[3]='C';
        arr[4]='D';
        arr[5]='E';

        deleteElement(arr,3);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static  void deleteElement(char[] ar, int pos){
        for(int i=pos-1;i<ar.length-1;i++){
            ar[i]=ar[i+1];
        }
        ar[ar.length-1]='0';
    }
}
