package com.campusdual.classroom;

public class Person {
    protected String name;
    protected String surname;

    // La clase Person es la clase "padre" que representa de forma genéria a una persona.
// Incluye el metodo getDetails() que muestra por pantalla el valor de sus propiedades.
// Este metodo lo heredarán las clases que extiendan de ella, y será el que se utilice en printMapValues().
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void getDetails() {
        System.out.println("Nombre completo: " + name + " " + surname);
    }
}
