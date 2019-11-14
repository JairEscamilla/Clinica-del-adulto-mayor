public class Paciente{
    private String NombrePaciente, APaternoPaciente, AMaternoPaciente, CorreoPaciente, TContacto;
    private int EdadPaciente;

    public String SetNombrePaciente(String NombrePaciente){
        this.NombrePaciente = NombrePaciente;
    }
    public String GetNombrePaciente(){
        return NombrePaciente;
    }
    public String SetAPaternoPaciente(String APaternoPaciente){
        this.APaternoPaciente = APaternoPaciente;
    }
    public String GetAPaternoPaciente()
    {
        return APaternoPaciente;
    }
    public String SetAMaternoPaciente(String AMaternoPaciente){
        this.AMaternoPaciente = AMaternoPaciente;
    }
    public String GetAMaternoPaciente(){
        return AMaternoPaciente;
    }
    public String SetCorreoPaciente(String CorreoPaciente){
        this.CorreoPaciente = CorreoPaciente;
    }
    public String GetCorreoPaciente(){
        return CorreoPaciente;
    }
    public String SetTContacto(String TContacto){
        this.TContacto = TContacto;
    }
    public String GetTContacto(){
        return TContacto;
    }
    public int SetEdadPaciente(String EdadPaciente){
        this.EdadPaciente = EdadPaciente;
    }
    public int GetEdadPaciente(){
        return EdadPaciente;
    }
}