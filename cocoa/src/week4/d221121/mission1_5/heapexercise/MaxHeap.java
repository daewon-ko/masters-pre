package week4.d221121.mission1_5.heapexercise;

import java.util.ArrayList;

public class MaxHeap {
    public static class MaximunHeap {
        private ArrayList<Integer> heap;

        private MaximunHeap() {
            heap = new ArrayList<>();

            heap.add(Integer.MAX_VALUE);
        }

        public void print() {
            for (int i = 1; i < heap.size(); i++) {
                System.out.print(heap.get(i) + " ");
            }
            System.out.println();
        }

        public void insert(int val) {
            heap.add(val);
            // p는 heap 배열의 마지막 인덱스
            int p = heap.size() - 1;

            while (p > 1 && heap.get(p / 2) < heap.get(p)) {
                System.out.println("swap");
                int temp = heap.get(p / 2);
                heap.set(p / 2, heap.get(p));
                heap.set(p, temp);

                p = p / 2;
            }
        }

        public int delete() {
            // 사실상의 예외처리
            if (heap.size() - 1 < 1) {
                return 0;
            }
            heap.set(1, heap.get(heap.size()) - 1);
            heap.remove(heap.size() - 1);

            int pos = 1;
            while((pos))

        }

    }

    public static void main(String[] args) {

    }
}
