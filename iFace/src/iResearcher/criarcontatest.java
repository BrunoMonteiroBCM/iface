package iResearcher;

import java.util.Scanner;

public class criarcontatest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		criarconta criarconta = new criarconta();
		
		System.out.println("Insira seu nome");
		String nome = input.next();
		criarconta.setnome(nome);
		//System.out.println(criarconta.getnome());
		
		System.out.println("Insira seu novo usuario\n");
		String usuario = input.next();
		criarconta.setsusuario(usuario);
		//System.out.println(criarconta.getusuario());
	
		System.out.println("Insira seu email\n");
		String email = input.next();
		criarconta.setemail(email);
		//System.out.println(criarconta.getusuario());
		
		System.out.println("Insira sua senha\n");
		String senha = input.next();
		criarconta.setsenha(senha);
		
		System.out.println("Sexo:\n");
		System.out.println("(M) Masculino\n(F) Feminino\n");
		String sexo = input.next();
		criarconta.setsexo(sexo);
		System.out.println(criarconta.getsexo());
		
		
		
		//String senha2 = String.valueOf().getPassword()).trim(); // ocultar os caracteres da senha
		
		//System.out.printf("Olá %c, Seja bem vindo ao iFace! ", nome); 

		
		/*criarconta.setsexo(boolean);
		boolean sexo = input.nextInt();
		System.out.println(criarconta.getsexo());
	*/}

}	