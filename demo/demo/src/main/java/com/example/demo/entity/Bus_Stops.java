package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Bus_Stops {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "bus_id")
  private Bus bus;

  @ManyToOne
  @JoinColumn(name = "stops_id")
  private Stops stops;

  @Column(name = "bus_order", nullable = false)
  private String busOrder;

  public String getBusOrder() {
    return busOrder;
  }

  public void setBusOrder(String busOrder) {
    this.busOrder = busOrder;
  }

  public Stops getStops() {
    return stops;
  }

  public void setStops(Stops stops) {
    this.stops = stops;
  }

  public Bus getBus() {
    return bus;
  }

  public void setBus(Bus bus) {
    this.bus = bus;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}