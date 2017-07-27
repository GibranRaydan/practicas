/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;


/**
 *
 * @author Gibran
 */
public class PruebaLibros {
    
    public static void main(String[] args) {
      
        String titulo = "arbol";
        String autor = "pepe";
        Libros libro = new Libros(titulo, autor);
        libro.setNumPaginas(320);
        libro.setCalificacion(1);
        
         String titulo2 = "casa";
        String autor2 = "juan";
        Libros libro2 = new Libros(titulo2, autor2);
        libro2.setNumPaginas(310);
        libro2.setCalificacion(10);
        
        ConjuntoLibros conjunto = new ConjuntoLibros();
        conjunto.AgregarLibro(libro);
        conjunto.AgregarLibro(libro2);
        
        conjunto.mostrarContenido();
        
        conjunto.mayorPuntuacion();
        
        conjunto.EliminarLibro("casa");
        conjunto.mostrarContenido();
        
    }
    
}
