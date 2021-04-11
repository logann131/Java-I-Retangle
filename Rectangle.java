/* Nam Phu Nguyen (Logan)
   CS141 
   Programing Assignment
 */   
   
public class Rectangle{
   private double width; 
   private double height;
   public Rectangle() {
   width = 1;
   height = 1;
   }
   public Rectangle(double w, double h){
   width = w;
   height = h;
   }
   public double getWidth() {
   return width;
   }
   public double getHeight() {
   return height;
   }
   public double getArea() {  
   return width * height;
   }
   public double getPerimeter() {
   return 2 *(width + height);
   }   
   public String toString(){
   return ("Rectangle width = "+ width + ",height = "+ height);
   }
   public boolean equals(Rectangle rect){
   Boolean sameHeight, sameWidth;
   sameHeight = (getHeight() ==  rect.getHeight() );
   sameWidth  = (getWidth() ==  rect.getWidth());
   return (sameHeight && sameWidth);
   }
   
   }
