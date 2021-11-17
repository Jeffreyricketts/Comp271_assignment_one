# Comp271_assignment_one || Complete

This project was created to compare the runtime profiles between three different algorithms; Merged Sort, Quick Sort and Selection Sort.

Runtime and Comparisons for Sorts:

Merged Sort Runtime:

![image](https://user-images.githubusercontent.com/54014269/141931792-bd89b42d-6b1c-4d71-b97b-f817d9481a0c.png)
![image](https://user-images.githubusercontent.com/54014269/141931882-486b3064-f273-427c-8931-dc1b09f15235.png)
![image](https://user-images.githubusercontent.com/54014269/141931996-a2647838-29f2-4ecf-bda7-bdc1d996edeb.png)

Average runtime for Merged Sort is 7.67 milliseconds.

Merged Sort is a O(N log N) runtime as the list is divided by half, based on the mid point, until only 1 element is compared. It still compares the other elements at an N rate, leading to N log N.

![image](https://user-images.githubusercontent.com/54014269/142137275-f8c9211b-d57e-4522-b198-fa3db1b919d4.png)

:::      :::     :::

Quick Sort Runtime:

![image](https://user-images.githubusercontent.com/54014269/141932359-98e182ff-98de-4df3-a734-8ac02c65a30f.png)
![image](https://user-images.githubusercontent.com/54014269/141932435-efadee54-b360-4b87-83b7-fa2a33bf837c.png)
![image](https://user-images.githubusercontent.com/54014269/141932482-ced404d0-272c-493f-9de2-c07bb9cb2552.png)

Average runtime for Quick Sort is 7 milliseconds.

Quick Sort is also a O(N log N) runtime. This is because it also has to divide the list into two comparisons each time based on the low/high partition, while comparing each element.

![image](https://user-images.githubusercontent.com/54014269/142137695-31d8b6b9-c5a2-4ce4-b186-dae318e884fa.png)

:::       :::     :::

Selection Sort Runtime:

![image](https://user-images.githubusercontent.com/54014269/141932811-0134a86b-20b1-4925-9641-8eb9886a932e.png)
![image](https://user-images.githubusercontent.com/54014269/141933100-99277a5c-a411-497f-8b10-cefa82dc9355.png)
![image](https://user-images.githubusercontent.com/54014269/141933173-4d488caa-b4eb-4a58-8145-819041591ebd.png)

Average runtime for Selection Sort is 8 milliseconds.

Selection Sort is a O(N^2) runtime. This is because of the code has to execute a nested for loop within the outer for loop. This leads to the comparisons growing exponentially or O(N^2). 

![image](https://user-images.githubusercontent.com/54014269/142137978-462447bb-b75a-42ee-89ef-b4054c340a12.png)


