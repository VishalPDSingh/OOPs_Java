package ch_RelationShip.IS_A_RealtionShip;

public class Demo2Strudent {
    public static void main(String[] args) {
        Ram r1 = new Ram();
        r1.college();
        r1.study();
    }
}

class Student {
    void study() {
        System.out.println("Student is studing so hard: ");
    }
}

class Ram extends Student {
    void college() {
        System.out.println("Ram is going to college");
    }
}