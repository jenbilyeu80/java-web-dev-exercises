package restaurant;



import java.util.ArrayList;
import java.util.Date;

public class MenuB {
    private ArrayList<Menu> menu= new ArrayList<>();
    private Date lastUpdated;

    public MenuB (){
        this.lastUpdated = new Date();

    }
    public ArrayList<Menu> getMenus() {return this.menu;}
    public void setMenus(ArrayList<Menu> menus){this.menu = menus;}

    public Date getLastUpdated() {return this.lastUpdated;}
    public void setLastUpdated(Date lastUpdated){this.lastUpdated = lastUpdated;}

    public void addMenu(Menu item){
        this.menu.add(item);
        this.lastUpdated = new Date();
    }
    public void removeMenuItem(Menu item){
        this. menu.remove(item);
        this.lastUpdated=new Date();
    }

    @Override
    public String toString() {
        String returnString = "";
        for(Menu item : this.menu){
            returnString += item.toString() + "\n\n";
        }
return returnString;
    }
}
