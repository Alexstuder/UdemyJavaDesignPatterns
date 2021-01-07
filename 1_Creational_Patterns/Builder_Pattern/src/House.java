public class House {


    private String basement;
    private String material;
    private String kitchen;
    private String roof;




    @Override
    public String toString() {
        return "House{" +
                "basement='" + basement + '\'' +
                ", material='" + material + '\'' +
                ", kitchen='" + kitchen + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }

    public String getBasement() {
        return basement;
    }

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }
}
