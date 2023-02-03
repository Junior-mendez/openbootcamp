package com.example.obejercicio4.entities;

import javax.persistence.*;

@Entity
@Table(name = "laptop")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private Integer anio;
    private String modelo;

    public Laptop() {
    }

    public Laptop(Long id, String marca, Integer anio, String modelo) {
        this.id = id;
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", anio=" + anio +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
