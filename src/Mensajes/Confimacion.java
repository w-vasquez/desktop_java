/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensajes;
import javax.swing.JOptionPane;
/**
 *
 * @author redgo
 */
public class Confimacion {
     public int MenConfirmacion(){
        int respuestas = JOptionPane.showConfirmDialog(null, "¿Seguro de seguir realizar esta accion?", "Realizar cambios", JOptionPane.OK_CANCEL_OPTION);
        return respuestas;
    }
    
}
