package tp8;

public class Materia {

    private int idMateria;

    private String nombre;

    private int anio;

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria=idMateria;
        this.nombre = nombre;
        this.anio=anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria=idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio=anio;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if(o==this)
            return true;
        if((o == null) || (o.getClass() != this.getClass()))
            return false;
        
        Materia m= (Materia)o;
        return idMateria==m.getIdMateria()&&nombre.equals(m.getNombre())&&anio==m.getAnio();
    }
    
    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 31 * hash + idMateria;
        hash = 31 * hash + (null == nombre ? 0 : nombre.hashCode())+anio;
        return hash;
    }
}
