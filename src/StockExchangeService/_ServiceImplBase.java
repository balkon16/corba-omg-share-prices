package StockExchangeService;


/**
* StockExchangeService/_ServiceImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stockExchangeService.idl
* Thursday, June 3, 2021 2:18:38 PM CEST
*/

public abstract class _ServiceImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements StockExchangeService.Service, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _ServiceImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getAvailableStockExchanges", new java.lang.Integer (0));
    _methods.put ("getLastQuotationByTickerAndStockExchange", new java.lang.Integer (1));
    _methods.put ("addNewQuotation", new java.lang.Integer (2));
    _methods.put ("addNewStockExchange", new java.lang.Integer (3));
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
       case 0:  // StockExchangeService/Service/getAvailableStockExchanges
       {
         String $result = null;
         $result = this.getAvailableStockExchanges ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // StockExchangeService/Service/getLastQuotationByTickerAndStockExchange
       {
         String ticker = in.read_string ();
         String stockExchange = in.read_string ();
         StockExchangeService.StockPrice $result = null;
         $result = this.getLastQuotationByTickerAndStockExchange (ticker, stockExchange);
         out = $rh.createReply();
         StockExchangeService.StockPriceHelper.write (out, $result);
         break;
       }

       case 2:  // StockExchangeService/Service/addNewQuotation
       {
         StockExchangeService.StockPrice stockPrice = StockExchangeService.StockPriceHelper.read (in);
         String stockExchange = in.read_string ();
         boolean $result = false;
         $result = this.addNewQuotation (stockPrice, stockExchange);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // StockExchangeService/Service/addNewStockExchange
       {
         String stockExchange = in.read_string ();
         boolean $result = false;
         $result = this.addNewStockExchange (stockExchange);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:StockExchangeService/Service:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _ServiceImplBase
