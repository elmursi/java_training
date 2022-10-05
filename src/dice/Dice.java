package dice;

public class Dice {
    private String type;
    private int sides;
    private int[] rollFrequency;
    Person owner;

    public Dice() {};

    public Dice(String type, int sides) {
        this.type = type;
        this.sides = sides;
    }

    public void roll(int times) {
        System.out.printf("Dice is rolling %d times", times);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSides()
    {
        return this.sides;
    }

    public void setSides(int sides)
    {
        this.sides = sides;
    }
}
