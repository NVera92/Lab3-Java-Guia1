public class Banco {
    /*
    Modele el objeto que representa la cuenta de un banco, con identificador, nombre
    y balance. Considere los getters, setters y constructores necesarios. Tenga en
    cuenta los siguientes métodos.
    a. El método crédito que representa un depósito de dinero en la cuenta. Este
    método debe devolver el balance luego de la operación.
    b. El método débito que representa una sustracción de dinero de la cuenta.
    Este método debe devolver el balance luego de la operación. Si el dinero en
    la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
    pantalla un aviso.
    c. Un método que imprima por pantalla las características del objeto.

     */

    private int id;
    private String nombre;
    private double balance;

    public Banco(int id,String nombre,double balance){
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public double credito(double monto){
        return (this.balance+monto);
    }

    public double debito(double monto){

        if(monto<=this.balance){
            return (this.balance-monto);
        }else {
            System.out.println("El monto excede al dinero en caja");
            return this.balance;
        }
    }

    @Override
    public String toString() {
        return "Banco{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }
}
