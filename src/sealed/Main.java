package sealed;

public class Main {
    public static void main(String[] args) {
        Character killer= new MrKiller();
        System.out.println(killer.hasPositiveVibes());

        Character claw= new WhiteClaw();
        System.out.println(claw.hasPositiveVibes());
    }
}
