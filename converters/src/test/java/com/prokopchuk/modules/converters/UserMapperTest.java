package com.prokopchuk.modules.converters;

import com.prokopchuk.modules.User;
import com.prokopchuk.modules.domain.UserCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {

    @Test
    void userToUserCommand() {
        User user = new User(1L,"Nik","Prokop","test@mail.com");
        UserCommand userCommand = UserMapper.INSTANCE.userToUserCommand(user);
        assertNotNull(userCommand);
        assertEquals(user.getFirstName(), userCommand.getFirstName());
        assertEquals(user.getLastName(), userCommand.getLastName());
        assertEquals(user.getEmail(), userCommand.getEmail());
    }

    @Test
    void userCommandToUser() {
        UserCommand userCommand = new UserCommand();
        userCommand.setFirstName("Nik");
        userCommand.setLastName("Prokop");
        userCommand.setEmail("test@mail.com");

        User user = UserMapper.INSTANCE.userCommandToUser(userCommand);

        assertEquals(userCommand.getFirstName(), user.getFirstName());
        assertEquals(userCommand.getLastName(), user.getLastName());
        assertEquals(userCommand.getEmail(), user.getEmail());

    }
}