package ws;

import java.util.Date;

public class Operation {

    private TypeOperation type;
    private Date dateOperation;
    private double montant;
    private String description;

    public Operation() {}

    public Operation(TypeOperation type, Date dateOperation, double montant, String description) {
        this.type = type;
        this.dateOperation = dateOperation;
        this.montant = montant;
        this.description = description;
    }

    public TypeOperation getType() {
        return type;
    }

    public void setType(TypeOperation type) {
        this.type = type;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
