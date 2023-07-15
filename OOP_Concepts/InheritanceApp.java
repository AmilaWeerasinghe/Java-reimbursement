
class Product {
    // attrtibute
    int pid;
    String name;
    int price;


    //constructor

    Product() {
        System.out.println("Product beign constructed");
    }

    // methods
    void setProductDetails (int pid, String name, int price) {
        this.pid = pid;
        this.name = name;
        this.price = price;

    }

        void showProductDetails (){
            System.out.println("pid..."+pid);
             System.out.println("name...."+name);
              System.out.println("price..."+price);
        }
}

public class InheritanceApp {
    public static void main (String args []) {
        // create an object
        Product product = new Product();
        // refernce to hold the hashcode of the object in hexadecimal notation

        // set data for object
        product.setProductDetails(10, "LEDTV", 110);

        //show product details
        product.showProductDetails();


        // write data directly
        Product product2 = new Product();
        product2.pid = 120;
        product2.name = "iphone11";
        product2.price = 100000;

        product2.showProductDetails();

    }
}