/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerobjetog03;

import java.util.Calendar;

/**
 *
 * @author ersolano
 */
public class Usuario {
    // sintaxis de un atributo
    // visibilidad tipoDate identificador;
    private String nombre;
    private String login;
    private String password;
    private TEstado estado = TEstado.ACTIVO;              // por defecto es null
    private int edad;
    private static int maximoIntentos = 3;   //variable de clase - global
    private String correo;
    private String numeroTelefono;
 
    // sintaxis de un método
    // visibilidad tipoRetorno nombreMetodo( tipo param1, tipo param2){}
    public Usuario(){
        // constructor default
    }
    
    public Usuario(String unNombre, String unLogin){
        // constructor sobrecargado
        nombre = unNombre;
        login = unLogin;
    }

    public Usuario(String nombre, String login, String password) {
        this.nombre = nombre;
        this.login = login;
        this.password = password;
    }

    public Usuario(String nombre, String login, String password, int edad) {
        this.nombre = nombre;
        this.login = login;
        this.password = password;
        this.edad = edad;
    }
    
     public Usuario(int edad, String nombre, String login) {
        this.nombre = nombre;
        this.login = login;
        this.edad = edad;
    }  

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public TEstado getEstado() {
        return estado;
    }
    public void setEstado(TEstado estado) {
        this.estado = estado;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setEdad(Calendar fecha) {
        // en construccion  
    }
    public void setEdad(int dia, int mes, int annio) {
            // en construccion
    }
    public void setCorreo(String correo) {
        if(correo.matches("^[\\w.\\-]+\\@[\\w.\\-]+\\.[a-zA-z]{2,6}$")){    
            this.correo = correo;
        }else{
            this.correo = "N/A";
        }
    }
    public String getCorreo() {
        return correo;
    }
    public void setNumeroTelefono(String numeroTelefono) {
        if(numeroTelefono.matches("^[0-9]{4}-[0-9]{4}$")){
            this.numeroTelefono = numeroTelefono;
        }else{
            this.numeroTelefono = "N/A";
        }
    }
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    public static void setMaximoIntentos(int maximoIntentos) {
        Usuario.maximoIntentos = maximoIntentos;
    }
    public static int getMaximoIntentos() {
        return maximoIntentos;
    }  

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", login=" + login +
                ", password=" + password + ", estado=" + estado +
                ", edad=" + edad + ", correo=" + correo +
                ", numeroTelefono=" + numeroTelefono + '}';
    }
}
