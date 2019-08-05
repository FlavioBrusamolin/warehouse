package br.inatel.almoxarifado.classes;

public class Aluno {
    private String nome;
    private String email;
    private String matricula;
    private Componente[] componentes;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getMatricula() {
        return matricula;
    }

    public Componente[] getComponentes() {
        return componentes;
    }

    public void setComponentes(Componente[] componentes) {
        this.componentes = componentes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
 
    
}
