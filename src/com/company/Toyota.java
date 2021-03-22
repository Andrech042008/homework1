package com.company;

public final class Toyota extends Auto {
    private String model;
    private  String cuzov;

    public Toyota(Type type, int age, Color color, String model, String cuzov) {
        super(type, age, color);
        this.model = model;
        this.cuzov = cuzov;
    }



    public String getModel() {
        return model;
    }

    public String getCuzov() {
        return cuzov;
    }
}
