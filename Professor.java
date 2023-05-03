public class Professor extends Funcionario{
    
    private String disciplina;

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getDisciplina() {
        return this.disciplina;
    }



    public Professor(double salario, String nome, int idade, String endereco, String disciplina){
        super(salario, nome,idade, endereco);
        setDisciplina(disciplina);
    }
    public Professor(){
        
    }
    public Professor(String string, String string2, int i, String string3, int j, String string4) {
    }
}