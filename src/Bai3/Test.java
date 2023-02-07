package Bai3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	// Hàm nhận phần tử cuối cùng làm chốt,
    // đặt các phần tử nhỏ hơn chốt ở trước
    // và lớn hơn ở sau nó
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {

            // Nếu phần tử hiện tại nhỏ hơn chốt
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] và arr[high] (hoặc pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // arr[] --> Mảng cần được sắp xếp,
    // low --> chỉ mục bắt đầu,
    // high --> chỉ mục kết thúc
    void sort(int arr[], int low, int high) {
        if (low < high) {

            // pi là chỉ mục của chốt, arr[pi] vị trí của chốt
            int pi = partition(arr, low, high);

            // Sắp xếp đệ quy các phần tử
            // trướcphân vùng và sau phân vùng
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    // In các phần tử của mảng
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
	
	public static void main(String[] args) {
		String x = "";
		int[] result = new int[9];
		int n = result.length;
		FileInputStream fin = null;
        try {
            fin = new FileInputStream("input.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
            
            	x+=(char)i;
            	
            }
            String[] chu = x.split("\\s",0);
            
            
				for (int j = 0; j < chu.length; j++) {
					int so = Integer.parseInt(chu[j]);
					result[j] = so;
				}
            	 Test t = new Test();
            	 t.sort(result, 0, n-1);
            	 printArray(result);
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
			
		}
	}