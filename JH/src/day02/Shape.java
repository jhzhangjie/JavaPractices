package day02;
/**
 *图形 类型 其中x,y代表图形的位置
 *图形作为父类型，被圆和矩形继承 
 * 
 *
 */
public class Shape {
    int x;
    int y;
    /**
     * 
     * 图形向上移动的 
     */
    public void up(int dy){
    	y-=dy;
    }
    public void up(){
    	y--;
    }
    /**检查当前图形是否包含坐标（x,y）*/
    public boolean contains(int x,int y){
    	return false;
    }
}
