package Client;

import StockExchangeService.Service;
import StockExchangeService.ServiceHelper;
import StockExchangeService.StockPrice;
import model.StockPriceImpl;
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

            System.out.println("Initial stock exchanges: " + serviceImpl.getAvailableStockExchanges());

            String newStockExchange = "LSE";
            System.out.println("Stock exchange " + newStockExchange
                    + " successfully added: " + serviceImpl.addNewStockExchange(newStockExchange));

            System.out.println("All stock exchanges " + serviceImpl.getAvailableStockExchanges());

            System.out.println(StockExchangeServiceClient.findAndPresentStockPrice(serviceImpl, "WSE", "CCC"));

            StockPrice newStockPrice = new StockPriceImpl("CDR", 161.58, "PLN", 1622548800, "WSE");
            System.out.println("Added new stock price: " + serviceImpl.addNewQuotation(newStockPrice, "WSE"));

            System.out.println(StockExchangeServiceClient.findAndPresentStockPrice(serviceImpl, "WSE", "CDR"));

        } catch (Exception e) {
            System.out.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }

    public static String findAndPresentStockPrice(Service service, String stockExchange, String companyTicker) {
        StockPrice stockPrice = service.getLastQuotationByTickerAndStockExchange(companyTicker, stockExchange);
        String msg = "Last quotation for "  + companyTicker + " at " + stockExchange;
        return (stockPrice != null) ? msg + " is " + stockPrice.price() : msg + " not found.";
    }
}
