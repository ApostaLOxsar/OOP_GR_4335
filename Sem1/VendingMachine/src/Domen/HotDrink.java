package Domen;

public class HotDrink extends Bottle{

    private int temperature;
    public HotDrink(int productId, String productName, String productCategory, double price, int volume, int temperature) throws Exception {
        super(productId, productName, productCategory, price, volume);
        if (temperature > 20){
            this.temperature = temperature;
        }
        else {
            throw new IllegalStateException(String.format("Напиток не горячий!", temperature));
        }
    }

    public void setTemperature(int temperature){
        if (temperature > 20){
            this.temperature = temperature;
        }
        else {
            throw new IllegalStateException(String.format("Напиток не горячий!", temperature));
        }
    }

    public int getTemperature(int temperature){
        return temperature;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getProductName() +
                "\tcategory='" + super.getProductCategory() +
                "\tcost=" + super.getPrice() +
                "\tvolume=" + super.getVolume() +
                "\ttemperature=" + temperature +
                '}';
    }
}
