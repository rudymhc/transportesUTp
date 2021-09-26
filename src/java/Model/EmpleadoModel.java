/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LuisRomero
 */
public class EmpleadoModel {
    
    private String nombres;
    private String apellidos;
    private String username;
    private String password;
    private int docIdentidad;
    private String nacionalidad;
    private int nroContacto;
    private int nroLincencia;

    public EmpleadoModel(String nombres, String apellidos, String username, String password, int docIdentidad, String nacionalidad, int nroContacto, int nroLincencia) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.username = username;
        this.password = password;
        this.docIdentidad = docIdentidad;
        this.nacionalidad = nacionalidad;
        this.nroContacto = nroContacto;
        this.nroLincencia = nroLincencia;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDocIdentidad() {
        return docIdentidad;
    }

    public void setDocIdentidad(int docIdentidad) {
        this.docIdentidad = docIdentidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getNroContacto() {
        return nroContacto;
    }

    public void setNroContacto(int nroContacto) {
        this.nroContacto = nroContacto;
    }

    public int getNroLincencia() {
        return nroLincencia;
    }

    public void setNroLincencia(int nroLincencia) {
        this.nroLincencia = nroLincencia;
    }

    
    
    
}
