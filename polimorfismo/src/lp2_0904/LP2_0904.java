/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2_0904;

import dominio.Aluno;
import dominio.Disciplina;
import dominio.Pessoa;

/**
 *
 * @author hrausch
 */
public class LP2_0904 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * INSTANCIANDO PESSOA
         */
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        
        p1.setNome("Herbert Rausch");
        p1.setCpf("123321123-12");
        p1.setDataNascimento("02/09/1994");
        p1.setGenero('M');
        
        System.out.println("DADOS PESSOA ");
        System.out.println(p1);
        System.out.println("Nome: " + p1.getNome() );
        System.out.println("CPF" + p1.getCpf());
        
        
        p2.setNome("Fernanda Fernandes");
        p2.setCpf("999779097-12");
        p2.setDataNascimento("02/09/1994");
        p2.setGenero('F');
        
        System.out.println("DADOS PESSOA ");
        System.out.println(p2);
        System.out.println("Nome: " + p2.getNome() );
        System.out.println("CPF" + p2.getCpf());
        
        /**
         * INSTANCIANDO OBJETOS DO TIPO DISCIPLIA
         */
        Disciplina d1 = new Disciplina();
        d1.setNome("LLP2");
        d1.setCargaHoraria(30);
        d1.setProfessor(p1);
        
        System.out.println("DADOS DA DISCIPLINA");
        System.out.println("Nome Disciplina:" + d1.getNome());
        System.out.println("Carga Horaria:" + d1.getCargaHoraria());
        System.out.println("Professor: " + d1.getProfessor());
        System.out.println("Professor Nome: " + d1.getProfessor().getNome());
        System.out.println("Professor Nascimento:" + d1.getProfessor().getDataNascimento());
        
        
        /**
         * INSTANCIANDO ALUNOS
         */
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        
        a1.setNome("aluno 1");
        a1.setCpf("1122-92");
        a1.setNumeroMatricula("2005");
        a1.setDataIngresso("2015/01");
        
        a2.setNome("aluno 2");
        a2.setCpf("9999-84");
        a2.setNumeroMatricula("2006");
        a2.setDataIngresso("2016/01");
        
        a3.setNome("aluno 3");
        a3.setCpf("8888-8");
        a3.setNumeroMatricula("2005");
        a3.setDataIngresso("2015/02");
        
        System.out.println(a3);
        
    }
    
}
