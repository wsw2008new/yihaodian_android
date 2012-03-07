// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.ConversionException;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.thoughtworks.xstream.converters.basic:
//            AbstractSingleValueConverter

public class URLConverter extends AbstractSingleValueConverter
{

    public URLConverter()
    {
    }

    static Class _mthclass$(String s)
    {
        Class class1;
        try
        {
            class1 = Class.forName(s);
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
        return class1;
    }

    @Override
	public boolean canConvert(Class class1)
    {
        Class class2;
        if(class$java$net$URL == null)
        {
            class2 = _mthclass$("java.net.URL");
            class$java$net$URL = class2;
        } else
        {
            class2 = class$java$net$URL;
        }
        return class1.equals(class2);
    }

    @Override
	public Object fromString(String s)
    {
        URL url;
        try
        {
            url = new URL(s);
        }
        catch(MalformedURLException malformedurlexception)
        {
            throw new ConversionException(malformedurlexception);
        }
        return url;
    }

    static Class class$java$net$URL;
}
