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

    /*
    Metodo esBisiesto:
    Revisa si un año es bisiesto
    */
    private boolean esBisiesto(int annio) {
        if (annio % 4 == 0) {
            if (annio % 100 == 0) {
                if (annio % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    /*
    metodo esFecha:
    Revisa si los valores dados forman una fecha valida
    */
    private boolean esFecha(int dia, int mes, int annio) {
        if (annio < 1586) { // Se toman fechas apartir de 1586
            return false;
        }
        if (0 >= mes || mes > 12) {
            return false;
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia <= 0 || dia > 31) {
                return false;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia <= 0 || dia > 30) {
                return false;
            }
        } else if (mes == 2) {
            if (esBisiesto(annio)) { // comprobacion de año bisiesto para febrero
                if (dia <= 0 || dia > 29) {
                    return false;
                }
            } else {
                if (dia <= 0 || dia > 28) {
                    return false;
                }
            }
        }
        return true;
    }

    /*
    Metodo setEdad sobrecargado con 3 numeros enteros:
    Obtiene una edad calculando cuantos años han pasado desde la fecha actual hasta la fecha dada
    */
    public void setEdad(int dia, int mes, int annio) {
        // Comprobacion y verificacion de datos
        if (!(esFecha(dia, mes, annio))) {
            throw new RuntimeException("ERROR: LA FECHA TIENE UN FORMATO INCORRECTO");
        }

        // Inicializacion de variables
        int edadTemporal;
        Calendar fechaActual = Calendar.getInstance();
        int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);
        int mesActual = fechaActual.get(Calendar.MONTH) + 1;
        int annioActual = fechaActual.get(Calendar.YEAR);

        // Proceso de datos
        edadTemporal = annioActual - annio;

        // Los siguiente condicionales buscan saber si ya se cumplio años en el año en el que esta
        if (mesActual < mes) {
            edadTemporal -= 1;
        } else if (mesActual == mes) {
            if (diaActual < dia ) {
                edadTemporal -= 1;
            }
        }
        
        // La edad no puede ser menos de 0, la persona no ha nacido en ese caso
        if (edadTemporal < 0) {
            throw new RuntimeException("ERROR: LA FECHA INGRESADA ES DEL FUTURO");
        }

        // Una vez asegurado, se asigna la edad
        edad = edadTemporal;
    }
    /*
    Metodo setEdad sobrecargado con una fecha tipo Calendar:
    Lo mismo que la sobrecarga anterior pero recibe un parametro distinto
    */
    public void setEdad(Calendar fecha) {
        // Transformacion de tipo calendar a enteros
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int annio = fecha.get(Calendar.YEAR);

        // Se llama el metodo anterior con los parametros correctos
        setEdad(dia, mes, annio);
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
