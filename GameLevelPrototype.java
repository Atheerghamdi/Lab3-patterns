package lab3.dp.pkg2111179;

interface GameLevelPrototype extends Cloneable {
    GameLevelPrototype clone() throws CloneNotSupportedException;
    void modify();
}

class CloneFactory {
    public GameLevelPrototype getClone(GameLevelPrototype prototype) throws CloneNotSupportedException {
        return prototype.clone();
    }
}

class Enemy implements GameLevelPrototype {
    @Override
    public GameLevelPrototype clone() throws CloneNotSupportedException {
        return (GameLevelPrototype) super.clone();
    }

    @Override
    public void modify() {
        System.out.println("Modifying the Enemy placement...");
       
    }
}

class Obstacle implements GameLevelPrototype {
    @Override
    public GameLevelPrototype clone() throws CloneNotSupportedException {
        return (GameLevelPrototype) super.clone();
    }

    @Override
    public void modify() {
        System.out.println("Modifying the Obstacle...");
      
    }
}

class Terrain implements GameLevelPrototype {
    @Override
    public GameLevelPrototype clone() throws CloneNotSupportedException {
        return (GameLevelPrototype) super.clone();
    }

    @Override
    public void modify() {
        System.out.println("Modifying the Terrain...");
   
    }
}

class LevelDesign {
    public static void main(String[] args) throws CloneNotSupportedException {
        GameLevelPrototype terrain = new Terrain();
        GameLevelPrototype obstacle = new Obstacle();
        GameLevelPrototype enemy = new Enemy();

        CloneFactory factory = new CloneFactory();

        GameLevelPrototype modifiedTerrain = factory.getClone(terrain);
        modifiedTerrain.modify();

        GameLevelPrototype modifiedObstacle = factory.getClone(obstacle);
        modifiedObstacle.modify();

        GameLevelPrototype modifiedEnemy = factory.getClone(enemy);
        modifiedEnemy.modify();

        System.out.println("Original Terrain Hash Code: " + System.identityHashCode(terrain));
        System.out.println("Cloned Terrain Hash Code: " + System.identityHashCode(modifiedTerrain));

        System.out.println("Original Obstacle Hash Code: " + System.identityHashCode(obstacle));
        System.out.println("Cloned Obstacle Hash Code: " + System.identityHashCode(modifiedObstacle));

        System.out.println("Original Enemy Hash Code: " + System.identityHashCode(enemy));
        System.out.println("Cloned Enemy Hash Code: " + System.identityHashCode(modifiedEnemy));
    }
}