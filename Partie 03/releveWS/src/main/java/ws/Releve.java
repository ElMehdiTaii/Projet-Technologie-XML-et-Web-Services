package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Releve {

    private String rib;
    private Date dateReleve;
    private double solde;
    private List<Operation> operations = new ArrayList<Operation>();

    public Releve() {
    }

    public Releve(String rib, Date dateReleve, double solde, List<Operation> operations) {
        this.rib = rib;
        this.dateReleve = dateReleve;
        this.solde = solde;
        this.operations = operations;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
}
