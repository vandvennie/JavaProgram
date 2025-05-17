class ParticleD extends Zipper {
    public Particle collide(Particle other) {
        if (other instanceof Zipper)
            return new ParticleC();
        return new ParticleA();
    }
}