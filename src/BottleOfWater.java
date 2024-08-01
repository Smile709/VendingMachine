public class BottleOfWater extends Product{
    private double volume;

    public BottleOfWater(String name, int price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String toString(){
        return "BottleOfWater{" + "name='" + super.getName() +'\'' +
                ", cost=" + super.getPrice() +
                "volume=" + volume+'}';
    }
}