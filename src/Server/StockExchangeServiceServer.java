package Server;

import StockExchangeService.Service;
import StockExchangeService.ServiceHelper;
import model.ServiceImpl;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;

public class StockExchangeServiceServer {

    public static void main(String args[]) {

        try {
            ORB orb = ORB.init(args, null);

            ServiceImpl serviceImpl = new ServiceImpl();
            serviceImpl.setORB(orb);
            org.omg.CORBA.Object objRef =
                    orb.resolve_initial_references("NameService");
            NamingContext ncRef = NamingContextHelper.narrow(objRef);

            Service href = ServiceHelper.narrow(serviceImpl);

            NameComponent nc = new NameComponent("Service", "");
            NameComponent path[] = {nc};
            ncRef.rebind(path, href);

            System.out.println("StockExchangeServiceServer ready and waiting ...");

            orb.run();

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }

        System.out.println("StockExchangeServiceServer Exiting ...");

    }
}