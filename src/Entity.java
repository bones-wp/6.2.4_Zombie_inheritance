abstract public class Entity {
    String name;
    int force;
    int hp = 15;
    boolean destroyed = false;

    public Entity(String name) {
        this.name = name;
        System.out.println("Entity " + name + " was created");
    }

    protected Entity() {
    }

    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }
        return false;
    }

    public boolean isDestroyed(){
        return destroyed;
    }

    protected int getForce(){
        return force;
    }
}
