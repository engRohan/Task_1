import java.util.Scanner;

public class Conversion {


        public static void main(String[] args) {
            float temp;
            char unit;
            Scanner in= new Scanner(System.in);
            System.out.println("Enter the value of Temperature");
            temp= in.nextFloat();

            System.out.println("Enter the unit of the original temperature");
            System.out.println("Enter 'c' for celcius");
            System.out.println("Enter 'f' for fharenheit");
            System.out.println("Enter 'k' for kelvin");


            unit=in.next().charAt(0);
            unit=Character.toLowerCase(unit);
            in.close();

            if (isValid(temp,unit)) {
                Converter(temp, unit);

            }else {
                System.out.println("enter a Valid Value");
            }

        }


        static boolean isValid(float temp,char unit){
            if (temp>=-273.15 && unit=='c'){
                return true;
            }
            if (temp>=0 && unit=='k'){
                return true;
            }
            if (temp>=460 && unit=='f'){
                return true;
            }
            return false;
        }

        static void Converter(float temp,char unit){
            float result;
            switch (unit){
                case 'c':
                    //conversion to fharenheit
                    result=(temp*((float) 9 /5))+32;
                    System.out.println("The value in fharenheit is:"+result);

                    // conversion to kelvin
                    result= (float) (temp+273.15);
                    System.out.println("The value in kelvin is:"+result);
                    break;


                case 'f':

                    // conversion to celcius
                    result=(temp-32)*((float) 5/9);
                    System.out.println("The value in celcius is:"+result);


                    // conversion to kelvin
                    result=(float)(result+273.15);
                    System.out.println("The value in kelvin is:"+result);
                    break;


                case 'k':
                    // conversion to celcius:

                    result=(float) (temp-273.15);
                    System.out.println("The value in celcius is:"+result);

                    // conversion to fharenheit

                    result=result*((float) 9/5)+32;
                    System.out.println("The value in fahrenheit is:"+result);
            }
        }
    }


