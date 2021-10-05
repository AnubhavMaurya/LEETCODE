/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    if(head==NULL)
        return false;
    else if(head->next==NULL)
        return false;
    else{
    struct ListNode *slow=head,*fast=head->next;
    while(1)
    {
        if(slow==fast)
        {
            return true;
        }
        else if(fast==NULL || fast->next==NULL)
        {  
            return false;
        }
        slow=slow->next;
        fast=fast->next->next;
    }
    }
    return true;
}
