package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "stops")
public class Stops {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(name = "stops_buses",
            joinColumns = @JoinColumn(name = "stops_id"),
            inverseJoinColumns = @JoinColumn(name = "buses_id"))
    private Set<Bus> buses = new LinkedHashSet<>();

    public Set<Bus> getBuses() {
        return buses;
    }

    public void setBuses(Set<Bus> buses) {
        this.buses = buses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}