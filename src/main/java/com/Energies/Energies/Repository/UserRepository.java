package com.Energies.Energies.Repository;

import com.Energies.Energies.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
