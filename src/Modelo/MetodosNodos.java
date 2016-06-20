
package Modelo;

import Modelo.Nodo;


public class MetodosNodos {
    
    Nodo primero;
    
    public MetodosNodos()
    {
 
    }
    public void generarLista(int numero)
    {
        primero=new Nodo();
        primero.dato=1;
        for(int contador=1;contador<numero;contador++)
        {
            Nodo temporal=devolverUltimoNodo();
            temporal.siguiente=new Nodo();
            temporal.siguiente.dato=contador+1;
        }
    }
    public String imprimirLista()
    {
        String lista="";
        Nodo auxiliar=primero;
        while(auxiliar.siguiente!=null)
        {
            lista+="El valor del nodo es: "+auxiliar.dato+"\n";
            auxiliar=auxiliar.siguiente;
        }
        lista+="El valor del nodo es: "+auxiliar.dato+"\n";
        
        return lista;
    }
    public Nodo devolverUltimoNodo()
    {
        Nodo auxiliar=primero;
        while(auxiliar.siguiente!=null)
        {
            auxiliar=auxiliar.siguiente;
        }
        return auxiliar;
    }
    public Nodo devolverAntepenultimoNodo()
    {
        Nodo auxiliar=primero;
        while(auxiliar.siguiente.siguiente!=null)
        {
            auxiliar=auxiliar.siguiente;
        }
        return auxiliar;
    }
    public void agregarAlFinal(String dato)
    {
        Nodo auxiliar;
        auxiliar=devolverUltimoNodo();
        auxiliar.siguiente=new Nodo();
        auxiliar.siguiente.dato=Integer.parseInt(dato);
    }
    public void modificar(String datoModificar, String datoNuevo)
    {
        Nodo auxiliar;
        auxiliar=buscarNodo(Integer.parseInt(datoModificar));
        auxiliar.dato=Integer.parseInt(datoNuevo);
    }
    public Nodo buscarNodo(int datoModificar)
    {
        Nodo auxiliar=primero;
        while(auxiliar.dato!=datoModificar)
        {
            auxiliar=auxiliar.siguiente;
        }
        return auxiliar;
    }
    
    public void eliminar(int datoEliminar)
    {
        Nodo auxiliar=primero;
        boolean haEliminado=false;
        if(auxiliar.dato==datoEliminar)
        {
            primero=primero.siguiente;
            haEliminado=true;
        }
        else
        {
            auxiliar=devolverUltimoNodo();
            if(auxiliar.dato==datoEliminar)
            {
                auxiliar=devolverAntepenultimoNodo();
                auxiliar.siguiente=null;
                haEliminado=true;
            }
        }
        if(!haEliminado)
        {
            Nodo temporal;
            auxiliar=devolverNodoAnterior(datoEliminar);
            temporal=auxiliar.siguiente.siguiente;
            auxiliar.siguiente=temporal;
        }
    }
    public Nodo devolverNodoAnterior(int datoBuscar)
    {
        Nodo auxiliar=primero;
        while(auxiliar.siguiente.dato!=datoBuscar)
        {
            auxiliar=auxiliar.siguiente;
        }
        return auxiliar;
    }
    public int devolverCantidadNodos()
    {
        int contador=1;
        Nodo auxiliar=primero;
        while(auxiliar.siguiente!=null)
        {
            contador++;
            auxiliar=auxiliar.siguiente;
        }
        
        return contador;
    }
    public void ordenarMayorAMenor()
    {
        int cantidadNodos=devolverCantidadNodos();
        int datoTemporal;
        Nodo auxiliar=primero;
        for(int contador=0;contador<cantidadNodos;contador++)
        {
            auxiliar=primero;
            while(auxiliar.siguiente!=null)
            {
                if(auxiliar.dato<auxiliar.siguiente.dato)
                {
                    datoTemporal=auxiliar.dato;
                    auxiliar.dato=auxiliar.siguiente.dato;
                    auxiliar.siguiente.dato=datoTemporal;
                }
                auxiliar=auxiliar.siguiente;
            }
        }
    }
    public void ordenarMenorAMayor()
    {
        int cantidadNodos=devolverCantidadNodos();
        int datoTemporal;
        Nodo auxiliar=primero;
        for(int contador=0;contador<cantidadNodos;contador++)
        {
            auxiliar=primero;
            while(auxiliar.siguiente!=null)
            {
                if(auxiliar.dato>auxiliar.siguiente.dato)
                {
                    datoTemporal=auxiliar.dato;
                    auxiliar.dato=auxiliar.siguiente.dato;
                    auxiliar.siguiente.dato=datoTemporal;
                }
                auxiliar=auxiliar.siguiente;
            }
        }
    }
}
