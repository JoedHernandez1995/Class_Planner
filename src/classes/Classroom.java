package classes;

public class Classroom {
    //TODO Attributes number(String)
    private int numero_aula;
    private int numero_edificio;
    
    public Classroom(){
        
    }
    
    public Classroom(int numero_aula,int numero_edificio){
        this.numero_aula = numero_aula;
        this.numero_edificio = numero_edificio;
    }
    
    void setNumeroAula(int numero_aula){
        this.numero_aula = numero_aula;
    }
    
    int getNumeroAula(){
        return this.numero_aula;
    }
    
    public String toString(){
        return this.numero_aula+"/"+this.numero_edificio;
    }
    
    
}
