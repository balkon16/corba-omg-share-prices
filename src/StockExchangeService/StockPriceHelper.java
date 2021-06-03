package StockExchangeService;


/**
* StockExchangeService/StockPriceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stockExchangeService.idl
* Thursday, June 3, 2021 2:29:03 PM CEST
*/

abstract public class StockPriceHelper
{
  private static String  _id = "IDL:StockExchangeService/StockPrice:1.0";

  public static void insert (org.omg.CORBA.Any a, StockExchangeService.StockPrice that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static StockExchangeService.StockPrice extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (StockExchangeService.StockPriceHelper.id (), "StockPrice");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static StockExchangeService.StockPrice read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_StockPriceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, StockExchangeService.StockPrice value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static StockExchangeService.StockPrice narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof StockExchangeService.StockPrice)
      return (StockExchangeService.StockPrice)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      StockExchangeService._StockPriceStub stub = new StockExchangeService._StockPriceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static StockExchangeService.StockPrice unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof StockExchangeService.StockPrice)
      return (StockExchangeService.StockPrice)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      StockExchangeService._StockPriceStub stub = new StockExchangeService._StockPriceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
