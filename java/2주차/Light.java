public class Light {
    public static void main(String[] args){
        long lightspeed;
        long distance;

        lightspeed = 3000000;
        distance = lightspeed * 365L * 24 * 60 * 60;

        System.out.println("빛이 1년동안  기는 거리 : " + distance + "km");
    }
}
