package edu.penzgtu;


import edu.penzgtu.entities.Room;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    void testRoomCreation() {
        Room room = new Room(1, "Test Room");
        assertEquals(1, room.getId());
        assertEquals("Test Room", room.getDescription());
        assertTrue(room.getItems().isEmpty());
        assertTrue(room.getMonsters().isEmpty());
        assertFalse(room.hasArtifact());
    }

    @Test
    void testArtifactManagement() {
        Room room = new Room(1, "Test Room");
        assertFalse(room.hasArtifact());
        room.setHasArtifact(true);
        assertTrue(room.hasArtifact());
        room.removeArtifact();
        assertFalse(room.hasArtifact());
    }

}
