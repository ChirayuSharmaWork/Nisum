package com.junit.q3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testUserFields() {
        User user = new User("Chirayu", "chirayu@example.com", 22);

        assertAll("User Field Checks",
                () -> assertNotNull(user),
                () -> assertEquals("Chirayu", user.getName()),
                () -> assertEquals("chirayu@example.com", user.getEmail()),
                () -> assertTrue(user.getEmail().contains("@")),
                () -> assertEquals(22, user.getAge())
        );
    }

    @Test
    void testValidateAgeThrowsException() {
        UserService service = new UserService();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            service.validateAge(15);
        });

        assertEquals("Underage", exception.getMessage());
    }
}
