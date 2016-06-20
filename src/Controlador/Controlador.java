

package Controlador;

import Modelo.MetodosNodos;
import Vista.VentanaListas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador implements ActionListener{
    
    MetodosNodos metodosNodos;
    VentanaListas ventana;
    public Controlador(VentanaListas ventana)
    {
        this.ventana=ventana;
        metodosNodos=new MetodosNodos();
    }
    
    public void actionPerformed(ActionEvent evento)
    {
        if(evento.getActionCommand().equals("Generar"))
        {
            metodosNodos.generarLista(Integer.parseInt(ventana.getJt_CantidadElementos()));
            ventana.setJta_ReporteListas(metodosNodos.imprimirLista());
            ventana.limpiarCampos();
        }
        if(evento.getActionCommand().equals("Agregar"))
        {
            metodosNodos.agregarAlFinal(ventana.getJt_DatoAgregarFinal());
            ventana.setJta_ReporteListas(metodosNodos.imprimirLista());
            ventana.limpiarCampos();
        }
        if(evento.getActionCommand().equals("Modificar"))
        {
            metodosNodos.modificar(ventana.getJt_DatoModificar(),ventana.getJt_NuevoValor());
            ventana.setJta_ReporteListas(metodosNodos.imprimirLista());
            ventana.limpiarCampos();
        }
        if(evento.getActionCommand().equals("Eliminar"))
        {
            metodosNodos.eliminar(Integer.parseInt(ventana.getJt_DatoEliminar()));
            ventana.setJta_ReporteListas(metodosNodos.imprimirLista());
            ventana.limpiarCampos();
        }
        if(evento.getActionCommand().equals(">"))
        {
            metodosNodos.ordenarMayorAMenor();
            ventana.setJta_ReporteListas(metodosNodos.imprimirLista());
            ventana.limpiarCampos();
        }
        if(evento.getActionCommand().equals("<"))
        {
            metodosNodos.ordenarMenorAMayor();
            ventana.setJta_ReporteListas(metodosNodos.imprimirLista());
            ventana.limpiarCampos();
        }
        if(evento.getActionCommand().equals(">"))
        {
            metodosNodos.ordenarMayorAMenor();
            ventana.setJta_ReporteListas(metodosNodos.imprimirLista());
            ventana.limpiarCampos();
        }
    }
    
}
