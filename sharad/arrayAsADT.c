#include <stdio.h>
#include <stdlib.h>

struct Array
{
    int *A;
    int length;
    int size;
} * a1;

void display(struct Array *a)
{
    int i;
    for (i = 0; i < a->length; i++)
    {
        printf("%d", a->A[i]);
    }
}

int Delete(struct Array *a, int index)
{
    int i;
    int elem = a->A[index];
    for (i = index; i < a->length - 1; i++)
    {
        a->A[i] = a->A[i + 1];
    }
    a->length--;
    return elem;
}

int Get(struct Array *a, int index)
{
    return a->A[index];
}

void Set(struct Array *a, int index, int key)
{
    a->A[index] = key;
}

void Modify(struct Array *a, int index, int newValue)
{
    a->A[index] = newValue;
}

struct Array *Merge(struct Array *a1, struct Array *a2)
{
    int i = 0, j = 0, k = 0;
    struct Array *a3;
    a3 = (struct Array *)malloc(sizeof(struct Array));
    a3->size = a1->size + a2->size;
    a3->length = a1->length + a2->length;
    a3->A = (int *)malloc(a3->size * sizeof(int));
    while (i < a1->length && j < a2->length)
    {
        if (a1->A[i] <= a2->A[j])
        {
            a3->A[k] = a1->A[i];
            i++;
            k++;
        }
        if (a1->A[i] >= a2->A[j])
        {
            a3->A[k] = a2->A[j];
            j++;
            k++;
        }
    }
    for (; i < a1->length; i++)
    {
        a3->A[k++] = a1->A[i];
    }
    for (; j < a2->length; j++)
    {
        a3->A[k++] = a2->A[j];
    }
    return a3;
}

int main()
{
}