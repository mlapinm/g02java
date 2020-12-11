import java.util.ArrayList;

/**
 * hello
 */
public class hello {

    public static int randInt(int x1, int x2){

        int y = 0;
        y = (int)(Math.random()*(x2-x1+1)) + x1;

        return y;
    }

    public static void mNums( ArrayList<Integer> lres){
        int x = randInt(0,3) == 0 ? 1 : 0;
        lres.add(x);
        if(x == 0){
            int x1 = 10;
            while(x1 == 10){
                x1 = randInt(2, 19);
            }
            lres.add(x1);
            int x2 = 10;
            while(x2 == 10){
                x2 = randInt(2, 19);
            }
            lres.add(x2);
            int summ = x1 + x2;
            lres.add(summ);
            int xf = randInt(Math.max(x1, x2), 2*Math.max(x1, x2));
            lres.add(xf);
        }else if(x == 1){
            int x11 = randInt(3, 19);
            int x12 = randInt(2, 19);
            int x1 = Math.max(x11, x12);
            int x2 = Math.min(x11, x12);
            while(x2 == 10 || x1 == x2){
                x2 = randInt(2, x2-1);
            }
            lres.add(x1);
            lres.add(x2);
            lres.add(x1-x2);
            int xf = randInt(1, (x1-x2)*2+2);
            while(xf == x1-x2){
                xf = randInt(1, (x1-x2)*2+2);
            }
            lres.add(xf);
        }
        x = randInt(0,2) == 0 ? 1 : 0;
        lres.add(x);

    }

    public static void main(String[] args) {
        ArrayList<Integer> lres;
        for(int i=0;i<10;i++){
            lres = new ArrayList<Integer>();
            mNums(lres);
            System.out.println(lres);
        }

    }
    
}
