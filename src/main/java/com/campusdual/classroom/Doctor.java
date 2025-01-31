package com.campusdual.classroom;

public class Doctor extends Person {
    //Estas clases heredan de la clase Person. Son especificaciones de la misma e incorporan nuevas propiedades respectivamente
    protected String specialization;

    public Doctor(String name, String surname, String specialization) {
        super(name, surname);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void getDetails() {
        System.out.println("Nombre completo: " + super.name + " " + super.surname + " " + this.specialization);
    }
}
