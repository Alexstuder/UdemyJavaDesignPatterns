public class WoodHouseBuilder extends HouseBuilder {

    private House house ;


    public WoodHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Kein Keller vorhanden");

    }

    @Override
    public void buildMaterial() {
        house.setMaterial("Aus Holz");

    }

    @Override
    public void buildKitchen() {
        house.setKitchen("Edle Küche");

    }

    @Override
    public void buildRoof() {
        house.setRoof("HolzLatten mit PV");

    }

    @Override
    public House getHouse() {
        return this.house;
    }

}
