package shivank;



public class innerclassyearKaMain {
    public static void main(String[] args) {
        innerclassyear a=new innerclassyear();
       
    innerclassyear.month obj=a.new month(monthly.sept, days.fri,2);
    innerclassyear.fortnight obj1=a.new fortnight(5);
    obj1.print();
       obj.display();

    }
}
