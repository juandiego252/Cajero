

public class cajero {
    double saldo = 10000;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void conSultaSaldo(){
        System.out.println("Su saldo actual es de $:" + getSaldo());
    }
    public void retirarDinero(double cantidad){
        if (cantidad <= saldo){
            saldo = saldo - cantidad;
            System.out.println("Retiro $:" + cantidad + "exitoso");
        } else {
            System.out.println("Saldo Insuficiente.");
        }
    }
    public void depositarDinero(double cantidad){
        saldo = saldo + cantidad;
        System.out.println("Deposito $:" + cantidad + "exitosamente");
    }
}
