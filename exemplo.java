import java.util.*;
    public class exemplo{
    //CHAMAR MÉTODOS DA CLASSE RANDOM    
        public static void main(String[] args){
            Random num = new Random();
            boolean n1=num.nextBoolean();
            float n2=num.nextFloat();
            double n3=num.nextDouble();
            int n4=num.nextInt();
            long n5=num.nextLong();
            double gauss=num.nextGaussian();

            System.out.println("Boolean = " + n1);
            System.out.println("Float = " + n2);
            System.out.println("Double = " + n3);
            System.out.println("Int = " + n4);
            System.out.println("Long = " + n5);
            System.out.println("Gaussian = " + gauss);
        }
    }
    