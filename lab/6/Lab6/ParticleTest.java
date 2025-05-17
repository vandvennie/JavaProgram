public class ParticleTest extends SimpleUnitTest {
    public void runAllTests() {
        Particle a = new ParticleA();
        Particle b = new ParticleB();
        Particle c = new ParticleC();
        Particle d = new ParticleD();

        assertTrue(a.collide(a) instanceof ParticleA);
        assertTrue(a.collide(b) instanceof ParticleA);
        assertTrue(a.collide(c) instanceof ParticleB);
        assertTrue(a.collide(d) instanceof ParticleB);

        assertTrue(b.collide(a) instanceof ParticleA);
        assertTrue(b.collide(b) instanceof ParticleA);
        assertTrue(b.collide(c) instanceof ParticleC);
        assertTrue(b.collide(d) instanceof ParticleC);

        assertTrue(c.collide(a) instanceof ParticleC);
        assertTrue(c.collide(b) instanceof ParticleD);
        assertTrue(c.collide(c) instanceof ParticleD);
        assertTrue(c.collide(d) instanceof ParticleD);

        assertTrue(d.collide(a) instanceof ParticleA);
        assertTrue(d.collide(b) instanceof ParticleA);
        assertTrue(d.collide(c) instanceof ParticleC);
        assertTrue(d.collide(d) instanceof ParticleC);
    }
}