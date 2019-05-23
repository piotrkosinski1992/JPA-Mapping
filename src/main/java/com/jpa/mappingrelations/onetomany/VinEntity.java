package com.jpa.mappingrelations.onetomany;

import javax.persistence.*;

@Entity
@Table(name = "VEHICLE_VIN")
public class VinEntity {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "VIN")
    private String vin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ROW_KEY_FIELD")
    private RowEntity row;

    public VinEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public RowEntity getRow() {
        return row;
    }

    public void setRow(RowEntity row) {
        this.row = row;
    }
}
