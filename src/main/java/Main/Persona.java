/*
 * Clase que simula una persona con sus atributos
 */
package Main;

import java.util.Date;

/**
 * @author Sebasti�n Sanchez y Matias Vega
 */
public class Persona {

    private String nombre;
    private String rut;
    private Date horaDeAtencion;

    /**
     * Metodo que le asigna un nombre y una hora a un objeto de tipo persona
     *
     * @param nombre         es de tipo String y es uno de los identificadores de cada persona
     * @param horaDeAtencion es de tipo Date y permite saber cuando sera atendida cada persona
     */
    public Persona(String nombre, Date horaDeAtencion) {
        this.nombre = nombre;
        this.horaDeAtencion = horaDeAtencion;
    }

    /**
     * Metodo de tipo String que permite obtener el atributo nombre para cada persona
     *
     * @return nombre es el nombre de cada persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo de tipo void que añade un atributo nombre a cada persona
     *
     * @param nombre es un String que asigna el nombre a cada persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo de tipo Date que permite obtener el atributo  horaDeAtencion para cada persona
     *
     * @return horaDeAtencion es la hora para cada persona
     */
    public Date getHoraDeAtencion() {
        return horaDeAtencion;
    }

    /**
     * Metodo de tipo void que añade un atributo horaDeAtencion a cada persona
     *
     * @param horaDeAtencion es un Date que asigna una horaDeAtencion a cada persona
     */
    public void setHoraDeAtencion(Date horaDeAtencion) {
        this.horaDeAtencion = horaDeAtencion;
    }

    /**
     * Metodo de tipo String que permite obtener el atributo rut para cada persona
     *
     * @return rut es el rut de cada persona
     */
    public String getRut() {
        return rut;
    }

    /**
     * Metodo que de tipo void que añade un atriuto de tipo rut a cada persona
     *
     * @param rut es un String que asigna un rut a cada persona
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * Metodo que se encarga de validar el rut ingresado
     *
     * @param rut es de tipo String y es una cadena de numeros que pueden o no tener puntos y guion
     * @return validacion es un boolean true si el rut es valido o false si es invalido
     */
    public static boolean validarRut(String rut) {
        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
            char dv = rut.charAt(rut.length() - 1);
            int m = 0;
            int s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }
        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

}
