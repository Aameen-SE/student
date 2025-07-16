package dailypractice.july16;
//Create an interface OS with method spec().
//
//Create classes Windows, MacOS, and Linux implementing OS.
//
//Create a OSFactory with method getOS(String osType) to return proper OS object.
//
//In main, create different OS objects and call spec() to print a message like "Windows OS", "Mac OS", etc.

interface Os{
    void spec();
}

class Windows implements Os{

    @Override
    public void spec() {
        System.out.println("Windows Operating System");
    }
}

class MacOS implements Os{

    @Override
    public void spec() {
        System.out.println("MacOS Operating System");
    }
}

class Linux implements Os{

    @Override
    public void spec() {
        System.out.println("Linux Operating System");
    }
}

class OsFactory{

    public Os getOS(String type){

        if(type==null){
            return null;
        }

        switch (type){
            case "Windows":
                return new Windows();

            case "Linux":
                return new Linux();

            case "MacOS":
                return new MacOS();
            default :
                return null;
        }
    }
}

public class OperatingSystemMain {

    public static void main(String[] args) {

        OsFactory osFactory = new OsFactory();
        Os os = osFactory.getOS("Windows");
        os.spec();
    }
}
