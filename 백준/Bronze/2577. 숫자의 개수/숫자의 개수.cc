#include <stdio.h>

int arr[10];

int main() {
	int A, B, C;
	int num;

	scanf("%d %d %d", &A, &B, &C);

	num = A * B * C;

	for (int i = num; i > 0; i /= 10)
		arr[i % 10]++; //10으로 나눠서 제일 낮은 자리 수에 추가를 한다.

	for (int i = 0; i < 10; i++)
		printf("%d\n", arr[i]);

	return 0;
}