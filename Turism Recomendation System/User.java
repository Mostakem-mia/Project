
package tourist;

public class User{
        public int id;
        public String source;
        public String simg;
        public String destination;
        public String dimg;
        public int distance;
        public int cost;
        
        public User(int Id, String Source,String Simg, String Destination,String Dimg, int Distance,int Price)
        {
            this.id = Id;
            this.source = Source;
            this.simg=Simg;
            this.destination = Destination;
            this.dimg=Dimg;
            this.distance = Distance;
            this.cost=Price;
        }
    }
   
