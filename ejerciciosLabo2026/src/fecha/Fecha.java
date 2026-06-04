package fecha;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    private ArrayList<Mes> meses = new ArrayList<>(Arrays.asList(
            Mes.ENERO, Mes.FEBRERO, Mes.MARZO, Mes.ABRIL, Mes.MAYO, Mes.JUNIO,
            Mes.JULIO, Mes.AGOSTO, Mes.SEPTIEMBRE, Mes.OCTUBRE, Mes.NOVIEMBRE, Mes.DICIEMBRE
    ));
    private ArrayList<Dia> dias = new ArrayList<>(Arrays.asList(
            Dia.LUNES, Dia.MARTES, Dia.MIERCOLES, Dia.JUEVES,
            Dia.VIERNES, Dia.SABADO, Dia.DOMINGO
    ));

    public Fecha(){
        this.dia = 1;
        this.mes = 1;
        this.anio = 2000;
    }

    public Fecha(int dia,int mes,int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.validar(anio, mes, dia);
    }

    public int getAnio() { return anio; }
    public int getMes() { return mes; }
    public int getDia() { return dia; }

    public void validar(int anio ,int mes,int dia){
        boolean esValido = true;

        if ((anio < 0) || (mes < 1 || mes > 12)) {
            esValido = false;
        }
        else {
            int diasEnMes = YearMonth.of(anio, mes).lengthOfMonth();
            if (dia < 1 || dia > diasEnMes) {
                esValido = false;
            }
        }

        if(!esValido){
            this.dia = 1;
            this.mes = 1;
            this.anio = 1900;
        }
    }

    public int diaMes(){ return YearMonth.of(this.anio, this.mes).lengthOfMonth(); }

    public Fecha siguiente(){
        LocalDate fechaActual = LocalDate.of(this.anio, this.mes, this.dia);
        LocalDate fechaNueva = fechaActual.plusDays(1);
        return new Fecha(fechaNueva.getDayOfMonth(), fechaNueva.getMonthValue(), fechaNueva.getYear());
    }

    public Fecha anterior(){
        LocalDate fechaActual = LocalDate.of(this.anio, this.mes, this.dia);
        LocalDate fechaNueva = fechaActual.minusDays(1);
        return new Fecha(fechaNueva.getDayOfMonth(), fechaActual.getMonthValue(), fechaActual.getYear());
    }

    public String corto(){ return this.dia + "-" + this.mes + "-" + this.anio; }

    public String largo(){
        LocalDate aux = LocalDate.of(this.anio, this.mes, this.dia);
        return dias.get(aux.getDayOfWeek().getValue() - 1) + " " + this.dia + " de "  + meses.get(mes - 1) + " del "+  anio;
    }

    public boolean igualQue(Fecha fechaComp){
        return (this.dia == fechaComp.getDia() && this.mes == fechaComp.getMes() && this.anio == fechaComp.getAnio());
    }

    public boolean menorQue(Fecha fechaComp){
        LocalDate estaFecha = LocalDate.of(this.anio, this.mes, this.dia);
        LocalDate otraFecha = LocalDate.of(fechaComp.getAnio(), fechaComp.getMes(), fechaComp.getDia());
        return estaFecha.isBefore(otraFecha);
    }

    public boolean mayorQue(Fecha fechaComp){
        LocalDate estaFecha = LocalDate.of(this.anio, this.mes, this.dia);
        LocalDate otraFecha = LocalDate.of(fechaComp.getAnio(), fechaComp.getMes(), fechaComp.getDia());
        return estaFecha.isAfter(otraFecha);
    }

    public static void main(String[] args){
        Fecha fecha1 = new Fecha(6, 4, 2026);
        System.out.println("Fecha 1 (Larga): " + fecha1.largo());
        System.out.println("Fecha 1 (Corta): " + fecha1.corto());

        System.out.println("Días en el mes actual: " + fecha1.diaMes());

        Fecha fechaSig = fecha1.siguiente();
        System.out.println("Siguiente fecha: " + fechaSig.corto());
        Fecha fechaAnt = fecha1.anterior();
        System.out.println("Anterior fecha: " + fechaAnt.corto());

        Fecha fecha2 = new Fecha(12, 6, 2026);
        Fecha fecha3 = new Fecha(6, 4, 2026);
        System.out.println("¿Es fecha 1 menor a fecha 2?: " + fecha1.menorQue(fecha2));
        System.out.println("¿Es fecha 1 mayor a fecha 2?: " + fecha1.mayorQue(fecha2));
        System.out.println("¿Es fecha 1 igual a fecha 2?: " + fecha1.igualQue(fecha2));
        System.out.println("¿Es fecha 1 igual a fecha 3?: " + fecha1.igualQue(fecha3));

        Fecha fechaInvalida = new Fecha(32, 13, 2026);
        System.out.println("Fecha inválida ajustada a: " + fechaInvalida.corto());
    }
}