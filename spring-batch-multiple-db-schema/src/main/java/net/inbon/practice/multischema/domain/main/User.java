package net.inbon.practice.multischema.domain.main;

import javax.persistence.*;

@Entity
@Table(catalog = "main")
public class User {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    protected User() {
    }
    
    public static User ofNew(String name) {
        User user = new User();
        user.name = name;
        return user;
    }
}
