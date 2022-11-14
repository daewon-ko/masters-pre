package week2.day_221108.mission1_3;

import java.util.Stack;

public class MazeTest {

    static class Node{
        int x, y;

        public Node(int x, int y){
            this.x = x;
            this. y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static int[][] myMaze = {
            {0, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 0}
    };

    public static  Stack<Node> stack;
    static boolean [] isVisited = new boolean[64];


    public static void main(String[] args) {

//     초기값 세팅
       stack = new Stack<>();
       Node position;
       position = new Node(0,0);
       // 모든 isVisited = false로 어떻게 두지 ?
//     boolean의 기본 값은 모두 false
       isVisited[0] = false;
       stack.push(new Node(0,0));
       for(Node n : stack){
           System.out.print(n.getX()+","+n.getY());
           System.out.println();
       }
        System.out.println(stack.peek());
       // while문을 도는 이유는? DFS정렬 자체가 모든 노드를 다 도는 것이기 떄문에
//       while(stack.isEmpty()){
//           // 기본 값 설정
//
//           for(int i =0; i<isVisited.length; i++){
//               if(position.getX() !=1 && position.getY() !=1 && isVisited[i]){
//                   stack.pop();
//
//               }
//           }





       }


    }



