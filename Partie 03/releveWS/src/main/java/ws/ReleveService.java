package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@WebService(serviceName = "ReleveWS")
public class ReleveService {

    private final static List<Operation> operations = List.of(
            new Operation(TypeOperation.CREDIT,changeDate("2021-12-01"), 12899, "Vers Espèce"),
            new Operation(TypeOperation.DEBIT,changeDate("2021-12-02"), 10099, "Chèque Guichet"),
            new Operation(TypeOperation.DEBIT,changeDate("2021-12-03"), 999, "Prélèvement Assurence"),
            new Operation(TypeOperation.CREDIT,changeDate("2021-12-04"), 7000, "Virement")
    );

    @WebMethod
    public Releve getReleves(){
        return new Releve("123456789012123456",changeDate("2021-11-10"),14500,operations);
    }
    @WebMethod(operationName = "operationsByType")
    public List<Operation> getOperationsByType(String type){
        return operations.stream().filter(elm -> elm.getType().equals(type)).collect(Collectors.toList());
    }

    public static Date changeDate(String date){
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
