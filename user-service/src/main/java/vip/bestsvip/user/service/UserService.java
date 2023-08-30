package vip.bestsvip.user.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vip.bestsvip.user.entity.User;
import vip.bestsvip.user.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User queryById(Long id) {
        return userRepository.findById(id).get();
    }
}