package com.jpa.mappingrelations.onetomany;

import jdk.jfr.Name;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "VEHICLE_ROW")
@Entity
public class RowEntity {

    @Id
    @Name("KEY_FIELD")
    private String keyField;

    @Column(name = "CAPACITY")
    private Integer capacity;

    @Column(name = "STATE")
    @Enumerated(EnumType.STRING)
    private State state;

    @OneToMany(
            mappedBy = "row",
            cascade = CascadeType.MERGE, //usuwa w tym momencie zaleznosci
            orphanRemoval = true // usuwa w tym momencie zaleznosci + usuwa dziecko jeżeli straci połączenie z parentem
    )
    private List<VinEntity> vins = new ArrayList<>();

    public RowEntity() {
    }

    public String getKeyField() {
        return keyField;
    }

    public void setKeyField(String keyField) {
        this.keyField = keyField;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<VinEntity> getVins() {
        return vins;
    }

    public void setVins(List<VinEntity> vins) {
        this.vins = vins;
    }
}
