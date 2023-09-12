package design.pattern.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicHouseBuilderTest {

    @Test
    void shouldBuildHouse() {
        House houseFromBuilder = BasicHouseBuilder.builder()
                .buildBathRoom("clean bathroom")
                .buildBedRoom("cozy bedroom")
                .buildLivingRoom("comfortable livingroom")
                .build();

        House expectedHouse = new House("clean bathroom", "comfortable livingroom", "cozy bedroom");

        assertEquals(expectedHouse, houseFromBuilder);
    }
}