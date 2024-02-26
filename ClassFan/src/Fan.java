public class Fan {
    public static final int SlOW = 1;
    public static final int MEDIUM = 2;
    public  static final int FAST = 3;

    private int speed;
    private boolean on ;
    private double radius;
    private String color;

    public Fan() {
       speed = SlOW ;
        on = false  ;
      radius = 5.0  ;
       color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on != false){
            return "Speed "+this.speed +" Color "+ this.color + " Radius "+this.radius + " fan is on";
        }else {
            return "Speed "+this.speed +" Color "+ this.color + " Radius "+this.radius + " fan is off";
        }
    }
}
