package com.company;

public class Main {

    public static void main(String[] args) {
        Type type = new Type("auto");
	 Auto objectA = new Auto(type,45,Color.BLACK);

	 Toyota objectB= new Toyota(type,17,Color.BLACK,"TOYOTA","3.5");
	 Toyota objectC = new Toyota(type,20,Color.YELLOW,"Porche","2.5");

        System.out.println("возраст "+objectA.getAge());
        System.out.println(""+objectA.getColor());
        System.out.println(""+objectA.getType().getType());
        System.out.println("---------------");

        System.out.println("возраст"+objectB.getAge());
        System.out.println(""+objectB.getColor());
        System.out.println(""+objectB.getModel());
        System.out.println(""+objectB.getCuzov());
        System.out.println(""+objectB.getType().getType());
        System.out.println("----------------");


        System.out.println("возраст"+objectC.getAge());
        System.out.println(""+objectC.getColor());
        System.out.println(""+objectC.getModel());
        System.out.println(""+objectC.getCuzov());
        System.out.println(""+objectC.getType().getType());
        System.out.println("----------------");


    }



}
