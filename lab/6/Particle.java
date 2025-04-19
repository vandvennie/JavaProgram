abstract class Particle {
  private String type;
  private String name;
  public Particle(String type, String name) {
    this.type = type;
    this.name = name;
  }
  public Particle() {
  }
  public abstract Particle collide(Particle other);
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

}
class ParticleA extends Particle {
  public ParticleA(){
    super("Xappers", "A");
  }
  Particle element;
  @Override
  public Particle collide(Particle other){
    if ("Xappers".equals(other.getType())){
      element = new ParticleA();
      
    } else {
      element = new ParticleB();
    }
    return element;
  }
}

class ParticleB extends Particle {
  public ParticleB(){
    super("Xappers", "B");
  }
  Particle element;
  @Override
  public Particle collide(Particle other){
    if ("Zippers".equals(other.getType())){
      element = new ParticleC();
      
    } else {
      element = new ParticleA();
    }
    return element;
  }
}

class ParticleC extends Particle {
  public ParticleC(){
    super("Zippers", "C");
  }
  Particle element;
  @Override
  public Particle collide(Particle other){
    if ("A".equals(other.getName())){
      element = new ParticleC();
      
    } else {
      element = new ParticleD();
    }
    return element;
  }
}

class ParticleD extends Particle {
  public ParticleD(){
    super("Zippers", "D");
  }
  Particle element;
  @Override
  public Particle collide(Particle other){
    if ("Zippers".equals(other.getType())){
      element = new ParticleC();
      
    } else {
      element = new ParticleA();
    }
    return element;
  }
  
}