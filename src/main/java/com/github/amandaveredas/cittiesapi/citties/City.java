package com.github.amandaveredas.cittiesapi.citties;

import com.github.amandaveredas.cittiesapi.states.State;

import javax.persistence.*;

@Entity
@Table(name = "cidade")
public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @ManyToOne
    @JoinColumn(name = "uf", referencedColumnName = "id")
    private State state;

    private Integer ibge;

    @Column(name = "lat_lon")
    private String geoLocation;

//    private Long latitude;
//
//    private Long longitude;
//
//    private Integer cod_tom;


    public City() {
    }

//    public City(Long id, String name, Integer uf, Integer ibge, String geoLocation) {
//        this.id = id;
//        this.name = name;
//        this.uf = uf;
//        this.ibge = ibge;
//        this.geoLocation = geoLocation;
//    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getIbge() {
        return ibge;
    }

    public String getGeoLocation() {
        return geoLocation;
    }

    public State getState() {
        return state;
    }
}
