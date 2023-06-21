package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class Test {

    public static void main(String[] args){
        Test1();
    }
    public static void Test1(){

        BinaryTree arbol = new BinaryTree("1");

        Node node_2 = arbol.insert("2", arbol.getRoot(), true);
        arbol.insert("3", arbol.getRoot(), false);

        // Node node3 = arbol.search("3");
        Node node_4 = arbol.insert("4", node_2, true);

        Node node_5 = arbol.insert("5", node_4, true);


        arbol.insert("6", arbol.search("3"), true);
        /* Podemos insertar un nodo hijo a un nodo buscandolo por su contenido en el arbol*/

        System.out.println("Profundidad del arbol: " + arbol.depth());

        System.out.println(arbol.toString());
    }

}
