public class Paciente
{
    private String NombreMedico, APaternoMedico, AMaternoMedico, CorreoMedico;
    
    public String SetNombreMedico(String NombreMedico){
        this.NombreMedico = NombreMedico;
    }
    public String GetNombreMedico()
    {
        return NombreMedico;
    }
    public String SetAPaternoMedico(String APaternoMedico){
        this.APaternoMedico = APaternoMedico;
    }
    public String GetAPaternoMedico(){
        return APaternoMedico;
    }
    public String SetAMaternoMedico(String AMaternoMedico){
        this.AMaternoMedico = AMaternoMedico;
    }
    public String GetAMaternoMedico(){
        return AMaternoMedico;
    }
    public String SetCorreoMedico(String CorreoMedico){
        this.CorreoMedico = CorreoMedico;
    }
    public String GetCorreoMedico(){
            return CorreoMedico;
    }
}