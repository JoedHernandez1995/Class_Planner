package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Subject {
    //TODO attributes name(String), teacher(Teacher), time(Date), classroom(Classroom), string class code, string section
    private static SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
    private String nombre;
    private Date hora_inicial;
    private Classroom aula;
    private String codigo_clase;
    private String seccion;
    
    public Subject(){
        
    }
    
    public Subject(String nombre, String hora_inicial, String hora_final, Classroom aula, String codigo_clase, String seccion) throws ParseException{
        this.nombre = nombre;
        this.hora_inicial = formatter.parse(hora_inicial);
        this.aula = aula;
        this.codigo_clase = codigo_clase;
        this.seccion = seccion;
    }
    
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    String getNombre(){
        return this.nombre;
    }
    
    void setHoraInicial(String hora_inicial) throws ParseException{
        this.hora_inicial = formatter.parse(hora_inicial);
    }
    
    Date getHoraInicial(){
        return this.hora_inicial;
    }
    
    void setAula(Classroom aula){
        this.aula = aula;
    }
    
    Classroom getAula(){
        return this.aula;
    }
    
    void setCodigoClase(String codigo_clase){
        this.codigo_clase = codigo_clase;
    }
    
    String getCodigoClase(){
        return this.codigo_clase;
    }
    
    void setSeccion(String seccion){
        this.seccion = seccion;
    }
    
    String getSeccion(){
        return this.seccion;
    }
    
    public String toString(){
        return "Nombre: "+this.nombre + "Hora: "+this.hora_inicial + "Codigo: "+this.codigo_clase + "Seccion: "+this.seccion + "Aula: "+this.aula.toString();
    }
    
    
}
