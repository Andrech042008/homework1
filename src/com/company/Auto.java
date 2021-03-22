package com.company;

 public class Auto extends Transport {
    private  int age;
    private Color color;

    public Auto(Type type, int age, Color color) {
        super(type);
        this.age = age;
        this.color = color;
    }
    final   void getInfo(int age){

    }

    public  void getInfo(Color color){

    }

    public   void getInfo(Type type, int age, Color color){

    }



    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

}
