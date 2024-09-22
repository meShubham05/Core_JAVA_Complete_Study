

import  java.util.*;
class AddElement {
    int[] a;
    int size;
    Scanner sc = new Scanner(System.in);

    void setArray(int a[], int size) {
        this.a = a;
        this.size = size;
    }
}

class ShowElement {
    AddElement[] ade;

    ShowElement(AddElement... ade) {
        this.ade = ade;
    }

    public void show() {
        for (int i = 0; i < ade.length; i++) {
            for (int j = 0; j < ade[i].a[j]; j++) {  
                System.out.println(ade[i].a[j]);
            }
        }
    }
}

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddElement ad = null;  
        int ch;

        do {
            System.out.print("\n1. Add element in array\t");
            System.out.print("2. Show Elements\t");
            System.out.print("3. Search element");
            System.out.println("4. Update data\t");
            System.out.print("5. Occurrence of element\t");
            System.out.print("6. Reverse the element\t");
            System.out.println("7. SubArray\t");
            System.out.print("8. Sort Array");

            System.out.println("\nEnter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:  
                {
                    System.out.println("Please enter array size");
                    int size = sc.nextInt();
                    int[] a = new int[size];
                    System.out.println("Enter array elements");
                    for (int i = 0; i < a.length; i++) {
                        a[i] = sc.nextInt();
                    }
                    ad = new AddElement();  
                    ad.setArray(a, size);
                }
                break;

                case 2: 
                {
                   
                        ShowElement se = new ShowE lement(ad);  
                        System.out.println("Show element :");
                        se.show();
                    
                }
                break;
            }
        } while (ch != 0);
    }
}