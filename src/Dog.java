import java.util.Arrays;

public final class Dog extends Pet{
    private String name;
    private String breed;
    private String [] commands;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public Dog(String rex, String bulldog, String[] commands, ColorEnum black) {
    }

    public Dog(String name, String bulldog, ColorEnum black) {
        this.name = name;
    }
    public Dog(String name, String breed, ColorEnum colorEnum,
               String[] commands, Shelter shelter ) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColorEnum(colorEnum);
        super.setShelter(shelter);

    }
    public Dog(String name, String breed,
               ColorEnum colorEnum, Shelter shelter ) {
        this.name = name;
        this.breed = breed;
        super.setColorEnum(colorEnum);
        super.setShelter(shelter);

    }
    public void makeVoice(){
        System.out.println("dog making a voice");
    }
    public void makeVoice(String voice){
        System.out.println("dog making a voice"+ voice) ;
    }
}
