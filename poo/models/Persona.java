package poo.models;

import java.time.LocalDate;

public class Persona {
    private String    nombre;
    private int       edad;
    private LocalDate    fechaNacimiento;
    private String dni;

    public Persona(){

    }

    public Persona(String nombre, int edad, LocalDate fechaNacimiento, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Boolean esMayorDeEdad(){
        return this.edad > 18;
    }

    public String mostrar(){

        StringBuilder sb = new StringBuilder();

        sb.append("El Nombre es: ").append(this.nombre)
          .append("\n")
          .append("La edad es: ").append(this.edad)
          .append("\n")
          .append("La fecha de nacimiento es: ").append(this.fechaNacimiento)
          .append("\n")
          .append("El dni es: ").append(this.dni);
        return sb.toString();
    }

}
