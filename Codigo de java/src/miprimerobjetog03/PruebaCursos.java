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
public class PruebaCursos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo soy nuevo en Java");
        System.out.println("Me llamo Ericka");
        
        /*
        variables que no estan en uso y VSCode manda warnings
        int cantidad = 0;
        boolean seguir = false;
        double precio = 0;
        String nombre = null;
        */

        Curso miCurso = null;   // declaración de una instancia, variable de tipo Curso
        miCurso = new Curso("Programacion Orientada a Objetos", "IC2101", 3);   //  instanciación del objeto
        
        Curso otroCurso = new Curso();   // declaracion e instanciacion del objeto Curso
        otroCurso.setCodigo("IC2001");
        otroCurso.setNombre("Estructuras de Datos");
        otroCurso.setCreditos(4);
        otroCurso.setHoras(4);
        otroCurso.setAsistenciaObligatoria(true);
        
        System.out.println(Curso.getNOTA_APROBACION());
                
        System.out.println(miCurso.getCodigo() + "-" + miCurso.getNombre() + "-" + miCurso.getCreditos());
                
        System.out.println(otroCurso);
        
    }
    
}
