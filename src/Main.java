import java.util.Random;

public class Main {
    static public void main(String[] args){
        int d = 6;
        long N = 1000;
        if(args.length>0){
            d = Integer.parseInt(args[0]);
        }
        if(args.length>1){
            N = Long.parseLong(args[1]);
        }
        var ranom = new Random();
        float num =0;
        var cube = new Cube(d);
        float[] bordes = new float[d+1];
        bordes[0] =0;
        bordes[d]=1;
        int v =0;
        for (long qw = 0;qw<N;qw++){
            num =ranom.nextFloat();
            cube.roll(num);
            v = cube.getValue();
            bordes[v]=num;

        }
        float delta = (float)1/(float)d;
        System.out.println("Results of determination:");
        System.out.println("\t\t\t\t\tCalculated\t|\tTrue");
        for (int i =1;i<=d;i++){
            System.out.printf("\t%d --> %f - %f\t|\t",i,bordes[i-1],bordes[i]);
            float left = (i-1)*delta;
            float right = left+delta;
            System.out.printf("%f - %f\n",left,right);
        }

    }
}
