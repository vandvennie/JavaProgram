class ParticleC extends Zipper {
    public Particle collide(Particle other) {
        if (other instanceof ParticleA)
            return new ParticleC();
        return new ParticleD();
    }
}
