package Class25;

import java.util.ArrayList;
import java.util.List;

public class E2ArrayList {
    public static void main(String[] args) {

            HeadSet headsets1=new HeadSet("String1",79.99,3456);
            HeadSet headsets2=new HeadSet("String2",79.99,3456);
            HeadSet headsets3=new HeadSet("String3",79.99,3456);
// we will list below because arraylist implements list and we can store object of a class
// in a variable whos type is interface.
            List<HeadSet> headSets=new ArrayList<>();// we use Arraylist because it implement the interface List to achieve poly
            headSets.add(headsets1);
            headSets.add(headsets2);
            headSets.add(headsets3);
           // printlist(headSets);
           // for(HeadSet h:headSets){
               // h.print();
        System.out.println(headSets);
            }

        public static void printlist(List<HeadSet>headSets){//  this is same way as above we just pass the list as parameters
            for(HeadSet h:headSets){
    //         h.printInfo();
            }
        }
    }


    class HeadSet{
        private  String title;
        private  double price;
        private  int  noOfReviews;

        public HeadSet(String title, double price, int noOfReviews) {
            this.title = title;
            this.price = price;
            this.noOfReviews = noOfReviews;
        }
       // public void printInfo(){



        @Override
        public String toString() {
            return "HeadSet{" +
                    "title='" + title + '\'' +
                    ", price=" + price +
                    ", noOfReviews=" + noOfReviews +
                    '}';
        }
        //  void print(){
           // System.out.println(title+" "+price+" "+noOfReviews);
       }
    //}


