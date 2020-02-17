package com.TTEnriching.TTEnriching.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table
@Entity
public class Repository implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idrepository;

    @Column
    private String origin;
    @Column
    private String nameRepository;
    @Column
    private String resource;
    @Column
    private int state;




    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getNameRepository() {
        return nameRepository;
    }

    public void setNameRepository(String nameRepository) {
        this.nameRepository = nameRepository;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Long getIdrepository() {
        return idrepository;
    }

    public void setIdrepository(Long idrepository) {
        this.idrepository = idrepository;
    }

    public Repository() {}

    @Override
    public String toString() {
        return "Repository [id= "+ idrepository +", origin= "+ origin+", nameRepository= "+ nameRepository+", resource= "+ resource+", state= "+ state+"]";
    }
}