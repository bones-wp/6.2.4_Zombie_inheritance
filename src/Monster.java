abstract public class Monster extends Entity {

    public Monster (String name, int force) {
        super.name = name;
        super.force = force;
        System.out.println("Monster " + name + " was created");
    }

}