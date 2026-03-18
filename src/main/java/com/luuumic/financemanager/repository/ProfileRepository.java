package com.luuumic.financemanager.repository;

import com.luuumic.financemanager.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {

    //behind the scenes select * from tbl_profiles where email = ?1
    Optional<ProfileEntity> findByEmail(String email);

    // select * from tbl_profiles where activation_token = ?
    Optional<ProfileEntity> findByActivationToken(String activationToken);
}
