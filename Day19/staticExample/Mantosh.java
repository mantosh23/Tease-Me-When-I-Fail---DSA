package Day19.staticExample;

public class Mantosh {
    public static void main(String[] args) {
        Human mantosh = new Human(21, "Mantosh Kumar", 1000000000, false);
        Human rahul = new Human(21, "Rahul Kumar", 100000, false);
        System.out.println(Human.population);
        System.out.println(mantosh);
    }
}
