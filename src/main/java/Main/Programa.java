/*
 * Clase contenedora del programa con los principales m√©todos.
 */
package Main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Sebasti·n Sanchez y Matias Vega
 */
public class Programa {

    static ArrayList<Persona> usuarios = new ArrayList<Persona>();

    /**
     * Metodo de tipo int que se encarga de comparar la hora del sistema con la
     * hora asignada a cada persona y hace
     *
     * @param persona objeto de tipo Persona que se desea compara la hora de atencion con la hora actual
     * @return diferencia de tiempo en minutos
     */
    public static long compararHora(Persona persona) {
        long diferencia = 0;
        String horaPrueba = "22:06";
        horaPrueba.replace(":", "");
        asignarHora(persona);
        DateFormat dateF = new SimpleDateFormat("HH:mm");
        String horaPerso = dateF.format(persona.getHoraDeAtencion());
        horaPerso.replace(":", "");
        long horaPrue = Integer.parseInt(horaPrueba);
        long horaPersona = Integer.parseInt(horaPerso);
        if ((horaPrue - horaPersona) == 10) {
            System.out.println("Faltan 10 minutos para su turno");
            diferencia = horaPrue - horaPersona;
        } else if ((horaPrue - horaPersona) < 10) {
            System.out.println("quedan menos de 10 minutos para su turno");
            diferencia = horaPrue - horaPersona;
        } else {
            System.out.println("aun falta para su turno");
        }

        return diferencia;
    }

    /**
     * Metodo de tipo void que envia un mensaje al cumplirse cierta condicion
     *
     *
     * @param diferencia
     */
    public static void mensajeUsuario(long diferencia) {
        if (diferencia == 10) {
            System.out.println("Faltan 10 minutos para su turno");

        } else if (diferencia < 10) {
            System.out.println("quedan menos de 10 minutos para su turno");
        } else {
            System.out.println("A˙n faltan m·s de 10 minutos para su turno");
        }
    }

    /**
     *  MÈtodo que le asigna la hora de atencion a la persona
     * @param persona
     */
    public static void asignarHora(Persona persona){
        try {
            String horaInicial = "22:20";
            DateFormat dateF = new SimpleDateFormat("HH:mm");
            Date horaDeAtencion = dateF.parse(horaInicial);
            persona.setHoraDeAtencion(horaDeAtencion);
        } catch (ParseException e) {
            System.out.println("Ocurrio un error");
        }

    }

    /**
     * Metodo de tipo void que se encarga de ver si la hora es igual a cero para
     * remover a las personas del Arraylist
     *
     * @param persona es un objeto del Arraylist usuarios
     *
     */
    public static void eliminarUsuario(Persona persona) {
        if (compararHora(persona) == 0) {
            usuarios.remove(persona);
        }
    }

    /**
     * MÈtodo que ejecuta el programa
     */
    public static void correrPrograma() {
        Persona persona = new Persona();
        asignarHora(persona);
        long horaComparada = compararHora(persona);
        mensajeUsuario(horaComparada);
        eliminarUsuario(persona);
    }
}
