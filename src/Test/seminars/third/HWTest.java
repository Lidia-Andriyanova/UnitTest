package seminars.third;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import seminars.third.hw.MainHW;
import seminars.third.tdd.User;
import seminars.third.tdd.UserRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HWTest {

    @ParameterizedTest
    @CsvSource({
          "2, true",
          "1, false"
    })
    public void NumIsOdd(int num, boolean even) {
        MainHW thirdHW = new MainHW();
        assertEquals(even, thirdHW.evenOddNumber(num));
    }

    @ParameterizedTest
    @CsvSource({
            "0, false",
            "25, true",
            "50, true",
            "100, true",
            "105, false"
    })
    public void NumInInterval(int num, boolean even) {
        MainHW thirdHW = new MainHW();
        assertEquals(even, thirdHW.numberInInterval(num));
    }

    @Test
    public void NumInInterval() {
        User admin = new User("admin", "admin111", true);
        User user1 = new User("user1", "pass12345", false);
        User user2 = new User("user2", "pass45678", false);

        UserRepository userRepository = new UserRepository();
        userRepository.addUser(admin);
        userRepository.addUser(user1);
        userRepository.addUser(user2);

        admin.authenticate("admin", "admin111");
        user1.authenticate("user1", "pass12345");
        user2.authenticate("user2", "pass45678");

        userRepository.logoutAllUsers();
        assertEquals(true, admin.isAuthenticate());
        assertEquals(false, user1.isAuthenticate());
        assertEquals(false, user2.isAuthenticate());
    }
}

