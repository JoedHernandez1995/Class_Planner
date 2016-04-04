package classes;

import java.util.ArrayList;

public class Teacher {
    //TODO name, unitecId, list<subject>
    private String nombre;
    private String unitecID;
    
    public Teacher(String nombre, String unitecID){
        this.nombre = nombre;
        this.unitecID = unitecID;
    }
    
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    String getNombre(){
        return this.nombre;
    }
    
    void setUnitecID(String unitecID){
        this.unitecID = unitecID;
    }
    
    String getUnitecID(){
        return this.unitecID;
    }
   
}
