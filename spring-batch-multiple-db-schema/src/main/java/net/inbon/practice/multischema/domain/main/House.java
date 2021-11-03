package net.inbon.practice.multischema.domain.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class House {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    protected House() {
    }
    
    public static House ofNew(String name) {
        House house = new House();
        house.name = name;
        return house;
    }
}
