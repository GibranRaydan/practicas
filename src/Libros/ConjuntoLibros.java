
package Libros;

/**
 *
 * @author Gibran Raydan
 */
public class ConjuntoLibros {
    public Libros conjunto[];

    public ConjuntoLibros() {
      this.conjunto= new Libros[10];
    }
    public void AgregarLibro(Libros libro){
        for(int i=0;i<conjunto.length;i++){
            
            if(conjunto[i]==null ){
                conjunto[i]= libro;
                System.out.println("el libro "+"(" + libro.getTitulo()+ ")"+" ha sido agregado");
               break; 
                
            }
        }
    }
    public void EliminarLibro(String nombre){
        for(int i=0;i<conjunto.length;i++){
            if(conjunto[i]!=null){
                Libros libroAux = conjunto[i];
            if(libroAux.getTitulo().equals(nombre)){
                conjunto[i]=null;
                System.out.println("el libro " + "("+ libroAux.getTitulo()+")"+ " fue eliminado");
            }else{
                System.out.println("no se encontro el libro");
            }
            }
            
        }
    }
    public void mayorPuntuacion(){
        Libros libroM = conjunto[0];
        for(int i=0;i<conjunto.length;i++){
            if(conjunto[i]!=null){
                if(conjunto[i].getCalificacion() > libroM.getCalificacion()){
                    libroM = conjunto[i];
                }
            }
        }
        System.out.println("el libro con mejor puntuacion es:" + libroM.getTitulo());
       
    }
    public void mostrarContenido(){
        for(int i=0;i<conjunto.length;i++){
            if(conjunto[i]!= null){
                System.out.println(conjunto[i].getTitulo()+ "  " + conjunto[i].getAutor() );
            }else{
                System.out.println(conjunto[i]);
            }
            
        }
    }
    
    
}
