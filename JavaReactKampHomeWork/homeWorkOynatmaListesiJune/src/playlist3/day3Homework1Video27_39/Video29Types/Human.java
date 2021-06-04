package playlist3.day3Homework1Video27_39.Video29Types;

public class Human {
    static final int LIFESPAN = 100;
    private String name;
    private int age;
    private float height;
    private Gender gender;
    public Human(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Human(String name, int age, float height, Gender gender) {
        this(name, age, gender);
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public void computeAndPrintTtl(){
        int ttl = LIFESPAN - this.age;
        System.out.println("Time to live: " + ttl);
    }
    public int getTimeToLive(){
        int ttl = LIFESPAN - this.age;
        return ttl;
    }
}
