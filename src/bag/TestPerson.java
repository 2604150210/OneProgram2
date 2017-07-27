package bag;

/**
 * Created by c on 2017/7/23.
 */
public class TestPerson {

    public static void main(String[] args) {

        Person jack = new Person();
        jack.setAge(23);
        jack.setName("jal");
        int i = jack.getAge();
        System.out.println(jack.getName() + "'s age is : " + i);
    }
}
