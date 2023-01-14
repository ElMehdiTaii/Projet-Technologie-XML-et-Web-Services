import jakarta.xml.ws.Endpoint;
import ws.ReleveService;

public class ServerJWS {

    private final static String endPoint = "http://0.0.0.0:9191/";
    public static void main(String[] args) {
        Endpoint.publish(endPoint, new ReleveService());
        System.out.println("Web Service deployed in "+endPoint);
    }
}
