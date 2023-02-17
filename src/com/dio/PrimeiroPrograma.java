package com.dio;

import com.dio.model.*;
public class PrimeiroPrograma {

	public static void main(String[] args) {
		/*int a = 3;
		int b = 2;
		System.out.println("Hello World!! "+ (a+b));*/
		Gato gato = new Gato();
		Livros livro = new Livros();
		System.out.println(gato);
		System.out.println(livro);
	}

}
class Livros{
	private String nome;
	private String npag;
}
