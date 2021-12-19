package ru.mirea.task30;

import org.junit.Assert;
import ru.mirea.task30.Car;
import ru.mirea.task30.ShowRoom;

class ShowRoomTest {

    ShowRoom TestRoom() {
        ShowRoom room = new ShowRoom();
        room.add(new Car("Tesla S", "green", 250, 18));
        room.add(new Car("Tesla S", "red", 250, 18));
        room.add(new Car("Lada 2107", "white", 65, 13));
        room.add(new Car("Tesla T", "silver", 290, 18));
        room.add(new Car("Lada Granta", "black", 106, 14));
        room.add(new Car("Lada Samara", "silver", 75, 13));
        room.add(new Car("Tesla T", "purple", 290, 18));
        room.add(new Car("Lada Granta", "blue", 106, 14));
        room.add(new Car("Tesla Q", "gold", 350, 19));
        room.add(new Car("Tesla A", "gray", 100, 15));
        return room;
    }

    @org.junit.jupiter.api.Test
    void getByColor() {
        ShowRoom expected = TestRoom().getByColor("silver");
        ShowRoom actual = new ShowRoom();
        actual.add(new Car("Tesla T", "silver", 290, 18));
        actual.add(new Car("Lada Samara", "silver", 75, 13));
        Assert.assertEquals(expected.getList(), actual.getList());
    }

    @org.junit.jupiter.api.Test
    void getPowerMoreThen() {
        ShowRoom expected = TestRoom().getPowerMoreThen(250);
        ShowRoom actual = new ShowRoom();
        actual.add(new Car("Tesla T", "silver", 290, 18));
        actual.add(new Car("Tesla T", "purple", 290, 18));
        actual.add(new Car("Tesla Q", "gold", 350, 19));
        Assert.assertEquals(expected.getList(), actual.getList());
    }

    @org.junit.jupiter.api.Test
    void getPowerLessThen() {
        ShowRoom expected = TestRoom().getPowerLessThen(100);
        ShowRoom actual = new ShowRoom();
        actual.add(new Car("Lada 2107", "white", 65, 13));
        actual.add(new Car("Lada Samara", "silver", 75, 13));
        Assert.assertEquals(expected.getList(), actual.getList());
    }

    @org.junit.jupiter.api.Test
    void getColors() {
        String expected = TestRoom().getPowerMoreThen(150).getColors();
        String actual = "[gold, green, purple, red, silver]";
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getSize() {
        Assert.assertEquals(TestRoom().size(), 10);
    }
}