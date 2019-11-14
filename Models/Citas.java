public class Citas{
    private String Fecha, Hora, Descripcion;

    public Citas(String Fecha, String Hora, String Descripcion)
    {
        this.SetFecha(Fecha);
        this.SetHora(Hora);
        this.SetDescripcion(Descripcion);
    }
    public String SetFecha(String Fecha){
        this.Fecha = Fecha;
    }
    public String GetFecha(){
        return Fecha;
    }
    public String SetHora(String Hora){
        this.Hora = Hora;
    }
    public String GetHora(){
        return Hora;
    }
    public String SetDescripcion(String Descripcion){
        this.Descripcion = Descripcion;
    }
    public String GetDescripcion(){
        return Descripcion;
    }
}