package Technology.main;

public class Program {
    public static void main(String[] args){
        SmartPhone mySmartPhone = new SmartPhone(500,1500, "2021", true );
        //mySmartPhone.makeAPhoneCall("618-555-8123");
        //int result = mySmartPhone.processTwoPlusTwo();
        //System.out.println("The result is:" + result);
        System.out.println(mySmartPhone.getId());

        Laptop mylaptop = new Laptop(1500, 2500, "2021");
        //mylaptop.openIntellJ();
        //int lapTopResult = mylaptop.processTwoPlusTwo();
        System.out.println(mylaptop.getId());

        Computer myComputer = new Computer (3000, 3000, "2021");
        //int ComputerResult = myComputer.processTwoPlusTwo();
        //System.out.println("Computer result is: " + ComputerResult);
        System.out.println(myComputer.getId());

    }
}
