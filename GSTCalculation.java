class GSTCalculation{
    public static void Gstcal(){
        
        int r=4;
        for(double[] Element:price){
           double gst = (Element[i]*r)/100;
            System.out.println(gst);
        }
        
    }
    public static void main(String[] args) {
        double[] price={1000.00,2000.00,3000.00};
        Gstcal(price);
    }
}