package batcave;

import org.w3c.dom.ls.LSOutput;

class DataTypesConversion{

    //Manual boxing
    byte byteVariable=1;
    Byte byteWrapper=Byte.valueOf(byteVariable);

    short shortVariable=2;
    Short shortWrapper=Short.valueOf(shortVariable);

    char charVariable='A';
    Character charWrapper=Character.valueOf(charVariable);

    boolean booleanVariable=true;
    Boolean booleanWrapper=Boolean.valueOf(booleanVariable);

    //Autoboxing automatic
    int integerVariable=10;
    Integer integerWrapper=integerVariable;

    long longVariable=20;
    Long longWrapper=longVariable;

    float floatVariable= 30.1F; //F is telling JVM to consider it as float and not double
    Float floatWrapper=floatVariable;

    double doubleVariable=40.2; //no need of mentioning
    Double doubleWrapper=doubleVariable;


    //Manual unboxing
    byte b=byteWrapper.byteValue();
    short s=shortWrapper.shortValue();
    char c=charWrapper.charValue();
    boolean bool=booleanWrapper.booleanValue();

    //Automatic Unboxing
    int i=integerWrapper;
    long l=longWrapper;
    float f=floatWrapper;
    double d=doubleWrapper;

}
public class AutoboxingandUnboxingExample {

    public static void main(String[] args) {

        DataTypesConversion dataTypesConversion=new DataTypesConversion();
        System.out.println("AutoBoxing");
        System.out.println(dataTypesConversion.byteWrapper);
        System.out.println(dataTypesConversion.shortWrapper);
        System.out.println(dataTypesConversion.charWrapper);
        System.out.println(dataTypesConversion.booleanWrapper);
        System.out.println(dataTypesConversion.integerWrapper);
        System.out.println(dataTypesConversion.longWrapper);
        System.out.println(dataTypesConversion.floatWrapper);
        System.out.println(dataTypesConversion.doubleWrapper);

        System.out.println();

        System.out.println("UnBoxing");
        System.out.println(dataTypesConversion.b);
        System.out.println(dataTypesConversion.s);
        System.out.println(dataTypesConversion.c);
        System.out.println(dataTypesConversion.bool);
        System.out.println(dataTypesConversion.i);
        System.out.println(dataTypesConversion.l);
        System.out.println(dataTypesConversion.f);
        System.out.println(dataTypesConversion.d);



    }

}












