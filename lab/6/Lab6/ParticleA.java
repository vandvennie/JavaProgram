class ParticleA extends Xapper {
    public Particle collide(Particle other) {
        if (other instanceof Xapper)
            return new ParticleA();
        return new ParticleB();
    }
}
