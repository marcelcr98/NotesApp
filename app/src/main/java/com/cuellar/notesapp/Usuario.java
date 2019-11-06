package com.cuellar.notesapp;

public class Usuario {

    int id;
    String usuariom,nombre,correo, password;


    public Usuario(){
    }

    public Usuario(int id, String usuariom, String nombre, String correo, String password) {
        this.id = id;
        this.usuariom = usuariom;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }

    public boolean isNull(){
        if(usuariom.equals("")&&nombre.equals("")&&correo.equals("")&&password.equals("")){

            return false;

        }else{

            return true;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", usuariom='" + usuariom + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuariom() {
        return usuariom;
    }

    public void setUsuariom(String usuariom) {
        this.usuariom = usuariom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
