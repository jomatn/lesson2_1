public class Main {
    public static void main(String[] args) {
        String[] commands = {"sit", "lay"};
        Shelter shelter = new Shelter("foggy","lenina 1");
        Dog dog = new Dog("rex","bulldog", ColorEnum.BLACK,
                commands, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("woof");


        Shelter shelter1 = new Shelter("forry","lenina 88");
        Dog dog1 = new Dog("lexi","bulldog", ColorEnum.GREY, shelter1);
        System.out.println(dog1.getInfo());
        dog.makeVoice();
        dog.makeVoice(" woof woof");

        String[] commands2 = {"sit", "lay", "paw", "dead"};
        Shelter shelter2 = new Shelter("Happy shelter","Mainhattan  1/33");
        Dog dog2 = new Dog("Biscuit","Corgy", ColorEnum.WHITE, commands2, shelter2);
        System.out.println(dog2.getInfo());
        dog.makeVoice();
        dog.makeVoice("ав ав");



    }
}