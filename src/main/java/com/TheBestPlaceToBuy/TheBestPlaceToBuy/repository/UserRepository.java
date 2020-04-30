package com.TheBestPlaceToBuy.TheBestPlaceToBuy.repository;

import com.TheBestPlaceToBuy.TheBestPlaceToBuy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
