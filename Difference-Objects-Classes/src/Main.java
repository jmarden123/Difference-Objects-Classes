public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "Husky", 3);
        Dog dog2 = new Dog("Bella", "Labrador", 5);

        dog1.showInfo();
        dog2.showInfo();
        dog1.bark();
        dog2.bark();

        dog1.haveBirthday();
        dog1.showInfo();
        dog2.showInfo();
    }
}