public class LightBulb {
    private LightBulb lightBulb;

    public LightBulb() {
        this.lightBulb = new LightBulb();
    }
    
    public void turnOn() {
        System.out.println("Light bulb turned on");
    }

    public void turnOff() {
        System.out.println("Light bulb turned off");
    }
}
