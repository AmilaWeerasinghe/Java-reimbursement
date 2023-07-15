
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

    //setter indirectly update the private variables
    void setPid (int pid) {
        this.pid = pid;//LHS belongs to the object RHS to this function
    }

    // getter
    int getPid () {
        return pid;
    }

        void showProductDetails (){
            System.out.println("pid..."+pid);
             System.out.println("name...."+name);
              System.out.println("price..."+price);
        }
}

  //Inheritance IS-A relationship
        class Mobile extends Product {

            //additional details
            String os;
            int ram;
            int sdCardSize;



            Mobile () {
                System.out.println("Mobile is constructed");
            }

             void setProductDetails (int pid, String name, int price, String os,int ram, int sdCardSize) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.os = os;
        this.ram= ram;
        this.sdCardSize = sdCardSize;

    }

    void showProductDetails (){
            System.out.println("pid..."+pid);
             System.out.println("name...."+name);
              System.out.println("price..."+price);

              System.out.println("os..."+os);
              System.out.println("sdCardSize..."+sdCardSize);
              System.out.println("ram..."+ram);
              
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
        // product2.pid = 120; // private

        product2.name = "iphone11";
        product2.price = 100000;

        product2.showProductDetails();

        Mobile mobile = new Mobile();

        // mobile.setProductDetails(20, "iphone12", 12340);

        mobile.setProductDetails(110, "iphone12", 45640, "mac", 50, 10);
        mobile.showProductDetails();

    }
}