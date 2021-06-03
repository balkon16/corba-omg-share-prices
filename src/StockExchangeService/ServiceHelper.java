package StockExchangeService;


/**
* StockExchangeService/ServiceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stockExchangeService.idl
* Thursday, June 3, 2021 11:53:15 AM CEST
*/

abstract public class ServiceHelper
{
  private static String  _id = "IDL:StockExchangeService/Service:1.0";

  public static void insert (org.omg.CORBA.Any a, StockExchangeService.Service that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static StockExchangeService.Service extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (StockExchangeService.ServiceHelper.id (), "Service");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static StockExchangeService.Service read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ServiceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, StockExchangeService.Service value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static StockExchangeService.Service narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof StockExchangeService.Service)
      return (StockExchangeService.Service)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      StockExchangeService._ServiceStub stub = new StockExchangeService._ServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static StockExchangeService.Service unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof StockExchangeService.Service)
      return (StockExchangeService.Service)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      StockExchangeService._ServiceStub stub = new StockExchangeService._ServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
