/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author hrausch
 */
public class Aluno extends Pessoa{
    
    private String numeroMatricula;
    private String dataIngresso;

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(String dataIngresso) {
        this.dataIngresso = dataIngresso;
    }
    
    
    @Override
    public String toString(){
        String resultado = "";
        
        resultado = "NOME: " + nome ;
        resultado += "\nCPF: " + cpf;
        resultado += "\nMATRICULA: " + numeroMatricula;
        resultado += "\nINGRESSO: " + dataIngresso;
        
        return resultado;
        
    }
    
}
