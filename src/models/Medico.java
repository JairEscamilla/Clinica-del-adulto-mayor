package models;

public class Medico{
    private String NombreMedico, APaternoMedico, AMaternoMedico, CorreoMedico;
    
    public Medico(String NombreMedico, String APaternoMedico, String AMaternoMedico, String CorreoMedico){
        this.NombreMedico = NombreMedico;
        this.APaternoMedico = APaternoMedico;
        this.AMaternoMedico = AMaternoMedico;
        this.CorreoMedico = CorreoMedico;
    }

    public void SetNombreMedico(String NombreMedico){
        this.NombreMedico = NombreMedico;
    }

    public String GetNombreMedico(){
        return NombreMedico;
    }

    public void SetAPaternoMedico(String APaternoMedico){
        this.APaternoMedico = APaternoMedico;
    }

    public String GetAPaternoMedico(){
        return APaternoMedico;
    }

    public void SetAMaternoMedico(String AMaternoMedico){
        this.AMaternoMedico = AMaternoMedico;
    }

    public String GetAMaternoMedico(){
        return AMaternoMedico;
    }

    public void SetCorreoMedico(String CorreoMedico){
        this.CorreoMedico = CorreoMedico;
    }
    
    public String GetCorreoMedico(){
            return CorreoMedico;
    }

}