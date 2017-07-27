/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;

/**
 *
 * @author Gibran Raydan    
 */
public class Libros {

    /**
     * @param args the command line arguments
     */
    public String Titulo;
    public String Autor;
    public int NumPaginas;
    public int Calificacion;
    
    public Libros(String Titulo , String Autor ){
        this.Titulo = Titulo;
        this.Autor = Autor;
  
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int NumPaginas) {
        this.NumPaginas = NumPaginas;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }
    
//    public String toString(Libros libro){
//        String s;
//        s = libro.getTitulo()+" "+ libro.getAutor()+" "+ libro.getNumPaginas()+" " libro.getCalificacion();
//        return s;
//    }
    
}
