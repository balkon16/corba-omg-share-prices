package StockExchangeService;

/**
* StockExchangeService/StockPriceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stockExchangeService.idl
* Thursday, June 3, 2021 2:18:38 PM CEST
*/

public final class StockPriceHolder implements org.omg.CORBA.portable.Streamable
{
  public StockExchangeService.StockPrice value = null;

  public StockPriceHolder ()
  {
  }

  public StockPriceHolder (StockExchangeService.StockPrice initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = StockExchangeService.StockPriceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    StockExchangeService.StockPriceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return StockExchangeService.StockPriceHelper.type ();
  }

}
