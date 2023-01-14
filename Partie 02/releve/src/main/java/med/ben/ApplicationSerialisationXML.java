package med.ben;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.Date;

public class ApplicationSerialisationXML {
    public static void main(String[] args) throws JAXBException {
        Releve releve = new Releve();
        releve.operations.add(new Operation(TypeOperation.CREDIT, new Date(), 12542, "Vers Expece"));
        releve.operations.add(new Operation(TypeOperation.DEBIT, new Date(), 23182, "Cheque Guichet"));
        releve.operations.add(new Operation(TypeOperation.CREDIT, new Date(), 23042, "Prelevement"));
        releve.operations.add(new Operation(TypeOperation.DEBIT, new Date(), 38842, "Virement..."));

        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(releve, new File("releve.xml"));

    }
}
