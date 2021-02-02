package atividade01;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso; 
	private LocalDate dataNascimento;
	private String nivelAtividade;
	private double sexo;
	private double altura;
	
	//Altura
	public void setAltura(double altura) {
	this.altura=altura;
	} 
	public double getAltura() {
		return this.altura;
	}
	
	//genero
	public void setSexo (double sexo) {
		this.sexo = sexo;
	}
	
	//imc
	public double getImc() {
		return this.peso/ Math.pow(altura, 2);
	}
	
	public String setNome (String nome) {
	 return this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	//peso
	public double getPeso(double peso) {
	return peso;
	}
	
	 //data
	
	public LocalDate setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public LocalDate getDataNascimento() {
		LocalDate dataNascimento;
		
	
	}
	
	//obter idade
	public int getIdade() {
		LocalDate hoje = LocalDate.now();
	Period periodo = Period.between(this.dataNascimento, hoje);
	return idade;
	
	}
	
	//****metodo
	public String resultadoImc() {
		if (this.getImc() <= 16) {
			System.out.println("Isso indica: \n Magreza grave");
		}
		else {
			
		}
			if (this.getImc >16 && this.getImc <=17 ) {
				System.out.println("Isso indica: \n Magreza moderada");
			
			} 
			
			if (this.getImc > 17 && this.getImc <= 18.5) {
				System.out.println("Isso indica: \n Magreza leve");
				
			}
			else {
				
			}
				if (this.getImc >18.5 && this.getImc <=25 ) {
					System.out.println("Isso indica: \n um status saudavel");
				
			}
		
}	
}	
