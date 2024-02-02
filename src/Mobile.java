public class Mobile{

    double displaySize;
    int noOfCameras;
    int batteryCapacity;
    static String unit;
    String totalCap;


    public Mobile(double dSize,int noOfCam , int batCap){
        displaySize = dSize;
        noOfCameras = noOfCam;
        batteryCapacity = batCap;
        totalCap = batCap + unit;

    }

    @Override
    public String toString() {
        return "Mobile{" +
                "displaySize=" + displaySize +
                ", noOfCameras=" + noOfCameras +
                ", batteryCapacity=" + batteryCapacity +
                ", totalCap='" + totalCap + '\'' +
                '}';
    }

    public void doCall(String mobNo){

        System.out.println("Calling :"+ mobNo);
    }


}