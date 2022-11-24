package ss4_Lop_Fan;

import ss5_Access_modifier.TestCircle;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,10,true,"yellow");
        Fan fan2 = new Fan(2,5,false,"blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }

}
