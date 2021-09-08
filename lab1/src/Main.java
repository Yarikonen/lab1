

public class Main {

    public static void main(String[] args) {

        short[] kek= new short[18];
        float[] x = new float[17];
        for(short i =1; i <=kek.length; i++){
            kek[i-1] = i ;

        }
        for(int i =0; i <x.length; i++){
            x[i] = (float) Math.random()*11 -9;
        }
        double[][] a = new double[18][17];
        for (int i =0; i<18;i++){
            for( int j =0; j<17;j++) {
                if (kek[i] == 12) {
                    a[i][j] = Math.exp(Math.tan(Math.cbrt(x[j])));
                }
                else {
                    if (       kek[i]==1 || kek[i]==3 || kek[i]==4
                            || kek[i]==6 || kek[i]==7 || kek[i]==11
                            || kek[i]==14|| kek[i]==15|| kek[i]==16) {
                        a[i][j] = Math.log(Math.pow(Math.sin(Math.pow((Math.atan((x[j]-3.5)/11))/0.5,2)),2));
                    } else {
                        a[i][j] = Math.cos(Math.pow(2*Math.sin(Math.sin(x[j])),3));
                    }
                }

            }
        }
        for(int i =0;i<18;i++){
            for(int j =0; j<17;j++){
                if (a[i][j]<0) {

                    System.out.printf("  %.2e", a[i][j]);
                }
                else{
                    System.out.printf("   %.2e",a[i][j]);
                }
            }
            System.out.print('\n');
        }
    }
}
