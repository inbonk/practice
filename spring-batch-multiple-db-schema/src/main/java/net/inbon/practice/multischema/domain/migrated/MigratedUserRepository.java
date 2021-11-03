package net.inbon.practice.multischema.domain.migrated;

import org.springframework.data.repository.CrudRepository;

public interface MigratedUserRepository extends CrudRepository<MigratedUser, Long> {
}
