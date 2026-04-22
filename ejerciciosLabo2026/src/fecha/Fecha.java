package fecha;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

    public Fecha(){
        this.dia = 2;
        this.mes = 4;
        this.anio = 2026;
    }

    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }

    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAnio(){
        return anio;
    }

    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }

    public void valida(){
        if (anio < 1){
            anio = 1900;
        }

        if (mes < 1 || mes > 12){
            mes = 1;
        }

        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            if (dia < 1 || dia > 31){
                dia = 1;
            }
        }
        else if (mes == 2){
            if (dia < 1 || dia > 28){
                dia = 1;
            }
        }
        else {
            if (dia < 1 || dia > 30){
                dia = 1;
            }
        }
    }

    public int diasMes(int mes){
        switch (mes){
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((anio % 4 == 0 && anio % 100 == 0) || (anio % 400 == 0)){ return 29; }
                else{ return 28; }
            default: return 31;
        }
    }

    public String corta(){
        return dia + "-" + mes + "-" + anio;
    }






}