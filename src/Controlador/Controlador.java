/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelos.*;

/**
 *
 * @author carlt
 */
public class Controlador {
    /**
 * Clase que actúa como controlador para la gestión de participantes.
 */

    private final ModeloParticipantes modelo;

    /**
     * Constructor del controlador de participantes.
     * @param modelo El modelo asociado al controlador.
     */
    public Controlador(ModeloParticipantes modelo) {
        this.modelo = modelo;
    }

    /**
     * Método para agregar un nuevo participante a la base de datos.
     * @param nombre El nombre del participante.
     * @param apellido El apellido del participante.
     * @param telefono El teléfono del participante.
     * @param dpi El DPI del participante.
     * @param nombreUsuario El nombre de usuario.
     * @param contrasena La contraseña.
     */
    public void agregarParticipante(String nombre, String apellido, String telefono, String dpi, String nombreUsuario, String contrasena) {
        Participantes nuevoParticipante = new Participantes(nombre, apellido, telefono, dpi);
        Usuarios usuario = new Usuarios(nombreUsuario, contrasena); // Crear un objeto Usuario
        //boolean exito = modelo.agregarParticipante(nuevoParticipante, usuario);
       /* if (exito) {
            System.out.println("Participante agregado con éxito.");
        } else {
            System.out.println("Error al agregar participante.");
        }*/
    }
}


