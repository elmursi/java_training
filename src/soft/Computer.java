package soft;

public class Computer
{
    private String model;
    private String manufacturer;
    private int ram;
    private int hdd;
    private double price;
    private int year;
    private double discount;


    public Computer() {};

    public Computer(String model, String manufacturer, int ram, int hdd, double price, int year, double discount) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ram = ram;
        this.hdd = hdd;
        this.price = price;
        this.year = year;
        this.discount = discount;
    }


    public void turrOn() {
        System.out.println("Computer is turned on");
    }

    public void turnOff() {
        System.out.println("Computer is turned off");
    }


    public String getSpecifications() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", price=" + price +
                ", year=" + year +
                ", discount=" + discount +
                '}';
    }
}