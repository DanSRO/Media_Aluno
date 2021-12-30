package exercicio03;
/*Crie a classe Aluno com as especifica��es: 
 *Atributos: nome, CPF, curso, disciplina, notaP1, notaP2 e notaFinal;
 *M�todos: Crie os m�todos set e get para cada atributo;
 *mostraAluno(): Imprime as informa��es sobre o aluno;
 *calculaNota(): A partir da P1 e P2 calcula a nota do aluno;
 *calculaNotaFinal(): A partir da m�dia das notas 
 *calcula nota final, deve receber um par�metro com o valor da nota da PF;
 *mostraSituacao(): imprime se o aluno est� aprovado ou reprovado e sua nota;
 *Crie um construtor para a classe Aluno. 
 *Valide os dados nos m�todos set e no construtor. 
 *Escreva a classe AlunoTeste para testar a classe Aluno;
 *Crie dois objetos do tipo Aluno;
 *Em seguida pe�a ao usu�rio para entrar com os dados de cada aluno e 
 *utilize os m�todos set para armazenar esses dados;
 *Chame o m�todo mostraSituacao() para os objetos;
 *Chame o m�todo calculaNotaFinal(), se necess�rio o usu�rio deve entrar com a nota da PF;
 *Chame os m�todos mostraAluno() e mostraSituacao() para cada objeto. 
*/

public class Aluno {
	String nome, CPF, curso, disciplina; 
	float notaP1, notaP2, notaFinal, provaFinal;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getCPF() {
		return this.CPF;
	}
	public void setCPF(String CPF) {
		this.CPF=CPF;
	}
	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String curso) {
		this.curso=curso;		
	}
	public String getDisciplina() {
		return this.disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina=disciplina;
	}
	public float getNotaP1() {
		return this.notaP1;
	}
	public void setNotaP1(float notaP1) {
		this.notaP1=notaP1;
	}
	public float getNotaP2() {
		return this.notaP2;
	}
	public void setNotaP2(float notaP2) {
		this.notaP2=notaP2;
	}
	public float getNotaFinal() {
		return this.notaFinal;
	}
	public void setNotaFinal(float notaFinal) {
		this.notaFinal=notaFinal;
	}
	
	public Aluno() {
	}
	public Aluno(String nome, String CPF, String curso, String disciplina, float notaP1, float notaP2, float notaFinal) {
		super();
		this.nome=nome;
		this.CPF=CPF;
		this.curso=curso;
		this.disciplina=disciplina;
		this.notaP1=notaP1;
		this.notaP2=notaP2;
		this.notaFinal=notaFinal;
	}
	
	public void mostraAlunos() {
		System.out.println("Nome :"+this.nome);
		System.out.println("CPF :"+this.CPF);
		System.out.println("Curso :"+this.curso);
		System.out.println("Disciplina :"+this.disciplina);
		System.out.println("Nota P1:"+this.notaP1);
		System.out.println("Nota P2 :"+this.notaP2);
		System.out.println("Nota Final :"+this.notaFinal);
	}
	
	public float calculaNota() {
		float mediaParcial= (notaP1+notaP2)/2;
		return mediaParcial;		
	}
	
	public float calculaNotaFinal() {
		notaFinal=(provaFinal+calculaNota())/2;
		return notaFinal;
	}
	
	public void mostraSituacao() {
		if(calculaNota()>=6) {
			System.out.println("Aluno "+this.nome+" aprovado com m�dia:  "+calculaNota());
		}else {
			System.out.println("Aluno "+this.nome+" reprovado com m�dia: "+calculaNota());
		}
	}
	}

