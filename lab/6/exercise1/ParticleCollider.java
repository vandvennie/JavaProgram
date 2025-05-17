
public class ParticleCollider {
  public static Particle runCollisions(Particle start, Particle[] collisions) {
    Particle current = start;
    for (int i = 0; i < collisions.length; i++) {
        System.out.println("Colliding " + current + " with " + collisions[i]);
        current = current.collide(collisions[i]);
    }
    return current;
}

public static void main(String[] args) {
    Particle[] collisions = {new ParticleC(), new ParticleD(), new ParticleA(), new ParticleB()};
    Particle start = new ParticleA();
    Particle result = runCollisions(start, collisions);
    System.out.println(result);
}
}
