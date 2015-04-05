public class Aluno{

	public String nomeAluno;
	public Turma turmaAluno;
	
	public Aluno(String nome, Turma turma){
	
		this.nomeAluno = nome;
		this.turmaAluno = turma;
	
	}
	
	public void imprimir(){
	
		System.out.println("Nome Aluno: " + nomeAluno);
		System.out.println("Aluno-Turma (memoria): " + turmaAluno);
	}

}

class Turma{

	public String codigoTurma;
	public Curso cursoTurma;
			
	public void imprimir(){
	
		System.out.println("Turma (memoria): " + this);
		System.out.println("Turma: " + codigoTurma);
		System.out.println("Curso-Turma (memoria): " + cursoTurma);
	}
}

class Curso{
	public String nomeCurso;
	
	public void imprimir(){
	
		System.out.println("Curso (memoria): " + this);
		System.out.println("Curso: " + nomeCurso);
	}
}

class Principal{

	public static void main(String [] args){
	
		Curso curso1 = new Curso();
		curso1.nomeCurso = "Informatica";
		
		Turma turma1 = new Turma();
		turma1.codigoTurma = "INF2015";
		
		//O objeto cursoTurma do objeto turma1 faz referencia ao objeto curso1
		turma1.cursoTurma = curso1;
		
		Aluno aluno1 = new Aluno("Herbert", turma1);
			
		aluno1.imprimir();
		aluno1.turmaAluno.imprimir();
		aluno1.turmaAluno.cursoTurma.imprimir();
	
	}

}