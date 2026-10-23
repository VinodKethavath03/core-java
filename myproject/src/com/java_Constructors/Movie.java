package com.java_Constructors;
// copy constructors

public class Movie {
	String name;
	String director;
	String hero;
	String heroine;
	double budget;
	Movie() {
		System.out.println("No-Arg called");
	}
	Movie(Movie m1){
		this.name=m1.name;
		this.director=m1.director;
		this.hero=m1.hero;
		this.heroine=m1.heroine;
		this.budget=m1.budget;
		
	}
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Movie m1=new Movie();
		m1.name="ISMART SHANKAR";
		m1.director="PuriJaganath";
		m1.hero="RAM POTHINENI";
		m1.heroine="Nidhi Agarwal";
		m1.budget=4000000.0;
		m1.movieInfo();
		
		
		Movie m2=new Movie(m1);
		m2.movieInfo();
		System.out.println("main method ended");

	}
	void movieInfo() {
		System.out.println("Name of the Movie:"+name);
		System.out.println("Hero of the Movie:"+hero);
		System.out.println("Heroine of the Movie:"+heroine);
		System.out.println("Director of the Movie:"+director);
		System.out.println("Budget of the Movie:"+budget);
		System.out.println("*****************************************");
	}

}
