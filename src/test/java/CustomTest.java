import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;

public class CustomTest {
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '5');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(99);
        aVLTree0.insert((int) (byte) 11);
        AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);

        try {
            aVLTree0.delete(10);
            fail("Will get null pointer exception");
        }catch(NullPointerException ignored){

        }
    }

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        AVLTree aVLTree0 = new AVLTree();
        aVLTree0.insert((-3240));
        aVLTree0.insert(1779);
        aVLTree0.delete(665);
        aVLTree0.insert(0);
        aVLTree0.insert((-796));
        aVLTree0.delete((-796));
        AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
        aVLTree0.delete((-935));
        AVLTree.Node aVLTree_Node1 = aVLTree_Node0.left;
        aVLTree_Node0.left = aVLTree_Node1;
        aVLTree0.insert((-450));
        aVLTree_Node0.left.key = (-1467);
        aVLTree_Node0.height = 395;
        aVLTree_Node0.key = (-796);
        aVLTree_Node1.height = (-935);
        aVLTree_Node0.height = (-796);
        aVLTree_Node0.height = 665;
        aVLTree_Node0.key = (-796);
        aVLTree0.insert(395);
        aVLTree0.getBalance(aVLTree_Node0);
    }

    @Test(timeout = 4000)
    public void test009() throws Throwable {
        AVLTree aVLTree0 = new AVLTree();
        aVLTree0.insert(12);
        aVLTree0.insert(56);
        aVLTree0.insert(24);
        aVLTree0.insert(85);
        try {
            aVLTree0.delete(56);
            aVLTree0.delete(24);
            aVLTree0.delete(85);
            fail("Will get Null pointer exception");
        }catch(NullPointerException ignored){

        }
    }
}

