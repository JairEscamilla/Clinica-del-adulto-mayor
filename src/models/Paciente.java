package models;

public class Paciente{
    private String NombrePaciente, APaternoPaciente, AMaternoPaciente, CorreoPaciente, TContacto;
    private int EdadPaciente;

    public Paciente(String NombrePaciente, String APaternoPaciente, String AMaternoPaciente, String CorreoPaciente, String TContacto, int EdadPaciente){
        this.NombrePaciente = NombrePaciente;
        this.APaternoPaciente = APaternoPaciente;
        this.AMaternoPaciente = AMaternoPaciente;
        this.CorreoPaciente = CorreoPaciente;
        this.TContacto = TContacto;
        this.EdadPaciente = EdadPaciente;
    }

    public void SetNombrePaciente(String NombrePaciente){
        this.NombrePaciente = NombrePaciente;
    }

    public String GetNombrePaciente(){
        return NombrePaciente;
    }

    public void SetAPaternoPaciente(String APaternoPaciente){
        this.APaternoPaciente = APaternoPaciente;
    }

    public String GetAPaternoPaciente(){
        return APaternoPaciente;
    }

    public void SetAMaternoPaciente(String AMaternoPaciente){
        this.AMaternoPaciente = AMaternoPaciente;
    }

    public String GetAMaternoPaciente(){
        return AMaternoPaciente;
    }

    public void SetCorreoPaciente(String CorreoPaciente){
        this.CorreoPaciente = CorreoPaciente;
    }

    public String GetCorreoPaciente(){
        return CorreoPaciente;
    }

    public void SetTContacto(String TContacto){
        this.TContacto = TContacto;
    }

    public String GetTContacto(){
        return TContacto;
    }

    public void SetEdadPaciente(int EdadPaciente){
        this.EdadPaciente = EdadPaciente;
    }
    
    public int GetEdadPaciente(){
        return EdadPaciente;
    }

}