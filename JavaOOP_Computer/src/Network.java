public enum Network {
    G3("3G"),G4("4G"),G5("5G");
    private final String kindOfNetwork;
    Network(String kindOfNetwork){
        this.kindOfNetwork = kindOfNetwork;
    }
    public String getKindOfNetwork(){
        return kindOfNetwork;
    }
}
