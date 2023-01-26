package com.simanavets.tenderflexbackend.service;

import com.simanavets.tenderflexbackend.entity.User;
import com.simanavets.tenderflexbackend.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
