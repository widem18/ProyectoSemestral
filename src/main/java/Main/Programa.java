/*
 * Clase contenedora del programa con los principales métodos.
 */
package Main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Sebastián Sanchez y Matias Vega
 */
public class Programa {

    static ArrayList<Persona> usuarios = new ArrayList<Persona>();

    /**
     * public void mostraFecha(){ Date utilDate = new Date(); //fecha actual
     * long lnMilisegundos = utilDate.getTime(); java.sql.Date Date = new
     * java.sql.Date(lnMilisegundos); java.sql.Time Time = new
     * java.sql.Time(lnMilisegundos);
     *
     * System.out.println("util.Date: " + utilDate); System.out.println("Date: "
     * + Date); System.out.println("Time: " + Time); }
     *
     * /
     * public void instanciar(){ Calendar calendario = new GregorianCalendar();
     *
     * }
     */

    /**
     * Metodo de tipo int que se encarga de comparar la hora del sistema con la hora asignada a cada persona y hace
     */

    public static int compararHora() {
        int hora = 0;

        return hora;
    }
    /**
     * Metodo de tipo void que envia un mensaje al cumplirse cierta condicion
     *
     * */
    public static void mensajeUsuario() {

    }
    /**
     * Metodo de tipo void que se encarga de ver si la hora es igual a cero para remover a las personas del Arraylist
     *
     * @param persona es un objeto del Arraylist usuarios
     * */
    public static void eliminarUsuario(Persona persona) {
        if (compararHora() == 0) {
            usuarios.remove(persona);
        }
    }

    public void menu() {

    }
}

