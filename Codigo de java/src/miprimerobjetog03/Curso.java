/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerobjetog03;

/**
 *
 * @author ersolano
 */
public class Curso {
    
    private String codigo;
    private String nombre;
    private int creditos;
    private int horas;
    private boolean asistenciaObligatoria;
    
    private final static double NOTA_APROBACION = 67.5;
    // private/public es un modificador de acceso que define la visibilidad del atributo
    // static es un modificador de acceso que define un atributo global
    // final es un modificador de acceso que define un atributo constante
    
    public Curso(){
        // constructor default
    }

    public Curso(String codigo, String nombre, int p_creditos) {
        // constructor sobrecargado
        this.codigo = codigo;
        this.nombre = nombre;
        creditos = p_creditos;
    }
    
    public Curso(int p_creditos, String codigo, String nombre) {
        // constructor sobrecargado con igual cantidad de parámetros, distinto orden
        this.codigo = codigo;
        nombre = nombre;
        creditos = p_creditos;
    }

    public Curso(String codigo, String nombre, int creditos, int horas, boolean asistenciaObligatoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.horas = horas;
        this.asistenciaObligatoria = asistenciaObligatoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public boolean isAsistenciaObligatoria() {
        return asistenciaObligatoria;
    }

    public void setAsistenciaObligatoria(boolean asistenciaObligatoria) {
        this.asistenciaObligatoria = asistenciaObligatoria;
    }

    public static double getNOTA_APROBACION() {
        return NOTA_APROBACION;
        
    }
    
    
    
   
    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + 
               ", creditos=" + creditos + ", horas=" + horas + 
               ", asistenciaObligatoria=" + asistenciaObligatoria + '}';
    }
    
    
    
}
