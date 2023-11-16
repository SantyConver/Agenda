package com.jx.pruebajdbc;

public class Contacto {
    private String nombre;
    private String apellido;
    private String instagram;
    private String numero;
    private Integer id;

    public Contacto(String nombre, String apellido, String instagram, String numero, Integer id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.instagram = instagram;
        this.numero = numero;
        this.id = id;
    }

    public Contacto() {
    }

//region Getter's and Setter's
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//endregion
}
