/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* reverseList(struct ListNode* head){
if(head==NULL)
    return head;
    else
    {
        struct ListNode *prev,*current;
        prev=head;
        head=head->next;
        current=head;
        prev->next=NULL;
        while(head!=NULL)
        {
            head=head->next;
            current->next=prev;
            prev=current;
            current=head;
        }
        head=prev;
        return head;
    }
}
