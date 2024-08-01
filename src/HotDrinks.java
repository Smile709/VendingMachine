public class HotDrinks extends BottleOfWater{
    private int temperature;

    public HotDrinks(String name, int price, double volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    public String toString(){
        return "HotDrink{" + "name='" + super.getName() +'\'' +
                ", cost=" + super.getPrice() +'\''+
                ", volume=" + super.getVolume() +'\''+ ", temperature=" + temperature + '}';
    }
}