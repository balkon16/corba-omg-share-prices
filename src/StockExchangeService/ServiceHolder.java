package StockExchangeService;

/**
* StockExchangeService/ServiceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stockExchangeService.idl
* Thursday, June 3, 2021 2:18:38 PM CEST
*/

public final class ServiceHolder implements org.omg.CORBA.portable.Streamable
{
  public StockExchangeService.Service value = null;

  public ServiceHolder ()
  {
  }

  public ServiceHolder (StockExchangeService.Service initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = StockExchangeService.ServiceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    StockExchangeService.ServiceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return StockExchangeService.ServiceHelper.type ();
  }

}
