// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.io.File;

public class FileConverter extends AbstractSingleValueConverter
{

    public FileConverter()
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
        if(class$java$io$File == null)
        {
            class2 = _mthclass$("java.io.File");
            class$java$io$File = class2;
        } else
        {
            class2 = class$java$io$File;
        }
        return class1.equals(class2);
    }

    @Override
	public Object fromString(String s)
    {
        return new File(s);
    }

    @Override
	public String toString(Object obj)
    {
        return ((File)obj).getPath();
    }

    static Class class$java$io$File;
}
