import java.util.Scanner;

class Mixer {
    int arr[];

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter elements in ascending order without duplicates:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i > 0 && arr[i] <= arr[i - 1]) {
                System.out.println("Error: Enter elements in strictly ascending order without duplicates.");
                i--;
            }
        }
    }

    Mixer mix(Mixer A) {
        Mixer result = new Mixer();
        int n1 = this.arr.length;
        int n2 = A.arr.length;
        int[] temp = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (this.arr[i] < A.arr[j]) {
                temp[k++] = this.arr[i++];
            } else if (this.arr[i] > A.arr[j]) {
                temp[k++] = A.arr[j++];
            } else {
                temp[k++] = this.arr[i++];
                j++;
            }
        }
        while (i < n1) {
            temp[k++] = this.arr[i++];
        }
        while (j < n2) {
            temp[k++] = A.arr[j++];
        }

        result.arr = new int[k];
        System.arraycopy(temp, 0, result.arr, 0, k);

        return result;
    }

    void display() {
        System.out.println("Array Elements:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

public class L3q3 {
    public static void main(String[] args) {
        Mixer m1 = new Mixer();
        Mixer m2 = new Mixer();

        System.out.println("Enter elements for first array:");
        m1.accept();
        System.out.println("Enter elements for second array:");
        m2.accept();

        Mixer m3 = m1.mix(m2);
        System.out.println("Merged Array:");
        m3.display();
    }
}
