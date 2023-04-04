package section8;

public class EncapsulationPartOne {
    public static void main(String[] args) {
//
//        Player player = new Player();
//        player.name = "Anders";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer anders = new EnhancedPlayer("Anders", 200,"Sword");
        System.out.println("Initial health is " + anders.healthRemaining());


    }
}
