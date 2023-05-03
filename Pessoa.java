 public class Pessoa {
    

    public static void main(String[] args) {
        
        Pessoa pessoa =new Pessoa("Isaque",24,"Etec");

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getEndereço());

        Funcionario funcionario =new Funcionario(2000000,"Isaque",24,"Etec");

        System.out.println(funcionario.getSalario());
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getIdade());
        System.out.println(funcionario.getEndereço());

        Aluno aluno =new Aluno("João",17,"Ibirarema","3º","Informática");

        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getEndereço());
        System.out.println(aluno.getSemestre());
        System.out.println(aluno.getCurso());
    
        
        Professor professor =new Professor("PW2","Isaque",24,"Etec", 2000000, "Professor");

        System.out.println(professor .getSalario());
        System.out.println(professor .getNome());
        System.out.println(professor .getIdade());
        System.out.println(professor .getEndereço());
        System.out.println(professor .getDisciplina());
    
        

        FuncAdm funcadm =new FuncAdm("PW2","Professor",24,"Isaque", 2000000, "Etec");

        System.out.println(funcadm.getSalario());
        System.out.println(funcadm.getNome());
        System.out.println(funcadm.getIdade());
        System.out.println(funcadm.getEndereço());
        System.out.println(funcadm.getSetor());
        System.out.println(funcadm.getFuncao());

        
        

    }







    private String nome;
    private int idade;
    private String endereço;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getEndereço() {
        return this.endereço;
    }


    public Pessoa (String nome, int idade, String endereço){
        this.nome=nome;
        this.idade=idade;
        this.endereço=endereço;
    }
    public Pessoa(){
        
    }
} 
    

