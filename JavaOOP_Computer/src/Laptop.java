public class Laptop extends Computer {
    private double screenSize;
    private Keyboard keyboard;
    public Laptop(){}
    public Laptop(int numberOfProcessors, int ramMeomoryAmount, int memoryInGb, double screenSize, Keyboard keyboard) {
        super(numberOfProcessors, ramMeomoryAmount, memoryInGb);
        this.screenSize = screenSize;
        this.keyboard = keyboard;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Number of processors: " + numberOfProcessors +
                ", ram: " + ramMeomoryAmount +"GB"+
                ", memory: " + memoryInGb + "GB"+
                ", screen: " + screenSize +
                ", keyboard: " + keyboard +
                '}';
    }
}
