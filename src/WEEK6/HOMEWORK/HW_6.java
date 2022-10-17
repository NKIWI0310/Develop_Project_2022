package WEEK6.HOMEWORK;
import java.util.*;
    class Location {
        private String city;
        private int latitude, longitude;

        public Location(String city, int latitude, int longitude) {
            this.city = city;
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public String getCity() {
            return city;
        }

        public int getLatitude() {
            return latitude;
        }

        public int getLongitude() {
            return longitude;
        }
    }

    public class HW_6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            HashMap<String, Location> map = new HashMap<>();
            System.out.println("도시, 경도, 위도를 입력하세요.");
            for(int i = 0; i < 4; i++) {
                System.out.print(">> ");
                String s = sc.nextLine();
                StringTokenizer st = new StringTokenizer(s, ",");

                String city = st.nextToken().trim();
                int latitude = Integer.parseInt(st.nextToken().trim());
                int longitude = Integer.parseInt(st.nextToken().trim());

                Location location = new Location(city, latitude, longitude);
                map.put(city, location);
            }

            System.out.println("--------------------");

            Set<String> key = map.keySet();
            Iterator<String> it = key.iterator();

            while(it.hasNext()) {
                String city = it.next();
                Location location = map.get(city);
                System.out.print(location.getCity() + "\t");
                System.out.print(location.getLatitude() + "\t");
                System.out.println(location.getLongitude() + "\t");
            }

            System.out.println("--------------------");

            while(true) {
                System.out.print("도시 이름 >> ");
                String city = sc.next();

                if(city.equals("그만"))
                    break;

                if(map.get(city) != null) {
                    System.out.print(map.get(city).getCity() + "\t");
                    System.out.print(map.get(city).getLatitude() + "\t");
                    System.out.println(map.get(city).getLongitude());
                } else System.out.println(city + "는 없습니다.");
            }
        }
    }
