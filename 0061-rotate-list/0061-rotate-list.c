/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* rotateRight(struct ListNode* head, int k) {
    if(head==NULL||head->next == NULL) {
        return head;
    }
    int *arr= malloc(500*sizeof(int));
    struct ListNode* temp=head;
    int count=0,index=0;
    while(temp!=NULL){
        count++;
        arr[index++]=temp->val;
        temp=temp->next;
    }
    k=k%count;
     for (int i = 0; i < k; i++) {
            int last = arr[count- 1];
            for (int j = count - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
     }
     temp=head;
        for(int i=0;i<count;i++){
        
                temp->val=arr[i];
            temp=temp->next;
        }
    free(arr);
    return head;
}