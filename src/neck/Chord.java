/**
 *
 * @author Jason Heyer
 */
package neck;

public class Chord {

    private int bigE;
    private int bigA;
    private int bigD;
    private int bigG;
    private int bigB;
    private int littleE;
    private int n;
    private int x;
    private String chord;
//    private int[] string = new int[6];
//    private int[] fret = new int[12]; 
    private int[][] neck = new int[6][12];
    private int[][] vneck = new int[12][6];

    public Chord() {

    }

    public Chord(int bigE, int bigA, int bigD, int bigG, int bigB, int littleE) {
        this.bigE = bigE;
        this.bigA = bigA;
        this.bigD = bigD;
        this.bigG = bigG;
        this.bigB = bigB;
        this.littleE = littleE;
    }

    public int getBigE() {
        return bigE;
    }

    public void setBigE(int bigE) {
        this.bigE = bigE;
    }

    public int getBigA() {
        return bigA;
    }

    public void setBigA(int bigA) {
        this.bigA = bigA;
    }

    public int getBigD() {
        return bigD;
    }

    public void setBigD(int bigD) {
        this.bigD = bigD;
    }

    public int getBigG() {
        return bigG;
    }

    public void setBigG(int bigG) {
        this.bigG = bigG;
    }

    public int getBigB() {
        return bigB;
    }

    public void setBigB(int bigB) {
        this.bigB = bigB;
    }

    public int getLittleE() {
        return littleE;
    }

    public void setLittleE(int littleE) {
        this.littleE = littleE;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getChord() {
        return chord;
    }

    public void setChord(String chord) {
        this.chord = chord;
    }

    @Override
    public String toString() {
        return "Chord{" + "bigE=" + bigE + ", bigA=" + bigA + ", bigD=" + bigD + ", bigG=" + bigG + ", bigB=" + bigB + ", littleE=" + littleE + ", n=" + n + ", x=" + x + ", chord=" + chord + ", neck=" + neck + ", vneck=" + vneck + '}';
    }

}
