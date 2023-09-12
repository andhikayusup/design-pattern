package design.pattern.builder;

import java.util.Objects;

public class House {
    public String bathRoom;
    public String livingRoom;
    public String bedRoom;

    public House(String bathRoom, String livingRoom, String bedRoom) {
        this.bathRoom = bathRoom;
        this.livingRoom = livingRoom;
        this.bedRoom = bedRoom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(bathRoom, house.bathRoom)
                && Objects.equals(livingRoom, house.livingRoom)
                && Objects.equals(bedRoom, house.bedRoom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bathRoom, livingRoom, bedRoom);
    }
}
