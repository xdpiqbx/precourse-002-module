package main.java.module_002.lesson_001_data_types;

public class DataTypes {
    public static void main(String[] args) {
        {
            boolean bZ = true;

            byte bNum = -128; // from -128 to 127
            short sNum = -128; // from -32768 to 32767
            int iX = 123; // from -2 147 483 648 to 2 147 483 647
            long lNum = 1000; // from -9 223 372 036 854 775 808 to 9 223 372 036 854 775 807

            float fNum = 3.1234567f; // for storing 6 to 7 decimal digits
            double dNum = 3.123456789012345; // for storing 15 decimal digits

            char cSymb = '#'; // from 0 to 65535 (symbol code)

            String sStr = "some string";

            System.out.println(bNum);
        }

        {
            // NOT Explicit type conversion
            int iNumber = 150;
            byte bSmall = 16;
            iNumber = bSmall;
            System.out.println(iNumber);
        }

        {
            // Explicit type conversion
            int iNumber = 150;
            byte bSmall = 16;
            // bSmall = iNumber; // ERROR!
            bSmall = (byte) iNumber; // Ok =) but lost data
            System.out.println(bSmall); // -106 (overflow)
        }

        {
            // wrapper class = 	provides a way to use primitive data types as reference data types
            //					reference data types contain useful methods
            //					can be used with collections (ex.ArrayList)

            //primitive		//wrapper
            //---------		//-------
            // boolean		Boolean
            // char			Character
            // int			Integer
            // double		Double

            // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
            // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

            Boolean bZ = true;

            Byte bNum = -128; // from -128 to 127
            Short sNum = -128; // from -32768 to 32767
            Integer iX = 123; // from -2 147 483 648 to 2 147 483 647
            Long lNum = 9223372036854775807l; // from -9 223 372 036 854 775 808 to 9 223 372 036 854 775 807

            Float fNum = 3.1234567f; // for storing 6 to 7 decimal digits
            Double dNum = 3.123456789012345; // for storing 15 decimal digits

            Character cSymb = '#'; // from 0 to 65535 (symbol code)
        }

    }
}
