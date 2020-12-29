public class Triangle {

    Point p1;
    Point p2;
    Point p3;

    public Triangle(Point p1,Point p2,Point p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
     //1
    Point centerPoint(){
        double x = (p1.x+p2.x+p3.x)/3;
        double y = (p1.y+p2.y+p3.y)/3;
        return new Point(x,y);
    }

     //2

    double areaSize(){
        double area=(p2.y-p3.y)+(p2.y-p3.y)+(p2.y-p3.y)/2;
        return Math.abs(area);
    }
    //3
   double perimeter(){
       double p1p2 = Math.pow((p1.x+p2.x),2) + Math.pow((p1.y+p2.y),2);
       double p2p3 = Math.pow((p2.x+p3.x),2) + Math.pow((p2.y+p3.y),2);
       double p1p3 = Math.pow((p1.x+p3.x),2) + Math.pow((p1.y+p3.y),2);
       return p1p2 + p2p3 + p1p3;
    }
     //4
    boolean pointLocation(Point s){

        //sp1p2
        double p1p2 = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
        double sp2  = Math.sqrt(Math.pow((s.x - p2.x), 2) + Math.pow((s.y - p2.y), 2));
        double sp1  = Math.sqrt(Math.pow((p1.x - s.x), 2) + Math.pow((p1.y - s.y), 2));

        //sp2p3
        double p2s = Math.sqrt(Math.pow((p2.x - s.x), 2) + Math.pow((p2.y - s.y), 2));
        double p2p3 = Math.sqrt(Math.pow((p3.x - p2.x), 2) + Math.pow((p3.y - p2.y), 2));
        double p3s = Math.sqrt(Math.pow((s.x - p3.x), 2) + Math.pow((s.y - p3.y), 2));


        //sp1p3
        double p1s = Math.sqrt(Math.pow((s.x - p1.x), 2) + Math.pow((s.y - p1.y), 2));
        double sp3 = Math.sqrt(Math.pow((p3.x - s.x), 2) + Math.pow((p3.y - s.y), 2));
        double p3p1= Math.sqrt(Math.pow((p1.x - p3.x), 2) + Math.pow((p1.y - p3.y), 2));


        double sp1p2 = p1p2+sp2+sp1;
        double sp2p3 = p2s+p2p3+p3s;
        double sp1p3 = p1s+sp3+p3p1;

        if ((sp1p2+sp1p3+sp2p3) == perimeter()){
            return true;
        }
            return false;
    }
}

