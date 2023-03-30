import java.sql.SQLOutput;
import java.util.Scanner;

public class Hora {

    /*
    Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
    Tenga en cuenta el rango de valores aceptados para cada uno de estos.
    a. Hora: 0 … 23
    b. Minuto: 0 … 59
    c. Segundo: 0 … 59
    Considere el siguiente comportamiento:
    1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
    usando zero a la izquierda ejemplo 13:04:22 .
    2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
    3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
    4. Instanciar el objeto y probar los métodos creados.

     */

    private int hora;
    private int minuto;
    private int segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public Hora(int hora,int minuto,int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void muestraHora(){
        System.out.println(this.getHora()+":"+this.getMinuto()+":"+this.getSegundo());
    }

    public void clockView(){

        if(this.hora<10){
            System.out.print("0"+this.hora+":");
        }else{
            System.out.print(this.hora+":");
        }

        if(this.minuto<10){
            System.out.print("0"+this.minuto+":");
        }else{
            System.out.print(this.minuto+":");
        }

        if(this.segundo<10){
            System.out.print("0"+this.segundo);
        }else{
            System.out.print(this.segundo);
        }
    }

    public Hora(){
        int hora;
        int minuto;
        int segundo;
        boolean flag;

        Scanner scan = new Scanner(System.in);

        do {
            flag = false;
            System.out.println("Ingrese la hora:");
            hora = scan.nextInt();
            if(hora>=0 && hora<=23){
                this.hora = hora;
                flag = true;
            }else{
                System.out.println("Ingrese una hora valida.");
            }
        }while(!flag);

        do {
            flag = false;
            System.out.println("Ingrese los minutos :");
            minuto = scan.nextInt();
            if(minuto>=0 && minuto<=59){
                this.minuto = minuto;
                flag = true;
            }else{
                System.out.println("Ingrese minutos validos.");
            }
        }while(!flag);

        do {
            flag = false;
            System.out.println("Ingrese los segundos:");
            segundo = scan.nextInt();
            if(segundo>=0 && segundo<=59){
                this.segundo = segundo;
                flag = true;
            }else{
                System.out.println("Ingrese segundos validos.");
            }
        }while(!flag);

    }
}
