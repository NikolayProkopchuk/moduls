package com.prokopchuk.modules.web;

import com.prokopchuk.modules.User;
import com.prokopchuk.modules.converters.UserMapper;
import com.prokopchuk.modules.domain.UserCommand;

public class UserController {

    User saveUser(UserCommand command) {
        return UserMapper.INSTANCE.userCommandToUser(command);
    }
}
