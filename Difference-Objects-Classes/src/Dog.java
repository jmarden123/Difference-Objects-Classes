public class Dog {
    private final String name;
    private final String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark() {
        System.out.println(name + " says: Woof!");
    }

    public void showInfo() {
        System.out.println("Dog{name='" + name + "', breed='" + breed + "', age=" + age + "}");
    }

    public void haveBirthday() {
        age++;
    }
}
