package com.campusdual.classroom;

public class PoliceOfficer extends Person {
    //Estas clases heredan de la clase Person. Son especificaciones de la misma e incorporan nuevas propiedades respectivamente
    protected String squad;

    public PoliceOfficer(String name, String surname, String squad) {
        super(name, surname);
        this.squad = squad;
    }

    public String getSquad() {
        return this.squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }

    @Override
    public void getDetails() {
        System.out.println("Nombre completo: " + super.name + " " + super.surname + " " + this.squad);
    }
}
