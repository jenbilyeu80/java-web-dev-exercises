package Technology.main;

import Technology.main.Computer;

public class Laptop extends Computer {
    private boolean isIntelliJOpened;

    public Laptop(int screenwidth, int screenheight, String manufactureYear) {
        super(screenwidth, screenheight, manufactureYear);
        this.isIntelliJOpened = false;
    }

    public Laptop(int screenwidth, int screenheight, String manufactureYear, boolean isIntelliJOpened) {
        super(screenwidth, screenheight, manufactureYear);
        this.isIntelliJOpened = false;
        this.isIntelliJOpened = isIntelliJOpened;
    }
    public boolean getIntellijOpened(){ return this.isIntelliJOpened;}

    public void setIntelliJOpened(boolean intelliJOpened) {
        isIntelliJOpened = intelliJOpened;
    }

    public void openIntellJ(){
        this.isIntelliJOpened = true;
        System.out.println("IntelliJ is opened!");
    }
}