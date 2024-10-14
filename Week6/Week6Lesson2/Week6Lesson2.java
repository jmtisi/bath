// Individual part classes
class Frame {
    String type;

    public Frame(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Frame: " + type;
    }
}

class Wheel {
    int size;

    public Wheel(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Wheel size: " + size + " inches";
    }
}

class Handlebar {
    String material;

    public Handlebar(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Handlebar material: " + material;
    }
}

class Bicycle {
    Frame frame;
    Wheel frontWheel;
    Wheel backWheel;
    Handlebar handlebar;

    public Bicycle(Frame frame, Wheel frontWheel, Wheel backWheel, Handlebar handlebar) {
        this.frame = frame;
        this.frontWheel = frontWheel;
        this.backWheel = backWheel;
        this.handlebar = handlebar;
    }

    @Override
    public String toString() {
        return "Bicycle built with:\n" + frame + "\n" + frontWheel + "\n" + backWheel + "\n" + handlebar;
    }
}

class BicyclePartsDatabase {
    public Frame[] getFrames() {
        return new Frame[] {
            new Frame("Carbon"),
            new Frame("Aluminum"),
            new Frame("Steel")
        };
    }

    public Wheel[] getWheels() {
        return new Wheel[] {
            new Wheel(26),
            new Wheel(28),
            new Wheel(29)
        };
    }

    public Handlebar[] getHandlebars() {
        return new Handlebar[] {
            new Handlebar("Carbon Fiber"),
            new Handlebar("Aluminum Alloy")
        };
    }
}

public class Week6Lesson2 {
    public static void main(String[] args) {

        BicyclePartsDatabase db = new BicyclePartsDatabase();

        Frame selectedFrame = db.getFrames()[0];  // Select Carbon frame
        Wheel selectedFrontWheel = db.getWheels()[1];  // Select 28" wheel for front
        Wheel selectedBackWheel = db.getWheels()[1];   // Select 28" wheel for back
        Handlebar selectedHandlebar = db.getHandlebars()[0];  // Select Carbon Fiber handlebar

        Bicycle customBike = new Bicycle(selectedFrame, selectedFrontWheel, selectedBackWheel, selectedHandlebar);

        System.out.println(customBike);
    }
}
