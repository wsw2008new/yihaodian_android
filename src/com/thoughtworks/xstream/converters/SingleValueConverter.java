// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.thoughtworks.xstream.converters;


// Referenced classes of package com.thoughtworks.xstream.converters:
//            ConverterMatcher

public interface SingleValueConverter
    extends ConverterMatcher
{

    public abstract Object fromString(String s);

    public abstract String toString(Object obj);
}
