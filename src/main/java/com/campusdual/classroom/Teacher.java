package com.campusdual.classroom;

public class Teacher extends Person {
    //Estas clases heredan de la clase Person. Son especificaciones de la misma e incorporan nuevas propiedades respectivamente
    protected String area;

    public Teacher(String name, String surname, String area) {
        super(name, surname);
        this.area = area;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
