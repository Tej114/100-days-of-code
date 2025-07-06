#include <stdio.h>
#include<stdlib.h>
#define SIZE 50
int stack[SIZE];
int top = -1;
void push(int value) {
    if (top == SIZE - 1) {
        printf("Stack overflow!\n");
    } else {
        top++;
        stack[top] = value;
        printf("%d pushed to stack\n",value);
    }
}
void pop() {
    if (top == -1) {
        printf("Stack underflow!\n");
    } 
    else {
        int value = stack[top];
        top--;
        printf("%d deleted from the stack\n",value);
    }
}
void peek() {
    if (top == -1) {
        printf("Stack is empty.\n");
    } 
    else {
        printf("Top element: %d\n", stack[top]);
    }
}
void isEmpty() {
    if (top == -1) {
        printf("Stack is empty.\n");
    } 
    else {
        printf("Stack is not empty.\n");
    }
}
void isFull() {
    if (top == SIZE - 1) {
        printf("Stack is full.\n");
    } 
    else {
        printf("Stack is not full.\n");
    }
}
void display() {
    if (top == -1) {
        printf("Stack is empty.\n");
    } 
    else {
        for (int i = 0; i <= top; i++) {
            printf("%d ", stack[i]);
        }
        printf("\n");
    }
}
int main() {
    int op, value,choice;
    while (1) {
        if(scanf("%d", &choice) != 1) break ;
        switch (choice) {
            case 1:
                 if(scanf("%d", &value) != 1) break ;
                push(value);
                break;
            case 2: 
                pop();
                break;
            case 3: 
                peek();
                break;
            case 4: 
                isEmpty();
                break;
            case 5: 
                display();
                break;
            case 6:
                printf("Exiting...\n");
                break;
                
            default:
                printf("Invalid input!!!\n");
        }
    }
    printf("Exiting...\n");
    return 0;
}
