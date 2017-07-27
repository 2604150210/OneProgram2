package bag;

/**
 * Created by c on 2017/7/23.
 */
public class Person {
    private int age;
    String name ;

    public Person(int newAge){
        age = newAge;
    }

    public Person (){};
    int getAge() {

        return age;
    }
    void setAge(int i) {
        if(i>=0 && i<=120)
            age = i;
    }
    void setName(String na){
        name = na;
    }

    String getName() {
        return name;
    }
}
