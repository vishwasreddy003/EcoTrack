package com.ust.EcoTrack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface User extends JpaRepository<org.apache.catalina.User,Integer> {
}
