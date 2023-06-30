package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class Test {

    public static void main(String[] args){
        Test1();
    }
    public static void Test1(){

        BinaryTree arbol = new BinaryTree("0");
        Node node_1 = arbol.insert("1", arbol.getRoot(), true);
        Node node_2 = arbol.insert("2", arbol.getRoot(), false);

        Node node_3 = arbol.insert("3", node_1, true);
        Node node_4 = arbol.insert("4", node_1, false);

        Node node_5 = arbol.insert("5", node_2, true);
        Node node_6 = arbol.insert("6", node_2, false);

        Node node_7 = arbol.insert("7", node_3, true);
        Node node_8 = arbol.insert("8", node_3, false);

        System.out.println("Profundidad del arbol: " + arbol.depth(arbol.getRoot()));

        System.out.println(arbol.toString());
    }

}
