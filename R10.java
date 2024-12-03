
package newpackage;

public class R10 {
    private String name;
    private int petals;
    private float price;

    
    public R10(String name, int petals, float price) {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for petals
    public int getPetals() {
        return petals;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    // Getter and Setter for price
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    
    public static void main(String[] args) {
        R10 rose = new R10("Rose", 32, 15.5f);
        System.out.println("Flower: " + rose.getName());
        System.out.println("Petals: " + rose.getPetals());
        System.out.println("Price: " + rose.getPrice());

        rose.setName("Tulip");
        rose.setPetals(24);
        rose.setPrice(10.0f);
        System.out.println("Updated Flower: " + rose.getName());
    }
}

