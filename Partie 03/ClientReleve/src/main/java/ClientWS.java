import proxy.Releve;
import proxy.ReleveService;
import proxy.ReleveWS;

public class ClientWS {
    public static void main(String[] args) {
        ReleveService stub = new ReleveWS().getReleveServicePort();
        Releve releve = stub.getReleves();
        System.out.println("RIB:"+releve.getRib());
        System.out.println("Solde:"+releve.getSolde());
        releve.getOperations().stream().forEach(elm -> System.out.println("Type d'operation:"+elm.getType()+"-Montant:"+elm.getMontant()));
    }
}
