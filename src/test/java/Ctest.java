import org.junit.Test;

import static org.junit.Assert.*;

public class
Ctest {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        AVLTree avt3 = new AVLTree();
        AVLTree.Node n1 = avt3.find((int) '4');
        AVLTree.Node n2 = avt3.getRoot();
        avt3.delete(103);
        avt3.insert((int) (byte) 13);
        AVLTree.Node n4 = avt3.getRoot();
        avt3.insert((int) (int) 3);

        try {
            avt3.delete(10);
            fail("NPE");
        }
        catch(NullPointerException ignored){
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        try {
            AVLTree sdf = new AVLTree();
            sdf.insert((-3243));
            sdf.insert(1776);
            sdf.delete(645);
            sdf.insert(3);
            sdf.insert((-795));
            sdf.delete((-795));
            AVLTree.Node nd = sdf.getRoot();
            sdf.delete((-937));
            AVLTree.Node node1 = nd.left;
            nd.left = node1;
            sdf.insert((-453));
            nd.left.key = (-1468);

            node1.height = (-937);
            nd.height = 663;
            nd.key = (-795);
            sdf.insert(390);
            sdf.getBalance(nd);
        }
        catch(NullPointerException ne){
            fail("NPE");
        }
    }

    @Test(timeout = 4200)
    public void test02() throws Throwable {
        AVLTree aVLTREE = new AVLTree();
        aVLTREE.insert(13);
        aVLTREE.insert(57);
        aVLTREE.insert(26);
        aVLTREE.insert(84);
        try {
            aVLTREE.delete(57);
            aVLTREE.delete(26);
            aVLTREE.delete(84);
            fail("NPE");
        }catch(NullPointerException ignored){

        }
    }
}
