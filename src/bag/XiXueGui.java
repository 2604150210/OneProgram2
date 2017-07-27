package bag;
import java.util.*;
/**
 * Created by c on 2017/7/15.
 */
class Rock{
    int i = 0;
    Rock increase(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i = " + i);
    }
}
public class XiXueGui {
    public static void main(String[] args) {
        Rock rock = new Rock();
        rock.increase();
        rock.increase();
        rock.increase();
        rock.print();
    }
}
