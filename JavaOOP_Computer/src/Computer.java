public class Computer {
    protected int numberOfProcessors;
    protected int ramMeomoryAmount;
    protected int memoryInGb;
    public Computer(){}

    public Computer(int numberOfProcessors, int ramMeomoryAmount, int memoryInGb) {
        this.numberOfProcessors = numberOfProcessors;
        this.ramMeomoryAmount = ramMeomoryAmount;
        this.memoryInGb = memoryInGb;
    }


    public int getNumberOfProcessors() {
        return numberOfProcessors;
    }

    public void setBrojProcesora(int numberOfProcessor) {
        this.numberOfProcessors = numberOfProcessors;
    }

    public int getRamMeomoryAmount() {
        return ramMeomoryAmount;
    }

    public void setRamMeomoryAmount(int ramMeomoryAmount) {
        this.ramMeomoryAmount = ramMeomoryAmount;
    }

    public int getMemoryInGb() {
        return memoryInGb;
    }

    public void setMemoryInGb(int memoryInGb) {
        this.memoryInGb = memoryInGb;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Number of processors: " + numberOfProcessors +
                ", ram: " + ramMeomoryAmount + "GB"+
                ", memory:" + memoryInGb +"GB"+
                '}';
    }
}
