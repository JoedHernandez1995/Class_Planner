package classes;

import java.util.ArrayList;

public class Student {
    //TODO attributes name(String), list<subject>, unitecId(String), 
    private String nombre;
    private ArrayList<Subject> clases_que_lleva;
    
    public Student(){
        
    }
    
    public Student(String nombre, ArrayList<Subject> clases_que_lleva, String unitecID){
        this.clases_que_lleva = new ArrayList<>();
        this.nombre = nombre;
        this.clases_que_lleva = clases_que_lleva;
    }
    
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    String getNombre(){
        return this.nombre;
    }
    
    void setClasesQueLleva(ArrayList<Subject> clases_que_lleva){
        this.clases_que_lleva = clases_que_lleva;
    }
    
    ArrayList<Subject> getClasesQueLleva(){
        return this.clases_que_lleva;
    }
    
    
}
