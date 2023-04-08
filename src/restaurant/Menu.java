package restaurant;

public class Menu {
    private String description;
    private String name;
    private String category;
    private double price;
    private Boolean isNew;

    public Menu(String description, String name, String category, double price, boolean isNew) {
        this.description = description;
        this.name = name;
        this.price = price;

        this.category = "Not Categorized";
        this.isNew = false;
    }

    public Menu(String description, String name, String category, double price, Boolean isNew) {
        this.description = description;
        this.name = name;
        this.price = price;
        this.category = "Not Categorized";
        this.isNew = false;
    }

    public Menu() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getIsNew() {
        return this.isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    @Override
    public String toString() {
        String returnString = "";

        returnString += "Item Name:" + this.name + "\n";
        returnString += "Item Description:" + this.description + "\n";
        returnString += "Item Price:" + this.price + "\n";
        returnString += "Item Category:" + this.category + "\n";
        returnString += "Item IsNew:" + this.isNew + "\n";

        return returnString;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Menu)) {
            return false;
        }
        Menu menu = (Menu) obj;
        if (menu.name.equals(this.name)
                && menu.description.equals(this.description)
               // && menu.price.equals(this.price)
                && menu.category.equals(this.category))
            return true;

        else return false;


    }

    public void addMenu(Menu menu1) {
    }
}




