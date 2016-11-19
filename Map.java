/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Map  
{
    //startx 블럭부터 endx블럭까지 id 받아옴(배열 형태로)
    public abstract int[][] getMap(int startx, int lengthx, int starty, int lengthy);
    public abstract int[][] getMap();
    public abstract void setMap(int x, int y, int id);
}
