public class Circle {
    Point center;
    double radius;

    public Circle(double radius){
        this.radius=radius;
      Point center= new Point(0,0);
    }
   //1
    void move(Point p){
       Point center = new Point(1,4);
   }
   //2
   double areaSize(){
        return Math.PI*(Math.pow(radius,2));
   }

   //3
   double circumference(){
        return 2*(radius*Math.PI);
   }

   //4

    boolean pointLocation(Point p) {
        double x = p.x - center.x;
        double y = p.y - center.y;
        if ((Math.pow(x, 2) + (Math.pow(y, 2))) < Math.pow(radius, 2)) {
            return true;
        }

        return false;
    }





}




