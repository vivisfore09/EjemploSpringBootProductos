package com.Udea.Ejemplo_Udea.Servicios;

import com.Udea.Ejemplo_Udea.Entidades.Producto;

import java.util.ArrayList;

public class productoServicio {

    ArrayList<Producto> lista=new ArrayList<Producto>();

    public productoServicio() { //Constructor
    this.datosIniciales();
    }

    public ArrayList<Producto> getLista() { //Datos lista
        return lista;
    }

    public void datosIniciales(){
    lista.add(new Producto("Ref01","Naranjas",4500.0f,60,"Frutas"));
    lista.add(new Producto("Ref02","Queso",8500,45,"Lacteos"));
    lista.add(new Producto("Ref03","Jamon",25000,20,"Carnes"));
    lista.add(new Producto("Ref04","Arroz",2500,21,"Cereal"));
    lista.add(new Producto("Ref05","Manzana",2500,12,"Frutas"));
    }

    public Producto buscarProducto(int index){
        return lista.get(index);
    }

    public String crearProducto(Producto p){
     lista.add(p);
     return "Producto Registrado Exitosamente";
    }

    public String actualizarProducto(int index, Producto p){
        lista.set(index,p);
        return "Producto modificado";
    }

    public String eliminarProducto(int index){
        lista.remove(index);
        return "Producto Eliminado";
    }


}
