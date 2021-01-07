public class StoneHouseBuilder extends HouseBuilder {

    private House house ;


    public StoneHouseBuilder() {

        this.house = new House();
    }

    @Override
    public void buildBasement() {
    house.setBasement("Keller aus Stein mit Strom und Wasserleitung");

    }

    @Override
    public void buildMaterial() {
        house.setMaterial("Backsteinmauern");

    }

    @Override
    public void buildKitchen() {
        house.setKitchen("Einfache Küche mit Holzofen");

    }

    @Override
    public void buildRoof() {
        house.setRoof("Ziegeln");

    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
