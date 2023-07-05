public class MobilePhone extends Computer {
    private int cameraInMegapixels;
    private Network network ;
    public MobilePhone(){}
    public MobilePhone(int numberOfProcessors, int ramMeomoryAmount, int memoryInGb, int cameraInMegapixels,Network network) {
        super(numberOfProcessors, ramMeomoryAmount, memoryInGb);
        this.cameraInMegapixels = cameraInMegapixels;
        this.network = network;
    }

    public int getCameraInMegapixels() {
        return cameraInMegapixels;
    }

    public void setCameraInMegapixels(int cameraInMegapixels) {
        this.cameraInMegapixels = cameraInMegapixels;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +"Number of processors: " + numberOfProcessors +
                ", ram: " + ramMeomoryAmount +"GB"+
                ", memory: " + memoryInGb+ "GB"+
                ", camera: " + cameraInMegapixels + "Megapixels"+
                ", network: " + network.getKindOfNetwork()+
                '}';
    }
}
