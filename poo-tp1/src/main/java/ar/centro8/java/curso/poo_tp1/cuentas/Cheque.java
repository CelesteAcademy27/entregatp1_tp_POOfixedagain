package ar.centro8.java.curso.poo_tp1.cuentas;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter; 

@Getter 
@Setter 
@AllArgsConstructor 

public class Cheque { 
    private double monto; 
    private String BancoEmisor; 
    private LocalDate fechaPago;

}
