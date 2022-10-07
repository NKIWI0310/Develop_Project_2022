package WEEK5.homework;
import java.util.Scanner;

abstract class GameObject {	// 추상 클래스
    protected int distance;	// 한 번 이동 거리
    protected int x, y;	// 현재 위치(화면 맵 상의 위치)
    public GameObject(int startX, int startY, int distance) { 	// 초기 위치와 이동 거리 설정
        this.x = startX;
        this.y = startY;
        this.distance = distance;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public boolean collide(GameObject p) { 	// 이 객체가 객체 p와 충돌했으면 true 리턴
        if(this.x == p.getX() && this.y == p.getY())
            return true;
        else
            return false;
    }

    public abstract void move();	// 이동한 후의 새로운 위치로 x, y 변경
    public abstract char getShape();	// 객체의 모양을 나타내는 문자 리턴
}

class Bear extends GameObject {

    Bear(int startX, int startY, int distance){
        super(startX, startY, distance);
    }

    @Override
    public void move() {
        Scanner sc = new Scanner(System.in);
        System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >>");
        String key = sc.next();

        Game.map[x][y] = '-';

        switch(key) {
            case "a":
                if(y == 0) y = 0;
                else y -= distance;
                break;
            case "s":
                if(x == 9) x = 9;
                else x += distance;
                break;
            case "d":
                if(x == 0) x = 0;
                else x -= distance;
                break;
            case "f":
                if(y == 19) y = 19;
                else y += distance;
                break;
            default:
                System.out.print("잘못 입력했습니다.");
        }

        Game.map[x][y] = getShape();

    }
    @Override
    public char getShape() {
        return 'B';
    }
}

class Fish extends GameObject {
    Fish(int startX, int startY, int distance) {
        super(startX, startY, distance);
    }

    @Override
    public void move() {
        int randomNum = (int)(Math.random() * 4);	// 상, 하, 좌, 우 방향으로 움직일 랜덤 난수값
        Game.map[x][y] = '-';	// 현재 좌표 초기화

        switch(randomNum) {	// 랜덤값에 따라 상, 하, 좌, 우로 이동
            case 0:
                if(x == 0) x = 0;	// 맵의 가장자리에 있으면 더이상 이동하지 않음.
                else x -= distance;
                break;
            case 1:
                if(x == 9) x = 9;
                else x += distance;
                break;
            case 2:
                if(y == 0) y = 0;
                else y -= distance;
                break;
            case 3:
                if(y == 19) y = 19;
                else y += distance;
                break;
        }

        Game.map[x][y] = getShape();	// 바뀐 좌표에 모양 수정
    }

    @Override
    public char getShape() {
        return '@';
    }
}

class Game {
    Bear bear;
    Fish fish;
    static char[][] map = new char[10][20];
    // 클래스 객체들(bear, fish) 사이에서 공유될 수 있도록 static으로 선언되어야만 한다.

    public void set() {	// 초기 설정
        bear = new Bear(0,0,1);
        fish = new Fish(5,5,1);

        for(int i = 0; i < map.length; i++)
            for(int j = 0; j < map[i].length; j++)
                map[i][j] = '-';

        map[bear.x][bear.y] = bear.getShape();	// 초기값에 따라 bear 표시
        map[fish.x][fish.y] = fish.getShape();	// 초기값에 따라 fish 표시
    }

    public void showMap() {	// 게임 맵 출력
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++)
                System.out.print(map[i][j]);
            System.out.println();
        }
    }

    public void winBear() {	// Bear 승리시 출력
        map[bear.x][bear.y]= bear.getShape();
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++)
                System.out.print(map[i][j]);
            System.out.println();
        }
    }

    public void run() {	// 게임 진행
        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");
        set();
        showMap();

        int fishMoveCount = 0;	// fish가 움직인 횟수
        int totalMoveCount = 0;	// 총 진행된 턴

        while(true) {
            for(int i = 0; i < 5; i++) {
                bear.move();
                int randomNum = (int)(Math.random() * 2);
                // 0이면 fish 이동, 1이면 fish 제자리

                if(bear.collide(fish)) {
                    // bear와 fish가 충돌했을 때 승리 및 종료
                    winBear();
                    System.out.print("Bear Wins!!");
                    return;
                }
                if(totalMoveCount == 5) {
                    // 총 진행된 턴이 5가 되면 다시 fish가 움직인 횟수와 함께 0으로 초기화
                    totalMoveCount = 0;
                    fishMoveCount = 0;
                }
                if(randomNum == 0 && fishMoveCount < 2) {
                    // fish가 움직인 횟수가 2보다 작은 경우 && 랜덤값이 0인경우 이동
                    fish.move();
                    showMap();
                    fishMoveCount++;
                    totalMoveCount++;
                }
                else if(randomNum == 1 && totalMoveCount > 3 && fishMoveCount < 2) {
                    // fish가 움직인 횟수가 2보다 작고 총 진행된 턴이 3인경우 랜덤값이 1이지만 이동
                    fish.move();
                    showMap();
                    fishMoveCount++;
                    totalMoveCount++;
                }
                else {
                    // 그 외의 경우 fish는 제자리, 턴 증가
                    showMap();
                    totalMoveCount++;
                }
            }
        }
    }
}
public class openchallenge_5 {

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }

}
