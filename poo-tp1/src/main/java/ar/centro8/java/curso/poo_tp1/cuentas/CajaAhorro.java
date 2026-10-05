package ar.centro8.java.curso.poo_tp1.cuentas;



import ar.centro8.java.curso.poo_tp1.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString 


public class CajaAhorro extends Cuenta{ 
    
    private double tasaInteres;

    // CONSTRUCTOR DE ESTA CLASE LLAMADA CajaAhorro
public CajaAhorro(int numeroCuenta, double saldo, Cliente cliente, double tasaInteres ) {
        super(numeroCuenta, saldo, cliente); 
        this.tasaInteres = tasaInteres;
        
    }
  
  
    // METODO EXTRAER 
    @Override 
    public void extraer(double monto) { 
        if (monto > 0) { 
            System.out.println("No se puede hacer la extracción: el monto debe ser mayor a cero"); 
        } else if (monto > getSaldo()) { 
            System.out.println("No se puede hacer la extracción: saldo insuficiente."); 
            System.out.println("Saldo disponible: $" + getSaldo()); 
        } else { 
            setSaldo(getSaldo()-monto); 
            System.out.println("Se extrajeron:$" + monto);
            System.out.println("Saldo actual: $" + getSaldo()); 
        }
    }


   // METODO COBRAR INTERESES 
   public void cobrarIntereses() { 
    if (getSaldo() > 0 && this.tasaInteres > 0) { 
        double interes = getSaldo() * (this.tasaInteres/100); 
        setSaldo(getSaldo() + interes); 
        System.out.println("Interes acreditado:$" + getSaldo()); 
    } else { 
        System.out.println("No se puede acreditar: tanto el saldo y la tasa de interes deben ser mayores que cero");

    }
    

   }
   
}
