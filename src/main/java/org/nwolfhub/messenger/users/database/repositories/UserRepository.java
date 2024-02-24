package org.nwolfhub.messenger.users.database.repositories;

import org.nwolfhub.messenger.users.database.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    public List<User> findTop3ByUsername(String username);
}
