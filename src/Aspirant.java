/**
 * Created by uitschool JV on 14.05.2017.
 */
public class Aspirant extends Student {
    String nameWork;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    public void say() {
        System.out.println("Меня зовут " + getName() + ".Мне " + getAge() + "vлет");
    }

    public void say1() {
        System.out.println("Научная работа " + getNameWork());
    }

    public String getNameWork() {
        return nameWork;
    }

    void setNameWork(String nameWork) {
        this.nameWork = nameWork;
    }

}
