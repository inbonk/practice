package net.inbon.practice.multischema.runner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.inbon.practice.multischema.domain.main.House;
import net.inbon.practice.multischema.domain.main.HouseRepository;
import net.inbon.practice.multischema.domain.main.User;
import net.inbon.practice.multischema.domain.main.UserRepository;
import net.inbon.practice.multischema.domain.migrated.MigratedUser;
import net.inbon.practice.multischema.domain.migrated.MigratedUserRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements ApplicationRunner {
    
    private final UserRepository userRepository;
    private final HouseRepository houseRepository;
    private final MigratedUserRepository migratedUserRepository;
    
    @Override
    @Transactional
    public void run(ApplicationArguments args) {
        userRepository.save(User.ofNew("A"));
        houseRepository.save(House.ofNew("H"));
        migratedUserRepository.save(MigratedUser.ofNew("AA"));
    }
}
