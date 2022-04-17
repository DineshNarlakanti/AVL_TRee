import org.junit.Test;

import static org.junit.Assert.*;

public class
Ctest {
    @Test(timeout = 4000)
    public void test12() throws Throwable {
        try {
            AVLTree aVLTree0 = new AVLTree();
            int int0 = 1;
            aVLTree0.delete(1);
            aVLTree0.insert(1);
            AVLTree.Node aVLTree_Node0 = aVLTree0.find(1);
            aVLTree_Node0.height = 1;
            aVLTree_Node0.height = (-668);
            aVLTree0.delete(111);
            aVLTree0.delete((-668));
            aVLTree_Node0.height = 1;
            aVLTree0.delete(1487);
            aVLTree0.height();
            int int1 = aVLTree0.getBalance(aVLTree_Node0);
            aVLTree_Node0.key = 1065;
            AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
            aVLTree_Node0.right = aVLTree_Node1;
            aVLTree0.delete(0);
            aVLTree0.insert(int0);
            int int2 = 0;
            aVLTree0.insert(int2);
            AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
            aVLTree0.find(int1);
            int int3 = 0;
            aVLTree_Node2.key = int3;
            aVLTree0.height();
            aVLTree0.getBalance(aVLTree_Node2);
            int int4 = 5;
            AVLTree.Node aVLTree_Node3 = aVLTree0.find(int4);
            aVLTree_Node3.right = aVLTree_Node2;
            aVLTree_Node3.key = int3;
            aVLTree0.getBalance(aVLTree_Node3);
            aVLTree0.height();
            aVLTree0.getRoot();
        } catch (Error error) {
            fail("fail");
        }
    }}
