package com.Udea.Ejemplo_Udea.Controlador;

import com.Udea.Ejemplo_Udea.Entidades.Producto;
import com.Udea.Ejemplo_Udea.Servicios.productoServicio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class productoControlador {

    productoServicio servicio;

    public productoControlador() {
        this.servicio = new productoServicio();
    }

    @GetMapping("/LeerProducto")
    public String leerProducto(){
        Producto p=new Producto("R01","Manzana",5200,50,"Frutas");
        return p.toString();
    }

    @GetMapping("/ListaProductos")
    public ArrayList<Producto> listaProductos(){
        return this.servicio.getLista();
    }

    @GetMapping("/Consultar1/{posicion}")
    public Producto consultarUno(@PathVariable("posicion") Integer index){
        return this.servicio.buscarProducto(index);
    }

    @PostMapping("/Insertar")
    public String crearProducto(@RequestBody Producto x){
        return this.servicio.crearProducto(x);
    }

    @PutMapping("/Actualizar/{posicion}")
    public String actualiza(@PathVariable("posicion") Integer index,@RequestBody Producto p){
        return this.servicio.actualizarProducto(index,p);
    }

    @DeleteMapping("/Eliminar/{posicion}")
    public String eliminar(@PathVariable("posicion") Integer index){
        return this.servicio.eliminarProducto(index);
    }

}
