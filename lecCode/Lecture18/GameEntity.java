
class Point3D {}

class Model3D {}

// public class GameEntity {
//     public Model3D getModel() {
//         // Not real code
//     }

//     public Point3D getPosition() {
//         // Not real code
//         return null;
//     }

//     public int getHP() {
//         // Not real code
//         return 0;
//     }

//     public int getAttack() {
//         // Not real code
//         return 0;
//     }
// }

// class Renderer {
//     public void render(GameEntity entity) {
//         // We don't care about getHP() and getAttack()
//     }
// }

// ISP adhering version
interface Renderable {
    Model3D getModel();
    Point3D getPosition();
}

interface Fighter {
    int getHP();
    int getAttack();
}

public class GameEntity implements Renderable, Fighter {
    public Model3D getModel() {
        // Not real code
        return null;
    }

    public Point3D getPosition() {
        // Not real code
        return null;
    }

    public int getHP() {
        // Not real code
        return 0;
    }

    public int getAttack() {
        // Not real code
        return 0;
    }
}

class Renderer {
    public void render(Renderable entity) {
        // Much better
    }
}