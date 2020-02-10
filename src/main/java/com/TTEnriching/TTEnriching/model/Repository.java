package com.TTEnriching.TTEnriching.model;

public class Repository {

    private String origin;
    private String nameRepository;
    private String resource;
    private Integer state;
    private Integer idrepository;

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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getIdrepository() {
        return idrepository;
    }

    public void setIdrepository(Integer idrepository) {
        this.idrepository = idrepository;
    }
}
