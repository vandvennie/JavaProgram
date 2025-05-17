
class ParticleB extends Xapper {
    public Particle collide(Particle other) {
        if (other instanceof Zipper)
            return new ParticleC();
        return new ParticleA();
    }
}
