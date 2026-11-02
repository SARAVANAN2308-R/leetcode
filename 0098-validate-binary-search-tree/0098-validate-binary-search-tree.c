/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool valid(struct TreeNode* root,long long min,long long max){
    if(root==NULL){
        return true;
    }
    if(root->val<=min || root->val >=max){
        return false;
    }
    return valid(root->left,min,root->val)&&
    valid(root->right,root->val,max);
}
bool isValidBST(struct TreeNode* root) {
    return valid(root,LLONG_MIN,LLONG_MAX);
}