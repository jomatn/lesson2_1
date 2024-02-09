import java.util.Random;

public class Pet  {
    private int age = generateDefaultAge();
    private Shelter shelter;
    private ColorEnum colorEnum;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public void setColorEnum(ColorEnum colorEnum) {
        this.colorEnum = colorEnum;
    }
    private  int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(31)+1;

    }
    public final String getInfo(){
        return "Age: " + age +
                "\nColor: " + colorEnum+
                "\nShelter name: " +(shelter != null ? shelter.getName() : "N/A") +
                "\nShelter address: " + (shelter != null ? shelter.getAddress() : "N/A");
    }
}
