package design.pattern.builder;

public class BasicHouseBuilder implements HouseBuilder {

    private String livingRoom;
    private String bathRoom;
    private String bedRoom;

    private BasicHouseBuilder() {
    }

    public static BasicHouseBuilder builder() {
        return new BasicHouseBuilder();
    }

    public BasicHouseBuilder buildLivingRoom(String livingRoom) {
        this.livingRoom = livingRoom;
        return this;
    }

    public BasicHouseBuilder buildBathRoom(String bathRoom) {
        this.bathRoom = bathRoom;
        return this;
    }

    public BasicHouseBuilder buildBedRoom(String bedRoom) {
        this.bedRoom = bedRoom;
        return this;
    }

    public House build() {
        return new House(bathRoom, livingRoom, bedRoom);
    }
}
