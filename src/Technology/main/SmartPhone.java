package Technology.main;

import Technology.main.Computer;

public class SmartPhone extends Computer {
    private boolean isConnectedTo5G;
    public SmartPhone(int screenwidth, int screenheight, String manufactureYear, boolean isConnectedTo5G) {
        super(screenwidth, screenheight, manufactureYear);
        this. isConnectedTo5G = isConnectedTo5G;
    }
    public boolean getIsConnectedTo5G(){return this.isConnectedTo5G;}
    public void makeAPhoneCall(String number){
        System.out.println("Calling:" + number);

    }

}