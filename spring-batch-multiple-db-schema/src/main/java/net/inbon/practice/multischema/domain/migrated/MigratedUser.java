package net.inbon.practice.multischema.domain.migrated;

import javax.persistence.*;

@Entity
@Table(catalog = "migrated")
public class MigratedUser {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    protected MigratedUser() {
    }
    
    public static MigratedUser ofNew(String name) {
        MigratedUser user = new MigratedUser();
        user.name = name;
        return user;
    }
}
