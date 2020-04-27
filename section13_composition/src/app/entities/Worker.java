package app.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import app.entities.enums.WorkerLevel;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department departament;
    private List<HourContract> contracts = new ArrayList<>(); // lista pois o trabalhador pode ter vários contratos;

    public Worker() {

    }

    // lista não incluir no construtor - define o atributo e ja instancia ela vazia;
    public Worker(String name, WorkerLevel level, Double baseSalary, Department departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartament() {
        return departament;
    }

    public void setDepartament(Department departament) {
        this.departament = departament;
    }

    public List<HourContract> getHourContract() {
        return contracts;
    }

    public void addContract( HourContract contract ) {
        this.contracts.add( contract );
    }

    public void removeContract( HourContract contract ) {
        contracts.remove( contract );
    }

    public double income( int year, int month ) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for ( HourContract c : contracts ) {
            cal.setTime( c.getDate() );
            int c_year = cal.get( Calendar.YEAR );
            int c_month = 1 + cal.get( Calendar.MONTH );
            
            if ( year == c_year && month == c_month ) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
    
}