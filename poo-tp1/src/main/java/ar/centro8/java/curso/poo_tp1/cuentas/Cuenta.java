package ar.centro8.java.curso.poo_tp1.cuentas; 
import ar.centro8.java.curso.poo_tp1.clientes.Cliente;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString 
@AllArgsConstructor 


public  abstract class  Cuenta {
   private int numeroCuenta;  
   protected double saldo; 
   private Cliente cliente;  

   // METODO DE ESTA CLASE PADRE LLAMADA Cuenta
   public void depositar(double monto) { 
      this.saldo += monto;
   }
   
   // METODO ABSTRACTO SIN CUERPO 
   public abstract void extraer(double monto);
}
