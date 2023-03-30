public class Empleado {

    /*
    Modele el objeto Empleado que posee las siguientes características, dni, nombre,
    apellido y salario. El mismo debe contar con la posibilidad de calcular el salario
    anual. A su vez se requiere otro método que permita aumentar el salario
    dependiendo del porcentaje que se le pase por parámetro. Considere crear un
    método que facilite imprimir por pantalla las características del objeto de la
    siguiente forma:
    Empleado[dni=?, nombre=?, apellido=?, salario=?]
    a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
    25000.
    b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
    27500.
    c. Imprima ambos objetos por pantalla
    d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
    salario anual del mismo.

     */

    private String nombre;
    private String apellido;
    private double salario;
    private String dni;


    public Empleado(String dni,String nombre, String apellido,double salario){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double calcularSalarioAnual(){
        return (this.salario*12);
    }

    public void aumentarSueldo(double porcentaje){

        this.salario = ((porcentaje/100)*this.salario)+this.salario;
    }

    public void muestraEmpleado(){
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Apellido: "+this.getApellido());
        System.out.println("DNI: "+this.getDni());
        System.out.println("Salario: "+this.getSalario());


    }
}
