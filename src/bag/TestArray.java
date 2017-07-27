package bag;


/**
 * Created by c on 2017/7/23.
 */
class Mydate{
    private int year = 17, month = 2, day = 2007;

    public Mydate(int y, int m, int d){
        year = y;
        month = m;
        day = d;
    }

    public Mydate(){

    }

    public void setMonth(int m){
        month = m;
    }

    public void setDay(int d){
        day = d;
    }

    public void setYear(int y){
        year = y;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay() {
        return day;
    }

    public void display(){
        System.out.println("year : " + year + "   month : " + month + "  day : " + day);
    }

}
public class TestArray {

    public static void main(String[] args) {

        Mydate[] m;
        m = new Mydate[5];
        for(int i = 0; i < 5; i++){
            m[i] = new Mydate(i+1, i+1, 1999+i);
            m[i].display();
        }
    }
}
