// 抽象基类
public abstract class Particle {
  private final String type;
  public Particle(String type) {
      this.type = type;
  }
  public String getType() {
      return type;
  }
  public abstract Particle collide(Particle other);
}

// A 类
class ParticleA extends Particle {
  public ParticleA() {
      super("A");
  }
  @Override
  public Particle collide(Particle other) {
      if (other.getType().equals("Xapper")) {
          return new ParticleA();
      }
      return new ParticleB();
  }
}

// B 类
class ParticleB extends Particle {
  public ParticleB() {
      super("B");
  }
  @Override
  public Particle collide(Particle other) {
      if (other.getType().equals("Zipper")) {
          return new ParticleC();
      }
      return new ParticleA();
  }
}

// C 类
class ParticleC extends Particle {
  public ParticleC() {
      super("C");
  }
  @Override
  public Particle collide(Particle other) {
      if (other instanceof ParticleA) {
          return new ParticleC();
      }
      return new ParticleD();
  }
}

// D 类
class ParticleD extends Particle {
  public ParticleD() {
      super("D");
  }
  @Override
  public Particle collide(Particle other) {
      if (other.getType().equals("Xapper")) {
          return new ParticleA();
      }
      return new ParticleB();
  }
}