package Client;

import StockExchangeService.Service;
import StockExchangeService.ServiceHelper;
import StockExchangeService.StockPrice;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;

public class StockExchangeServiceClient {
    public static void main(String args[]) {
        try {
            ORB orb = ORB.init(args, null);

            org.omg.CORBA.Object objRef =
                    orb.resolve_initial_references("NameService");
            NamingContext ncRef = NamingContextHelper.narrow(objRef);

            NameComponent nc = new NameComponent("Service", "");
            NameComponent path[] = {nc};

            Service serviceImpl = ServiceHelper.narrow(ncRef.resolve(path));

            System.out.println("Obtained a handle on server object: " + serviceImpl);
            String[] exchangeNames = serviceImpl.getAvailableStockExchanges();
            for (String exchangeName : exchangeNames){
                System.out.println("Name " + exchangeName);
            }


        } catch (Exception e) {
            System.out.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }
}
