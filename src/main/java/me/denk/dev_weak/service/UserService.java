package me.denk.dev_weak.service;

import me.denk.dev_weak.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
