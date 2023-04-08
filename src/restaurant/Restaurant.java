package restaurant;
public class Restaurant {
        public static void main(String[] args) {
                Menu menu1 = new Menu("Salad", "Greens", "Healthy", 7.50, true);
                Menu menu2 = new Menu("Salad", "Greens", "Healthy", 7.50, true);
                Menu menu3 = new Menu("Cake", "Dessert", "UnHealthy", 5.50, true);

                Menu mymenu = new Menu();
                mymenu.addMenu(menu1);
                mymenu.addMenu(menu2);


                System.out.println(menu1.toString());
                System.out.println(menu2.toString());



        }
}


