/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;
 import ec.edu.intsuperior.controlador.Conexion;



/**
 *
 * @author User
 */
public class Aplicacion {
    public static void main(String[] args) {
       Conexion.conexion();
       Conexion.consultarUsuario();
       Conexion.insertarUsuario();
    }}