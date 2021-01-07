public class HouseBuilder_Demo {

    public static void main(String[] args) {
        HouseBuilder woodHouseBuilder = new WoodHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(woodHouseBuilder);

        engineer.constructHouse();

        House house = engineer.getHouse();

        System.out.println(house.toString());



        HouseBuilder stoneHouse = new StoneHouseBuilder();
        engineer = new CivilEngineer(stoneHouse);

        engineer.constructHouse();
        house = engineer.getHouse();
        System.out.println(house.toString());


    }
}
