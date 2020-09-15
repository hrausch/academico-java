class Aluno{

	public String nomeAluno;
	public Turma turmaAluno;
	
	public Aluno(){
	

		System.out.println("Instancia Aluno");
	
	}
	
	public void imprimir(){
	
		System.out.println("Nome Aluno: " + nomeAluno);
		System.out.println("Aluno-Turma (memoria): " + turmaAluno);
	}

}

class Tecnico extends Aluno{
	public String curso;

	public Tecnico(){
		System.out.println("Instancia Tec");
	}

	//sobrescrita
	public void imprimir(){
		System.out.println("Imprimir tec");
	}



	
}

class Turma{

	public String codigoTurma;
	public Curso cursoTurma;
	

	public Turma(){
		System.out.println("Instancia de Turma");
	}

	public Turma(String codigo){
		System.out.println("Instancia de turma 2");
	}

	public void imprimir(){
	
		System.out.println("Turma (memoria): " + this);
		System.out.println("Turma: " + codigoTurma);
		System.out.println("Curso-Turma (memoria): " + cursoTurma);
	}

	public void imprimir(int i)
	{
		System.out.println("Metodo imprimir");
	}
}

class Curso{
	public String nomeCurso;
	
	public void imprimir(){
	
		System.out.println("Curso (memoria): " + this);
		System.out.println("Curso: " + nomeCurso);
	}
}

public class Principal{

	public static void main(String [] args){
	


	
	}

}




