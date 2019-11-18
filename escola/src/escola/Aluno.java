package escola;

public class Aluno {
private String nome;
private double nota1;
private double nota2;

public String getNome() {
	if (getNome().length() <=30) {
		return nome;}
	else {
		System.out.println("O nome deve conter até 30 caracteres.");
		return getNome();
	}
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getNota1() {
	if (getNota1() >= 0 &&getNota1() <= 10) {
	return nota1;}
	else {
		System.out.println("Digite uma Nota válida");
		return getNota1();
	}
	
}
public void setNota1(double nota1) {
	this.nota1 = nota1;
}
public double getNota2() {
	if (getNota2() >= 0 &&getNota2() <= 10) {
		return nota2;}
		else {
			System.out.println("Digite uma Nota válida");
			return getNota2();
		}
}
public void setNota2(double nota2) {
	this.nota2 = nota2;
}


}
