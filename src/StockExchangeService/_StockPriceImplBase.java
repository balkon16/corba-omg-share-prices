package StockExchangeService;


/**
* StockExchangeService/_StockPriceImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stockExchangeService.idl
* Thursday, June 3, 2021 11:53:15 AM CEST
*/

public abstract class _StockPriceImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements StockExchangeService.StockPrice, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _StockPriceImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_ticker", new java.lang.Integer (0));
    _methods.put ("_set_ticker", new java.lang.Integer (1));
    _methods.put ("_get_price", new java.lang.Integer (2));
    _methods.put ("_set_price", new java.lang.Integer (3));
    _methods.put ("_get_currency", new java.lang.Integer (4));
    _methods.put ("_set_currency", new java.lang.Integer (5));
    _methods.put ("_get_measurementDateTime", new java.lang.Integer (6));
    _methods.put ("_set_measurementDateTime", new java.lang.Integer (7));
    _methods.put ("_get_stockExchange", new java.lang.Integer (8));
    _methods.put ("_set_stockExchange", new java.lang.Integer (9));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // StockExchangeService/StockPrice/_get_ticker
       {
         String $result = null;
         $result = this.ticker ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // StockExchangeService/StockPrice/_set_ticker
       {
         String newTicker = in.read_string ();
         this.ticker (newTicker);
         out = $rh.createReply();
         break;
       }

       case 2:  // StockExchangeService/StockPrice/_get_price
       {
         double $result = (double)0;
         $result = this.price ();
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 3:  // StockExchangeService/StockPrice/_set_price
       {
         double newPrice = in.read_double ();
         this.price (newPrice);
         out = $rh.createReply();
         break;
       }

       case 4:  // StockExchangeService/StockPrice/_get_currency
       {
         String $result = null;
         $result = this.currency ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 5:  // StockExchangeService/StockPrice/_set_currency
       {
         String newCurrency = in.read_string ();
         this.currency (newCurrency);
         out = $rh.createReply();
         break;
       }

       case 6:  // StockExchangeService/StockPrice/_get_measurementDateTime
       {
         int $result = (int)0;
         $result = this.measurementDateTime ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 7:  // StockExchangeService/StockPrice/_set_measurementDateTime
       {
         int newMeasurementDateTime = in.read_long ();
         this.measurementDateTime (newMeasurementDateTime);
         out = $rh.createReply();
         break;
       }

       case 8:  // StockExchangeService/StockPrice/_get_stockExchange
       {
         String $result = null;
         $result = this.stockExchange ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 9:  // StockExchangeService/StockPrice/_set_stockExchange
       {
         String newStockExchange = in.read_string ();
         this.stockExchange (newStockExchange);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:StockExchangeService/StockPrice:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _StockPriceImplBase
